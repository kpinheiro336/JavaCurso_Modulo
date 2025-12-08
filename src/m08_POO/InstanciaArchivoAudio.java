package m08_POO;

import java.util.ArrayList;

public class InstanciaArchivoAudio {
    static void main() {
        ArrayList<ArchivoAudio> listaArchivoAudio = new ArrayList<>();
        listaArchivoAudio.add(new ClasesArchivoAudio.mp3("Save me", "Remy zero", "Rock", 3.5));
        listaArchivoAudio.add(new ClasesArchivoAudio.flac("Bubbly", "Colbie Caillat", "Relax", 3));
        listaArchivoAudio.add(new ClasesArchivoAudio.RadioEnLinea("Amantes", "Mike Bahia & Greicy", "Latina", 3.9));

        for (ArchivoAudio music : listaArchivoAudio) {
            System.out.println(music.reproducir());

            if (music instanceof ClasesArchivoAudio.mp3) {
                ClasesArchivoAudio.mp3 mp01 = (ClasesArchivoAudio.mp3) music;
                System.out.println(mp01.Descargable());
                System.out.println(mp01.Streamable());

            } else if (music instanceof ClasesArchivoAudio.flac) {
                ClasesArchivoAudio.flac flac01 = (ClasesArchivoAudio.flac) music;
                System.out.println(flac01.Descargable());




            }

        }
    }
}