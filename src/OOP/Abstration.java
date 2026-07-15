package OOP;

public class Abstration {

    static void main() {


        // Abstraccion: Exponer lo esencial y reducir la complejidad
        var perro = new Dog("Randy");
        perro.animal();
        perro.sound();
        perro.sleep();
        perro.corro();
        perro.nado();

        var cat = new Cat("Michi");
        cat.animal();
        cat.sound();
        cat.sleep();
        cat.corro();


    }

    public static abstract class Animal{
        protected String name;

        Animal(String name){
            this.name = name;
        }

        //Metodo abstrato -> Obliga a las subClases su implementacion
        public abstract void sound();

        //Metodo concreto -> Se hereda a la subClase Opcional Sobrescribirse
        public void animal(){
            System.out.println("Soy "+this.name);
        }

        //Metodo concreto -> Se hereda a la subClase Opcional Sobrescribirse
        public void sleep(){
            System.out.println("El animal se encuentra durmiendo");
        }
    }

    public static class Dog extends Animal implements Correr , Nadar{

        public Dog(String name){
            super(name);
        }

        @Override
        public void sound() {
            System.out.println("Wooff, Wooff");
        }

        @Override
        public void animal() {
            System.out.println("Soy un perro mi nombre es: "+this.name);
        }

        @Override
        public void sleep() {
            System.out.println(this.name+", se encuentra durmiendo.");
        }

        @Override
        public void corro(){
            System.out.println("corro a una velocidad de 52 kM/H");
        }

        @Override
        public void nado() {
            System.out.println("Nado muy lento");
        }
    }

    public static class Cat extends Animal implements Correr{

        public Cat(String name){
            super(name);
        }

        @Override
        public void sound() {
            System.out.println("Miauu");
        }

        @Override
        public void corro() {
            System.out.println("Soy muy agil corriendo");
        }
    }

    public interface Volar{
        void vuelo();
    }

    public interface Nadar{
        void nado();
    }

    public interface Correr{
        void corro();
    }
}
