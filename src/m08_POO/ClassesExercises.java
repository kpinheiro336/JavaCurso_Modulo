package m08_POO;

public class ClassesExercises {
    static void main() {


        // 1. Crea una clase Book con atributos title y author. Crea un objeto y muestra sus datos.
        Book book1 = new Book("Principios", "Ray Dalio", "2002", "Finanzas");
        book1.sayinfolibro2();


        // 2. Crea una clase Dog con un método bark() que imprima su sonido.
        Dog dog1 = new Dog("Lilo", "Bull Dog Frances", 25, 10);
        dog1.bark();

        // 3. Añade un constructor a la clase Book que reciba title y author.
        Book book12 = new Book("Principios", "Ray Dalio", "2002", "Finanzas");
        System.out.println("El ítulo del libro es: " + book1.title + " y el autor es: " + book1.author);
        book1.sayinfolibro();

        // 4. Crea una clase Car con atributos brand y model y un método showData().

        // 5. Crea una clase Student con atributo score y un método que diga si aprobó (mayor o igual a 60).

        // 6. Crea una clase BankAccount con atributo balance y un método deposit() que sume el saldo.

        // 7. Crea una clase Rectangle con métodos para calcular el área y el perímetro.

        // 8. Crea una clase Worker que reciba nombre y salario, y un método para mostrar su salario.

        // 9. Crea varios objetos Person y guárdalos en un ArrayList.

        // 10. Crea una clase Product y un método que aplique un descuento sobre su precio.

        // 11. Crea una clase Laptop con atributos brand, ramGB y price.
        //    Añade un método upgradeRam(int extra) que aumente la RAM sin superar 64GB.

        // 12. Crea una clase MusicTrack con atributos title y duration (en segundos).
        //    Añade un método getFormattedDuration() que devuelva "min:seg".

        // 13. Crea una clase Game con atributos name y score.
        //    Añade un método increaseScore(int amount) que no permita superar 9999.

        // 14. Crea una clase WeatherReport con temperatura y humedad.
        //    Añade un método isComfortable() (temp entre 18 y 26, humedad < 60).

        // 15. Crea una clase Message con sender, text y un método countWords().
        //    Usa un split para contar palabras.

        // 16. Crea una clase Task con atributos title y completed.
        //    Añade un método toggle() que cambie su estado (true/false).

        // 17. Crea una clase ShopItem con name, price y stock.
        //    Añade un método restock(int amount) y another sell(int units) que verifique existencias.

        // 18. Crea una clase Playlist con un ArrayList<String> de canciones.
        //    Añade métodos addSong(), removeSong() y showPlaylist().

        // 19. Crea una clase QuizQuestion con question, options (ArrayList<String>) y correctIndex.
        //    Añade un método isCorrect(int userIndex).

        // 20. Crea una clase Point con x e y.
        //     Añade un método move(int dx, int dy) que modifique ambas coordenadas.

        // 21. Crea una clase ShoppingList con un HashSet<String>.
        //     Añade métodos addItem(), removeItem() y showItems().

        // 22. Crea una clase PhoneContact con name y phoneNumber.
        //     Crea un ArrayList con varios contactos y muestra solo los que empiezan por una letra concreta.

        // 23. Crea una clase StockPrice con atributo priceHistory (ArrayList<Double>).
        //     Añade un método getAveragePrice() y otro getMaxPrice().

        // 24. Crea una clase MatchResult con goalsHome y goalsAway.
        //     Añade un método getWinner() que devuelva "Home", "Away" o "Draw".

        // 25. Crea una clase VehicleTracker con un HashMap<String, Integer>
        //     para almacenar vehículos y su kilometraje.
        //     Añade métodos addVehicle(), updateMileage() y getHighestMileage().

        // 26. Crea una clase Recipe con attributes name y ingredients (ArrayList<String>).
        //     Añade un método containsIngredient(String ing) que devuelva true si está en la lista.

        // 27. Crea una clase Attendance con un HashSet<String> de estudiantes presentes.
        //     Añade métodos markPresent(String name), markAbsent(String name) y showAttendance().

        // 28. Crea una clase ScoreAnalyzer con un array de enteros.
        //     Añade métodos getMin(), getMax() y getMedian() (mediana calculada ordenando una copia).

        // 29. Crea una clase Event con title y maxSeats.
        //     Lleva un ArrayList<String> con los asistentes.
        //     Añade un método register(String name) que solo permita añadir si hay plazas.

        // 30. Crea una clase UrlChecker con atributo url.
        //     Añade un método isSecure() que devuelva true si empieza por "https".
        //     Añade otro método domainLength() que calcule la longitud del dominio usando split.
    }
}
