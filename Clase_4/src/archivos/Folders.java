/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivos;

import java.io.File;

/**
 *
 * @author globalk
 */
public class Folders {
    
    public static void main(String[] args) {
        //File miDirectorio = new File("C:\\Users\\globalk\\Documents\\Linea Blanca");
        File miDirectorio = new File("C:\\Users\\\\globalk\\Documents\\Linea Blanca\\Electronica", "venta 2017-10-10.txt");
        miDirectorio.mkdirs();
    }
}
