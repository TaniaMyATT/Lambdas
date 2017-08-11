/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.netect.varargs;

/**
 *
 * @author globalk
 */
public class Operaciones {
    
    /*public static void main(String[] args) {
        
        Operaciones op = new Operaciones();
        float promedio = op.promedio(3,4,5,6,7,9,3,4,5);
        
        System.out.println("Promedio: " + promedio);
    }*/
    
    public static void main(String[] args) {
       
        Operaciones op = new Operaciones();
        op.calcularCalificaciones("Saul", "Ing Mecatronica", 10, 10, 9, 9, 10);
        
    }
    
    public float promedio(int... calificaciones){
        
        int suma = 0;
        
        for (int calificacion : calificaciones) {
            suma += calificacion;
        }
        
        
        //casting del resultado de la división, en el caso que resulte un entero.
        return ((float) suma/calificaciones.length);
    }
    
    public void calcularCalificaciones (String nombreAlumno, String carrera, int... calificaciones){
        
        System.out.println("Alumno: " + nombreAlumno);
        System.out.println("Carrera: " + carrera);
        
        for (int calificacion : calificaciones) {
            System.out.println("Calificaciones: " + calificacion);
        }
        
    }
}
