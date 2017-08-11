/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializacion;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author globalk
 */
public class TestGato {
    
    public static void main(String[] args) {
        
        Gato benito = new Gato();
        benito.nombre = "Benito Juarez";
        benito.raza = "Oaxaca";
        
        try {
            
            /*FileOutputStream fm = new FileOutputStream("C:\\Users\\globalk\\Documents\\Linea Blanca\\testSer.ser");
            ObjectOutputStream os = new ObjectOutputStream(fm);
            os.writeObject(benito);
            os.close();
            */
            
            FileInputStream fi = new FileInputStream("C:\\Users\\globalk\\Documents\\Linea Blanca\\testSer.ser");
            ObjectInputStream obj = new ObjectInputStream(fi);
            
            
            try {
                
                
                Gato nuevoGato = (Gato) obj.readObject();
                obj.close();
                
                System.out.println(nuevoGato);
                
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(TestGato.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        } catch (IOException ex) {
            Logger.getLogger(TestGato.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
