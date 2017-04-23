package controller;
import java.util.ArrayList;
import java.nio.charset.StandardCharsets;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;
import model.*;

/**
  * Kelas yang menciptakan mahluk.
*/
public class Pencipta extends Thread {
    /**
      * variabel konstanta baris.
    */
    public static final int BARIS = 40;
    /**
      * variabel konstanta kolom.
    */
    public static final int KOLOM = 70;
    /**
      * variabel yang digunakan untuk singleton pencipta.
    */
    private static Pencipta pencipta;
    /**
      * matriks untuk mengambil gambar peta dengan lambang int.
    */
    private final int[][] st_petaDunia = new int[BARIS][KOLOM];
    /**
      * matriks yang menyatakan banyaknya mahluk dalam satu sel.
    */
    private final int[][] st_banyakYangMenempati = new int[BARIS][KOLOM];
    /**
      * daftar mahluk yang pernah diciptakan.
    */
    private final ArrayList<Mahluk> st_list = new ArrayList<>();
    /**
      * sebuah list untuk menyimpan thread.
    */
    private final ArrayList<Thread> st_trit = new ArrayList<>();
    /**
      * variabel penanda dunia sudah selesai.
    */
    private boolean st_selesai;
    /**
      * variabel untuk jumlah mahluk yang masih hidup.
    */
    private int st_banyakObjek;

    /**
      * fungsi untuk membaca sebuah file.
      * @param path : lokasi file
      * @param encoding : hasil pembacaan file.
      * @return mengembalikan isi file dalam sebuah string
      * @throws IOException melemparkan IOException jika gagal membaca
      * @author Rio Chandra Rajagukguk/13514082
    */
    private String readFile(final String path, final Charset encoding) throws IOException {
      byte[] encoded = Files.readAllBytes(Paths.get(path));
      return new String(encoded, encoding);
    }

    /**
    * konstruktor pencipta.
    * @author Verisky Mega Jaya/13514018
    */
    private Pencipta() {
        st_banyakObjek = 0;
        st_selesai = false;
        resetKe0MatriksBanyakYangMenempati();
        for (int i = 0; i < 60; ++i) {
            Ciptakan('t');
        }
//        for (int i = 0; i < 5; ++i) {
//            Ciptakan('b');
//            Ciptakan('c');
//            Ciptakan('o');
//            Ciptakan('d');
//        }
        Ciptakan('b');
        Ciptakan('c');
        Ciptakan('o');
        Ciptakan('d');
        Ciptakan('u');
        Ciptakan('e');
        Ciptakan('f');
        Ciptakan('g');
        Ciptakan('l');
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
      * Prosedur untuk menciptakan Mahluk.
      * @param x : kode untuk menentukan alokasi Mahluk
 (Manusia, Tumbuhan, Chicken, atau Bird)
      * @author Rio Chandra Rajagukguk/13514082
    */
    public final void Ciptakan(final char x) {
        int i = st_trit.size();
        switch (x) {
            case 't' :
                st_list.add(new Tumbuhan());
                break;
            case 'b' :
                st_list.add(new Bird());
                break;
            case 'c' :
                st_list.add(new Chicken());
                break;
            case 'o' :
                st_list.add(new Cow());
                break;
            case 'd' :
                st_list.add(new Dog());
                break;
            case 'u' :
                st_list.add(new Duck());
                break;
            case 'e' :
                st_list.add(new Elephant());
                break;
            case 'f' :
                st_list.add(new Fish());
                break;
            case 'g' :
                st_list.add(new Goat());
                break;
            case 'l' :
                st_list.add(new Lion());
                break;
            default :
                st_list.add(new Tumbuhan());
                break;
        }
        st_banyakObjek++;
        st_trit.add(st_list.get(i));
        st_trit.get(i).start();
    }
    /**
    * Prosedur untuk memperbarui Dunia dan posisi Mahluk.
    * @author Rio Chandra Rajagukguk/13514082
    */
    public void update() {
        while (!st_selesai) {
            synchronized (this) {
                int i = 0;
                resetKe0MatriksBanyakYangMenempati();
                st_banyakObjek = st_list.size();
                while (i < st_list.size()) {
                    int pX = st_list.get(i).getPositionX();
                    int pY = st_list.get(i).getPositionY();
                    if (pX > -1 && pY > -1) {
                        st_banyakYangMenempati[pX][pY]++;
                    }

                    if (st_list.get(i).getUmur() == 0) {
                        st_banyakObjek--;
                    }
                    ++i;
                }
                if (st_banyakObjek == 0) {
                    delay(500);
                    st_selesai = true;
                }
            }
            delay(100);
        }
    }
    /**
    * Prosedur untuk menambahkan nilai sel st_banyakYangMenempati.
    * @param x : x adalah representasi ordinat (baris) pada matriks dunia
    * @param y : y adalah representasi absis (kolom) pada matriks dunia
    * @author Rio Chandra Rajagukguk/13514082
    */
    public synchronized void tambah1MatriksBanyakYangMenempati(final int x, final int y) {
        st_banyakYangMenempati[x][y]++;
    }
    /**
    * Prosedur untuk mengurangi nilai sel st_banyakYangMenempati.
    * @param x : x adalah representasi ordinat (baris) pada matriks dunia
    * @param y : y adalah representasi absis (kolom) pada matriks dunia
    * @author Rio Chandra Rajagukguk/13514082
    */
    public synchronized void kurang1MatriksBanyakYangMenempati(final int x, final int y) {
        st_banyakYangMenempati[x][y]--;
    }
    /**
    * Fungsi untuk mengembalikan apakah Mahluk berada laut.
    * @param x : x adalah representasi ordinat (baris) pada matriks dunia
    * @param y : y adalah representasi absis (kolom) pada matriks dunia
    * @return sebuah boolean yang menyatakan apakah mahluk berada di laut
    */
    public synchronized boolean beradaDiLaut(final int x, final int y) {
        boolean b = st_petaDunia[x][y] < 0;
        return b;
    }

    /**
    * Prosedur untuk membaca peta pada file eksternal.
    * @param namaBerkas : parameter untuk membaca nama file yang akan dibaca
    * @author Rio Chandra Rajagukguk/13514082
    */
    public void bacaPeta(final String namaBerkas) {
        String data;
        try {
            data = readFile(namaBerkas, StandardCharsets.UTF_8);
            int panjang = data.length();
            int i = 0, j = 0;
            int k = 1;
            char cc = data.charAt(0);
            while (k < panjang) {
                if (j == KOLOM) {
                    i++;
                    j = 0;
                    k++;
                    cc = data.charAt(k);
                }

                if (cc == '_') {
                    st_petaDunia[i][j++] = -1;
                } else {
                    if (cc == ';') {
                        st_petaDunia[i][j++] = 0;
                    } else {
                        st_petaDunia[i][j++] = 1;
                    }
                }
                cc = data.charAt(k);
                k++;
            }
        } catch (IOException e) {

        }
    }

    /**
    * Prosedur mengubah nilai elemen-elemen pada st_banyakYangMenempati menjadi 0.
    * @author Rio Chandra Rajagukguk/13514082
    */
    public final synchronized void resetKe0MatriksBanyakYangMenempati() {
        for (int i = 0; i < BARIS; i++) {
            for (int j = 0; j < KOLOM; j++) {
                st_banyakYangMenempati[i][j] = 0;
            }
        }
    }

    /**
    * Fungsi untuk mendapatkan jumlah Mahluk yang ada.
    * @return jumlah Mahluk yang ada di List of Mahluk
    * @author Rio Chandra Rajagukguk/13514082
    */
    public synchronized int getBanyakMahluk() {
        int si = st_list.size();
        return si;
    }

    /**
    * Mengambil sel peta pada posisi X.
    * @param x : representasi ordinat (baris) pada matriks dunia
    * @param y : representasi absis (kolom) pada matriks dunia
    * @return : Mengembalikan -1 untuk karakter '_' ,0 untuk karakter ';',
    * 1 untuk yang lainnya
    * @author Rio Chandra Rajagukguk/13514082
    **/
    public int ambilSelPetaDunia(final int x, final int y) {
        return st_petaDunia[x][y];
    }

    /**
    * Mengembalikan pointer Mahluk pada list ke i.
    * @param i : representasi indeks ke-i pada List
    * @return : Mengembalikan pointer Mahluk pada List indeks ke-i
    * @author Rio Chandra Rajagukguk/13514082
    */
    public synchronized Mahluk getMahluk(final int i) {
        assert i < st_list.size() : i;
        Mahluk ml = st_list.get(i);
        return ml;
    }

    /**
    * Mengembalikan pointer Mahluk pada list ke i.
    * @param x : representasi ordinat (baris) pada matriks dunia
    * @param y : representasi absis (kolom) pada matriks dunia
    * @return : Mengembalikan matriks st_banyakYangMenempati sel x,y
    * @author Rio Chandra Rajagukguk/13514082
    */
    public synchronized int getMatriksBanyakYangMenempati(final int x, final int y) {
        int n = st_banyakYangMenempati[x][y];
        return n;
    }

    /**
    * Fungsi untuk mengembalikan nilai st_selesai.
    * @return : Mengembalikan nilai st_selesai
    * @author Rio Chandra Rajagukguk/13514082
    */
    public boolean getSelesai() {
        return st_selesai;
    }

    /**
    * Fungsi untuk mengembalikan nilai st_banyakObjek.
    * @return : mengembalikan nilai st_banyakObjek
    * @author Rio Chandra Rajagukguk/13514082
    */
    public int getBanyakObjek() {
        return st_banyakObjek;
    }

    /**
    * Prosedur untuk memberikan nilai st_selesai.
    * @param b : variabel masukkan untuk st_selesai
    * @author Rio Chandra Rajagukguk/13514082
    **/
    public void setSelesai(final boolean b) {
        st_selesai = b;
    }

    /**
    * Prosedur untuk mematikan Mahluk pada List indeks ke-i.
    * @param i : i adalah indeks
    * @author Martino Christanto Khuangga/13514084
    */
    public synchronized void setMatiMahluk(final int i) {
        st_list.get(i).setUmur(0);
    }

    /**
    * Prosedur untuk menghentikan aktivitas Dunia sementara.
    * @author Rio Chandra Rajagukguk/13514082
    */
    public void pauseMahluk() {
        Mahluk.pause = !(Mahluk.pause);
    }

    /**
    * Digunakan untuk konstruktor singleton pencipta.
    * @return pencipta yang telah diciptakan
    * @author Verisky Mega Jaya/13514018
    */
    public static Pencipta getPencipta() {
        if (pencipta == null) {
            pencipta = new Pencipta();
        }
        return pencipta;
    }

    /**
    * Sebuah prosedur untuk menjalankan thread.
    */
    @Override
    public void run() {
        update();
    }
}
