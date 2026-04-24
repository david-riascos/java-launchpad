public class Strings {

    static void main(String[] args) {

        // Cadenas de Texto
        String name = "David";
        var lastName = "Riascos";

        // Operaciones Básicas

        // Concatenaciones
        System.out.println(name + lastName);

        System.out.println(name +" "+ lastName);

        // Longitud
        System.out.println(name.length());

        // Obtener Carácter (a)
        System.out.println(name.charAt(1));

        System.out.println(name.charAt(name.length()-1));

        // Subcadena
        System.out.println(name.substring(1,3));

        //Mayúsculas
        System.out.println(name.toUpperCase());

        //Minúsculas
        System.out.println(name.toLowerCase());

        // Comprobar si contiene un valor
        System.out.println(name.contains("id"));

        // Comparación de Textos
        System.out.println(name.equals("David"));

        System.out.println(name.equalsIgnoreCase("david"));

        var a = "variable";
        var b = "variable";

        System.out.println(a.equals(b));

        // Trim eliminar espacios en blanco
        var texto = " Hola, Mundo! ";

        System.out.println(texto.trim());


        // Replace o reemplazar caracteres
        System.out.println(" Hola, me llamo David! ".replace("David", "Emer"));

        //Plantillas o Interpolación
        var edad = 29;
        var nombre = "David";
        System.out.println(String.format("Hola, Soy %s. Tengo %d.", name, edad));

    }

}
