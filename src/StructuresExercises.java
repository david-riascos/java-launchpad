import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StructuresExercises {

    static void main() {


        //1. Crea un array con 5 valores e imprime su longitud

        int[] cedulas = new int[5];

        System.out.println(((Object) cedulas).getClass().getSimpleName());
        System.out.println(cedulas.length);

        cedulas[0] = 1144089065;
        cedulas[1] = 894089075;
        cedulas[2] = 1424089489;
        cedulas[3] = 78408954;
        cedulas[4] = 1144088023;

        System.out.println(cedulas[4]);
        System.out.println(cedulas.length);

        //2. Modifica los valores cada indíce e imprime los valores anteriores

        cedulas[0] = 10;
        cedulas[1] = 11;
        cedulas[2] = 12;
        cedulas[3] = 13;
        cedulas[4] = 14;

        System.out.println(cedulas[4]);
        System.out.println(cedulas.length);

        //3. Crea un ArrayList Vacío

        ArrayList<String> nombres =  new ArrayList<>();
        System.out.println(nombres.size());

        //4. Añade 4 elementos al arraylist y elimina uno

        nombres.add("Emer David");
        nombres.add("Julian Andres");
        nombres.add("Karol Michelle");
        nombres.add("Daniel Steven");

        System.out.println(nombres.size());
        System.out.println(nombres);
        var found = nombres.contains(" Daniel Steven ".trim());

        if(found){
            var index = nombres.indexOf(" Daniel Steven ".trim());
            nombres.remove(index);
            System.out.println(nombres);
        }

        //5. Crea un HashSet con 2 valores diferentes

        HashSet<String> ciudades = new HashSet<>();

        ciudades.add("Santiago de Cali");
        ciudades.add("Bogotá DC");

        System.out.println(ciudades.size());
        System.out.println(ciudades);
        //6. Añade un valor repetido y otro sin repetir al hashset

        ciudades.add("Medellín");
        ciudades.add("Medellín");
        ciudades.add("Barranquilla");

        System.out.println(ciudades.size());
        System.out.println(ciudades);

        //7. elimina uno de los elementos del hashset

        System.out.println(ciudades.size());
        System.out.println(ciudades);

        found = ciudades.contains(" Barranquilla ".trim());

        if(found){
            ciudades.remove(" Barranquilla ".trim());
        }
        System.out.println(ciudades.size());
        System.out.println(ciudades);

        //8. Crea un Hashmap donde la clave sea un nombre y el valor un número de teléfono añade tres
        HashMap<String, BigInteger> contactos = new HashMap<>();
        System.out.println(contactos.size());

        contactos.put("David",new BigInteger("3024554899"));
        contactos.put("Stefany",new BigInteger("311457892"));
        contactos.put("Daniel",new BigInteger("3184566792"));
        System.out.println(contactos);

        found = contactos.containsKey(" Stefany ".trim());

        if(found){
            var value = contactos.get(" Stefany ".trim());
            contactos.remove(" Stefany ".trim(),value);
        }

        System.out.println(contactos);

        //9. Modifica uno de los contactos y elimina el otro

        found = contactos.containsKey(" David ".trim());

        if(found){
            contactos.replace(" David ".trim(),contactos.get(" David ".trim()),new BigInteger("3024814"));
        }

        System.out.println(contactos);

        found = contactos.containsKey(" Stefany ".trim());

        if(found){
            var value = contactos.get(" Stefany ".trim());
            contactos.remove(" Stefany ".trim(),value);
        }

        System.out.println(contactos);

        //10. Dado un array transfórmalo en un arraylist, luego a un hashset y finalmente en un hashmap con clave y valor iguales


        // Array
        String[] paises = new String[4];

        paises[0] = "Francia";
        paises[1] = "Colombia";
        paises[2] = "Argentina";
        paises[3] = "Noruega";

        // Array to ArrayList
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.addAll(Arrays.asList(paises));
        System.out.println((Object) arrayList.getClass().getSimpleName());
        arrayList.add("Belgica");
        arrayList.add("Belgica");
        System.out.println(arrayList.size());
        System.out.println(arrayList);

        //ArrayList to HashSet

        HashSet<String> hashSet = new HashSet<>();
        hashSet.addAll(arrayList);

        System.out.println(hashSet.size());
        hashSet.add("Brazil");
        System.out.println(hashSet);

        //HashSet to HashMap

        HashMap<String, String> selecciones = new HashMap<>();
        selecciones.putAll(hashSet.stream().collect(Collectors.toMap(Function.identity(),Function.identity())));

        System.out.println(selecciones.size());
        selecciones.put("Mexico","Mexico");
        System.out.println(selecciones);

    }
}
