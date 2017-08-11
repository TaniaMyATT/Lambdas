/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivos;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author globalk
 */
public class Archivos {
    
    public static void main(String[] args) throws IOException {
        
        File file = new File("C:\\Users\\globalk\\Documents\\RegistroVentas\\Registro.txt");
        char[] in = new char[50];
        /*in[0] = 'T';
        in[1] = 'A';
        in[2] = 'N';
        in[3] = 'I';
        in[4] = 'A';
        */
        
        if (!file.exists()){
            try {
               
            if (file.createNewFile()){
                System.out.println("Se creó exitosamente, continúa el trabajo");
            }else {
                System.out.println("No se creó el archivo");
            }
            } catch (IOException ex) {
                Logger.getLogger(Archivos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            System.out.println("El archivo ya existe");
        }
        
        //FileWriter fw = new FileWriter(file);
        //fw.write("Artículo: Televisión \nPrecio: $50000");
        //fw.write(in);
        
        //fw.flush();
        //fw.close();
        
        FileReader fr = new FileReader(file);
        int size =  fr.read(in);
        System.out.println(size + " ");
        for (char c : in){
            System.out.print(c);
            fr.close();
        }
    }
}
