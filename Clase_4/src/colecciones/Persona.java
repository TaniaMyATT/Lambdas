/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones;

/**
 *
 * @author globalk
 */
public class Persona {
 
    public String name;
    public String lastname;
    
    public Persona(){}
    
    public Persona(String name, String lastname){
        
        this.name = name;
        this.lastname = lastname;
        
    }

    @Override
    public String toString() {
        return "Persona{" + "name=" + name + ", lastname=" + lastname + '}';
    }
    
    
}
