package Exceptions;

public class main {

    public static void main(String[] args) {
        CuentaBancaria bancolombia = new CuentaBancaria(11500);
        boolean success = false;
        try{
            bancolombia.retirar(18000);
        }catch ( SaldoInsuficienteException e){
            success = true;
            System.out.println("Error: "+e);
        }finally {
            if (success){
                System.out.println("Retiro sin Exito");
            }else{
                System.out.println("Retiro con Exito");
            }
        }
        System.out.println("Hasta luego!");

        try {
            Persona david = new Persona(25);
        }catch (EdadInvalidaException e){
            System.out.println(e);
        }



    }
}
