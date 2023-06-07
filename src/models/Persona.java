package models;

import java.util.Objects;

public class Persona {
    private String nombre;
    private String apellido;
    private Integer edad;
    private String barrio;
    private String DNI;
    private String ocupacion;
    private Integer numeroTest;

    public Persona(String nombre, String apellido, Integer edad, String barrio, String DNI, String ocupacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.barrio = barrio;
        this.DNI = DNI;
        this.ocupacion = ocupacion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Persona persona = (Persona) o;

        return Objects.equals(DNI, persona.DNI);
    }

    @Override
    public int hashCode() {
        return DNI != null ? DNI.hashCode() : 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public Integer getNumeroTest() {
        return numeroTest;
    }

    public void setNumeroTest(Integer numeroTest) {
        this.numeroTest = numeroTest;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", barrio='" + barrio + '\'' +
                ", DNI='" + DNI + '\'' +
                ", ocupacion='" + ocupacion + '\'' +
                ", numeroTest=" + numeroTest +
                '}';
    }
}
