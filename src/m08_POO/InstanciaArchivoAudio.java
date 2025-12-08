package m08_POO;

import java.util.ArrayList;

public class InstanciaArchivoAudio {
    static void main() {
        ArrayList<ArchivoAudio> listaArchivoAudio = new ArrayList<>();
        listaArchivoAudio.add(new ClasesArchivoAudio.mp3("Save me", "Remy zero", "Rock", 210));         //duracion : en segundos.
        listaArchivoAudio.add(new ClasesArchivoAudio.flac("Bubbly", "Colbie Caillat", "Relax", 180));
        listaArchivoAudio.add(new ClasesArchivoAudio.RadioEnLinea("Amantes", "Mike Bahia & Greicy", "Latina", 234));

        for (ArchivoAudio music : listaArchivoAudio) {
            System.out.println(music.reproducir());
            System.out.println(music.getDuracion());

            if (music instanceof ClasesArchivoAudio.mp3) {
                ClasesArchivoAudio.mp3 mp01 = (ClasesArchivoAudio.mp3) music;
                System.out.println(mp01.Descargable());
                System.out.println(mp01.Streamable());
                System.out.println(" ");

            } else if (music instanceof ClasesArchivoAudio.flac) {
                ClasesArchivoAudio.flac flac01 = (ClasesArchivoAudio.flac) music;
                System.out.println(flac01.Descargable());
                System.out.println(" ");

            }else if (music instanceof ClasesArchivoAudio.RadioEnLinea) {
                ClasesArchivoAudio.RadioEnLinea rel01 = (ClasesArchivoAudio.RadioEnLinea) music;
                System.out.println(rel01.Streamable());
                System.out.println(" ");





            }

        }
    }
}