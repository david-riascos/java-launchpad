package Fundamental;

import java.util.ArrayList;

public class FunctionsExercises {

    static void main() {

        // 1. Crea una función que imprima "¡Te doy la bienvenida al curso de Java desde cero!".
        bienvenida();
        // 2. Escribe una función que reciba un nombre como parámetro y salude a esa persona.
        saludo("David");
        // 3. Haz un metodo que reciba dos números enteros y devuelva su resta.
        System.out.println(resta(5,3));
        // 4. Crea un metodo que calcule el cuadrado de un número (n * n).
        System.out.println(cuadrado(5));
        // 5. Escribe una función que reciba un número y diga si es par o impar.
        esImpar(5);
        // 6. Crea un metodo que reciba una edad y retorne true si es mayor de edad (y false en caso contrario).
        System.out.println(esMayor(18));
        // 7. Implementa una función que reciba una cadena y retorne su longitud.
        System.out.println(strLeng("Hola "));
        //  8. Crea un metodo que reciba un array de enteros, calcula su media y lo retorna.
        int[] arr = {2,2,2};
        System.out.println(media(arr));
        // 9. Escribe un metodo que reciba un número y retorna su factorial.
        System.out.println(factorial(5));
        // 10. Crea una función que reciba un ArrayList<String> y lo recorra mostrando cada elemento.
        ArrayList<String> nombres = new ArrayList<>();
        nombres.add("David");
        nombres.add("Andres");
        nombres.add("Calixto");
        show(nombres);
    }

    // 1. Crea una función que imprima "¡Te doy la bienvenida al curso de Java desde cero!".

    static void bienvenida(){
        System.out.println("¡Te doy la bienvenida al curso de Java desde cero!");
    }

    // 2. Escribe una función que reciba un nombre como parámetro y salude a esa persona.
    static void saludo(String nombre){
        System.out.println("Hola!, "+nombre);
    }

    // 3. Haz un metodo que reciba dos números enteros y devuelva su resta.
    static int resta(int num1, int num2){
        return (num1 - num2);
    }
    // 4. Crea un metodo que calcule el cuadrado de un número (n * n).

    static double cuadrado(int num){
        return (num*num);
    }

    // 5. Escribe una función que reciba un número y diga si es par o impar.
    static void esImpar(int num){
        if(num % 2 == 0){
            System.out.println("Es par");
        }
        System.out.println("Es impar");
    }
    // 6. Crea un metodo que reciba una edad y retorne true si es mayor de edad (y false en caso contrario).
    static boolean esMayor(int edad){
        if(edad < 18){
            return false;
        }

        return true;
    }
    // 7. Implementa una función que reciba una cadena y retorne su longitud.
    static int strLeng(String str){
        return str.length();
    }
    //  8. Crea un metodo que reciba un array de enteros, calcula su media y lo retorna.
    static int media(int[] arr){
        int suma = 0;
        for (int e : arr){
            suma += e;
        }
        return Math.divideExact(suma,arr.length);
    }
    // 9. Escribe un metodo que reciba un número y retorna su factorial.
    static int factorial(int num){

        int resultado = 1;

        for (int i = num; i > 0; i--){
            resultado *= i;
        }
        return resultado;
    }
    // 10. Crea una función que reciba un ArrayList<String> y lo recorra mostrando cada elemento.

    static void show(ArrayList<String> nombres){
        for (String nombre: nombres){
            System.out.println(nombre);
        }
    }

}
