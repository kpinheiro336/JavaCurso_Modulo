package m08_POO;

public class InheritanceExercises {
    static void main() {


        // 1. Crea una clase Animal con makeSound(). Luego Dog y Cat sobrescriben makeSound() con sus propios sonidos.

        Animal02 animal02 = new Animal02("Kyrbi", "Red", 30, 25.6);
        Dog03 dog03 = new Dog03("Firulas", "Black", 25, 28.4, "UAU-UAU-UAU");
        dog03.soDog01();
        Cat01 cat01 = new Cat01("Gato", "blanco", 5, 10.2, "MIAU-MIAU");
        cat01.soCat01();


// 2. Crea la clase Vehicle con move(). Car y Bike deben sobrescribirlo con mensajes distintos.
        Bike01 bike01 = new Bike01("Btwin", "Bicicleta", 25.6);
        bike01.move();

        Car01 car01 = new Car01("Mercedes", "coche", 25.4);
        car01.move();


// 3. Person tiene greet(). Student y Teacher sobrescriben greet() de forma diferente.


// 4. Shape tiene draw(). Circle y Square lo sobrescriben. Crea un método que reciba un Shape y llame a draw().

// 5. ElectronicDevice tiene turnOn(). TV y Radio sobrescriben ese método mostrando comportamientos distintos.

// 6. Fruit tiene taste(). Apple y Lemon sobrescriben taste(), uno dulce y el otro ácido.

// 7. Tool tiene use(). Hammer y Screwdriver sobrescriben use() mostrando un mensaje diferente.

// 8. Instrument tiene play(). Piano y Drums sobrescriben play(). Crea un array de Instrument y recórrelo.

// 9. Character tiene attack(). Archer y Mage sobrescriben attack(). Llama a attack() desde un método genérico.

// 10. Transport tiene start(). Bus y Airplane sobrescriben start() con mensajes personalizados.

// 11. GameObject tiene update(). Player y Enemy sobrescriben update(). Llama a update() en una lista de GameObject.

// 12. Worker tiene work(). Programmer y Designer sobrescriben work(). Simula un día laboral llamando work() a cada uno.

// 13. Notification tiene send(). EmailNotification y SMSNotification sobrescriben send().

// 14. Device tiene boot(). Laptop y Smartphone sobrescriben boot(). Crea un método que acepte Device y llame boot().

// 15. Course tiene describe(). OnlineCourse y OnsiteCourse sobrescriben describe(). Muestra un ArrayList de Course.

// 16. Payment tiene process(). CashPayment y CardPayment sobrescriben process(). Llama al método desde una lista.

// 17. Creature tiene move(). Fish y Bird sobrescriben move(). Llama move() usando polimorfismo.

// 18. Message tiene show(). ErrorMessage y SuccessMessage sobrescriben show(). Demuestra polimorfismo con un array.

// 19. Vehicle2 tiene accelerate(). Car2 y Motorcycle sobrescriben accelerate(). Usa un método que reciba Vehicle2.

// 20. Employee2 tiene doTask(). Engineer y Manager sobrescriben doTask(). Simula tareas del día con polimorfismo.

// 21. Sensor tiene read(). MotionSensor y LightSensor sobrescriben read(). Crea un sistema que lea todos los sensores.

// 22. FileResource tiene load(). ImageFile y AudioFile sobrescriben load(). Llama load() polimórficamente.

// 23. Creature2 tiene eat(). Herbivore y Carnivore sobrescriben eat(). Usa polimorfismo para llamarlo en distintos objetos.

// 24. EnemyAI tiene think(). BasicAI y AdvancedAI sobrescriben think(). Procesa una lista de EnemyAI.

// 25. Appliance2 tiene activate(). Heater y AirConditioner sobrescriben activate(). Llama a activate() sin saber su tipo real.

// 26. Media tiene play(). Video y Audio sobrescriben play(). Llama play() desde una función que recibe Media.

// 27. Vehicle3 tiene brake(). Truck y Scooter sobrescriben brake(). Demuestra polimorfismo con varios Vehicle3 distintos.

// 28. Food tiene cook(). Pasta y Steak sobrescriben cook(). Crea un menú que llame cook() a cada comida.

// 29. Robot tiene execute(). CleaningRobot y SecurityRobot sobrescriben execute(). Se ejecutan todos en una rutina.

// 30. Task tiene run(). QuickTask y DelayedTask sobrescriben run(). Llama run() desde un scheduler polimórfico.
    }
}
