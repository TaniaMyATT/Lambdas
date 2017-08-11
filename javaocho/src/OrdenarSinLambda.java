/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambdas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author globalk
 */
public class OrdenarSinLambda {
    
    public static void main(String[] args) {
    
        List<Persona> clientes = new ArrayList<Persona>();
        
        clientes.add(new Persona("Lety"));
        clientes.add(new Persona("Alberto"));
        clientes.add(new Persona("Carlos"));
        clientes.add(new Persona("Yesica"));
        
        /*Collections.sort(clientes, new Comparator<Persona>() {
            @Override
            public int compare(Persona t, Persona t1) {
                return t.nombre.compareTo(t1.nombre);
            }
        });
        */
        Collections.sort(clientes, (Persona p1, Persona p2) -> p1.nombre.compareTo(p2.nombre));
        
        for (Persona cliente : clientes){
            System.out.println(cliente);
        }
    }
    
    
    
}
