package m08_POO;

public class Animal {
    private String name;
    String color;
    int age;
    double weight;

    public Animal(String name, String color, int age, double weight) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.weight = weight;
    }

    String getname() {
        return this.name;
    }

    public void eat() {
        System.out.println("El animal está comiendo");
    }
}

class Dog1 extends Animal {
    String LegsColor;


    public Dog1(String name, String color, int age, double weight, String Legscolor) {
        super(name, color, age, weight);
        this.LegsColor = Legscolor;
    }
}

class Bird extends Animal {
    String wingsColor;

    public Bird(String name, String color, int age, double weight, String wingsColor) {
        super(name, color, age, weight);
        this.wingsColor = wingsColor;

    }

    public void eat() {
        System.out.println("El pajaro está comiendo");

    }

    public void fly() {
        System.out.println("El pajaro está volando");
    }
}
