/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones;

import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author globalk
 */
public class ArrayListPerformance {
    
    public static void main(String[] args) {
        
        long inicio1 = System.currentTimeMillis();
        List<Integer> lista = new ArrayList<Integer>();                
        
                for (int i=0; i<10000000; i++){
            lista.add(i);
        }
        long fin1 = System.currentTimeMillis();
        
        System.out.println("Inicio Uno");
        System.out.println(fin1 - inicio1);
        
        long inicio2 = System.currentTimeMillis();
        List<Integer> lista2 = new ArrayList<Integer>(10000000);
        
        
        for (int j=0; j<10000000; j++){
            lista2.add(j);
        }
        long fin2 = System.currentTimeMillis();        
        System.out.println("Inicio Dos");
        System.out.println(fin2 - inicio2);
        
    }
}
