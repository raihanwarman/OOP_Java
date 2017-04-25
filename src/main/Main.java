package main;
import javax.swing.*;
import controller.Pencipta;
import controller.JButtonListener;
import view.Dunia;

/**
  * Kelas utama.
*/
class Main {
    /**
      * Sebuah prosedur untuk menghentikan program selama waktu yang ditentukan.
      * @param lamaWaktu : parameter input untuk menentukan lama delay
      * @author Nur Latifah Ulfah/13514015
    */
    public static void delay(final int lamaWaktu) {
        try {
            // to sleep 10 seconds
            Thread.sleep(lamaWaktu);
        } catch (InterruptedException e) {
            // recommended because catching InterruptedException
            // clears interrupt flag
            Thread.currentThread().interrupt();
        }
    }

    /**
      * Prosedur aksi untuk memulai program.
      * @param namaBerkasPeta : nama file dari peta yang digunakan
      * @author Hasna Nur Karimah/13514106
    */
    private static void mulai(final String namaBerkasPeta) {
        Pencipta p = Pencipta.getPencipta();
        p.bacaPeta(namaBerkasPeta);
        Dunia d = Dunia.getDunia();
        SwingUtilities.invokeLater(JButtonListener::displayJFrame);
        d.start();
        p.start();
    }

    /**
      * Program utama.
      * @param args : argumen dari main program
      * @author Nur Latifah Ulfah/13514015
    */
    public static void main(final String[] args) {
        mulai("res/peta1");
    }
}
