package models;

public class AltaTemperaturaException extends Exception {
    private String barrio;
    private Integer numeroTest;

    public AltaTemperaturaException(String barrio, Integer numeroTest) {
        this.barrio = barrio;
        this.numeroTest = numeroTest;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    public Integer getNumeroTest() {
        return numeroTest;
    }

    public void setNumeroTest(Integer numeroTest) {
        this.numeroTest = numeroTest;
    }

    @Override
    public String toString() {
        return "AltaTemperaturaException{" +
                "barrio='" + barrio + '\'' +
                ", numeroTest=" + numeroTest +
                '}';
    }
}
