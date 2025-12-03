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


    }


}

class Student02 extends Person02 {
    public Student02(String name, int age, double height) {
        super(name, age, height);
    }

    @Override
    public void greet() {
        System.out.println("hola, estoy estudiando Java" + "me llamo: " + this.name);

    }

}

class Teacher02 extends Person02 {
    public Teacher02(String name, int age, double height) {
        super(name, age, height);
    }

    @Override
    public void greet() {
        System.out.println("Hola, voy a dar clases de Java hoy," + " tengo: " + this.age + " años, y me llamo " + this.name);
    }
}
