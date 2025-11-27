package m08_POO;

public class Vehicle {
    String owner;
    int wheels;
    int doors;
    String licencePlate;

    public Vehicle(String owner, int wheels, int doors, String licencePlate) {
        this.owner = owner;
        this.wheels = wheels;
        this.doors = doors;
        this.licencePlate = licencePlate;

    }

    void accelerate(int speed) {
        if (speed >= 0 && speed <= 120) {
            System.out.println("El coche con matrícula " + this.licencePlate + " " + "está acelerando");
        } else {
            System.out.println("El coche con matrícula " + this.licencePlate + " " + "debe frenar");
        }
    }
}
