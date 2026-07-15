package OOP;

public class Polymorphis {

    static void main(String[] arg) {

        // ** Polimorfismo - muchas formas en que un metodo toma diferentes comportamientos**

        // - Polimorfismo por (sobrescritura)
        var animal = new Animal();
        animal.sound();

        var dog = new Dog();
        dog.sound();

        // - Polimorfismo por (sobrecarga)
        Calculadora calc = new Calculadora();

        System.out.println(calc.sumar(2, 3));              // 5   -> sumar(int, int)
        System.out.println(calc.sumar(2, 3, 4));         // 9 -> sumar(int, int, int)
        System.out.println(calc.sumar(2.5, 3.7));          // 6.2  -> sumar(double, double)
        System.out.println(calc.sumar(new int[]{1, 2, 3, 4}));  // 10   -> sumar(int[])
        System.out.println(calc.sumar("Hola ", "Mundo"));  // "Hola Mundo" -> sumar(String, String)

    }


    public static class Animal{

        public void sound(){
            System.out.println("algun sonido");
        }
    }

    public static class Dog extends Animal{
        @Override
        public void sound() {
            System.out.println("Woof!");
        }
    }

    public static class Calculadora {

        // Suma dos enteros
        public int sumar(int a, int b) {
            return a + b;
        }

        // Suma tres enteros -> distinta cantidad de parámetros
        public int sumar(int a, int b, int c) {
            return a + b + c;
        }

        // Suma dos decimales -> distinto tipo de parámetros
        public double sumar(double a, double b) {
            return a + b;
        }

        // Suma un arreglo completo -> firma totalmente distinta
        public int sumar(int[] numeros) {
            int total = 0;
            for (int n : numeros) {
                total += n;
            }
            return total;
        }

        // Concatena en vez de sumar -> mismo nombre, distinto tipo
        public String sumar(String a, String b) {
            return a + b;
        }
    }

}

