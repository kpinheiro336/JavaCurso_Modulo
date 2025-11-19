package m05_Structures;

import java.util.HashMap;

public class HashMapsExercises {
    static void main() {
//    1) Crea un HashMap<String, Integer> llamado "edades" que guarde la edad de
//    tres personas (por ejemplo "Ana" -> 20, "Luis" -> 25, "Marta" -> 30).
//    Muestra por pantalla la edad de "Luis" y el número total de personas
//    almacenadas usando size().
        HashMap<String, Integer> edades = new HashMap<>();

        edades.put("Ana", 20);
        edades.put("Luis", 25);
        edades.put("Marta", 30);

        System.out.println(edades.get("Luis"));
        System.out.println(edades.size());

// 2) Crea un HashMap<String, String> llamado "telefonos" que guarde el número
//    de teléfono de tres contactos. Muestra el teléfono de uno de ellos,
//    luego actualiza el teléfono de ese contacto usando put y muestra el
//    valor anterior y el nuevo.
        HashMap<String, String> telefonos = new HashMap<>();

        telefonos.put("Amanda", "634478963");
        telefonos.put("Lucio", "654123789");
        telefonos.put("Defante", "685236478");
        telefonos.put("Casimito", "654741012");

        System.out.println(telefonos.get("Casimito"));

        System.out.println(telefonos.get("Casimito"));
        telefonos.put("Casimito", "563965748");
        System.out.println(telefonos);


// 3) Crea un HashMap<String, Double> llamado "precios" con el precio de
//    tres productos. Calcula el precio total de la compra sumando los
//    tres valores usando get y muéstralo por pantalla.
        HashMap<String, Double> precios = new HashMap<>();

        precios.put("Bebida", 25.50);
        precios.put("Esponja", 1.50);
        precios.put("Papel", 5.75);
        double suma = precios.get("Bebida") + precios.get("Esponja") + precios.get("Papel");

        System.out.println(suma);


// 4) Crea un HashMap<Integer, String> llamado "salas" que asocie el número
//    de una sala con su nombre (por ejemplo 1 -> "Reuniones", 2 -> "Conferencias").
//    Elimina una de las salas usando remove y muestra el HashMap resultante
//    junto con el valor devuelto por remove (la sala eliminada).
        HashMap<Integer, String> salas = new HashMap<>();
        salas.put(1, "Reuniones");
        salas.put(2, "Conferencias");
        salas.put(3, "Baño");
        System.out.println(salas);

        salas.remove(2);
        System.out.println(salas);

// 5) Crea un HashMap<String, Boolean> llamado "asistencia" donde la clave
//    sea el nombre de un alumno y el valor indique si ha asistido (true/false).
//    Comprueba si un alumno concreto está en el mapa usando containsKey y
//    muestra un mensaje indicando si hay registro de su asistencia.
        HashMap<String, Boolean> asistencia = new HashMap<>();

        asistencia.put("Carlos", true);
        asistencia.put("Amanda", true);
        asistencia.put("Felipe", false);
        asistencia.put("Juan", true);
        asistencia.put("Kevin", false);

        System.out.println(asistencia.containsKey("Carlos"));


// 6) Crea un HashMap<String, String> llamado "usuarioRol" que asocie nombres
//    de usuario con su rol ("USER", "ADMIN", etc.). Comprueba usando
//    containsValue si existe algún usuario con el rol "ADMIN" y muestra
//    un mensaje diferente según el resultado.

// 7) Crea un HashMap<String, String> llamado "traducciones" que contenga
//    algunas palabras en inglés como clave y su traducción al español como valor.
//    Pide la traducción de una palabra concreta usando get y, si no existe
//    (get devuelve null), muestra un mensaje indicando que no se encontró.

// 8) Crea un HashMap<String, Integer> llamado "inventario" que relacione
//    el nombre de un producto con la cantidad en stock. Aumenta en 10 unidades
//    el stock de uno de los productos usando get y put, y muestra el nuevo stock.

// 9) Crea un HashMap<Integer, Double> llamado "notasExamen" que asocie el
//    número de un examen (1, 2, 3) con su nota. Calcula la nota media de los
//    tres exámenes como double y muéstrala por pantalla.

// 10) Crea un HashMap<String, String> llamado "login" donde la clave sea el
//     nombre de usuario y el valor la contraseña. Declara dos variables
//     String "usuarioIntroducido" y "passwordIntroducida" y comprueba si
//     el inicio de sesión es correcto: el usuario debe existir en el mapa
//     y la contraseña debe coincidir con la almacenada. Muestra si el login
//     es correcto o incorrecto.


// ===============================
// ENUNCIADOS NIVEL AVANZADO (HASHMAP, SIN BUCLES)
// ===============================

// -----------------------------------------------------------
// 1) Crea un HashMap que relacione países con sus capitales. Muestra la
//    capital almacenada para un país concreto.
// -----------------------------------------------------------


// -----------------------------------------------------------
// 2) Crea un HashMap donde la clave sea un String (producto) y el valor
//    un double (precio). Calcula cuánto cuesta comprar dos productos
//    concretos.
// -----------------------------------------------------------


// -----------------------------------------------------------
// 3) Crea un HashMap con tres pares nombre->edad. Muestra la edad más
//    alta comparando únicamente las tres claves directamente.
// -----------------------------------------------------------

// -----------------------------------------------------------
// 4) Crea un HashMap de códigos de país (int) y nombre de país (String).
//    Muestra el nombre asociado a los códigos 1 y 3 en una frase.
// -----------------------------------------------------------

// -----------------------------------------------------------
// 5) Crea un HashMap donde cada clave es un nombre y cada valor una nota.
//    Calcula el promedio de las tres notas sin usar bucles.
// -----------------------------------------------------------

// -----------------------------------------------------------
// 6) Crea un HashMap de usuario->contraseña. Comprueba si una contraseña
//    corresponde al usuario dado.
// -----------------------------------------------------------

// -----------------------------------------------------------
// 7) Crea un HashMap donde la clave es un producto y el valor es un
//    booleano indicando si está disponible. Muestra cuántos productos
//    están disponibles usando solo condicionales.
// -----------------------------------------------------------

// -----------------------------------------------------------
// 8) Crea un HashMap que relacione nombres de colores con su código
//    numérico. Construye un array con tres de esos valores.
// -----------------------------------------------------------

// -----------------------------------------------------------
// 9) Crea un HashMap de día->temperatura. Muestra la diferencia entre
//    la temperatura del lunes y la del miércoles.
// -----------------------------------------------------------

// -----------------------------------------------------------
// 10) Crea un HashMap que guarde el nombre de un alumno y su nota.
//     Muestra si un alumno en concreto ha aprobado (nota >= 5).
// -----------------------------------------------------------

    }
}
