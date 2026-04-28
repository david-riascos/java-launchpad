public class structures {

    static void main(String[] args) {

        // Arrays Declaración y creación
        int[] numbers = new int[5];
        System.out.println(numbers);

        String[] names = {"David", "Riascos", "Devops"};
        System.out.println(names);


        // Acceso
        System.out.println(numbers[0]);
        System.out.println(names[2]);
        System.out.println((new String[3])[0]);

        // Metodos & Modificaciones
        numbers[0] = 1;
        numbers[1] = 10;
        numbers[2] = 100;

        System.out.println(numbers[0]);



    }
}
