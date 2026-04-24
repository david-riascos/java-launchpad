public class StringExercises {

    static void main(String[] args) {

        // 1. Concatena dos cadenas de texto.
        String primerNombre = "Emer";
        String segundoNombre = "David";

        System.out.println(String.format("Primer Nombre: %s Segundo Nombre: %s",primerNombre, segundoNombre));



        // 2. Muestra la longitud de una cadena de texto.

        System.out.println(primerNombre.length());

        // 3. Muestra el primer y último carácter de un string.

        System.out.println("Primer Carácter: '"+primerNombre.charAt(0)+"' Último Carácter: '"+primerNombre.charAt(primerNombre.length()-1)+"'");

        // 4. Convierte a mayúsculas y minúsculas un string.

        System.out.println(primerNombre.toLowerCase());
        System.out.println(primerNombre.toUpperCase());

        // 5. Comprueba si una cadena de texto contiene una palabra concreta.

        System.out.println("Hola, mundo".contains("Hola"));

        // 6. Formatea un string con un entero.
        System.out.println(Integer.parseInt("25"));

        // 7. Elimina los espacios en blanco al principio y final de un string.
        var variable = " Soy una variable ";
        System.out.println(variable.trim());

        // 8. Sustituye todos los espacios en blanco de un string por un guión (-).
        System.out.println(variable.replace(" ","-"));

        // 9. Comprueba si dos strings son iguales.
        var variable1 = "Hola";
        var variable2 = "hola";
        System.out.println(variable1.equalsIgnoreCase(variable2));

        // 10. Comprueba si dos strings tienen la misma longitud.
        System.out.println(variable1.length() == variable2.length());

    }

}
