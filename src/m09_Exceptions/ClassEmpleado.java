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
    String dirigirEquipo();

}

interface Programador {
    String programar();
}

interface Vendedor {
    String vendedor();
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
        return "- " + nombre + " hoy está reuniendo todo el equipo para una reunion sobre una nueva aplicación, a las 16:00 PM ";


    }

    @Override
    public String dirigirEquipo() {
        return "* " + nombre + " antes de la reunion esta reflexionando sobre todo el trabajo que tuvo este año dirigiendo el equipo,";

    }

    @Override
    public String programar() {
        return "* " + nombre + " antes de la reunión está programando las lineas de codigo claves para la nueva aplicación";

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
    public String realizarTarea() {
        return "- " + nombre + " está ayudando directamente al TeamLead en la programación ";


    }

    @Override
    public String programar() {
        return "* " + nombre + " está programando la app.";

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
        return "- " + nombre + " está haciendo todo el marketing de la app. ";


    }

    @Override
    public String vendedor() {
        return "* " + nombre + " es un excelente vendedor";

    }
}