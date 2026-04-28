public class Conditionals {

    static void main(String[] args) {

        // Condicionales
        var age = 18;

        if (age > 18) {
            System.out.println("Usuario es mayor de edad.");
        }else if(age == 18){
            System.out.println("Usuario acaba de cumplir 18.");
        }else{
            System.out.println("Usuario no es mayor de edad.");
        }

        var sex = 'M';

        switch (sex){

            case 'F':
                System.out.println("Female");
                break;
            case 'M':
                System.out.println("Male");
                break;
            case 'U':
                System.out.println("Undefined");
                break;
            default:
                System.out.println("Therian");
        }


    }

}
