package model;

/**
  * @author Martino Christanto Khuangga/13514084
*/
public class Player extends Mahluk {
    /**
      * variabel yang digunakan untuk singleton player.
    */
    private static Player player;
    
    private int score;
    /**
      * Konstruktor manusia dengan paramter.
      * @param gender : parameter untuk menentukan jenis kelamin
    */
    public Player() {
        posX = 20;
        posY = 35;
        kekuatan = 2;
        umur = 3;
//        kecepatanx = 1;
//        kecepatany = 1;
        symbol = 'P';
        lamaMenujuMati = 5;
        score = 0;
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
            while (pause) {
                delay(10);
            }
        }
    }
    /**
      * Prosedur untuk mengubah posisi X,Y dari Player ke kanan.
    */
    public final void MoveUp(){
        kecepatanx = -1;
        kecepatany = 0;
        posX += kecepatanx + BARIS;
        posX %= BARIS;

        posY += kecepatany + KOLOM;
        posY %= KOLOM;
        
//        System.out.println(posX+' '+posY);
    }
    /**
      * Prosedur untuk mengubah posisi X,Y dari Player ke kanan.
    */
    public final void moveDown(){
        kecepatanx = 1;
        kecepatany = 0;
        posX += kecepatanx + BARIS;
        posX %= BARIS;

        posY += kecepatany + KOLOM;
        posY %= KOLOM;
    }
    /**
      * Prosedur untuk mengubah posisi X,Y dari Player ke kanan.
    */
    public final void moveLeft(){
        kecepatanx = 0;
        kecepatany = -1;
        posX += kecepatanx + BARIS;
        posX %= BARIS;

        posY += kecepatany + KOLOM;
        posY %= KOLOM;
    }
    /**
      * Prosedur untuk mengubah posisi X,Y dari Player ke kanan.
    */
    public final void moveRight(){
        kecepatanx = 0;
        kecepatany = 1;
        posX += kecepatanx + BARIS;
        posX %= BARIS;

        posY += kecepatany + KOLOM;
        posY %= KOLOM;
    }
    /**
      * Prosedur animasi mati Mahluk.
    */
    public final void mati() {
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
    * Sebuah prosedur untuk menjalankan thread.
    */
    public final void run() {
        move();
    }
    
    /**
    * Digunakan untuk konstruktor singleton pencipta.
    * @return pencipta yang telah diciptakan
    * @author Verisky Mega Jaya/13514018
    */
    public static Player getPlayer() {
        if (player == null) {
            player = new Player();
        }
        return player;
    }
    
    public int getScore() {
        return score;
    }
    
    public synchronized void addScore(int x) {
        score = score + x;
    }
}
