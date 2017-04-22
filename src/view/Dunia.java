package view;
import java.util.ArrayList;
import javax.swing.JFrame;
import controller.Pencipta;
import model.Mahluk;

/**
  * Kelas yang merupakan tempat hidup mahluk.
*/
public class Dunia extends Thread {
    /**
      * variabel konstanta baris.
    */
    public static final int BARIS = 40;
    /**
      * variabel konstanta kolom.
    */
    public static final int KOLOM = 70;
    /**
      * variabel untuk singleton.
    */
    private static Dunia dunia;

    /**
      * variabel pencipta dalam satu dunia.
    */
    private final Pencipta dx;

    /**
     * variabel konstanta GUI.
    */
    private final AntarmukaSwing gui;

    /**
      * Konstruktor dunia singleton.
      * @author Verisky Mega Jaya/13514018
    */
    private Dunia() {
    int layarW = 1120, layarH = 640;
    JFrame frame = new JFrame("aptuyu");

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    gui = AntarmukaSwing.getAntarmukaSwing();
    frame.add(gui);
    frame.setSize(layarW, layarH);
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);
    dx = Pencipta.getPencipta();

    cetakMatriks();
    }

    /**
      * Sebuah prosedur untuk menghentikan.
      * program selama waktu yang ditentukan
      * @param lamaWaktu : parameter input untuk menentukan lama delay
      * @author Rio Chandra Rajagukguk/13514082
    */
    public void delay(final int lamaWaktu) {
        try {
            // to sleep 10 seconds
            Thread.sleep(lamaWaktu);
        } catch (InterruptedException e) {
            // recommended because catching InterruptedException
            //clears interrupt flag
            Thread.currentThread().interrupt();
        }
    }

    /**
      * Mengembalikan daftar semua Mahluk yang ada di posisi X,Y.
      * @param x : x adalah representasi ordinat (baris) pada Matriks dunia
      * @param y : y adalah representasi absis (kolom) pada Matriks dunia
      * @return mengembalikan List semua Mahluk yang berada di posisi X,Y
      * @author Martino Christanto Khuangga/13514084
    */
    public ArrayList<Mahluk> cariSemuadiXY(final int x, final int y) {
        ArrayList<Mahluk> MahlukdiTempat = new ArrayList<Mahluk>();
        int panjang = dx.getBanyakMahluk();
        for (int k = 0; k < panjang; k++) {
            Mahluk temp = dx.getMahluk(k);
            if (temp.getPositionX() == x && temp.getPositionY() == y) {
                MahlukdiTempat.add(temp);
            }
        }
        return MahlukdiTempat;
    }

    /**
      * Mencari indeks Mahluk di posisi X,Y pada List of Mahluk.
      * @param x : x adalah representasi ordinat (baris) pada Matriks dunia
      * @param y : y adalah representasi absis (kolom) pada Matriks dunia
      * @param umur parameter untuk memasukkan nilai umur yang diinginkan
      * @return mengembalikan indeks Mahluk di posisi X,Y dengan umur tertentu
      * pada List of Mahluk (st_list)
      * @author Martino Christanto Khuangga/13514084
    */
    public int cariIndeksListDiPosisiXYdanUmur(final int x, final int y,
            final int umur) {
        int panjang = dx.getBanyakMahluk();
        for (int k = 0; k < panjang; k++) {
            Mahluk temp = dx.getMahluk(k);
            if (temp.getPositionX() == x && temp.getPositionY() == y && temp
                    .getUmur() == umur) {
                return k;
            }
        }
        return -1;
    }

    /**
      * Mengembalikan indeks Mahluk di List of Mahluk yang berada di posisi i,j.
      * @param i : i adalah representasi ordinat (baris) pada Matriks dunia
      * @param j : j adalah representasi absis (kolom) pada Matriks dunia
      * @param x : x adalah semua mahluk di x,y
      * @return mengembalikan indeks Mahluk di posisi X,Y dengan umur tertentu
      * pada List of Mahluk (st_list)
      * @author Martino Christanto Khuangga/13514084
    */
    public int cariIndeksListKekuatanTertinggi(final int i, final int j,
            final ArrayList<Mahluk> x) {
        int kekuatan_maks = 0;
        int idx = -1;
        for (int k = 0; k < x.size(); k++) {
            Mahluk temp = x.get(k);
            if (temp.getPositionX() == i && temp.getPositionY() == j
                    && temp.getKekuatan() > kekuatan_maks) {
                kekuatan_maks = temp.getKekuatan();
                idx = k;
            }
        }
        return idx;
    }

    /**
      * Melakukan update dunia(matriks) ke Layar dan melakukan cetak Matriks.
      * @author Rio Chandra Rajagukguk/13514082
    */
    public synchronized void updateLayar() {
        int angkaDelay = 100;
        while (!dx.getSelesai()) {
            cetakMatriks();
            delay(angkaDelay);
        }
        gameOver();
    }

    /**
    *Mencetak matriks.
    * @author Rio Chandra Rajagukguk/13514082
    */
    public final void cetakMatriks() {
        for (int i = 0; i < BARIS; i++) {
            for (int j = 0; j < KOLOM; j++) {
                int p = dx.getMatriksBanyakYangMenempati(i, j);

                if (p > 1) {
                    ArrayList<Mahluk> MahlukdiXY = new ArrayList<Mahluk>();
                    MahlukdiXY = cariSemuadiXY(i, j);
                    int indeksMahlukTerkuat = cariIndeksListKekuatanTertinggi(i,
                            j, MahlukdiXY);
                    for (int k = 0; k < MahlukdiXY.size(); k++) {
                        if (k != indeksMahlukTerkuat) {
                            int akanDihapus = cariIndeksListDiPosisiXYdanUmur(i,
                                    j, MahlukdiXY.get(k).getUmur());
                            if (akanDihapus > -1) {
                                dx.setMatiMahluk(akanDihapus);
                            }
                        }
                    }
                }
            }
        }
    }

    /**
    * Animasi game over.
    * @author Rio Chandra Rajagukguk/13514082
    */
    public void gameOver() {
        //... kosong
    }

    /**
    * Digunakan untuk konstruktor singleton.
    * @return dunia yang sudah diciptakan
    * @author Verisky Mega Jaya/13514018
    */
    public static Dunia getDunia() {
        if (dunia == null) {
            dunia = new Dunia();
        }
        return dunia;
    }

    /**
     * Sebuah prosedur untuk menjalankan thread.
     */
    public void run() {
        updateLayar();
    }
}
