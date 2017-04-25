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
    JButton buttonUp = new JButton("^");
    JButton buttonLeft = new JButton("<");
    JButton buttonRight = new JButton(">");
    JButton buttonDown = new JButton("v");
    JButton buttonPause = new JButton("Pause");
    
    p.Ciptakan('m');

    // add the listener to the jbutton to handle the "pressed" event
    buttonUp.addActionListener((ActionEvent e) -> {
        p.Ciptakan('l');
    });

    buttonLeft.addActionListener((ActionEvent e) -> {
        p.Ciptakan('p');
    });

    buttonRight.addActionListener((ActionEvent e) -> {
        p.Ciptakan('h');
    });

    buttonDown.addActionListener((ActionEvent e) -> {
        p.Ciptakan('k');
    });

    buttonPause.addActionListener((ActionEvent e) -> {
        p.pauseMahluk();
    });

    // put the button on the frame
    frame.getContentPane().setLayout(new FlowLayout());
    frame.add(buttonUp);
    frame.add(buttonLeft);
    frame.add(buttonRight);
    frame.add(buttonDown);
    frame.add(buttonPause);

    // set up the jframe, then display it
    frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    frame.setPreferredSize(new Dimension(300, 200));
    frame.pack();
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);
  }
}
