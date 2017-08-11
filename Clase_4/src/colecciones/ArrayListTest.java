/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author globalk
 */
public class ArrayListTest {

    public static void main(String[] args) {
        
        ArrayList<Persona> personas = new ArrayList<Persona>();
        
        Persona juan = new Persona("Juan", "Alvarez");
        Persona rosa = new Persona("Rosa", "Gonzalez"); 
        personas.add(juan);
        personas.add(rosa);
        
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
    
        arrayList.add(23);
        arrayList.add(23);
        arrayList.add(2);
        arrayList.add(45);
        arrayList.add(35);
        
        System.out.println ("Tamaño de mi arreglo: " + arrayList.size());
        System.out.println("Contiene? : " + arrayList.contains(23));
        System.out.println("Contiene? : " + personas.contains(rosa));
        
        for (Object persona : personas) {
            System.out.println(persona);
        }
    
        Iterator iterar = personas.iterator();
        while (iterar.hasNext()){
            System.out.println("Iterator");
            System.out.println();
            System.out.println(personas.toString());
        }
    }
    
}
