/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package frame;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.GroupLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author USUARIO
 */
public class Game {

    private JFrame fr;
    private User user;
    private JPanel panel;
    private Vidas v;
    private Enemy enemy;
    int vidas = 0;
    private Wall wall1, wall2, wall3, wall4, wall5, wall6, wall7, wall8, wall9, wall10;
    private boolean up = true, down = true, left = true, right = true;
    private boolean controlEnemy1=false;
    Timer t;

    Game(JFrame frame) throws IOException {
        this.fr = frame;
        fr.requestFocus();
        ventana();
        agregarVida();
        movimiento();
        agregarPersonaje();
        agregarMuros();
        agregarEnemigos();

        t = new Timer(5, escuchante);
        t.start();

        fr.add(panel);
    }

    private void ventana() {
        panel = new JPanel();
        GroupLayout grupo = new GroupLayout(panel);
        panel.setLayout(grupo);
        panel.setBounds(0, 0, 1000, 600);
        panel.setBackground(new Color(152, 245, 255));
    }

    private void agregarPersonaje() {
        user = new User(50, 50);
        panel.add(user.personaje);
    }
    
    private void agregarVida() {
        v = new Vidas();
        panel.add(v.vida1);
        panel.add(v.vida2);
        panel.add(v.vida3);
    }

    private void agregarMuros() {
        Wall barra1 = new Wall(0, -20, 20, 600);
        Wall barra2 = new Wall(0, 0, 1000, 20);
        Wall barra3 = new Wall(970, -20, 20, 600);
        Wall barra4 = new Wall(0, 550, 1000, 20);

        panel.add(barra4.wall);
        panel.add(barra2.wall);
        panel.add(barra3.wall);
        panel.add(barra1.wall);

        wall1 = new Wall(200, 0, 20, 300);
        panel.add(wall1.wall);
        wall2 = new Wall(200, 400, 450, 20);
        panel.add(wall2.wall);
        wall3 = new Wall(200, 150, 300, 20);
        panel.add(wall3.wall);
        wall4 = new Wall(640, 125, 20, 300);
        panel.add(wall4.wall);
        wall5 = new Wall(640, 125, 200, 20);
        panel.add(wall5.wall);

    }
    
    private void agregarEnemigos(){
        enemy = new Enemy(380, 170);
        panel.add(enemy.enemy);
        
    }

    private void movimiento() {
        fr.addKeyListener(new KeyListener() {

            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
//                Listener encargado de escuchar los movimientos de el teclado para el avion

                accion(e);
            }

            @Override
            public void keyReleased(KeyEvent e) {
            }

        });

    }

    private void accion(KeyEvent e) {
        int numeroDeDesplazamiento = 10;
        int bandera = e.getExtendedKeyCode();
        //Escape
        if (bandera == KeyEvent.VK_ESCAPE) {

            System.exit(0);
        }
        if (bandera == KeyEvent.VK_RIGHT || bandera == KeyEvent.VK_D && right) {

            if (user.posX() < 910) {
                user.setPosicion(user.posX() + numeroDeDesplazamiento, user.posY());
            }

        }
        //Izquierda
        if (bandera == KeyEvent.VK_LEFT || bandera == KeyEvent.VK_A && left) {

            if (user.posX() > 10) {
                user.setPosicion(user.posX() - numeroDeDesplazamiento, user.posY());
            }

        }

        if (bandera == KeyEvent.VK_UP || bandera == KeyEvent.VK_W && up) {
            if (user.posY() > 30) {
                user.setPosicion(user.posX(), user.posY() - numeroDeDesplazamiento);
            }

        }
        if (bandera == KeyEvent.VK_DOWN || bandera == KeyEvent.VK_S && down) {
            if (user.posY() < 490) {
                user.setPosicion(user.posX(), user.posY() + numeroDeDesplazamiento);
            }

        }
    }

    ActionListener escuchante = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            left = true;
            right = true;
            up=true;
            down=true;
            
            if (user.area.intersects(wall1.area)) {
                if (user.posX() > wall1.posX()) {
                    left = false;
                } else {
                    right = false;
                }
                
                if(user.posY()>wall1.posY()){
                    up=false;
                }else{
                    down=false;
                }
            }
            
            if (user.area.intersects(wall2.area)) {
                if (user.posX() > wall2.posX()) {
                    left = false;
                } else {
                    right = false;
                }
                
                if(user.posY()>wall2.posY()){
                    up=false;
                }else{
                    down=false;
                }
            }
            if (user.area.intersects(wall3.area)) {
                if (user.posX() > wall3.posX()) {
                    left = false;
                } else {
                    right = false;
                }
                
                if(user.posY()>wall3.posY()){
                    up=false;
                }else{
                    down=false;
                }
            }
            if (user.area.intersects(wall4.area)) {
                if (user.posX() > wall4.posX()) {
                    left = false;
                } else {
                    right = false;
                }
                
                if(user.posY()>wall4.posY()){
                    up=false;
                }else{
                    down=false;
                }
            }
            if (user.area.intersects(wall5.area)) {
                if (user.posX() > wall5.posX()) {
                    left = false;
                } else {
                    right = false;
                }
                
                if(user.posY()>wall5.posY()){
                    up=false;
                }else{
                    down=false;
                }
            }
            
           //380  170-350
            if(user.area.intersects(enemy.areaEnemy)){
                 v.vida1.setVisible(false);
            }
               
            if(enemy.posY()<=350 && !controlEnemy1){
                System.out.println(enemy.posY());
                enemy.setPosicion(enemy.posX(), enemy.posY()+1);
                if(enemy.posY()==350)
                    controlEnemy1=true;
            }else{
                if(enemy.posY()==170){
                    controlEnemy1=false;
                }
                enemy.setPosicion(enemy.posX(), enemy.posY()-1);
            }
            
           

        }
    };

}
