package m05_Structures;

import java.util.HashSet;

public class SetsExercises {
    static void main() {
        // 1) Crea un Set<String> llamado "paisesVisitados" y añade al menos 4 países
//    (incluyendo "España"). Muestra por pantalla el conjunto completo,
//    si contiene "España" usando contains, y el tamaño del set con size().

        HashSet<String> paisesVisitados = new HashSet<>();

        paisesVisitados.add("España");
        paisesVisitados.add("Noruega");
        paisesVisitados.add("Brasil");
        paisesVisitados.add("Finlandia");
        paisesVisitados.add("Australia");

        System.out.println(paisesVisitados);
        System.out.println(paisesVisitados.contains("España"));
        System.out.println(paisesVisitados.size());


// 2) Crea un Set<String> llamado "etiquetas" para etiquetas de una foto.
//    Añade varias etiquetas, incluyendo alguna repetida (por ejemplo "playa" dos veces).
//    Muestra el contenido del set y el tamaño para comprobar que no se repiten.
        HashSet<String> etiquetas = new HashSet<>();

        etiquetas.add("noche");
        etiquetas.add("campo");
        etiquetas.add("playa");
        etiquetas.add("playa");
        etiquetas.add("luna");
        etiquetas.add("escritorio");
        etiquetas.add("trabajo");

        System.out.println(etiquetas);
        System.out.println(etiquetas.size());

// 3) Crea un Set<Integer> llamado "numerosLoteria" e intenta añadir 6 números,
//    incluyendo al menos un número repetido. Muestra el tamaño del set y un mensaje
//    que indique si la combinación es válida (tamaño 6) o no (menos de 6).

        HashSet<Integer> numerosLoteria = new HashSet<>();
        numerosLoteria.add(50);
        numerosLoteria.add(1);
        numerosLoteria.add(8);
        numerosLoteria.add(30);
        numerosLoteria.add(89);
        numerosLoteria.add(72);

        if (numerosLoteria.size() == 6) {
            System.out.println("Combinación válida");
        } else {
            System.out.println("Combinación no válida");
        }


// 4) Crea un Set<Character> llamado "vocalesEnNombre" que contenga las vocales
//    diferentes que aparecen en tu nombre (por ejemplo, 'A', 'E') añadiéndolas a mano.
//    Muestra las vocales guardadas y cuántas vocales distintas tiene tu nombre.

        HashSet<Character> vocalesEnNombre = new HashSet<>();

        vocalesEnNombre.add('E');
        vocalesEnNombre.add('I');
        vocalesEnNombre.add('A');

        System.out.println(vocalesEnNombre);
        System.out.println(vocalesEnNombre.size());


// 5) Crea un Set<String> llamado "rolesUsuario" que pueda contener roles como
//    "LECTOR", "EDITOR" y "ADMIN". Añade dos roles al usuario, comprueba si tiene
//    el rol "ADMIN" usando contains y muestra un mensaje diferente según el resultado.
        HashSet<String> rolesUsuario = new HashSet<>();

        rolesUsuario.add("LECTOR");
        rolesUsuario.add("EDITOR");
        rolesUsuario.add("ADMIN");

        System.out.println(rolesUsuario.contains("ADMIN"));

// 6) Crea un Set<Integer> llamado "diasConectado" que contenga números que representen
//    días de la semana en los que un usuario se conectó (por ejemplo 1=Lunes, 7=Domingo).
//    Añade algunos días y muestra si el usuario se conectó en fin de semana
//    (comprueba si contiene 6 o 7).
        HashSet<Integer> diasConectado = new HashSet<>();

        diasConectado.add(1);
        diasConectado.add(2);
        diasConectado.add(3);
        diasConectado.add(4);
        diasConectado.add(5);
        diasConectado.add(0);
        diasConectado.add(0);

        if (diasConectado.contains(6) == true || diasConectado.contains(7) == true) {
            System.out.println("Se conecto el finde");
        } else {
            System.out.println("Se conecto en dia de semana");
        }

// 7) Crea un Set<String> llamado "comandosDisponibles" con varios comandos de consola
//    (por ejemplo "start", "stop", "restart"). Elimina el comando "restart" con remove
//    y muestra el set antes y después de eliminarlo.
        HashSet<String> comandosDisponibles = new HashSet<>();

        comandosDisponibles.add("Start");
        comandosDisponibles.add("Stop");
        comandosDisponibles.add("Restart");

        System.out.println(comandosDisponibles);

        comandosDisponibles.remove("Restart");
        System.out.println(comandosDisponibles);

// 8) Crea un Set<String> llamado "categorias" con algunas categorías de productos.
//    Comprueba si el set está vacío con isEmpty(), luego elimina todos los elementos
//    con clear() y vuelve a comprobar si está vacío. Muestra los resultados.
        HashSet<String> categorias = new HashSet<>();

        categorias.add("Limpieza");
        categorias.add("Electrodomésticos");
        categorias.add("Hogar");

        System.out.println(categorias.isEmpty());
        categorias.clear();
        System.out.println(categorias);

// 9) Crea un Set<String> llamado "invitadosFiesta" con al menos 3 nombres.
//    Quita uno de los invitados con remove y muestra tanto el set resultante
//    como el booleano devuelto por remove para indicar si el invitado existía.

        //No termine

        HashSet<String> invitadosFiesta = new HashSet<>();

        invitadosFiesta.add("Monark");
        invitadosFiesta.add("Lucio");
        invitadosFiesta.add("Flavia");

        invitadosFiesta.remove("Flavia");
       
        boolean fueremovido = invitadosFiesta.remove("Flavia");
        System.out.println(fueremovido);

// 10) Crea un Set<String> llamado "lenguajes" y añade nombres de lenguajes
//      de programación. Intenta añadir "Java" dos veces. Muestra el set y un mensaje
//      indicando si "Java" estaba ya presente comprobando el resultado de add.


// ===============================
// ENUNCIADOS NIVEL AVANZADO (SETS, SIN LOOPS)
// ===============================

// -----------------------------------------------------------
// 1) Crea un HashSet con tres colores. Comprueba si contiene el color
//    "Azul" y muestra un mensaje según el resultado.
// -----------------------------------------------------------

// -----------------------------------------------------------
// 2) Crea un HashSet con tres números enteros. Comprueba si al añadir
//    un número repetido el tamaño del set cambia o no.
// -----------------------------------------------------------

// -----------------------------------------------------------
// 3) Crea un HashSet con tres palabras. Elimina una de ellas y muestra
//    cuántos elementos quedan.
// -----------------------------------------------------------

// -----------------------------------------------------------
// 4) Crea un HashSet con tres nombres. Copia los elementos a un nuevo
//    HashSet sin usar bucles y muéstralo.
// -----------------------------------------------------------

// -----------------------------------------------------------
// 5) Crea un HashSet con tres enteros. Comprueba si el set contiene
//    todos los valores de un array de dos posiciones sin loops.
// -----------------------------------------------------------

// -----------------------------------------------------------
// 6) Crea un HashSet con tres ciudades. Intenta añadir una ciudad nueva
//    y muestra si la operación tuvo éxito usando su valor booleano.
// -----------------------------------------------------------

// -----------------------------------------------------------
// 7) Crea un HashSet de booleans con valores mezclados. Comprueba si
//    contiene al menos un true usando solo condicionales.
// -----------------------------------------------------------

// -----------------------------------------------------------
// 8) Crea un HashSet con tres números. Calcula la suma de ellos
//    usando únicamente variables auxiliares (sin iteraciones).
// -----------------------------------------------------------

// -----------------------------------------------------------
// 9) Crea un HashSet con tres letras. Crea un String con todas ellas
//    concatenadas sin importar el orden.
// -----------------------------------------------------------

// -----------------------------------------------------------
// 10) Crea un HashSet con nombres de animales. Comprueba si dos animales
//     concretos están dentro del set a la vez.
// -----------------------------------------------------------

    }
}
