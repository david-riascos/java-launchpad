public class BeginnerExercises {

    static void main(String[] args) {

        // 1. Declara una variable de tipo String y asígnale tu nombre.
        String name = "E David RM";
        System.out.println(name);

        // 2. Crea una variable de tipo int y asígnale tu edad.
        int age = 29;
        System.out.println(age);

        // 3. Crea una variable double con tu altura en metros.
        double height =  1.80;
        System.out.println(height);

        // 4. Declara una variable de tipo boolean que indique si te gusta programar.
        boolean developer = true;
        System.out.println(developer);

        // 5. Declara una constante con tu email.
        final String EMAIL =  "developer2026@.dev.co";
        System.out.println(EMAIL);
        // 6. Crea una variable de tipo char y guárdale tu inicial.
        char character = 'A';
        System.out.println(character);

        // 7. Declara una variable de tipo String con tu localidad, y a continuación cambia su valor y vuelve a imprimirla.

        String localidad = "Santiago de Cali";
        System.out.println(localidad);

        localidad = "Cali,Valle";
        System.out.println(localidad);

        // 8. Crea una variable int llamada a, otra b, e imprime la suma de ambas.
        int a = 8, b = 2;
        int c = a+b;
        System.out.println(c);

        // 9. Imprime el tipo de dos variables creadas anteriormente.
        System.out.println( EMAIL.getClass().getSimpleName());
        System.out.println( ((Object) developer).getClass().getSimpleName() );

        // 10. Intenta declarar una variable sin inicializarla y luego asígnale un valor antes de imprimirla.

        String any;
        any = "@Dev1996";
        System.out.println(any);

    }
}
