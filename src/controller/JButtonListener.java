package controller;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * Kelas untuk membuat button beserta windowsnya.
 */
public class JButtonListener {
  /**
   * Sebuah variabel untuk menampilkan frame (windows utama).
   */
  private static JFrame frame;

  /**
   * Pencipta.
   */
  private static final Pencipta p = Pencipta.getPencipta();

  /**
   * Sebuah prosedur untuk menampilkan windows dari button.
   */
  public static void displayJFrame() {
    frame = new JFrame("Aptuyu");

    // create our jbutton
    JButton buttonL = new JButton("Laki-Laki");
    JButton buttonP = new JButton("Perempuan");
    JButton buttonH = new JButton("Herbivora");
    JButton buttonK = new JButton("Karnivora");
    JButton buttonT = new JButton("Tumbuhan");
    JButton buttonPause = new JButton("Pause");

    // add the listener to the jbutton to handle the "pressed" event
    buttonL.addActionListener((ActionEvent e) -> {
        p.Ciptakan('l');
    });

    buttonP.addActionListener((ActionEvent e) -> {
        p.Ciptakan('p');
    });

    buttonH.addActionListener((ActionEvent e) -> {
        p.Ciptakan('h');
    });

    buttonK.addActionListener((ActionEvent e) -> {
        p.Ciptakan('k');
    });

    buttonT.addActionListener((ActionEvent e) -> {
        p.Ciptakan('t');
    });

    buttonPause.addActionListener((ActionEvent e) -> {
        p.pauseMahluk();
    });

    // put the button on the frame
    frame.getContentPane().setLayout(new FlowLayout());
    frame.add(buttonL);
    frame.add(buttonP);
    frame.add(buttonH);
    frame.add(buttonK);
    frame.add(buttonT);
    frame.add(buttonPause);

    // set up the jframe, then display it
    frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    frame.setPreferredSize(new Dimension(300, 200));
    frame.pack();
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);
  }
}
