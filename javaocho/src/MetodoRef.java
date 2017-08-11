/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodosReferencia;

import java.util.Arrays;
import java.util.Comparator;

/**
 *
 * @author globalk
 */
public class MetodoRef {
    
    
    public static void main(String[] args) {
        
        MetodoRef.referenciarConstructor();
        
        //MetodoRef.referenciarMetodosObjetos();
    }
    public static void referenciarMetodosObjetos(){
        
        String[] nombres = {"Armando", "Zaori", "Gerardo"};
        
        /*Arrays.sort(nombres, new Comparator<String>() {
            @Override
            public int compare(String t, String t1) {
                return t.compareToIgnoreCase(t1);
            }
        });
        */
              
        //Referencia al metodo CompareToIgnoreCase sin crear objeto String
        Arrays.sort(nombres, String::compareToIgnoreCase);
        
        for (String nombre : nombres){
            System.out.println(nombre);
        }
    }
    
    public void referenciaMetodoParticular(){
        
        
    }
    
    public static void referenciarConstructor(){
        
        IPersona iper = Persona::new;
        Persona per = iper.crear(1, "Tania Gonzalez");
        
        System.out.println(per);
        
    }
    
}
