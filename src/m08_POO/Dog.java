package m08_POO;

public class Dog {
    String name;
    String raza;
    double peso;
    int edad;

    public Dog(String name, String raza, double peso, int edad) {
        this.name = name;
        this.raza = raza;
        this.peso = peso;
        this.edad = edad;
    }

    public void bark() {
        System.out.println("RafRafRaf");
    }
}
