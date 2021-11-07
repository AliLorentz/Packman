/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package frame;

import java.applet.AudioClip;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author USUARIO
 */
public class index {

    JFrame frame;
    Window window;
    Game game;

    public index() {
        frame = new JFrame("Packman");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000, 600);
        frame.getContentPane().setBackground(new Color(0, 191, 255));
        frame.getContentPane().setLayout(null);
        frame.setResizable(false);

        window = new Window(this);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        index ind = new index();
    }

}
