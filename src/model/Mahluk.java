package model;
/**
  * @author Nur Latifah Ulfah/13514015
*/
public abstract class Mahluk extends Thread {
  /**
    * Variabel konstan Baris.
  */
  public static final int BARIS = 40;
  /**
    * Variabel konstan Kolom.
  */
  public static final int KOLOM = 70;
  /**
    * umur suatu mahluk dalam satuan langkah.
  */
  protected int umur;
  /**
    * penentu arah gerak horisontal.
  */
  protected int kecepatanx;
  /**
    * penentu arah gerak vertikal.
  */
  protected int kecepatany;
  /**
    * penentu siapa yang bertahan hidup dalam persaingan.
  */
  protected int kekuatan;
  /**
    * representasi ordinat dalam matriks.
  */
  protected int posX;
  /**
    * representasi absis dalam matriks.
  */
  protected int posY;
  /**
    * tampilan mahluk dalam dunia.
  */
  protected char symbol;
  /**
    * penanda hidup atau mati suatu mahluk.
  */
  protected boolean selesai;
  /**
    * variabel untuk konstanta animasi mati.
  */
  protected int lamaMenujuMati;
  /**
    * variabel yang bernilai true, jika aplikasi di-pause.
  */
  public static boolean pause;

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
    * @param u : paramter untuk memberikan nilai umur nantinya
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
    * @return nilai selesai
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
  @Override
  public abstract void run();
}

