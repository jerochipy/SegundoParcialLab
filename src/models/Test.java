package models;

public class Test {
    private Double temperatura;
    private String DNI;

    public Test(Double temperatura, String DNI) {
        this.temperatura = temperatura;
        this.DNI = DNI;
    }

    @Override
    public String toString() {
        return "Test{" +
                "temperatura=" + temperatura +
                ", DNI='" + DNI + '\'' +
                '}';
    }

    public Double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(Double temperatura) {
        this.temperatura = temperatura;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }
}
