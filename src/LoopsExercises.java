import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class LoopsExercises {
    static void main() {

        // 1. Imprime los números del 1 al 10 usando while.

        int i = 0;
        while(i < 10){
            ++i;
            System.out.println(i);
        }

        // 2. Usa do-while para mostrar todos los valores de un ArrayList.

        ArrayList<String> ciudades = new ArrayList<>();

        ciudades.add("París");
        ciudades.add("New York");
        ciudades.add("Tokio");

        i = 0;
        do{
            System.out.println(ciudades.get(i));
            i++;
        }while (i < ciudades.size());

        // 3. Imprime los múltiplos de 5 del 1 al 50 usando for.

        for (int index = 1; index <= 50; index++){
            if(index % 5 == 0){
                System.out.println(index);
            }
        }

        // 4. Recorre un Array de 5 números e imprime la suma total.

        double[] sumandos = new double[5];

        sumandos[0] = 5.250f;
        sumandos[1] = 9.321f;
        sumandos[2] = 51.235f;
        sumandos[3] = 5.000f;
        sumandos[4] = 2.0002f;

        double total = 0;
        int factor = 1000;
        for(double suma : sumandos){
            total += suma;
        }
        System.out.println("Total: "+Math.ceil(total * factor)/factor);

        // 5. Usa un for para recorrer un Array y mostrar sus valores.

        i = 0;
        for(i = 0; i < sumandos.length; i++){
            System.out.println(Math.ceil(sumandos[i]*factor)/factor);
        }

        // 6. Usa for-each para recorrer un HashSet y un HashMap.

        HashSet<String> politicos = new HashSet<>();
        politicos.add("Abelardo Velez");
        politicos.add("Barack Obama");
        politicos.add("Cesar Gaviria");

        for (String politico: politicos){
            System.out.println(politico);
        }

        HashMap<Integer,String> mandatos = new HashMap<>();
        mandatos.put(2026,"Abelardo Velez");
        mandatos.put(2009,"Barack Obama");
        mandatos.put(1990,"Cesar Gaviria");

        for (Map.Entry<Integer,String> mandato : mandatos.entrySet()){
            System.out.println(mandatos);
        }


        // 7. Imprime los números del 10 al 1 (descendiente) con un bucle for.

        for (i = 10; i >= 1; i--){
            System.out.println(i);
        }

        // 8. Usa continue para saltar los múltiplos de 3 del 1 al 20.

        for (i=1;i<=20;i++){
            if(i % 3 == 0){
                continue;
            }
            System.out.println(i);
        }

        // 9. Usa break para detener un bucle cuando encuentres un número negativo en un array.
        int[] naturales = new int[10];

        naturales[0] = 15;
        naturales[1] = 31;
        naturales[2] = 8;
        naturales[3] = 3;
        naturales[4] = -2;
        naturales[5] = 0;
        naturales[6] = 3;
        naturales[7] = 56;
        naturales[8] = 11;
        naturales[9] = 18;

        for ( i = 0; i < naturales.length; i++) {
            if (naturales[i] < 0) {
                break;
            }
            System.out.println(naturales[i]);
        }


        // 10. Crea un programa que calcule el factorial de un número dado.
        int factorial = 5;
        int resultado = 1;

        for (i = factorial; i >= 1; i--) {
            resultado *= i;
            System.out.println("i=" + i + " -> resultado=" + resultado);
        }

    }

}
