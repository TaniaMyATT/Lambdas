/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.netec;
import com.netect.testprotected.Direccion;

/**
 *
 * @author globalk
 */
public class TestDireccionRH {
    
    public static void main(String[] args) {
        
        // Probar public de otro paquete en clase Direccion
        Direccion rh = new Direccion();
        
        rh.nombreDireccion = "Secundaria General 78";
        
               
    }
}
