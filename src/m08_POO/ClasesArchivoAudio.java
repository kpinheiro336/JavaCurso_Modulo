package m08_POO;

public class ClasesArchivoAudio {

    static class mp3 extends ArchivoAudio implements InterfacesArchivoAudio.Descarga, InterfacesArchivoAudio.Stream {
        mp3(String nombre, String artist, String genre, double duracion) {
            super(nombre, artist, genre, duracion);
        }

        @Override
        public String reproducir() {
            return "Reproduciendo: " + " " + nombre + " -" + " " +  artist;
        }

        @Override
        public String getDuracion() {
            return "Duración: " + duracion;
        }

        @Override
        public String Descargable() {
            return "Disponible para Descargar: " + nombre + " - " + artist;
        }

        @Override
        public String Streamable() {
            return "Disponible para reproducción solo en Stream: " + nombre + " - " + artist;
        }
    }

    static class flac extends ArchivoAudio implements InterfacesArchivoAudio.Descarga {
        flac(String nombre, String artist, String genre, double duracion) {
            super(nombre, artist, genre, duracion);
        }

        @Override
        public String reproducir() {
            return "Reproduciendo: " + " " + nombre + "-" + " " +  artist;
        }

        @Override
        public String getDuracion() {
            return "Duración: " + duracion;
        }

        @Override
        public String Descargable() {
            return "Disponible para Descargar: " + nombre + " - " + artist;
        }
    }

    static class RadioEnLinea extends ArchivoAudio implements InterfacesArchivoAudio.Stream {
        RadioEnLinea(String nombre, String artist, String genre, double duracion) {
            super(nombre, artist, genre, duracion);
        }

        @Override
        public String reproducir() {
            return "Reproduciendo: " + " " + nombre + "-" + " " +  artist;
        }

        @Override
        public String getDuracion() {
            return "Duración: " + duracion;
        }

        @Override
        public String Streamable() {
             return "Reproduciendo en Stream: " + nombre + " - " + artist;
        }
    }


}




