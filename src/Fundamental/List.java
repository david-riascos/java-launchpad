package Fundamental;

import java.util.ArrayList;

public class List {



    public static void main (String[] args){

        // Declaración y Creación de ArrayLyst
        ArrayList<String> names = new ArrayList<>();
        var numbers = new ArrayList<Integer>();

        // ver longitud
        System.out.println(names.size());

        // Añadir Elementos esta estructura permite repetir valores
        names.add("David");
        names.add("Nicolas");
        names.add("Nicolas");

        System.out.println(names.size());

        //Mostrar un elemento get
        System.out.println(names.getFirst());
        System.out.println(names.get(0));

        //Modificar un elemento set
        names.set(0, "Miguel");

        System.out.println(names.getFirst());
        System.out.println(names.size());

        names.remove(0);
        System.out.println(names.size());

        // Buscar elemento
        var found = names.contains("Nicolas");

        System.out.println(found);

        //limpiar
        names.clear();
    }

}
