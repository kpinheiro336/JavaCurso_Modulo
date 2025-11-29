package m08_POO;

import java.util.ArrayList;

public class PersonList {
    String name1;
    String name2;
    String name3;
    String name4;





    public PersonList(String name1, String name2, String name3, String name4){
        this.name1 = name1;
        this.name2 = name2;
        this.name3 = name3;
        this.name4 = name4;
    }
    void arrayperson(){
        ArrayList<String> listanombres= new ArrayList<>();
        listanombres.add(name1);
        listanombres.add(name2);
        listanombres.add(name3);
        listanombres.add(name4);

        System.out.println("nombres escritos: " + listanombres);

    }

}
