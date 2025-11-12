package m03_Strings;

public class Exercises {
    static void main() {
        String name = "Kevin";
        String name2 = "kevin";
        String name3 = new String("Kevin");
        var surname = new String("Pinheiro");


        //equals
        System.out.println(name.equals(name2));
        System.out.println(print);


        System.out.println(name);


        //length
        System.out.println(name.length());

        //Obtener un caracter
        System.out.println(name.charAt(0));

        //Subcadenas
        System.out.println(name.substring(2));
        System.out.println(name.substring(2, 4));

        // Mayusculas y minusculas
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());

        //Contains
        String world = "Hola Mundo";
        System.out.println(world.contains("nota"));
        System.out.println(world.toLowerCase().contains("hola"));


    }
}
