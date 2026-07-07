
import java.util.HashMap;


public class Maps {
    static void main() {

        HashMap<String, String> names = new HashMap<>();
        HashMap<Integer, String> users = new HashMap<>();

        // añadir valore al mapa
        names.put("david@dev.co", "emer david");
        names.put("carlos@dev.co", "carlos rios");
        names.put("james@dev.co", "james gonzalez");

        users.put(1144, "emer david riascos");
        users.put(1145, "carlos rios");
        users.put(1147, "james gonzalez");


        //verificar si existe una clave o un valor
        System.out.println(names.containsKey("david@dev.co"));
        System.out.println(users.containsValue("james gonzalez"));

        //mostrar elementos
        System.out.println(names);
        System.out.println(names.size());

        System.out.println(users);
        System.out.println(users.size());

        System.out.println(names.get("david@dev.co"));

        System.out.println(users.get(1144));


        //eliminar elementos
        System.out.println(names.remove("carlos@dev.co"));
        System.out.println(names.remove("carlos@dev.co"));
        System.out.println(names.remove("david@dev.co"));

        System.out.println(names);
        System.out.println(names.size());

        System.out.println(names.values());
        System.out.println(names.keySet());

        names.replace("james@dev.co","reemplazado");

        System.out.println(names.values());


    }
}
