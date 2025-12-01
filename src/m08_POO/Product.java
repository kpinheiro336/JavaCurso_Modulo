package m08_POO;

public class Product {
    String nombreproduct;
    double precioproducto;
    double descuento;

    public Product(String nombreproduct, double precioproducto, double descuento) {
        this.nombreproduct = nombreproduct;
        this.precioproducto = precioproducto;
        this.descuento = descuento;
    }

    public void resultado() {
        double calculo = precioproducto - (precioproducto * descuento);
        System.out.println("El producto: " + nombreproduct + " , con el precio de " + precioproducto + " con descuento cuesta: " + calculo);
    }
}

