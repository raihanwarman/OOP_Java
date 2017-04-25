package model;
/**
   * @author Raihan Maulana Warman/13514076
*/
public class Duck extends Hewan {
    /**
      * Variabel yang menyatakan ketahanan Bird.
    */
    private int armor;

    /**
      * Konstruktor Herbivor.
    */
    public Duck() {
        //CHECK:OFF: MagicNumber
        posX = (int) (Math.random() * 40);
        posY = (int) (Math.random() * 70);
        armor = 5;
        umur = 50;
        kecepatanx = 0;
        kecepatany = 1;
        kekuatan = 1;
        symbol = 'U';
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
        //CHECK:OFF: MagicNumber
        while (umur > 0 && !selesai) {
            umur--;
            posX += kecepatanx + BARIS;
            posX %= BARIS;

            posY += kecepatany + KOLOM;
            posY %= KOLOM;
            delay(970);
            while (pause) {
                delay(10);
            }
        }
        mati();
    }

    /**
      * Fungsi untuk mengembalikan nilai armor.
      * @return : nilai armor Bird
    */
    public final int getArmor() {
            return armor;
    }

    /**
     * Prosedur animasi mati Mahluk.
    */
    public final void mati() {
        //CHECKSTYLE:OFF
        umur = 0;
        while (lamaMenujuMati > 0) {
            lamaMenujuMati--;
            symbol = Integer.toString(lamaMenujuMati).charAt(0);
            delay(50);
        }
        posX = -1;
        posY = -1;
        selesai = true;
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
      * Sebuah prosedur untuk menjalankan thread.
    */
    public final void run() {
        move();
    }
}
