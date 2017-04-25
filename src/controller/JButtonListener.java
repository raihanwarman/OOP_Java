package controller;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import model.Player;

/**
 * Kelas untuk membuat button beserta windowsnya.
 */
public class JButtonListener {
  /**
   * Sebuah variabel untuk menampilkan frame (windows utama).
   */
  private static JFrame frame;

  private static JLabel score;
  /**
   * Pencipta.
   */
  private static final Pencipta pt = Pencipta.getPencipta();
  private static final Player p = Player.getPlayer();
  private static final ImageIcon [] img = new ImageIcon[10];
  private static final JLabel[] label = new JLabel[10];
  /**
   * Sebuah prosedur untuk menampilkan windows dari button.
   */
  public static void displayJFrame() {
    frame = new JFrame("Aptuyu");
//    JPanel panel1 = new JPanel();
//    JPanel panel2 = new JPanel();
//    JPanel panel3 = new JPanel();
//    JPanel panel4 = new JPanel();
    
    // create our jbutton
    JButton buttonU = new JButton("Up");
    JButton buttonD = new JButton("Down");
    JButton buttonL = new JButton("Left");
    JButton buttonR = new JButton("Right");
    JButton buttonPause = new JButton("Pause");
        
    // add the listener to the jbutton to handle the "pressed" event
    buttonU.addActionListener((ActionEvent e) -> {
        p.MoveUp();
    });

    buttonD.addActionListener((ActionEvent e) -> {
        p.moveDown();
    });

    buttonL.addActionListener((ActionEvent e) -> {
        p.moveLeft();
    });

    buttonR.addActionListener((ActionEvent e) -> {
        p.moveRight();
    });

    buttonPause.addActionListener((ActionEvent e) -> {
        pt.pauseMahluk();
    });

    // put the button on the frame
    frame.getContentPane().setLayout(new FlowLayout());
    frame.add(buttonU);
    frame.add(buttonD);
    frame.add(buttonL);
    frame.add(buttonR);
    frame.add(buttonPause);
    //Legenda
    img[0] = new ImageIcon("res/bird.png");
    img[1] = new ImageIcon("res/chicken.png");
    img[2] = new ImageIcon("res/cow.png");
    img[3] = new ImageIcon("res/duckling.png");
    img[4] = new ImageIcon("res/fish.png");
    img[5] = new ImageIcon("res/goat.png");
    img[6] = new ImageIcon("res/lion.png");
    img[7] = new ImageIcon("res/dog.png");
    img[8] = new ImageIcon("res/elephant.png");
    img[9] = new ImageIcon("res/p116.png");
    
    
    for(int i=0; i<10; i++){
        label[i] = new JLabel(img[i]);
    }
    JLabel target = new JLabel("Target");
    frame.add(target);
    for(int i=0; i<6; i++){
        frame.add(label[i]);
    }
    
    JLabel musuh = new JLabel("Musuh");
    frame.add(musuh);
    for(int i=6; i<9; i++){
        frame.add(label[i]);
    }
    
    JLabel pemain = new JLabel("Player");
    frame.add(pemain);
    frame.add(label[9]);
    
    // set up the jframe, then display it
    frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    frame.setPreferredSize(new Dimension(300, 200));
    frame.pack();
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);
  }
  
  public void addComponentsToFrame(Container pane) {
      
    
  }
}
