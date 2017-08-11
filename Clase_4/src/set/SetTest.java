/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author globalk
 */
public class SetTest {
    
    public static void main(String[] args) {
        Set<String> lista = new HashSet<String>();
        
        lista.add("f");
        lista.add("b");
        lista.add("z");
        lista.add("c");
        lista.add("b");
        lista.add("c");
        lista.add("d");
        lista.add("b");
        lista.add("d");
        lista.add("x");
        lista.add("b");
        lista.add("y");
        
        for (String list : lista){
            System.out.println(list);
        }
            
    }
}
