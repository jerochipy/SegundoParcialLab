import com.fasterxml.jackson.databind.ObjectMapper;
import models.AltaTemperaturaException;
import models.FaltaKitException;
import models.Persona;
import models.Test;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class SSM {

    private Integer cantidadTest;
    private ArrayList<Persona> personas;
    private HashMap<Integer, Test> resultados;
    private HashMap<Integer, Test> personasSospechsas;
    private ArrayList<Persona> sanos;



    public SSM(Integer cantidadTest) {
        this.cantidadTest = cantidadTest;
        this.personas = new ArrayList<>();
        this.resultados=new HashMap<>();
        this.personasSospechsas=new HashMap<>();
        this.sanos=new ArrayList<>();
    }

    private Persona buscarPorDNI(String dni)
    {
        for (Persona p:personas
        ) {
            if(p.getDNI().equals(dni))
            {
                return p;
            }

        }
        return null;
    }

    public void agregarPersona(Persona persona) throws FaltaKitException {
        if(cantidadTest>0){
            if(buscarPorDNI(persona.getDNI())==null){
                persona.setNumeroTest(cantidadTest);
                cantidadTest--;
                personas.add(persona);

            }
            else {
                System.out.println("DNI no valido.");
            }
        }else{
            throw new FaltaKitException();
        }
    }
    public void pedirTest(){
        Random random = new Random();
        int result=random.nextInt(2);
        if(result!=0)
        {
            cantidadTest+=5;
        }
    }

    public void testear(){
        for (Persona p:personas) {
            Random random=new Random();
            double temperatura = 36 + random.nextDouble() * (39 - 36);
            resultados.put(p.getNumeroTest(),new Test(temperatura,p.getDNI()));
        }
    }

    public void aislar()throws AltaTemperaturaException {
        for (Map.Entry<Integer, Test> entry : resultados.entrySet()) {
            Test test = entry.getValue();
            if(test.getTemperatura()>=38){
                personasSospechsas.put(entry.getKey(),test);
                throw new AltaTemperaturaException(Objects.requireNonNull(buscarPorDNI(test.getDNI())).getBarrio(),entry.getKey());
            }else {
                sanos.add(buscarPorDNI(test.getDNI()));
            }
        }
    }


    @Override
    public String toString() {
        return "SSM{" +
                "cantidadTest=" + cantidadTest +
                ", personas=" + personas +
                '}';
    }

    public String resultadosToString() {
        return "SSM{" +
                "resultados=" + resultados +
                '}';
    }
}
