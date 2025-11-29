package m08_POO;

public class Worker {
    String nombre;
    double salario;

    public Worker(String nombre, double salario){
        this.nombre = nombre;
        this.salario = salario;
    }

    void mostrarsalario(){
        System.out.println("El trabajador:" + " " + nombre + " " +  "tiene un sueldo de: " + salario + "€");
    }


}
