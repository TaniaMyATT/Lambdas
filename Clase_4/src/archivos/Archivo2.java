/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author globalk
 */
public class Archivo2 {
    
    public static void main(String[] args) {
        File file = new File("C:\\Users\\globalk\\Documents\\RegistroVentas\\archivo2.txt");
        
        try {
            
            FileWriter fw = new FileWriter(file);
            PrintWriter pw = new PrintWriter(file);
            pw.println("Producto: lavadora");
            pw.println("Precio: $10000");
            
            pw.flush();
            pw.close();
            
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            
            String data = br.readLine();
            String data2 = br.readLine();
            br.close();
            
            System.out.println(data);
            System.out.println(data2);
            
        } catch (IOException ex) {
            Logger.getLogger(Archivo2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
