package m08_POO;

public class Vehicle02 {
    String marca;
    String estilo;
    double velocidad;

    public Vehicle02(String marca, String estilo, double velocidad) {
        this.marca = marca;
        this.estilo = estilo;
        this.velocidad = velocidad;
    }

    public void move() {

    }


}

class Bike01 extends Vehicle02 {

    public Bike01(String marca, String estilo, double velocidad) {
        super(marca, estilo, velocidad);
    }

    @Override
    public void move() {
        super.move();
        System.out.println("La bicicleta se está moviendo");
    }
}

class Car01 extends Vehicle02 {
    public Car01(String marca, String estilo, double velocidad) {
        super(marca, estilo, velocidad);
    }

    @Override
    public void move() {
        super.move();
        System.out.println("EL coche se está moviendo");
    }
}