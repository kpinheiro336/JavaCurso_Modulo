package m01_HelloWorld;

public class HelloWorldExercises {

    public static void main(String[] args) {

        // 1. Imprime un mensaje que diga tu nombre en lugar de "¡Hola Mundo!".
        System.out.println("Kevin Pinheiro ");//este es el comando de salida

        // 2. Imprime dos líneas: "Hola" y luego "Mundo" con un solo println.
        System.out.println("\nHola\nmundo");// esto hace que separe las lineas en uuna sola linea de codigo

        // 3. Añade un comentario sobre lo que hace cada línea del programa.
        String frase = "Vamos a conseguir !!"; // En esta parte atribuimos el String y lo que va a representar.
        System.out.println(frase); // Ponemos lo que queremos que imprima.

        // 4. Crea un comentario en varias líneas.
//        Estamos testando como poner
//                comentarios en varias lineas con el comando Ctr + //

        /*Este es un comentario en varias lineas
        asi se puede ir escribiendo varias observaciones
        sin tener que hacer // varias veces
        */

        // 5. Imprime tu edad, tu color favorito y tu ciudad.
        System.out.println("\n32 Años\nRojo\nVitoria-Gasteiz");


        // 6. Explora los diferentes System.XXX.println(); más allá de "out".
        System.err.println("Advertencia Error");


        // 7. Utiliza varios println para imprimir una frase.
        System.out.println("Pienso");
        System.out.println("luego");
        System.out.println("Existo");

        // 8. Imprime un diseño ASCII (por ejemplo, una cara feliz usando símbolos).
        System.out.println("  /\\_/\\");
        System.out.println(" ( o.o )");
        System.out.println(" (  ^  )");
        System.out.println("  \\___/");
        System.out.println(); // Línea vacía final
        System.out.println("¡Miau!");

        // 9. Intenta ejecutar el programa sin el método main y observa el error.

        // hecho

        //10. Intenta cambiar el nombre del archivo a uno diferente del de la clase y compílalo. ¿Qué pasa?

        // hecho

    }
}