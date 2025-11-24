package m06_Loops;

import java.util.ArrayList;

public class LoopsExercises {

    static void main() {
        // 1. Imprime los números del 1 al 10 usando while.
//        int number = 1;
//        while (number <= 10) {
//            System.out.println("contage: " + number);
//            number++;
//        }

        // 2. Usa do-while para mostrar todos los valores de un ArrayList.
        ArrayList<Integer> valores = new ArrayList<>();
        valores.add(20);
        valores.add(12);
        valores.add(6);
        valores.add(4);
        valores.add(258);
        int index = 0;
        do {
            System.out.println(valores);
            index++;
        } while (valores.get(0) <= 5);

        // 3. Imprime los múltiplos de 5 del 1 al 50 usando for.
//        System.out.println("Estos son los multiplos de 5: ");
//        for (int index = 5; index <= 50; index += 5) {
//            System.out.println(index);
//        }

        // 4. Recorre un Array de 5 números e imprime la suma total.

        // 5. Usa un for para recorrer un Array y mostrar sus valores.

        // 6. Usa for-each para recorrer un HashSet y un HashMap.

        // 7. Imprime los números del 10 al 1 (descendiente) con un bucle for.

        // 8. Usa continue para saltar los múltiplos de 3 del 1 al 20.

        // 9. Usa break para detener un bucle cuando encuentres un número negativo en un array.

        // 10. Crea un programa que calcule el factorial de un número dado


        // 11. Declara una variable int limite = 100; y muestra todos los números pares desde 1 hasta ese límite.

        // 12. Declara un array de números enteros. Recorre el array y calcula la suma total de sus valores.

        // 13. Declara una variable int numero = 12345; y calcula cuántos dígitos tiene sin convertirlo a String.

        // 14. Calcular el doble de cada número en un array

        // 15. Declara un array con varios números e identifica el valor máximo y el mínimo del array.

        // 16. Contar cuántos divisores tiene un número

        // 17. Mostrar los primeros n7 números impares

        // 18. Declara un array de enteros y calcula el promedio (media) de todos sus elementos sin usar librerías externas.

        // 19. Declara una variable int numero = 91; y comprueba si es un número primo recorriendo sus posibles divisores.

        // 20. Declara una variable int limite = 50; e imprime todos los números que sean múltiplos de 3 o de 5 (pero no de ambos).

        // 21. Declara un array de enteros que incluya ceros. Recorre el array y cuenta cuántas veces aparece el cero.

        // 22.  Declara una matriz (array bidimensional) de enteros y calcula la suma de todos sus elementos.

        // 23. Declara una variable int n = 30; y muestra todos los números menores que n que sean cuadrados perfectos.

        // 24. Declara un array de enteros y verifica si está ordenado de forma creciente. Debes recorrerlo y detectarlo manualmente.

        // 25. Declara una variable int numero = 314159; y calcula la suma de todos sus dígitos usando operaciones matemáticas.

        // 26. Dado un array de enteros, escribe un programa que recorra el array usando loops y determine si todos los números son consecutivos (por ejemplo, {4,5,6,7} sí lo son; {3,5,6} no). No puedes usar Arrays.sort() ni HashSet, solo bucles y condicionales.

        // 27. Declara dos variables sumaPares y sumaImpares. Recorre un array y usa continue para saltar los impares mientras sumas únicamente los pares en sumaPares. Luego, en un segundo bucle, recorre el mismo array y usa break para detenerte al encontrar el primer número negativo, sumando solo los impares anteriores a ese punto en sumaImpares.

        // 28. Dado un array que contiene ceros intercalados, crea un algoritmo usando un solo bucle que genere un nuevo array donde todos los números distintos de cero aparezcan primero (manteniendo su orden original) y los ceros queden desplazados al final. Ejemplo: [4,0,5,0,1] debe transformarse en [4,5,1,0,0].

        // 29. Con un número n, crea un programa que imprima la secuencia completa usando un único bucle:
        // 1 2 3 ... n ... 3 2 1
        // No puedes usar arrays ni listas; debes controlar el cambio de dirección del bucle manualmente
    }
}
