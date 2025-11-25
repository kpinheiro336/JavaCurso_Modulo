package m07_Methods;

import java.util.ArrayList;

public class MethodsPractice {
    void main() {
        sendEmail();

        sendEmailToUser("Josu");

        sendEmailToUserCanVote("Mikel", 17);

        callUser("Josu");

        callUser("Josu", 699999999);

        if (generarFichero("fichero.txt")) {
            System.out.println("Fichero creado correctamente");
        } else {
            System.out.println("Fichero creado de forma erronea");
        }

        ArrayList<String> users = new ArrayList<>();
        users.add("Jonh");
        users.add("Alex");
        users.add("Juan");
        sendEmailToUsers(users);

    }

    //Funciones sin parametros ni retorno
    void sendEmail() {
        System.out.println("Correo enviado");
    }

    //Funciones con parámetros
    void sendEmailToUser(String user) {
        System.out.println("Correo electronico enviado: " + user);
    }

    void sendEmailToUsers(ArrayList<String> users) {
        for (String user : users) {
            sendEmailToUser(user);
        }
    }

    void sendEmailToUserCanVote(String user, int age) {
        if (age >= 18) {
            sendEmailToUser(user);
        } else {
            System.out.println("Usuario menor de edad, no recibirá el correo");
        }

    }


    //Sobrecarga
    void callUser(String name) {
        System.out.println("Llamando al usuario: " + name);
    }

    void callUser(String name, int phone) {
        System.out.println("Llamando al usuario: " + name + " al numero de telefono: " + phone);
    }

    boolean generarFichero(String fileName) {
        boolean fileCorrectlyCreated = true;
        if (fileCorrectlyCreated) {
            return true;
        }
        return false;

    }

}