/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package frame;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author USUARIO
 */
public class Inicio {

    index fr;
    JPanel panel;
    JButton ins, star, score, cred, salir, top;
    JTextField f1;
    Game gm;

    public Inicio(index frame) {
        this.fr = frame;
        componentes();
        frame.frame.add(panel);

    }

    private void componentes() {
        panel = new JPanel();
        GroupLayout grupo = new GroupLayout(panel);
        panel.setLayout(grupo);
        panel.setBackground(new Color(193, 205, 193));
        panel.setBounds(0, 0, 1000, 600);
        //Agrego los botones
        panel.setLayout(null);

        star = new JButton("JUGAR");
        Font str = new Font("arial", 22, 32);
        star.setFont(str);
        star.setBounds(50, 120, 200, 50);

        panel.add(star);

        star.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    panel.setVisible(false);
                    fr.frame.remove(panel);
                    //Constructor de la clase instrucciones
                    //mando por parametros el fr
                    fr.game = new Game(fr.frame);
                } catch (IOException ex) {
                    Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        });
    }

}
