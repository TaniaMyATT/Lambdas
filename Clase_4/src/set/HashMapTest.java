/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set;

import java.util.Map;
import java.util.HashMap;
import java.util.Map.Entry;

/**
 *
 * @author globalk
 */
public class HashMapTest{
    
    public static void main(String[] args) {
    
        Map<Integer, String> diccionario = new HashMap<Integer, String>();
        
        diccionario.put(20, "ID");
        diccionario.put(30, "NAME");
        diccionario.put(40, "LASTNAME");
        
        System.out.println("Tamaño del HashMap: " + diccionario.size());
        
        for (Entry<Integer, String> e: diccionario.entrySet()){
            System.out.println("Llave: " + e.getKey() + " :: " + "Valor: " + e.getValue());
        }
        
    }

    
    
    
}
