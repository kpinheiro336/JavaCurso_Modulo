package m08_POO;

public class ClassesPractice {
    static void main() {
        Person person1 = new Person("Josu", 39, 1.78, 80, "man");
        person1.sayHello();
        person1.sayHelloWithAge();

        Vehicle car1 = new Vehicle("Mikel", 4, 3, "7654HBN");
        car1.accelerate(100);

        System.out.println(car1.owner);


    }
}
