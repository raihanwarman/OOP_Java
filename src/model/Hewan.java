package model;
/**
   * @author Raihan Maulana Warman/13514076
*/
public abstract class Hewan extends Mahluk {
    /**
      * Sebuah prosedur untuk menghentikan program selama waktu yang ditentukan.
      * @param lamaWaktu : parameter input untuk menentukan lama delay
    */
    public abstract void delay(final int lamaWaktu);

    /**
      * Fungsi untuk mengembalikan nilai umur.
      * @return : nilai umur Mahluk
    */
    public abstract int getUmur();

    /**
      * Prosedur untuk memberikan nilai ke Umur.
      * @param u : parameter untuk memberikan nilai umur nantinya
    */
    public abstract void setUmur(int u);

    /**
      * Fungsi untuk mengembalikan nilai posisi X.
      * @return : nilai posX
    */
    public abstract int getPositionX();

    /**
      * Fungsi untuk mengembalikan nilai posisi Y.
      * @return : nilai posY
    */
    public abstract int getPositionY();

    /**
      * Fungsi untuk mengembalikan nilai kekuatan.
      * @return : nilai kekuatan Mahluk
    */
    public abstract int getKekuatan();

    /**
      * Fungsi untuk mengembalikan simbol Mahluk.
      * @return : simbol Mahluk
    */
    public abstract char getSymbol();

    /**
      * Prosedur untuk memberikan nilai selesai.
      * @param b : parameter untuk memberikan nilai bool selesai
    */
    public abstract void setSelesai(boolean b);

    /**
      * Fungsi untuk mengembalikan nilai selesai.
      * @return : nilai selesai
    */
    public abstract boolean getSelesai();

    /**
      * Prosedur untuk mengubah posisi X,Y dari Mahluk.
    */
    public abstract void move();

    /**
      * Prosedur animasi mati Mahluk.
    */
    public abstract void mati();

    /**
      * Sebuah prosedur untuk menjalankan thread.
    */
    public abstract void run();
}
