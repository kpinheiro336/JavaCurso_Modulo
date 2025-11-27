package m08_POO;

public class Person {
    //Atribbutes
    String name;
    int age;
    double heigh;
    double weight;
    String genre;


    //Constructor
    public Person(String name, int age, double heigh, double weight, String genre) {
        this.name = name;
        this.age = age;
        this.heigh = heigh;
        this.weight = weight;
        this.genre = genre;

    }

    //Methods
    public void sayHello() {
        System.out.println("Hello!");

    }

    public void sayHelloWithAge() {
        System.out.println("Hello, my age is: " + this.age);
    }
}
