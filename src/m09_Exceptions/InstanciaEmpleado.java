package m09_Exceptions;

import java.util.ArrayList;

public class InstanciaEmpleado {
    static void main() {

        ArrayList<Empleado> listaEmpleados = new ArrayList<>();
        listaEmpleados.add(new Teamlead("Jose", 32, 2500));
        listaEmpleados.add(new BeckendDev("Maria", 24, 1500));
        listaEmpleados.add(new Comercial("Pablo", 30, 1450));

        for (Empleado emp : listaEmpleados) {


            System.out.println(emp.realizarTarea());
            System.out.println("Su salario es de: " + emp.calcularSalario() + "€");
        }
    }
}
