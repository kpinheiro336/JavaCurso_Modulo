package m07_Methods;

public class MethodsExercises {
    void main() {
        sendBienvenida();

        saludopersona("Kevin");

        int resultado = restar(5, 2);
        System.out.println("El resultado de la resta es: " + resultado);


        int resultado2 = multiplicar(4);
        System.out.println("El cuadro del número es  " + resultado2);

        int resultado3 = parImpar(2);


        int edad = 15;
        System.out.println(esAdolescente(edad));

        String[] cadena = {"Vamos", "que", "tengo", "sueño"};
        lista(cadena);

        int[] numeros = {25, 30, 45, 4};
        enteros(numeros);


    }


    // 1. Crea una función que imprima "¡Te doy la bienvenida al curso de Java desde cero!".
    void sendBienvenida() {
        System.out.println("¡Te doy la bienvenida al curso de Java desde cero!");
    }

    // 2. Escribe una función que reciba un nombre como parámetro y salude a esa persona.
    void saludopersona(String persona) {
        System.out.println("Hola " + persona);
    }

    // 3. Haz un método que reciba dos números enteros y devuelva su resta.
    int restar(int a, int b) {
        return a - b;

    }

    // 4. Crea un método que calcule el cuadrado de un número (n * n).
    int multiplicar(int n) {
        return n * n;
    }

    // 5. Escribe una función que reciba un número y diga si es par o impar.
    int parImpar(int a) {
        if (a % 2 == 0) {
            System.out.println("El numero es par");
        } else {
            System.out.println("El número es impar");

        }


        return a;
    }

    // 6. Crea un método que reciba una edad y retorne true si es mayor de edad (y false en caso contrario).
    boolean esAdolescente(int edad) {
        return edad >= 18;

    }

    // 7. Implementa una función que reciba una cadena y retorne su longitud.
    void lista(String[] cadena) {
        System.out.println(cadena.length);

    }

    //  8. Crea un método que reciba un array de enteros, calcula su media y lo retorna.
    void enteros(int[] numeros) {
        System.out.println((numeros[0] + numeros[1] + numeros[2] + numeros[3]) / 2);
    }

}



