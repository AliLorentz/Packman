/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package frame;

/**
 *
 * @author USUARIO
 */
public class Level {

    Level() {

    }

    public int[] wallLevel1() {
        int[] wall = {
            200, 0, 20, 300,
            200, 400, 450, 20,
            200, 150, 300, 20,
            640, 125, 20, 300,
            640, 125, 200, 20};
        return wall;
    }

    public int[] wallLevel2() {
        int[] wall = {
            200, 150, 20, 450,
            200, 400, 600, 20,
            200, 150, 450, 20,
            640, 150, 20, 150,
            6240, 125, 200, 20};
        return wall;
    }

    public int[] enemyLevel1() {
        int[] enemyLevel1 = {
            320, 170,
            670, 300,
            23, 200,
            400, 20};
        return enemyLevel1;
    }

    public int[] enemyMoveLevel1() {
        int[] enemyMove = {
            350, 170,
            910, 670,
            160, 25,
            110, 15};
        return enemyMove;
    }

    public int[] enemyLevel2() {
        int[] enemyLevel2 = {
            520, 170,
            670, 250,
            23, 200,
            400, 20};
        return enemyLevel2;
    }
    
    public int [] llaveLevel1(){
        int [] llave={700,200};
        return llave;
    }
    
    public int [] llaveLevel2(){
        int [] llave={250,200};
        return llave;
    }
    
    public int [] PuertaLevel1(){
        int [] puerta={500,0};
        return puerta;
    }
    
    public int [] PuertaLevel2(){
        int [] puerta={100,510};
        return puerta;
    }

    public int[] enemyMoveLevel2() {
        int[] enemyMove = {350, 170};
        return enemyMove;
    }

}
