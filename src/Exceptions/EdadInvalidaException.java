package Exceptions;

public class EdadInvalidaException extends RuntimeException{

    EdadInvalidaException(int edad){
        super("Edad: "+edad+" La edad debe estar entre 0 y 120");
    }
}
