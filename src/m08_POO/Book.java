package m08_POO;

public class Book {
    public String año;
    public String estilo;
    public String title;
    public String author;

    public Book(String title, String author, String año, String estilo) {
        this.año = año;
        this.estilo = estilo;
        this.title = title;
        this.author = author;

    }

    public String getAuthor() {
        return author;
    }

    public String getAño() {
        return año;
    }

    public String getEstilo() {
        return estilo;
    }


    public void sayinfolibro() {
        System.out.println("El libro lo crio: " + this.author);


    }


    public void sayinfolibro2() {
        System.out.println("El libro fue publicado en: " + this.año + " y tine como asunto sobre: " + this.estilo);
    }


}

