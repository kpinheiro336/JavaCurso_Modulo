package m03_Strings;

public class StringsExercises {
    static void main() {
        // 1. Concatena dos cadenas de texto.
        String deporte = "correr";
        String gusto = " me gusta";
        System.out.println(deporte + gusto);
        System.out.println(deporte.concat(gusto));


        // 2. Muestra la longitud de una cadena de texto.
        String frase = " La vida es algo valioso ";
        System.out.println(frase.length());

        // 3. Muestra el primer y último carácter de un string.
        String lugar = " Brasil ";
        System.out.println(lugar.charAt(1));
        System.out.println(lugar.charAt(6));

        // 4. Convierte a mayúsculas y minúsculas un string.
        System.out.println(lugar.toLowerCase());
        System.out.println(lugar.toUpperCase());

        // 5. Comprueba si una cadena de texto contiene una palabra concreta.
        String frase2 = " Un paso de cada vez ";
        System.out.println(frase2.contains("paso"));

        // 6. Formatea un string con un entero.
        String nombre = "Kevin";
        int edad = 32;
        double sueldo = 1500.50;
        String mensaje = String.format("El empleado %s tiene %d años y un sueldo de %.2f euros.", nombre, edad, sueldo);
        System.out.println(mensaje);
        // 7. Elimina los espacios en blanco al principio y final de un string.
        System.out.println(frase2.trim());

        // 8. Sustituye todos los espacios en blanco de un string por un guión (-).
        System.out.println(frase2.replace(" ", "-"));

        // 9. Comprueba si dos strings son iguales.
        String comp1 = "Power Bi";
        String comp2 = "Power Bi2";
        System.out.println(comp1.equals(comp2));

        // 10. Comprueba si dos strings tienen la misma longitud.
        System.out.println(comp1.length() == comp2.length());

        // 11. A partir de un string que contiene un número de teléfono con espacios (por ejemplo "123 456 789"), crea otro string sin ningún espacio.
        String n = "147 852 456";
        String nse = n.replace(" ", "");
        System.out.println(nse);

        // 12. Dado un string que contiene una ruta de archivo con barras ("C:/Users/Alumno/Documento.txt"), obtén únicamente el nombre del archivo.
        // Pista: lastIndexOf("/")
        String barras = "C:/Users/Alumno/Documento.txt";
        System.out.println(barras.substring(barras.lastIndexOf("/") + 1));

        // 13. Toma dos strings y crea un tercero que los una con una coma en medio.
        String A1 = "Lejos pero";
        String A2 = "cerca de todos";
        String coma = ",";
        System.out.println(A1 + coma + A2);


        // 14. A partir de un string "Hola Mundo", obtén el substring "Mundo".
        String string = "hola mundo";
        System.out.println(string.substring(5));


        // 15. Comprueba si un string termina en “.jpg” (sin usar condicionales, solo devuelve true/false).
        // Pista: endsWith().

        // 16. Reemplaza todas las vocales de un string por la letra "x" usando únicamente replace().

        // 17. Dado un string que contiene varias palabras separadas por espacios, obtén solo la primera palabra.
        // Pista: indexOf(" ")

        // 18. Dado un email (ej: "persona@correo.com"), obtén el nombre de usuario (todo antes de la @).

        // 19. Toma un string cualquiera y conviértelo en la misma cadena pero con el primer carácter en mayúscula y el resto en minúscula (sin if).

        // 20. Comprueba si un string contiene otra palabra ignorando mayúsculas/minúsculas.
    }
}
