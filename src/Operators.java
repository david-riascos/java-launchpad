public class Operators {

    static void main(String[] args) {

        /*
         *  Los operadores son escenciales en todos los programas ya que estos
         *  a su vez nos permiten realizar operaciones entre valores o tambien
         *  tomar decisiones sobre un posible resultado y se dividen en dos grupos
         *  aritméticos, lógicos,relacionales,asignación,unarios
         */

        // Operadores arítméticos permiten operar entre dos valores

        double num1 = 7;
        double num2 = 3;

        System.out.println("SUMA (+) "+ (num1 + num2));
        System.out.println("RESTA (-) "+ (num1 - num2));
        System.out.println("MULTIPLICACIÓN (*) "+ (num1 * num2));
        System.out.println("DIVISIÓN (/) "+ (num1 / num2));
        System.out.println("MODULO O RESIDUO (%) "+ (num1 % num2));

        // Operadores de asignación nos permiten almacenar o asignar un valor

        num1 = (num2 * 2);
        System.out.println("Nuevo valor de variable num1 usando operador (=)  : "+ num1);

        num1 += 1;
        System.out.println("Nuevo valor de variable num1 usando operador (+=) 1 : "+ num1);

        num1 -= 1;
        System.out.println("Nuevo valor de variable num1 usando operador (-=) 1 : "+ num1);

        num1 *= 2;
        System.out.println("Nuevo valor de variable num1 usando operador (*=) 2 : "+ num1);

        num1 /= 2;
        System.out.println("Nuevo valor de variable num1 usando operador (/=) 2 : "+ num1);

        num1 %= 5;
        System.out.println("Nuevo valor de variable num1 usando operador (%=) 5 : "+ num1);

        // Operadores relacionales nos permiten verificar un resultado con relación al operador

        System.out.println("igualdad "+num1+ " (==) "+num2+ ": "+ (num1 == num2));

        System.out.println("diferencia "+num1+ " (!=) "+num2+ ": "+ (num1 != num2));

        System.out.println("mayor que "+num1+ " (>) "+num2+ ": "+ (num1 > num2));

        System.out.println("mayor o igual "+num1+ " (>=) "+num2+ ": "+ (num1 >= num2));

        System.out.println("menor que "+num1+ " (<) "+num2+ ": "+ (num1 < num2));

        System.out.println("menor o igual "+num1+ " (<=) "+num2+ ": "+ (num1 <= num2));


        // Operadores lógicos nos permiten combinar expresiones boleanas usando las tablas de verdad

        // Tabla de verdad con operador lógico Y (AND)

        System.out.println(" Operador: Y / (AND) (&&) es verdad si antecedente y el consecuente son verdaderos");
        System.out.println(" Operador: Y / (AND) "+true+ " (&&) "+true+ ": "+ (true && true));
        System.out.println(" Operador: Y / (AND) "+true+ " (&&) "+false+ ": "+ (true && false));
        System.out.println(" Operador: Y / (AND) "+false+ " (&&) "+true+ ": "+ (false && true));
        System.out.println(" Operador: Y / (AND) "+false+ " (&&) "+false+ ": "+ (false && false));

        System.out.println(" Operador: O / (OR) (||) es falsa si todas las expresiones son falsas");
        System.out.println(" Operador: O / (OR) "+true+ " (||) "+true+ ": "+ (true || true));
        System.out.println(" Operador: O / (OR) "+true+ " (||) "+false+ ": "+ (true || false));
        System.out.println(" Operador: O / (OR) "+false+ " (||) "+true+ ": "+ (false || true));
        System.out.println(" Operador: O / (OR) "+false+ " (||) "+false+ ": "+ (false || false));

        System.out.println(" Operador: NOT / (!) niega el valor de verdad de una expresión");
        System.out.println(" Operador: O / (OR) "+true+ " !(||) "+true+ ": "+ !(true || true));
        System.out.println(" Operador: Y / (AND) "+true+ " !(&&) "+false+ ": "+ !(true && false));
        System.out.println(" Operador: O / (OR) "+false+ " !(||) "+true+ ": "+ !(false || true));
        System.out.println(" Operador: Y / (AND) "+false+ " !(&&) "+false+ ": "+ !(false && false));

        int valor = 10;
        boolean activo = true;

        // 1. Unario Positivo (+) or (-) invierte el valor de un resultado o variable
        // teniendo en cuenta la ley de signos
        System.out.println("Positivo: " + (+valor)); // Muestra 10

        System.out.println("Negativo: " + (-valor)); // Muestra -10

        // 2. Incremento (++) y Decremento (--)
        // Aquí es donde la posición (donde se encuentre el operador) cambia todo.

        // PRE-INCREMENTO: Incrementa ANTES de usar el valor en la línea.
        System.out.println("Pre-incremento (++valor): " + (++valor)); // Muestra 11. 'valor' ahora es 11.

        // POST-INCREMENTO: Entrega el valor actual y LUEGO incrementa.
        // En la siguiente línea verás 11, pero internamente se volverá 12.
        System.out.println("Post-incremento (valor++): " + (valor++)); // Muestra 11.
        System.out.println("Valor despues del post-incremento: " + valor); // Muestra 12.

        // 4. Complemento de bits (~)
        // Invierte todos los bits de un entero (operación a nivel binario).
        // Fórmula rápida: -(n + 1)
        System.out.println("Complemento de bits (~12): " + (~valor)); // Muestra -13

    }
}
