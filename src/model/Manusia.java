package model;
/**
  * @author Martino Christanto Khuangga/13514084
*/
public class Manusia extends Mahluk {
    /**
      * Atribut yang menyatakan jenis kelamin.
    */
    private final boolean jenisKelamin;
    /**
      * Konstruktor manusia dengan paramter.
      * @param gender : parameter untuk menentukan jenis kelamin
    */
    public Manusia(final boolean gender) {
        posX = (int) (Math.random() * 40);
        posY = (int) (Math.random() * 70);

        jenisKelamin = gender;
        umur = 75;
        kecepatanx = 1;
        kecepatany = 1;
        if (jenisKelamin) {
            kekuatan = 10;
            symbol = 'L';
        } else {
            kekuatan = 8;
            symbol = 'P';
        }
        lamaMenujuMati = 5;
    }

    /**
      * Sebuah prosedur untuk menghentikan program selama waktu yang ditentukan.
      * @param lamaWaktu : parameter input untuk menentukan lama delay
    */
    public final void delay(final int lamaWaktu) {
        try {
            // to sleep 10 seconds
            Thread.sleep(lamaWaktu);
            } catch (InterruptedException e) {
            // recommended because catching InterruptedException
            // clears interrupt flag
            Thread.currentThread().interrupt();
            // you probably want to quit if the thread is interrupted
            return;
        }
    }

    /**
      * Fungsi untuk mengembalikan nilai kekuatan.
      * @return : nilai kekuatan Mahluk
    */
    public final int getKekuatan() {
        return kekuatan;
    }

    /**
      * Fungsi untuk mengembalikan nilai umur.
      * @return : nilai umur Mahluk
    */
    public final int getUmur() {
        return umur;
    }

    /**
      * Prosedur untuk memberikan nilai ke Umur.
      * @param u : paramter untuk memberikan nilai umur nantinya
    */
    public final void setUmur(final int u) {
        umur = u;
    }

    /**
      * Fungsi untuk mengembalikan nilai posisi X.
      * @return : nilai posX
    */
    public final int getPositionX() {
        return posX;
    }

    /**
      * Fungsi untuk mengembalikan nilai posisi Y.
      * @return : nilai posY
    */
    public final int getPositionY() {
        return posY;
    }

    /**
      * Prosedur untuk memberikan nilai selesai.
      * @param b : parameter untuk memberikan nilai bool selesai
    */
    public final void setSelesai(final boolean b) {
        selesai = b;
    }

    /**
      * Fungsi untuk mengembalikan nilai selesai.
      * @return : nilai selesai
    */
    public final boolean getSelesai() {
            return selesai;
    }

    /**
      * Fungsi untuk mengembalikan simbol Mahluk.
      * @return : simbol Mahluk
    */
    public final char getSymbol() {
        return symbol;
    }

/**
      * Prosedur untuk mengubah posisi X,Y dari Mahluk.
    */
    public final void move() {
        while (umur > 0 && !selesai) {
            umur--;
            posX += kecepatanx + BARIS;
            posX %= BARIS;
            kecepatanx = (int) (Math.random() * 2) - 1;

            posY += kecepatany + KOLOM;
            posY %= KOLOM;
            kecepatany = (int) (Math.random() * 2) - 1;
            delay(200);
            while (pause) {
                delay(10);
            }
        }
        mati();
    }

    /**
      * Prosedur animasi mati Mahluk.
    */
    public final void mati() {
        umur = 0;
        while (lamaMenujuMati > 0) {
            lamaMenujuMati--;
            symbol = Integer.toString(lamaMenujuMati).charAt(0);
            delay(100);
        }
        posX = -1;
        posY = -1;

        selesai = true;
    }

    /**
    * Fungsi untuk mengembalikan jenis kelamin.
    * @return : mengembalikan boolean jenis kelamin
    */
    public final boolean getJenisKelamin() {
        return jenisKelamin;
    }

    /**
    * Sebuah prosedur untuk menjalankan thread.
    */
    public final void run() {
        move();
    }
}
