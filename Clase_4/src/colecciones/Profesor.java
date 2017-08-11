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
public class Profesor extends Persona {
    
    public String especialidad;

    @Override
    public String toString() {
        return super.toString() + " Especialidad:" + especialidad; //To change body of generated methods, choose Tools | Templates.
    }
                
}
