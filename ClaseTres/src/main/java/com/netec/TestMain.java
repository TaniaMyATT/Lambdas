/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.netec;

/**
 *
 * @author globalk
 */
public class TestMain {
    
    public static void main(String[] args) {
        String nombre = new String("Tania");
    
        /*for( ;; ){
            nombre += nombre;
            System.out.println("Nombre: " + nombre);   
        }*/    
        StringBuilder sb = new StringBuilder();
        
        String apellido1, apellido2, carrera;
        apellido1="Gonzalez";
        apellido2="Bernal";
        carrera= "IoT";
        
        sb.append(nombre).append(" ").append(apellido1).append(" ").append(apellido2).append(" tiene el doctorado de: ").append(carrera);
        /*sb.append(" ");
        sb.append(apellido1);
        sb.append(" ");
        sb.append(apellido2);
        sb.append(" tiene el doctorado de: ");
        sb.append(carrera);*/
        
        System.out.println(sb);
        
    }
    
}
