package m08_POO;

abstract class Figura {
    double medida1;
    double medida2;

    public Figura(double medida1, double medida2) {
        this.medida1 = medida1;
        this.medida2 = medida2;
    }

    abstract double calcularArea();
}

interface Dibujable {
    void draw();

}

class Circulo extends Figura implements Dibujable {
    public Circulo(double medida1, double medida2) {
        super(medida1, medida2);
    }

    @Override
    public void draw() {
        System.out.println("TU figura es un circulo");
    }

    @Override
    double calcularArea() {
        return Math.PI * medida1 * medida2;


    }


}


