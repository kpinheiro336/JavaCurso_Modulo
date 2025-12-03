package m08_POO;

public class AbstractionExercises {

    // 1. Crea una clase abstracta Animal con eat() y makeSound(). Crea la interfaz Volador con volar().
//    Haz que Pajaro extienda Animal e implemente Volador. Crea Perro que solo extienda Animal.
    static void main() {


        Pajaro pajaro01 = new Pajaro("Canario");
        pajaro01.makeSound();
        pajaro01.eat();
        pajaro01.volar();

        Perro perro01 = new Perro("Firulais");
        perro01.eat();


// 2. Define la clase abstracta Figura con el método abstracto calcularArea().
//    Crea la interfaz Dibujable con draw() y haz que Circulo y Cuadrado implementen la interfaz y extiendan Figura.
        Circulo circulo01 = new Circulo(25, 23.5);
        circulo01.calcularArea();
        System.out.println(circulo01.calcularArea() + " m2");


// 3. La clase abstracta Empleado tiene calcularSalario(). La interfaz Responsable define asumirResponsabilidad().
//    Haz que Gerente implemente Responsable y que Programador no lo implemente.

// 4. Crea Maquina abstracta con start() y stop(). Crea la interfaz Recargable con recharge().
//    Haz que Robot implemente Recargable y que Lavadora solo herede de Maquina.

// 5. Define el abstract class Instrumento con play(). Crea la interfaz Afinable con tune().
//    La clase Guitarra implementa Afinable y extiende Instrumento. Piano solo extiende Instrumento.

// 6. Crea Transporte abstracto con mover(). La interfaz ConRuedas con girarRuedas().
//    Haz Auto que extienda Transporte e implemente ConRuedas y Avion que solo extienda Transporte.

// 7. Define la clase abstracta CuentaBancaria con deposit() y withdraw().
//    Crea la interfaz Transferible con transfer() y haz que CuentaPremium implemente Transferible, pero CuentaBasica no.

// 8. Crea DispositivoElectrico abstracto con encender().
//    Crea la interfaz Conectable con conectarWifi(). Haz que Telefono implemente Conectable y Televisor no.

// 9. Abstract class SerVivo con respirar(). Interfaz Fotosintetico con hacerFotosintesis().
//    Planta implementa Fotosintetico pero Animal no. Ambos extienden SerVivo.

// 10. Abstract class Juego con start() y end(). Interfaz Multijugador con agregarJugador().
//     Haz que JuegoOnline implemente Multijugador y que JuegoMesa no.

// 11. Crea Vehiculo abstracto con encenderMotor(). Interfaz Cargable con cargarEnergia().
//     Haz que AutoElectrico implemente Cargable y MotoGasolina no.

// 12. Abstract class Archivo con open(). Interfaz Comprimible con compress().
//     ArchivoZip debe implementar Comprimible, ArchivoTexto no.

// 13. Abstract class Sensor con read(). Interfaz Inalambrico con conectar().
//     SensorWifi implementa Inalambrico y SensorCableado no.

// 14. Abstract class SerHumano con hablar(). Interfaz Programador con programar().
//     Adulto implementa Programador y Niño no.

// 15. Abstract class NaveEspacial con despegar(). Interfaz Interplanetario con viajarAPlaneta().
//     NaveExploradora implementa Interplanetario, NaveDomestica no.

// 16. Abstract class Docente con ensenar(). Interfaz Calificable con ponerNota().
//     ProfesorUniversitario implementa Calificable, InstructorDeportivo no.

// 17. Abstract class Figura3D con calcularVolumen(). Interfaz Rotable con rotar().
//     Cubo implementa Rotable, Piramide no.

// 18. Abstract class Producto con getPrecio(). Interfaz Vendible con vender().
//     ProductoDigital implementa Vendible, ProductoFisico también, pero Servicio solo extiende Producto.

// 19. Abstract class TransportePublico con cobrarBoleto(). Interfaz Accesible con asistirPersonas().
//     Autobus implementa Accesible, Tren no.

// 20. Abstract class Electrodomestico con encender(). Interfaz Temporizable con setTimer().
//     Horno implementa Temporizable, Refrigerador no.

// 21. Abstract class Dispositivo con activar(). Interfaz Actualizable con update().
//     Smartphone implementa Actualizable, Lampara no.

// 22. Abstract class AnimalMarino con nadar(). Interfaz Depredador con cazar().
//     Tiburon implementa Depredador, Delfin no.

// 23. Abstract class VehiculoAereo con volar(). Interfaz Autopiloto con activarAutopiloto().
//     AvionComercial implementa Autopiloto, Helicoptero no.

// 24. Abstract class EmpleadoEmpresa con trabajar(). Interfaz Reportable con generarReporte().
//     Analista implementa Reportable, Auxiliar no.

// 25. Abstract class SistemaOperativo con iniciar(). Interfaz Actualizable con actualizar().
//     Windows implementa Actualizable, Linux no.

// 26. Abstract class AnimalDomestico con jugar(). Interfaz Adoptable con serAdoptado().
//     Gato implementa Adoptable, Tortuga no.

// 27. Abstract class MaquinaIndustrial con operar(). Interfaz Mantenible con mantener().
//     MaquinaCorte implementa Mantenible, MaquinaEmpaque no.

// 28. Abstract class VehiculoDeCarrera con competir(). Interfaz Turbo con activarTurbo().
//     Formula1 implementa Turbo, GoKart no.

// 29. Abstract class NaveMarina con navegar(). Interfaz Sumergible con sumergir().
//     Submarino implementa Sumergible, Barco no.

// 30. Abstract class DispositivoDeAudio con reproducir(). Interfaz Bluetooth con emparejar().
//     Auriculares implementan Bluetooth, AltavozCableado no.


    }
}
