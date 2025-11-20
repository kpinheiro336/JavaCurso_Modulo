package m05_Structures;

import java.util.HashMap;

public class StructuresExercises2 {
    static void main() {
        // 1) Tienes una lista de etiquetas de una foto que puede contener
//    duplicados, por ejemplo: "playa", "montaña", "playa".
//    Representa estas etiquetas y obtén el conjunto de etiquetas
//    únicas que aparecen. Muestra por pantalla las etiquetas
//    originales y las etiquetas únicas, junto con el número
//    de etiquetas únicas.
// -----------------------------------------------------------
        HashMap<Integer, String> etiquetas = new HashMap<>();

        etiquetas.put(1, "Playa");
        etiquetas.put(2, "Montaña");
        etiquetas.put(3, "Playa");
        etiquetas.put(4, "Oficina");

        System.out.println(etiquetas);
        etiquetas.remove(3);
        System.out.println(etiquetas);


// -----------------------------------------------------------
// 2) Tienes una lista de nombres de usuarios en el orden en que
//    se conectaron a una aplicación, y un conjunto de usuarios
//    que son administradores. A partir de la lista, indica si el
//    primer y el último usuario que se conectaron son
//    administradores o no. Muestra un mensaje específico
//    para cada uno.
// -----------------------------------------------------------
        HashMap<String, String> nombres = new HashMap<>();
        nombres.put("Kevin", "Administrador");
        nombres.put("Amanda", "Usuario");
        nombres.put("Lucio", "Usuario");
        nombres.put("Casimito", "Usuario");

        System.out.println("El primero es un " + nombres.get("Kevin") + " y el ultimo es " + nombres.get("Casimito"));


// -----------------------------------------------------------
// 3) Un sistema almacena el nombre de tres productos en un array,
//    y dispone de una lista con los nombres de los productos que
//    están actualmente en oferta. Muestra para el primer y el
//    tercer producto del array si están o no en oferta y
//    construye un mensaje del estilo:
//    "Producto X en oferta: true/false".
// -----------------------------------------------------------
        boolean[] oferta = {true, false, false, true};

        System.out.println("El producto X en oferta: " + oferta[2]);


// -----------------------------------------------------------
// 4) Tienes una lista con los nombres de empleados de una empresa
//    y un mapa que relaciona cada empleado con su salario.
//    A partir de la lista, calcula el salario total de los dos
//    primeros empleados y muéstralo por pantalla.
// -----------------------------------------------------------
        HashMap<String, Double> empleado = new HashMap<>();

        empleado.put("A", 2.500);
        empleado.put("B", 1.835);
        empleado.put("C", 3.500);
        empleado.put("D", 1.550);
        empleado.put("E", 7.500);
        empleado.put("F", 1.200);

        double suma = empleado.get("A") + empleado.get("B");
        System.out.println(suma + ".00 €");

// -----------------------------------------------------------
// 5) Un videojuego guarda la puntuación de tres niveles en un
//    array de enteros. Además, para cada nivel hay un
//    multiplicador almacenado en un mapa (clave = nivel,
//    valor = multiplicador). Calcula la puntuación total de los
//    niveles 1 y 3 aplicando su multiplicador y muestra el
//    resultado final.
// -----------------------------------------------------------
        int[] puntuacion = {200, 150, 100};
        HashMap<Integer, Double> multiplicadores = new HashMap<>();

        multiplicadores.put(1, 1.5);
        multiplicadores.put(2, 2.0);
        multiplicadores.put(3, 1.2);
        double nivel1 = puntuacion[0] * multiplicadores.get(1);
        double nivel3 = puntuacion[2] * multiplicadores.get(3);
        System.out.println("Puntuacion del nivel 1 es " + nivel1 + " y la puntuación del nível 3 es " + nivel3);


// -----------------------------------------------------------
// 6) Una aplicación tiene un conjunto de permisos posibles
//    ("READ", "WRITE", "DELETE") y un mapa que indica si un
//    usuario concreto tiene permitido cada permiso. Comprueba
//    si el usuario tiene concedidos los permisos "READ" y
//    "DELETE" y construye un mensaje:
//    "READ: true/false — DELETE: true/false".
// -----------------------------------------------------------
        String[] permisos = {"READ", "WRITE", "DELETE"};

// -----------------------------------------------------------
// 7) Un sistema de votos tiene un array con los nombres de dos
//    candidatos y un mapa con el número de votos de cada uno.
//    Determina cuál de los candidatos del array tiene más votos
//    y muestra un mensaje indicando el ganador y su
//    número de votos.
// -----------------------------------------------------------

// -----------------------------------------------------------
// 8) Una biblioteca guarda en una lista los títulos de los libros
//    prestados por un usuario y en un conjunto los títulos de los
//    libros marcados como "devolución urgente". Muestra para los
//    dos primeros libros de la lista si pertenecen al conjunto
//    de devolución urgente.
// -----------------------------------------------------------

// -----------------------------------------------------------
// 9) Un sistema de colores guarda un array con los nombres de
//    tres colores ("Rojo", "Verde", "Azul") y un mapa que
//    relaciona cada nombre de color con su valor numérico
//    (por ejemplo, Rojo -> 255). Construye un nuevo array de
//    enteros con los valores numéricos de los tres colores y
//    muéstralo por pantalla.
// -----------------------------------------------------------

// -----------------------------------------------------------
// 10) Un profesor guarda en una lista los nombres de tres alumnos
//     en el orden en que entregaron un trabajo. Además, tiene un
//     mapa que asocia a cada alumno con su nota, y un conjunto
//     con los alumnos que han aprobado (nota >= 5). Usa estas
//     estructuras para mostrar, para los dos primeros alumnos,
//     su nota y si han aprobado o no, con un mensaje como:
//     "Ana — nota: 7.5 — aprobado: true".
    }
}
