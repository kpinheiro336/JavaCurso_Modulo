package m08_POO;

public class Person {
    //Atribbutes
    private String name;
    String genre;
    private int age;
    double heigh;
    double weight;


    //Constructor
    public Person(String name, int age, double heigh, double weight, String genre) {
        this.name = name;
        this.age = age;
        this.heigh = heigh;
        this.weight = weight;
        this.genre = genre;

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;

    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }


    //Methods
    public void sayHello() {
        System.out.println("Hello!");

    }

    public void sayHelloWithAge() {
        System.out.println("Hello, my age is: " + this.age);
    }

    public void sayName() {
        System.out.println("hello my name is: " + this.name);
    }

}
