import java.util.Scanner;

public class HelloWorldExercises {

    public static void main(String[] args) {

        // 1. Imprime un mensaje que diga tu nombre en lugar de "¡Hola Mundo!".
        System.out.println("Emer David Riascos Macuase");

        // 2. Imprime dos líneas: "Hola" y luego "Mundo" con un solo println.
        System.out.println("Hola \nMundo");

        // 3. Añade un comentario sobre lo que hace cada línea del programa.

        // 4. Crea un comentario en varias líneas.

        /*
         * Esto es un comentario
         * Multi-linea :)
         */

        // 5. Imprime tu edad, tu color favorito y tu ciudad.

        System.out.println("Mi edad es: 29 \nMi color favorito es: Lima \nMi Ciudad actual: Santiago de Cali");

        // 6. Explora los diferentes System.XXX.println(); más allá de "out".
        System.out.printf("Mi edad es: %d Mi color favorito es: %s Mi Ciudad actual: %s%n",  29, "Lima", "Santiago de Cali");
        System.out.println("Tiene un error en la line 26 [Example]");
        System.err.println("Error msj");

        Scanner scanner = new Scanner(System.in);
        String userName = "";
        System.out.println("Por favor digita tu nombre: ");
        userName = scanner.nextLine();
        System.out.printf("Hola, %s Bienvenido.%n", userName);

        // 9. Imprime un diseño de un cuadrado.
        System.out.println("*********");
        System.out.println("*       *");
        System.out.println("*       *");
        System.out.println("*********");


        // 10. Imprime un diseño de un triangulo.
        System.out.println("    *    ");
        System.out.println("   ***   ");
        System.out.println("  *****  ");
        System.out.println(" ******* ");

    }

}
