package m05_Structures;

import java.util.Arrays;

public class ArraysExercises {
    static void main() {
        // ENUNCIADOS NIVEL MEDIO (SIN LOOPS)
// ===============================

// 1) Declara un array de 5 enteros para guardar edades, asígnale valores diferentes
//    a cada posición y muestra por pantalla la primera y la última edad.

        int[] edades = {25, 30, 12, 18, 40};
        System.out.println(edades[0]);
        System.out.println(edades[4]);


// 2) Declara un array de 3 doubles que represente precios de productos.
//    Calcula el total de la compra y el total con un 21% de IVA añadido,
//    y muéstralos por pantalla.
        double[] precio = {25.60, 19.99, 40.25};
        double total = precio[0] + precio[1] + precio[2];
        System.out.println((precio[0] + precio[1] + precio[2]));
        System.out.println((0.21 * total) + total);

// 3) Declara un array de 4 enteros que represente temperaturas diarias.
//    Calcula la temperatura media (como double) y muéstrala por pantalla.
        int[] temp = {25, 30, 18, 16};
        double media = (temp[0] + temp[1] + temp[2] + temp[3]) / 2;
        System.out.println("La temperatura media es " + media + "º");

// 4) Declara un array de 3 Strings con nombres de personas.
//    Construye un mensaje de saludo del estilo:
//    "Hola Ana, Luis y Marta" utilizando los elementos del array,
//    y muestra el mensaje por pantalla.
        String[] nombres = {"Ana", "Luis", "Marta"};
        System.out.println("Hola " + nombres[0] + ", " + nombres[1] + " y " + nombres[2]);


// 5) Declara un array de 3 enteros que represente notas de un examen.
//    Súmale 1 punto a cada nota (modificando el array) y muestra el array resultante.

        int[] notas = {7, 8, 6};
        notas[0] = notas[0] + 1;
        notas[1] = notas[1] + 1;
        notas[2] = notas[2] + 1;

        System.out.println(Arrays.toString(notas));

// 6) Declara un array de 3 booleanos que represente respuestas verdaderas o falsas.
//    Asigna: primera posición true, segunda false y tercera true.
//    Calcula si al menos una de las posiciones es true y muestra el resultado.
        boolean[] booleans = {6 > 3, 5 < 2, 20 > 0};
        System.out.println(booleans[0]);
        System.out.println(Arrays.toString(booleans));

// 7) Declara un array de 4 caracteres que forme una palabra (por ejemplo 'C','A','S','A').
//    Intercambia el segundo y el tercer carácter del array y muestra la nueva palabra.
        String[] palabra = {"C", "A", "S", "A"};
        palabra[1] = palabra[2];
        palabra[2] = palabra[1];
        System.out.println(Arrays.toString(palabra));

// 8) Declara un array de 3 enteros. Calcula y muestra el resultado de:
//    array[0] * array[2] - array[1].
        int[] numeros = {5, 25, 40};
        System.out.println(numeros[0] * numeros[2] - numeros[1]);


// 9) Declara un array de 3 enteros llamado original y otro llamado copia del mismo tamaño.
//    Copia los valores de original a copia sin usar bucles y muestra ambos arrays.

// 10) Declara un array de 3 Strings con nombres de ciudades.
//     Cambia la ciudad de la posición 1 por otra distinta y muestra todas las ciudades.


// ===============================
// ENUNCIADOS NIVEL MÁS AVANZADO (SIN LOOPS)
// ===============================

// -----------------------------------------------------------
// 1) Declara un array de 5 números enteros que representen alturas
//    en centímetros. Calcula la diferencia entre la mayor y la menor
//    altura y muéstrala por pantalla.
// -----------------------------------------------------------

// -----------------------------------------------------------
// 2) Declara un array de 4 números decimales que representen notas.
//    Calcula la suma de las dos primeras notas y réstale la última.
// -----------------------------------------------------------

// -----------------------------------------------------------
// 3) Declara un array de 3 Strings con nombres de animales.
//    Une los tres nombres en una sola frase separada por comas.
// -----------------------------------------------------------

// -----------------------------------------------------------
// 4) Declara un array de 3 booleans que representen estados.
//    Muestra cuántos de ellos son true utilizando solo condicionales.
// -----------------------------------------------------------

// -----------------------------------------------------------
// 5) Declara un array de 3 caracteres que formen una sigla.
//    Concaténalos en una sola cadena y muéstrala.
// -----------------------------------------------------------

// -----------------------------------------------------------
// 6) Declara un array de 5 enteros. Cambia la posición 0 con la 4
//    y la 1 con la 3, dejando la 2 igual. Muestra el array resultante.
// -----------------------------------------------------------

// -----------------------------------------------------------
// 7) Declara un array de 3 doubles con temperaturas.
//    Muestra la temperatura más alta sin usar bucles.
// -----------------------------------------------------------

// -----------------------------------------------------------
// 8) Declara un array con tres números. Calcula si el segundo número
//    es el promedio del primero y el tercero (sin bucles).
// -----------------------------------------------------------

// -----------------------------------------------------------
// 9) Declara un array de 4 Strings con nombres de ciudades.
//    Intercambia la segunda ciudad con la cuarta y muestra el array.
// -----------------------------------------------------------

// -----------------------------------------------------------
// 10) Declara un array de 3 enteros. Calcula la media redondeada hacia
//     abajo utilizando una operación matemática apropiada.
// -----------------------------------------------------------
    }
}


