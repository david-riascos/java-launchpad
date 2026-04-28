public class ConditionalsExercises {

    static void main(String[] args) {

        // 1. Establece la edad de un usuario y muestra si puede votar (mayor o igual a 18

        int edad = 18;

        if(edad < 18){
            System.out.println("No puedes Votar");
        }else{
            System.out.println("Elige tu candidato");
        }

        // 2. Declara dos números y muestra cuál es mayor, o si son iguales.

        var num1 = 25;
        var num2 = 56;

        if(num1 == num2){
            System.out.println("Son Iguales");
        }else if(num1 > num2){
            System.out.println("Num1 es mayor");
        }else{
            System.out.println("Num2 es mayor");
        }

        // 3. Dado un número, verifica si es positivo, negativo o cero.

        var num = 0;

        if(num == 0){
            System.out.println("El numero es 0");
        }else if(num > 0){
            System.out.println("El numero es positivo");
        }else{
            System.out.println("El numero es negativo");
        }

        // 4. Crea un programa que diga si un número es par o impar.

        var esPar = 5;

        esPar = esPar % 2;

        if(esPar == 0){
            System.out.println(" Es un numero Par: ");
        }else{
            System.out.println(" Es un numero Impar");
        }

        // 5. Verifica si un número está en el rango de 1 a 100.

        var numRango = 5;

        if(numRango > 0 && numRango <= 100 ){
            System.out.println("El numero esta dentro del Rango");
        }else{
            System.out.println("El numero esta fuera el Rango");
        }

        // 6. Declara una variable con el día de la semana (1-7) y muestra su nombre con switch.

        var dia = 3;

        switch (dia){

            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            default:
                System.out.println("Domingo");

        }

        // 7. Simula un sistema de notas: muestra "Sobresaliente", "Aprobado" o "Suspenso" según la nota (0-100).
        var nota = 29;

        if(nota <= 30){
            System.out.println("Suspenso");
        }else if(nota > 30 && nota <= 70 ){
            System.out.println("Aprobado");
        }else{
            System.out.println("Sobresaliente");
        }

        // 8. Escribe un programa que determine si puedes entrar al cine: debes tener al menos 15 años o ir acompañado.

        var cine = 14;

        if(cine < 15){
            System.out.println("Debes Traer Acompañante");
        }else{
            System.out.println("Puedes Pasar");
        }

        // 9. Crea un programa que diga si una letra es vocal o consonante.
        var letra = 'c';
        switch (letra) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("Es una vocal.");
                break;
            default:
                System.out.println("Es una consonante.");
                break;
        }

        // 10. Usa tres variables a, b, c y muestra cuál es el mayor de las tres.
        var num_1 = 17; var num_2 = 17; var num_3 = 17;

        if(num_1 >= num_2 && num_1 >= num_3){
            System.out.println("num_1 es Mayor");
        }else if(num_2 >= num_1 && num_2 >= num_3){
            System.out.println("num_2 es Mayor");
        }else{
            System.out.println("El num_3 es mayor");
        }

    }
}
