/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenar;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author globalk
 */
public class TestOrden {
    
    public static void main(String[] args) {
        Alumno alumno = new Alumno();
        alumno.nombre = "Felipe";
        alumno.apellido = "Castellanos";
        alumno.edad = 25;
        
        Alumno alumno2 = new Alumno();
        alumno2.nombre = "Zenon";
        alumno2.apellido = "Ramirez";
        alumno2.edad = 30;
        
        Alumno alumno3 = new Alumno();
        alumno3.nombre = "Alan";
        alumno3.apellido = "Gonzalez";
        alumno3.edad = 40;
        
        ArrayList<Alumno> alumnos = new ArrayList<>();
        
        alumnos.add(alumno);
        alumnos.add(alumno2);
        alumnos.add(alumno3);
        
        System.out.println("Sin Ordenar");
        for (Alumno alu : alumnos){
            System.out.println(alu);
        }
        
        Collections.sort(alumnos);
        
        System.out.println("Lista ordenada");
        for (Alumno al : alumnos){
            System.out.println(al);
        }
                
    }
}
