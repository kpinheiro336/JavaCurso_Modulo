package m08_POO;

public class Animal02 {
    String name;
    String color;
    int age;
    double weight;

    public Animal02(String name, String color, int age, double weight) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.weight = weight;


    }


}

class Dog03 extends Animal02 {
    String soundDog;

    public Dog03(String name, String color, int age, double weight, String soundDog) {
        super(name, color, age, weight);
        this.soundDog = soundDog;
    }

    public void soDog01() {
        System.out.println(soundDog);

    }
}

class Cat01 extends Animal02 {
    String soundCat;

    public Cat01(String name, String color, int age, double weight, String soundCat) {
        super(name, color, age, weight);
        this.soundCat = soundCat;
    }

    public void soCat01() {
        System.out.println(soundCat);
    }
}
