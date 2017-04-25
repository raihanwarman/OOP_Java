package view;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;
import controller.Pencipta;
import java.awt.*;
import model.Mahluk;
import model.Player;

/**
 * Sebuah kelas untuk menampilkan antarmuka.
 */
public class AntarmukaSwing extends JPanel implements ActionListener {

  /**
    * variabel pointer singleton.
  */
  private static AntarmukaSwing antarmukaSwing;

  /**
    * variabel konstanta baris.
  */
  public static final int BARIS = 40;

  /**
    * variabel konstanta kolom.
  */
  public static final int KOLOM = 70;

  /**
    * variabel timer membuat selang waktu frame gambar.
  */
  private Timer timer;

  /**
    * variabel konstanta gambar bird, chicken, cow, dog, duck
    * elephant, fish, goat, lion
    * 
  */
  private final Image[] img = new Image[10];

  /**
    * variabel konstanta gambar laut, daratan, dan pegunungan.
  */
  private final Image[] imgA = new Image[3];

  /**
    * variabel konstanta gambar animasi sequence saat mahluk mati.
  */
  private final Image[] animMati = new Image[5];

  /**
    * variabel konstanta delay frame saat rendering.
  */
  private final int delay = 10;

  /**
    * variabel pencipta dalam satu dunia.
  */
  private Pencipta dx;

  /**
   * Konstanta ukuran pixel gambar.
   */
  private final int ukuranPx = 16;
  
  private Player player;
  /**
    * Konstruktor dunia singleton.
    * @author Verisky Mega Jaya/13514018
  */
  private AntarmukaSwing() {
    dx = Pencipta.getPencipta();
    player = Player.getPlayer();

    img[0] = Toolkit.getDefaultToolkit().getImage("res/bird.png");
    img[1] = Toolkit.getDefaultToolkit().getImage("res/chicken.png");
    img[2] = Toolkit.getDefaultToolkit().getImage("res/cow.png");
    img[3] = Toolkit.getDefaultToolkit().getImage("res/dog.png");
    img[4] = Toolkit.getDefaultToolkit().getImage("res/duckling.png");
    img[5] = Toolkit.getDefaultToolkit().getImage("res/elephant.png");
    img[6] = Toolkit.getDefaultToolkit().getImage("res/fish.png");
    img[7] = Toolkit.getDefaultToolkit().getImage("res/goat.png");
    img[8] = Toolkit.getDefaultToolkit().getImage("res/lion.png");
    img[9] = Toolkit.getDefaultToolkit().getImage("res/p116.png");

    imgA[0] = Toolkit.getDefaultToolkit().getImage("res/laut.png");
    imgA[1] = Toolkit.getDefaultToolkit().getImage("res/rumput.png");
    imgA[2] = Toolkit.getDefaultToolkit().getImage("res/gunung.png");

    animMati[0] = Toolkit.getDefaultToolkit().getImage("res/mati0.png");
    animMati[1] = Toolkit.getDefaultToolkit().getImage("res/mati1.png");
    animMati[2] = Toolkit.getDefaultToolkit().getImage("res/mati2.png");
    animMati[3] = Toolkit.getDefaultToolkit().getImage("res/mati3.png");
    animMati[4] = Toolkit.getDefaultToolkit().getImage("res/mati4.png");

    // Ciptakan Timer
    timer = new Timer(delay, this);
    timer.setInitialDelay(delay);
    timer.start();
  }

  /**
    * Mengembalikan pointer ke singleton AntarmukaSwing.
    * @author Verisky Mega Jaya/13514018
    * @return Mengembalikan pointer ke singleton AntarmukaSwing
    */
  public static AntarmukaSwing getAntarmukaSwing() {
    if (antarmukaSwing == null) {
      antarmukaSwing = new AntarmukaSwing();
    }
    return antarmukaSwing;
  }

    /**
    * Mengembalikan pointer Mahluk yang berada pada posisi XY, mengembalikan
    * NULL jika tidak ada.
    * @param x : x adalah representasi ordinat (baris) pada Matriks dunia
    * @param y : y adalah representasi absis (kolom) pada Matriks dunia
    * @return mengembalikan Mahluk yang berada di posisi X,Y
    * @author Rio Chandra Rajagukguk/13514082
    */
  public Mahluk cariListDiPosisiXY(final int x, final int y) {
    int panjang = dx.getBanyakMahluk();
    for (int k = 0; k < panjang; k++) {
      Mahluk temp = dx.getMahluk(k);
      if (temp.getPositionX() == x && temp.getPositionY() == y) {
        return temp;
      }
    }
    return null;
  }

  /**
    * Melakukan rendering gambar berdasarkan matriks yang
    * terdapat pada Pencipta.
    * @param g2 : g2 adalah pointer ke Graphics2D tempat menggambar matriks
    * yang dijelaskan sebelumnya
    * @author Rio Chandra Rajagukguk/13514082
    */
  public void render(final Graphics2D g2) {
    for (int i = 0; i < BARIS; i++) {
      for (int j = 0; j < KOLOM; j++) {
        int x = dx.ambilSelPetaDunia(i, j);
        int p = dx.getMatriksBanyakYangMenempati(i, j);
        Mahluk li1 = cariListDiPosisiXY(i, j);
        if (x == -1) {
          g2.drawImage(imgA[0], j * ukuranPx, i * ukuranPx, this);
        } else {
          if (x == 1) {
            g2.drawImage(imgA[2], j * ukuranPx, i * ukuranPx, this);
          } else {
            g2.drawImage(imgA[1], j * ukuranPx, i * ukuranPx, this);
          }
        }
        if (li1 != null) {
          char c = li1.getSymbol();
          if (c == '4' || c == '3' || c == '2' || c == '1' || c == '0') {
            switch (c) {
              case '4' : g2.drawImage(animMati[0], j * ukuranPx, i * ukuranPx, this); break;
              case '3' : g2.drawImage(animMati[1], j * ukuranPx, i * ukuranPx, this); break;
              case '2' : g2.drawImage(animMati[2], j * ukuranPx, i * ukuranPx, this); break;
              case '1' : g2.drawImage(animMati[3], j * ukuranPx, i * ukuranPx, this); break;
              case '0' : g2.drawImage(animMati[4], j * ukuranPx, i * ukuranPx, this); break;
              default : assert false : c; break;
            }
          } else {
            switch (c) {
              case 'B' : g2.drawImage(img[0], j * ukuranPx, i * ukuranPx, this); break;
              case 'C' : g2.drawImage(img[1], j * ukuranPx, i * ukuranPx, this); break;
              case 'O' : g2.drawImage(img[2], j * ukuranPx, i * ukuranPx, this); break;
              case 'D' : g2.drawImage(img[3], j * ukuranPx, i * ukuranPx, this); break;
              case 'U' : g2.drawImage(img[4], j * ukuranPx, i * ukuranPx, this); break;
              case 'E' : g2.drawImage(img[5], j * ukuranPx, i * ukuranPx, this); break;
              case 'F' : g2.drawImage(img[6], j * ukuranPx, i * ukuranPx, this); break;
              case 'G' : g2.drawImage(img[7], j * ukuranPx, i * ukuranPx, this); break;
              case 'L' : g2.drawImage(img[8], j * ukuranPx, i * ukuranPx, this); break;
              case 'P' : g2.drawImage(img[9], j * ukuranPx, i * ukuranPx, this); break;
              default : assert false : c; break;
            }
          }
        }
      }
    }
    Font font = new Font("Serif", Font.PLAIN, 36);
    g2.setFont(font);
    g2.setColor(Color.WHITE);
    g2.drawString("SCORE: "+Integer.toString(player.getScore()),50,50);
  }

  /**
    * Override metode paint pada JPanel.
    * @param g : g adalah pointer ke Graphics tempat dilakukan rendering gambar
    * @author Rio Chandra Rajagukguk/13514082
    */
  public void paint(final Graphics g) {
    super.paintComponent(g);
    Graphics2D g2 = (Graphics2D) g;

    RenderingHints rh = new RenderingHints(RenderingHints.KEY_ANTIALIASING,
        RenderingHints.VALUE_ANTIALIAS_ON);

    rh.put(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);

    g2.setRenderingHints(rh);

    render(g2);
  }

  /**
    * Override metode actionPerformed. Melakukan repaint gambar
    * @param e : e adalah ActionEvent yang terjadi saat melakukan repaint
    * @author Rio Chandra Rajagukguk/13514082
    */
  public void actionPerformed(final ActionEvent e) {
    repaint();
  }
}
