package m08_POO;

import java.text.DecimalFormat;

public class Rectangle {
    double ladon1;
    double ladon2;

    public Rectangle(double ladon1, double ladon2) {
        this.ladon1 = ladon1;
        this.ladon2 = ladon2;
    }

    void areayperimetro() {

        double area = ladon1 * ladon2;
        double perimetro = ladon1 + ladon2;
        DecimalFormat df = new DecimalFormat("#.00");


//        DecimalFormat df = new DecimalFormat("#.00");
//        double area = df.format((ladon1 * ladon2));
//        double perimetro = Math.round(ladon1 + ladon2);
        System.out.println("La area del rectangulo es: " + df.format(area) + "m2" + " y el perimetro seria: " + df.format(perimetro) + "m" + " respectivamente");
    }
}
