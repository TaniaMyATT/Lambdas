/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package defaultMethods;

/**
 *
 * @author globalk
 */
public interface PersonaA {
    
    default public void hablar(){
        System.out.println("Hablando de varios temas");
    }
}
