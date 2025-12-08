package m08_POO;

abstract class ArchivoAudio {
    String nombre;
    String artist;
    String genre;
    double duracion;

    ArchivoAudio(String nombre, String artist, String genre, double duracion) {
        this.nombre = nombre;
        this.artist = artist;
        this.genre = genre;
        this.duracion = duracion;


    }
    abstract String reproducir();

    abstract String getDuracion();



}
