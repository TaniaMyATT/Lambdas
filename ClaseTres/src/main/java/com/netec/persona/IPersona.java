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
public interface IPersona {
    
    String NACIONALIDAD = "MEXICANA";
    
    public void comer(String comida);
    
    public void reproducirse(Persona persona);
    
    //Solo JAVA 8 en adelante.
    public default void caminar(String calle){
        System.out.println("Caminando por la calle: " + calle);
    }
}
