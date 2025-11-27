package m08_POO;

public class Book {
    String año;
    String estilo;
    String title;
    String author;

    public Book(String title, String author, String año, String estilo) {
        this.año = año;
        this.estilo = estilo;
        this.title = title;
        this.author = author;
    }

    public void sayinfolibro() {
        System.out.println("El libro lo crio: " + this.author);
    }

    public void sayinfolibro2() {
        System.out.println("El libro fue publicado en: " + this.año + " y tine como asunto sobre: " + this.estilo);
    }


}

