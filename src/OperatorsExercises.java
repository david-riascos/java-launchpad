public class OperatorsExercises {

    static void main( String[] args) {

        // 1. Crea una variable con el resultado de cada operación aritmética.
        System.out.println("=== OPERADORES ARITMÉTICOS ===\n");
        double num1 = 6;
        double num2 = 8;
        double result = 0;

        result = num1 + num2;
        System.out.println("Operación: SUMA Valor 1 : (" + num1 + ") Valor: 2 (" + num2 + ") Resultado = " + result);

        result = num1 - num2;
        System.out.println("Operación: RESTA Valor 1 : (" + num1 + ") Valor: 2 (" + num2 + ") Resultado = " + result);

        result = num1 * num2;
        System.out.println("Operación: MULTIPLICACIÓN Valor 1 : (" + num1 + ") Valor: 2 (" + num2 + ") Resultado = " + result);

        result = num1 / num2;
        System.out.println("Operación: DIVISIÓN Valor 1 : (" + num1 + ") Valor: 2 (" + num2 + ") Resultado = " + result);

        result = num1 % num2;
        System.out.println("Operación: MODULO Valor 1 : (" + num1 + ") Valor: 2 (" + num2 + ") Resultado = " + result);

        // 2. Crea una variable para cada tipo de operación de asignación.
        double a = 7;
        System.out.println("=== OPERADORES DE ASIGNACIÓN ===\n");

        // (=) Asignación simple
        a = 7;
        System.out.println("OPERADOR : asignación         (=)   | a = 7         | valor actual: (" + a + ")");

        // (+=) Suma y asigna
        a += 3;
        System.out.println("OPERADOR : suma y asigna      (+=)  | a += 3 → a = a + 3 | valor actual: (" + a + ")");

        // (-=) Resta y asigna
        a -= 3;
        System.out.println("OPERADOR : resta y asigna     (-=)  | a -= 3 → a = a - 3 | valor actual: (" + a + ")");

        // (*=) Multiplica y asigna
        a *= 3;
        System.out.println("OPERADOR : multiplica y asigna (*=) | a *= 3 → a = a * 3 | valor actual: (" + a + ")");

        // (/=) Divide y asigna
        a /= 3;
        System.out.println("OPERADOR : divide y asigna    (/=)  | a /= 3 → a = a / 3 | valor actual: (" + a + ")");

        System.out.println();

        // (++a) PRE-incremento: suma 1 ANTES de usar el valor
        System.out.println("valor antes de pre-incremento  : (" + a + ")");
        System.out.println("OPERADOR : pre-incremento  (++a) | ++a → suma 1 ANTES  | valor al momento de usar: (" + (++a) + ")");
        System.out.println("valor después de pre-incremento: (" + a + ")\n");

        // (a++) POST-incremento: suma 1 DESPUÉS de usar el valor
        System.out.println("valor antes de post-incremento  : (" + a + ")");
        System.out.println("OPERADOR : post-incremento (a++) | a++ → suma 1 DESPUÉS | valor al momento de usar: (" + (a++) + ")");
        System.out.println("valor después de post-incremento: (" + a + ")\n");

        // (--a) PRE-decremento: resta 1 ANTES de usar el valor
        System.out.println("valor antes de pre-decremento  : (" + a + ")");
        System.out.println("OPERADOR : pre-decremento  (--a) | --a → resta 1 ANTES  | valor al momento de usar: (" + (--a) + ")");
        System.out.println("valor después de pre-decremento: (" + a + ")\n");

        // (a--) POST-decremento: resta 1 DESPUÉS de usar el valor
        System.out.println("valor antes de post-decremento  : (" + a + ")");
        System.out.println("OPERADOR : post-decremento (a--) | a-- → resta 1 DESPUÉS | valor al momento de usar: (" + (a--) + ")");
        System.out.println("valor después de post-decremento: (" + a + ")");

        // 3. Imprime 3 comparaciones verdaderas con diferentes operadores de comparación.
        System.out.println("=== OPERADORES RELACIONALES O DE COMPARACIÓN ===\n");
        num1 = 2;
        num2 = 2;
        boolean expresion = num1 > num2;
        System.out.println("Operación: Mayor que  Valor 1 : (" + num1 + ") > Valor: 2 (" + num2 + ") Resultado = " + expresion);

        expresion = num1 >= num2;
        System.out.println("Operación: Mayor o Igual  Valor 1 : (" + num1 + ") >= Valor: 2 (" + num2 + ") Resultado = " + expresion);

        expresion = num1 == num2;
        System.out.println("Operación: igualdad  Valor 1 : (" + num1 + ") == Valor: 2 (" + num2 + ") Resultado = " + expresion);

        expresion = num1 != num2;
        System.out.println("Operación: diferente  Valor 1 : ("+num1+") != Valor: 2 ("+num2+") Resultado = "+expresion);

        expresion = num1 < num2;
        System.out.println("Operación: menor que  Valor 1 : ("+num1+") < Valor: 2 ("+num2+") Resultado = "+expresion);

        expresion = num1 <= num2;
        System.out.println("Operación: menor o igual  Valor 1 : ("+num1+") <= Valor: 2 ("+num2+") Resultado = "+expresion);

        // 4. Utiliza el operador lógico and.
        System.out.println("=== OPERADORES LÓGICOS ===\n");

        num1 = 10;
        num2 = 20;
        double num3 = 10;

        // AND (&&) - ambas condiciones deben ser true
        expresion = (num1 < num2) && (num1 == num3);
        System.out.println("Operación: AND (&&)  | (" + num1 + " < " + num2 + ") && (" + num1 + " == " + num3 + ") | Resultado: " + expresion);

        expresion = (num1 > num2) && (num1 == num3);
        System.out.println("Operación: AND (&&)  | (" + num1 + " > " + num2 + ") && (" + num1 + " == " + num3 + ") | Resultado: " + expresion);

        System.out.println();

        // 5. OR (||) - al menos una condición debe ser true
        expresion = (num1 > num2) || (num1 == num3);
        System.out.println("Operación: OR  (||)  | (" + num1 + " > " + num2 + ") || (" + num1 + " == " + num3 + ") | Resultado: " + expresion);

        expresion = (num1 > num2) || (num1 > num3);
        System.out.println("Operación: OR  (||)  | (" + num1 + " > " + num2 + ") || (" + num1 + " > "  + num3 + ") | Resultado: " + expresion);

        System.out.println();

        // 6. Combinación AND + OR
        expresion = (num1 < num2) && (num1 == num3) || (num2 > num3);
        System.out.println("Operación: AND + OR  | (" + num1 + " < " + num2 + ") && (" + num1 + " == " + num3 + ") || (" + num2 + " > " + num3 + ") | Resultado: " + expresion);

        expresion = (num1 > num2) || (num3 < num2) && (num1 == num3);
        System.out.println("Operación: OR  + AND | (" + num1 + " > " + num2 + ") || (" + num3 + " < " + num2 + ") && (" + num1 + " == " + num3 + ") | Resultado: " + expresion);

        System.out.println();

        // 7. Negación (!)
        expresion = !(num1 > num2);
        System.out.println("Operación: NOT (!)   | !(" + num1 + " > " + num2 + ")                           | Resultado: " + expresion);

        expresion = !(num1 == num3);
        System.out.println("Operación: NOT (!)   | !(" + num1 + " == " + num3 + ")                          | Resultado: " + expresion);

        expresion = !(num1 > num2) && !(num1 > num3);
        System.out.println("Operación: NOT + AND | !(" + num1 + " > " + num2 + ") && !(" + num1 + " > " + num3 + ")          | Resultado: " + expresion);

        System.out.println();

        // 8. Operadores unarios
        double x = 5;
        System.out.println("Operación: unario (+) | +x         | valor: (+" + x + ")  → positivo explícito");
        System.out.println("Operación: unario (-) | -x         | valor: (" + (-x) + ") → invierte el signo");
        System.out.println("Operación: unario (!) | !true      | valor: (" + (!true) + ")  → niega el booleano");

        System.out.println();

        // 9. Combinación aritmética + comparación + lógica
        double salario    = 3000;
        double experiencia = 5;
        double notaExamen  = 85;

        boolean aprobado = (salario > 2000) && (experiencia >= 3) || (notaExamen >= 80);
        System.out.println("=== EJEMPLO REAL: ¿Candidato aprobado? ===");
        System.out.println("Salario: " + salario + " | Experiencia: " + experiencia + " años | Nota examen: " + notaExamen);
        System.out.println("Regla: (salario > 2000 && experiencia >= 3) || notaExamen >= 80");
        System.out.println("Resultado: " + aprobado);

        boolean descuento = (salario * 0.1 > 200) && !(notaExamen < 70);
        System.out.println("\n=== EJEMPLO REAL: ¿Aplica descuento? ===");
        System.out.println("Regla: (salario * 0.1 > 200) && !(notaExamen < 70)");
        System.out.println("Resultado: " + descuento);

    }
}
