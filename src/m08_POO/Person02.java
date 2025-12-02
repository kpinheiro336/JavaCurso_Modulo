package m08_POO;

public class Person02 {
    String name;
    int age;
    double height;


    public Person02(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public void greet() {
        System.out.println("aloooo");

    }


}

class Student02 extends Person02 {
    public Student02(String name, int age, double height) {
        super(name, age, height);
    }


}
