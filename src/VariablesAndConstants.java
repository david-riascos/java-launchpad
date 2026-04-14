public class VariablesAndConstants {

    static void main(String[] args) {

        // String
        String nombre = "e david";
        String NOMBRE = "E David";

        /*
         * Java es Case Sensitive realiza distinción entre mayúsculas y minúsculas
         */
        System.out.println(nombre);
        System.out.println(NOMBRE);

        /*
         *  Puedo actualizar el valor de una variable siempre y cuando sea del mismo
         *  tipo de dato y mientras no sea una constante
         */
        nombre = "Emer david";
        // nombre = 29;
        System.out.println(nombre);

        final String EMAIL = "Dev1996@gmail.com";
        //EMAIL = "UdateDev1996@gmail.com";

        System.out.println(EMAIL);

        /*
         * Inferencia de datos podemos hacer uso de la palabra reservada
         * var en versiones modernas de java y según lo que se le asigne a
         * la variable infiere en su tipo
         */

        var salario = 5_678_456.00;
        System.out.print(salario+" ");
        System.out.println(((Object) salario).getClass().getSimpleName());


    }
}
