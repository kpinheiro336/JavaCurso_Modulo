package m05_Structures;

import java.util.ArrayList;

public class ArrayListsExercises {
    static void main() {
        // 1) Crea un ArrayList<String> llamado peliculas con al menos 3 títulos de películas.
//    Muestra por pantalla la primera película, la última y el número total de películas.
        ArrayList<String> peliculas = new ArrayList<>();

        peliculas.add("The Good Father");
        peliculas.add("Spider-Man");
        peliculas.add("The Avengers");

        System.out.println(peliculas.getFirst());
        System.out.println(peliculas.getLast());
        System.out.println(peliculas.size());

// 2) Crea un ArrayList<Integer> llamado tiradas con 3 resultados de una tirada de dado (entre 1 y 6).
//    Cambia el valor de la segunda tirada a 6 usando set y muestra la suma total de las tres tiradas
        ArrayList<Integer> tiradas = new ArrayList<>();

        tiradas.add(4);
        tiradas.add(2);
        tiradas.add(1);
        tiradas.add(5);
        tiradas.add(3);
        tiradas.add(6);

        tiradas.set(1, 6);
        System.out.println(tiradas);
        System.out.println(tiradas.size());


// 3) Crea un ArrayList<String> llamado colores con 4 nombres de colores.
//    Elimina el color que está en la posición 1 usando remove(indice).
//    Muestra la lista resultante y el tamaño final de la lista.
        ArrayList<String> colores = new ArrayList<>();

        colores.add("Rojo");
        colores.add("Azul");
        colores.add("Amarillo");
        colores.add("Negro");

        colores.remove(0);
        System.out.println(colores);
        System.out.println(colores.size());


// 4) Crea un ArrayList<Double> llamado pesos con 3 pesos de paquetes en kilos.
//    Calcula el peso total y el peso medio (como double) y muéstralos por pantalla.
        ArrayList<Double> pesos = new ArrayList<>();

        pesos.add(80.5);
        pesos.add(70.3);
        pesos.add(20.1);
        double s = pesos.get(0) + pesos.get(1) + pesos.get(2);
        double m = s / 2;


        System.out.println("El peso total es " + s + " kg" + " y el peso medio es " + m + " kg");


// 5) Crea un ArrayList<String> llamado usuarios con 3 nombres de usuario.
//    Comprueba si contiene el nombre de usuario "admin" usando contains y muestra
//    un mensaje indicando si existe o no en la lista.

        ArrayList<String> usuarios = new ArrayList<>();

        usuarios.add("Antonio");
        usuarios.add("Lisa");
        usuarios.add("Claudia");

        System.out.println(usuarios.contains("admin"));


// 6) Crea un ArrayList<Character> llamado iniciales con 3 iniciales de nombre y apellido.
//    Construye una cadena (String) que sea el acrónimo formado por esas tres letras y muéstrala.

        ArrayList<Character> iniciales = new ArrayList<>();

        iniciales.add('A');
        iniciales.add('L');
        iniciales.add('M');
        String Acronimo = "" + iniciales.get(0) + iniciales.get(1) + iniciales.get(2);

        System.out.println(Acronimo);

// 7) Crea un ArrayList<String> llamado nombres con 3 nombres de personas.
//    Intercambia el primer nombre y el último usando get y set, y muestra la lista resultante.
        ArrayList<String> nombres = new ArrayList<>();
        nombres.add("kevin");
        nombres.add("Ana");
        nombres.add("Felipe");

        String primeNombre = nombres.get(0);
        String ultimoNombre = nombres.get(2);

        nombres.set(0, ultimoNombre);
        nombres.set(2, primeNombre);
        System.out.println(nombres);

// 8) Crea un ArrayList<Integer> llamado saldos con 2 saldos de cuenta bancaria.
//    Simula una transferencia de 50 unidades desde la cuenta 0 a la cuenta 1
//    actualizando los valores con get y set. Muestra los saldos finales.
        //Falta terminar
        ArrayList<Integer> saldos = new ArrayList<>();
        saldos.add(300);
        saldos.add(1000);
        int transf = saldos.get(1) + 50;

        System.out.println(transf);


// 9) Crea un ArrayList<String> llamado agenda con 2 citas iniciales.
//    Inserta una nueva cita en la posición 1 utilizando add(indice, elemento)
//    y muestra la lista completa.

// 10) Crea un ArrayList<String> llamado compra con 3 productos.
//      Vacía la lista usando clear() y muestra por pantalla si está vacía
//      utilizando isEmpty().


// ===============================
// ENUNCIADOS NIVEL AVANZADO (ARRAYLIST, SIN LOOPS)
// ===============================

// -----------------------------------------------------------
// 1) Crea un ArrayList con tres nombres y muestra el segundo nombre
//    junto con el tamaño total de la lista.
// -----------------------------------------------------------

// -----------------------------------------------------------
// 2) Crea un ArrayList con tres precios. Duplica el valor del primero
//    y sustitúyelo en la lista.
// -----------------------------------------------------------

// -----------------------------------------------------------
// 3) Crea un ArrayList con tres colores. Intercambia el primero con
//    el tercero sin usar bucles.
// -----------------------------------------------------------

// -----------------------------------------------------------
// 4) Crea un ArrayList con tres palabras. Concatena las tres en el
//    orden inverso al original y muéstralas como un String.
// -----------------------------------------------------------

// -----------------------------------------------------------
// 5) Crea un ArrayList de enteros con tres valores. Calcula la suma
//    de los dos últimos y muéstrala.
// -----------------------------------------------------------

// -----------------------------------------------------------
// 6) Crea un ArrayList con tres nombres de frutas. Reemplaza la fruta
//    del medio por otra distinta y muestra la lista entera.
// -----------------------------------------------------------

// -----------------------------------------------------------
// 7) Crea un ArrayList de booleans. Comprueba si el primero y el último
//    son true al mismo tiempo.
// -----------------------------------------------------------

// -----------------------------------------------------------
// 8) Crea un ArrayList con tres Strings. Muestra la longitud total
//    sumada de los tres textos sin usar bucles.
// -----------------------------------------------------------

// -----------------------------------------------------------
// 9) Crea un ArrayList con tres números decimales. Calcula el promedio
//    de los tres elementos y muéstralo.
// -----------------------------------------------------------

// -----------------------------------------------------------
// 10) Crea un ArrayList con tres países. Sustituye todos por mayúsculas
//     usando solo accesos directos a los índices.
// -----------------------------------------------------------
    }
}
