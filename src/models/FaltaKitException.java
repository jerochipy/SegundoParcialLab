package models;

public class FaltaKitException extends Exception{
    @Override
    public String getMessage() {
        return "No hay suficientes kits para registrar la persona, consulte al SSM si hay mas.";
    }
}
