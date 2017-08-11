/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploEncapsulacion;

/**
 *
 * @author globalk
 */
public class Empleado {
    
    private String nombre;
    private int edad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) { 
        
        if (edad < 0 || edad >= 100){
            System.out.println("Edad: " + edad + ", no es permitida, solo de 0 - 99");
        }else{
             this.edad = edad;
             System.out.println("Edad: " + this.edad);
        }
    }
      
}
