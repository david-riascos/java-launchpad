public class DataTypes {

    static void main(String[] args) {

        /*
         * Los tipos de datos más importantes en un lenguaje de programación
         * son los datos primitivos, ya que representan el core a partir
         * de los cuales combinados podemos crear otros tipos y estructuras
         * byte, short, char, int, long, float, double, boolean
         */

        byte   b = 127;
        short  s = 32_000;
        int    i = 2_000_000;
        long   l = 9_000_000_000L;
        float  f = 3.14f;
        double d = 3.141592653589793;
        boolean bool = false;
        char character = 'A';

        System.out.println("byte:   " + b + " (ocupa 1 byte)");
        System.out.println("short:  " + s + " (ocupa 2 bytes)");
        System.out.println("int:    " + i + " (ocupa 4 bytes)");
        System.out.println("long:   " + l + " (ocupa 8 bytes)");
        System.out.println("float:  " + f + " (ocupa 4 bytes)");
        System.out.println("double: " + d + " (ocupa 8 bytes)");
        System.out.println("boolean:   " + bool + " (ocupa 1 byte)");
        System.out.println("char:   " + character + " (ocupa 1 bite )");


    }
}
