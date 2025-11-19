package m05_Structures;

import java.util.HashMap;

public class HashMapsPractice {
    static void main() {
        HashMap<Integer, String> names = new HashMap<>();

        names.put(1, "Kevin");
        names.put(2, "Josu");
        names.put(3, "Alex");
        names.put(4, "Juan");
        names.put(5, "Ivan");
        names.put(6, "Mikel");
        System.out.println(names);

        //Acceso
        System.out.println(names.get(6));
        System.out.println(names.getOrDefault(6, "Ivan"));

        //Eliminar valores
        names.remove(4);
        System.out.println(names);

        //Reemplazar
        names.replace(2, "Leandro");
        System.out.println(names);
        names.putIfAbsent(1, "Kevin2");
        names.put(5, "Leandro2");
        System.out.println(names);

        System.out.println(names.keySet());

        HashMap<Integer, String> names2 = new HashMap<>();
        names2.putAll(names);//es como clonar
        System.out.println(names2);

        System.out.println(names.containsKey(5));


    }
}
