
package frame;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


/**
 *
 * @author ali.colmenares
 */
class Archivo {

    Inicio p;
    int subir;
    int xD=0;
    String arch="Top.txt",a;
    int i=0;
    
    
    public Archivo() throws IOException {
       
    }

    /**
     * 
     * @param nombre lo usamos para llegar por parametros el nombre ingresado por el usuario 
     */
    Archivo(String nombre) {
 
        String a = nombre;
 try {
          
            File f = new File("SaveGame.txt");
            FileWriter fw = new FileWriter(f, true);
            BufferedWriter bw = new BufferedWriter(fw);
         
            
            fw.append(nombre+"/");
             
            fw.close();
       
            
            
            
          
        } catch (IOException ex) {            
        }
            
    }

    /**
     * 
     * @param Total es la puntuacion final del jugador que se agrega al archivo
     */
    Archivo(int Total) {
           String punt = String.valueOf(Total);
        File f = new File("SaveGame.txt");
        try {
            
            FileWriter fw;
            fw = new FileWriter(f, true);
            BufferedWriter bw = new BufferedWriter(fw);
            fw.append(punt+"\r\n");
            bw.newLine();
            fw.close();
        } catch (IOException ex) {            
        }
        
    }
    
    
}
