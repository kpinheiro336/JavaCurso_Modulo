package m08_POO;

public class ExceptionsPractise {
    static void main() {

        try {
            int[] arrayExample = {2, 3, 5, 8, 9};

            for (int index = 0; index < 6; index++) {
                System.out.println(arrayExample[index]);


            }
        } catch (Exception e) { //con Exception se controla todo tipo de error.
            System.out.println("Se ha producido un error " + e.getMessage() + " .Por favor indique menos elementos para el array");
        }


    }
}
