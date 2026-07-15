package Exceptions;

public class Persona {
    private int edad;

    public Persona(int edad){
        if (edad < 0 ||  edad > 120){
            throw new EdadInvalidaException(edad);
        }
        this.edad = edad;
    }
}
