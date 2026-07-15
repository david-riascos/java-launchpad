package OOP;

public class AccesModifiers {

    static void main(String[] arg) {
        Progenitores papa = new Progenitores("Carlos", "Andrés", "García", "Pérez");
        Progenitores mama = new Progenitores("Laura", "Beatriz", "Martínez", "Ruiz");

        Descendientes hijo = new Descendientes(1, "2015-03-20", "Juan", "David", papa, mama);

        System.out.println(hijo.getNombreCompleto()); // Juan David García Ruiz
        System.out.println(hijo.getPadre().getNombreCompleto()); // Carlos Andrés García Pérez

    }

}
