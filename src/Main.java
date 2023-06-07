import models.AltaTemperaturaException;
import models.FaltaKitException;
import models.Persona;

import java.io.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        SSM ssm=new SSM(10);

        //Registro de personas
        try {
            ssm.agregarPersona(new Persona("jero","chipy",20,"barrio1","12.345.678","trabajador"));
            ssm.agregarPersona(new Persona("jero","chipy",20,"barrio2","12.345.679","trabajador"));
            ssm.agregarPersona(new Persona("jero","chipy",20,"barrio3","12.345.680","trabajador"));
            ssm.agregarPersona(new Persona("jero","chipy",20,"barrio4","12.345.455","trabajador"));
            ssm.agregarPersona(new Persona("jero","chipy",20,"barrio5","12.345.456","trabajador"));
            ssm.agregarPersona(new Persona("jero","chipy",20,"barrio6","12.287.456","trabajador"));
            ssm.agregarPersona(new Persona("jero","chipy",20,"barrio7","12.482.456","trabajador"));
            ssm.agregarPersona(new Persona("jero","chipy",20,"barrio8","12.121.456","trabajador"));
        } catch (FaltaKitException e) {
            System.out.println(e.getMessage());
            ssm.pedirTest();

        }
        finally {
            System.out.println(ssm.toString());
        }

        //testeo
        ssm.testear();
        System.out.println(ssm.resultadosToString());

        //aislamiento
        try {
            ssm.aislar();
        } catch (AltaTemperaturaException e) {
            System.out.println(e.toString());
        }
    }
}