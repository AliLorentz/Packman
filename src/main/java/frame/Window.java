/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package frame;

import java.awt.Color;
import java.io.IOException;
import javax.swing.GroupLayout;
import javax.swing.JPanel;

/**
 *
 * @author USUARIO
 */
public class Window {

    index ind;
    JPanel panel;
    Game game;

    public Window(index index) {
        this.ind = index;
        componentes();
        index.frame.add(panel);
    }

    private void componentes() {
        panel = new JPanel();
        GroupLayout grupo = new GroupLayout(panel);
        panel.setLayout(grupo);
        panel.setBackground(new Color(193, 205, 193));
        panel.setBounds(0, 0, 1000, 600);
        //Agrego los botones
        panel.setLayout(null);
        try {
            panel.setVisible(false);
            ind.frame.remove(panel);

            ind.game = new Game(ind.frame);
        } catch (IOException ex) {

        }
    }

}
