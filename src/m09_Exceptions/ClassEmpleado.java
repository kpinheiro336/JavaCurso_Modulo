package m09_Exceptions;

abstract class Empleado {
    String nombre;
    int edad;
    double salarioBase;

    Empleado(String nombre, int edad, double salarioBase) {
        this.nombre = nombre;
        this.edad = edad;
        this.salarioBase = salarioBase;
    }


    abstract double calcularSalario();


    abstract String realizarTarea();
}

interface Lider {
    void dirigirEquipo();

}

interface Programador {
    String programar();
}

interface Vendedor {
    void vendedor();
}

class Teamlead extends Empleado implements Lider, Programador {
    Teamlead(String nombre, int edad, double salarioBase) {
        super(nombre, edad, salarioBase);
    }

    @Override
    double calcularSalario() {
        return salarioBase * 2;

    }

    @Override
    String realizarTarea() {
        return nombre + " Hoy está reuniendo todo el equipo para una reunion sobre una nueva aplicación, a las 16:00 PM";


    }

    @Override
    public void dirigirEquipo() {

    }

    @Override
    public String programar() {
        return nombre + " antes de la reunión está programando las lineas de codigo claves para la nueva aplicación";

    }
}

class BeckendDev extends Empleado implements Programador {
    BeckendDev(String nombre, int edad, double salarioBase) {
        super(nombre, edad, salarioBase);
    }

    @Override
    double calcularSalario() {
        return salarioBase * 1.5;


    }

    @Override
    String realizarTarea() {
        return nombre + " está ayudando directamente al TeamLead en la programación ";


    }

    @Override
    public String programar() {
        return "Está programando la app.";

    }
}

class Comercial extends Empleado implements Vendedor {
    Comercial(String nombre, int edad, double salarioBase) {
        super(nombre, edad, salarioBase);
    }

    @Override
    double calcularSalario() {
        return salarioBase * 1.3;

    }

    @Override
    String realizarTarea() {
        return nombre + "Está haciendo todo el marketing de la app. ";


    }

    @Override
    public void vendedor() {
        System.out.println(nombre + " Es un excelente vendedor");

    }
}