package OOP;

public class Exceptions {

    public static void main(String[] args) {

        int dividendo = 10,  divisor = 0, resultado = 0;
        String name = null;

        try{
            //division por 0
            resultado = dividendo / divisor;
            System.out.println(resultado);

            //String null
            name="David";
            System.out.println(name.toUpperCase());

        } catch (ArithmeticException e) {
            System.out.println(e);
        }catch (NullPointerException e){
            System.out.println(e);
        }catch (Exception e){
            System.out.println("Error Inesperado: "+e);
        } finally {
            System.out.println("Fin try-catch");
        }

        System.out.println("Fin del programa");

    }
}
