package OOP;

public class Composition {

    static void main(String[] arg) {

        var hp = new Computador();
        hp.on();
        hp.off();
    }

    // Composicion de clases
    public static class Computador{

        protected final Pantalla pantalla;
        protected final Teclado teclado;
        protected final Ram ram;
        protected final HardDisk discoDuro;

        public Computador(){
            pantalla = new Pantalla();
            teclado = new Teclado();
            ram = new Ram();
            discoDuro = new HardDisk();
        }

        public void on(){
            System.out.println("PC encendida");
        }

        public void off(){
            System.out.println("PC apagada");
        }

    }

    public static class Pantalla{
        public Pantalla(){
            System.out.println("Pantalla activada");
        }
    }

    public static class Teclado{
        public Teclado(){
            System.out.println("Teclado activado");
        }
    }

    public static class Ram{
        public Ram(){
            System.out.println("Ram activada");
        }
    }

    public static class HardDisk{
        public HardDisk(){
            System.out.println("HardDisk activada");
        }
    }
}
