import java.util.HashSet;

public class Set {

    public static void main (String[] args){

        // Declaración y Creación de Sets
        HashSet<String> names = new HashSet<>();
        var numbers = new HashSet<Integer>();

        // ver longitud
        System.out.println(names.size());

        // Añadir Elementos esta estructura no permite repetir valores
        names.add("David");
        names.add("Nicolas");
        names.add("Nicolas");

        // Tampoco tienen un orden, usan un hash para acceder más rapido
        System.out.println(names);
        System.out.println(names.size());

        //Buscar elemento
        var found = names.contains("David");
        System.out.println(found);

        //Eliminar elemeno
        names.remove("Nicolas");
        System.out.println(names);
        System.out.println(names.size());


    }

}
