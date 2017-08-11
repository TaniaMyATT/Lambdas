/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.netec.persona;

/**
 *
 * @author globalk
 */
public class PersonaImpl extends Persona implements IPersona{

    public String otroMetodo() {
        this.caminar("Dakota");
        return "";
    }
    
    @Override
    public void comer(String comida) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void reproducirse(Persona persona) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
