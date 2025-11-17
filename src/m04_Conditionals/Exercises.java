package m04_Conditionals;

public class Exercises {
    static void main() {
//        int age = 18;
//
//        if (age > 18) {
//            System.out.println("Soy mayor de edad");
//        } else if (age == 18) {
//            System.out.println("Acabo de cumplir 18 años");
//        } else {
//            System.out.println("Soy menor de edad");
//        }


        String favouriteColor = "Rojo";

        switch (favouriteColor) {
            case "Azul":
                System.out.println("No es mi color favorito");

            case "Rojo":
                System.out.println("Es mi color favorito");
                break;
            default:
                System.out.println("No es mi color favorito");
                
        }


    }
}
