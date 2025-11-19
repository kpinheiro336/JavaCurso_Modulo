package m05_Structures;

import java.util.HashSet;

public class SetsPractice {
    static void main() {
        //Declaracion
        HashSet<String> names = new HashSet<>();
        //var names1 = new HashSet<String>();

        names.add("Kevin");
        names.add("kevin");//lo añade porque esta con una letra minuscula
        names.add("Josu");
        names.add("Mikel");
        names.add("Jonh");
        names.add("Alex");


        System.out.println(names.size());
        System.out.println(names);

//        //Acceso
//        System.out.println(names.get(1));
//        System.out.println(names.get(1));
//        System.out.println(names.get(1));
//        System.out.println(names.get(1));
//        System.out.println(names.get(1));
//
//        //Eliminacion
//        names.remove("Kevin");
//        System.out.println(names);
//
//        //Búsqueda (contiene /no contiene)
//        System.out.println(names.contains("kevin"));

        HashSet<String> names2 = new HashSet<>();
        names2.add("Josu");
        names2.add("Mikel");
        System.out.println(names);
        System.out.println(names2);

//        names.containsAll(names2);
//        System.out.println(names);

        names.retainAll(names2);//va a mostrar solo lo que hay en comun.
        System.out.println(names);


    }
}
