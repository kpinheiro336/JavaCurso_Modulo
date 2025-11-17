package m04_Conditionals;

public class ConditionalsExercises {

    static void main() {
        // 1. Establece la edad de un usuario y muestra si puede votar (mayor o igual a 18).
        int age = 7;
        if (age >= 18) {
            System.out.println("Puede Votar");
        } else {
            System.out.println("No puede votar");
        }

        // 2. Declara dos números y muestra cuál es mayor, o si son iguales.
        int n1 = 40;
        int n2 = 10;

        if (n1 > n2) {
            System.out.println("El " + n1 + " es mayor que " + n2);

        } else if (n2 > n1) {
            System.out.println("El " + n2 + " es mayor que " + n1);

        } else {
            System.out.println("Los dos numeros son iguales");


        }

        // 3. Dado un número, verifica si es positivo, negativo o cero.
        int n3 = 2;
        int n4 = 1;
        int n5 = -1;

        if (n3 * n4 == 0) {
            System.out.println("El numero es cero");

        } else if (n3 * n5 < 0) {
            System.out.println("El numero es positivo");
        } else {
            System.out.println("El numero es negativo");


        }

        // 4. Crea un programa que diga si un número es par o impar.
        int n6 = 5;
        if (n6 % 2 == 0) {
            System.out.println("El numero es par");
        } else {
            System.out.println("El numero es impar");

        }


        // 5. Verifica si un número está en el rango de 1 a 100.
        int n7 = 104;
        if (n7 >= 1 && n7 <= 100) {
            System.out.println("Está en el rango de 1 a 100");
        } else {
            System.out.println("No está en el rango");
        }


        // 6. Declara una variable con el día de la semana (1-7) y muestra su nombre con switch.
        int diadesemana = 6;
        switch (diadesemana) {
            case 1:
                System.out.println("Es lunes");
                break;

            case 2:
                System.out.println("Es martes");
                break;
            case 3:
                System.out.println("Es miercoles");
                break;
            case 4:
                System.out.println("Es jueves");
                break;
            case 5:
                System.out.println("Es viernes");
                break;
            case 6:
                System.out.println("Es sabado");
                break;
            case 7:
                System.out.println("Es domingo");
                break;


        }


        // 7. Simula un sistema de notas: muestra "Sobresaliente", "Aprobado" o "Suspenso" según la nota (0-100).

        // 8. Escribe un programa que determine si puedes entrar al cine: debes tener al menos 15 años o ir acompañado.

        // 9. Crea un programa que diga si una letra es vocal o consonante.

        // 10. Usa tres variables a, b, c y muestra cuál es el mayor de las tres.
    }
}
