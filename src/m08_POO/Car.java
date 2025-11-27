package m08_POO;

public class Car {
    String brand;
    String model;

    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    void showData() {
        System.out.println("The model would be: " + model + " and the brand would be: " + brand);
    }
}
