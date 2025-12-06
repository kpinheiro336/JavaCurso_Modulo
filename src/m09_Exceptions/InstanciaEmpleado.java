package m09_Exceptions;

import java.util.ArrayList;

public class InstanciaEmpleado {
    static void main() {

        ArrayList<Empleado> listaEmpleados = new ArrayList<>();
        listaEmpleados.add(new Teamlead("Jose", 32, 2500));
        listaEmpleados.add(new BeckendDev("Maria", 24, 1500));
        listaEmpleados.add(new Comercial("Pablo", 30, 1450));
        listaEmpleados.add(new Comercial("Laura", 34,1450));
        listaEmpleados.add(new Teamlead("Monica",34, 1600));

        for (Empleado emp : listaEmpleados) {
            System.out.println(emp.realizarTarea());


        if (emp instanceof Teamlead) {
            Teamlead t1 = (Teamlead) emp;
            System.out.println(t1.dirigirEquipo());
            System.out.println(t1.programar());

        } else if (emp instanceof BeckendDev) {
            BeckendDev b1 = (BeckendDev) emp;
            System.out.println(b1.programar());

        }else if (emp instanceof Comercial){
            Comercial c1 = (Comercial) emp;
            System.out.println(c1.vendedor());
        }

        System.out.println("* Su salario es de: " + emp.calcularSalario() + "€");


        }



        }



    }

