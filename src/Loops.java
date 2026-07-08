import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Loops {

    static void main() {

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


        // Loops
        for (int i = 0; i < paises.length; i++){
            System.out.println("Index: for "+i+" "+paises[i]);
        }

        int i = 0;
        while (i < arrayList.size()){
            System.out.println("Index: while "+i+" "+arrayList.get(i));
            i++;
        }

        i = arrayList.size()-1;
        do{
            System.out.println("Index: Do while "+i+" "+arrayList.get(i));
            i--;
        }while (i>=0);

        //for-each tipo estructura recomendado para recorrer estructuras
        // tipo de dato a recorrer y each o variable

        for(String arr: arrayList){
            System.out.println("Foreach: "+arr);
        }

        HashMap<String, String> names = new HashMap<>();

        // añadir valore al mapa
        names.put("david@dev.co", "emer david");
        names.put("carlos@dev.co", "carlos rios");
        names.put("james@dev.co", "james gonzalez");

        for(Map.Entry<String, String> name: names.entrySet()){
            System.out.println(name);
            System.out.println(name.getKey());
            System.out.println(name.getValue());
        }


    }

}
