package m05_Structures;

import java.util.Arrays;

public class ExplicacionArrays {
    static void main() {

        // definicion de arrays
//        int[] edades = new int[4];
//        System.out.println(edades);

//        int[] edades = {18, 25, 35, 45};
//        System.out.println(edades);
//        System.out.println(Arrays.toString(edades));

        String[] nombres = {"Kevin", "Alex", "Leandro", "Osvaldo"};
        System.out.println(nombres);
        System.out.println(Arrays.toString(nombres));


        // Accesos
        System.out.println(nombres[0]);
        System.out.println(nombres[nombres.length - 1]);

        //Modificaciones
        nombres[0] = "John";
        System.out.println(Arrays.toString(nombres));
        System.out.println(nombres.length);

        nombres[1] = null;
        System.out.println(Arrays.toString(nombres));

        boolean[] booleans = {3 > 2, 3 < 2, true, true};
        System.out.println(Arrays.toString(booleans));


    }
}

