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
    
    for(int i = 0; i < 10; i++){
        label[i] = new JLabel(img[i]);
    }
    JLabel target = new JLabel("Target");
    JLabel musuh = new JLabel("Musuh");
    JLabel pemain = new JLabel("Player");
    
    //Layout manager
    GroupLayout layout = new GroupLayout(frame.getContentPane());
    frame.getContentPane().setLayout(layout);
    
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(target)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label[0])
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label[1])
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label[2])
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label[3])
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label[4])
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label[5]))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pemain)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label[9]))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(musuh)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label[6])
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label[7])
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label[8]))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(buttonU))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(buttonD))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(buttonPause, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(buttonL)
                            .addGap(72, 72, 72)
                            .addComponent(buttonR))))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(buttonU)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonL)
                    .addComponent(buttonR))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonD)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonPause)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(target)
                            .addComponent(label[0])
                            .addComponent(label[1])
                            .addComponent(label[2])
                            .addComponent(label[3])
                            .addComponent(label[4])
                            .addComponent(label[5]))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(musuh)
                            .addComponent(label[6])
                            .addComponent(label[7])
                            .addComponent(label[8]))
                        .addGap(0, 30, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pemain)
                            .addComponent(label[9]))
                        .addContainerGap())))
        );
    
    
    // set up the jframe, then display it
    frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    frame.setPreferredSize(new Dimension(250, 270));
    frame.pack();
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);
  }
  
  public void addComponentsToFrame(Container pane) {
      
    
  }
}
