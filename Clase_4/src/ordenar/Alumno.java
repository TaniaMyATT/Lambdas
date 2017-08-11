/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenar;

/**
 *
 * @author globalk
 */                           // Tipo de objeto a comparar
public class Alumno implements Comparable<Alumno>{

    public String nombre;
    public String apellido;
    public Integer edad;

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + '}';
    }

    @Override
    public int compareTo(Alumno t) {

        //String a = new String(String.valueOf(this.edad) + this.nombre);
        //String b = new String(String.valueOf(t.getEdad()) + t.getNombre());
        
        String a = new String(this.nombre + String.valueOf(this.edad));
        String b = new String(t.getNombre() + String.valueOf(t.getEdad()));
        
        /*if (t.orden.equalsIgnoreCase("edad")){
            return edad.compareTo(t.edad);
        }else
         return nombre.compareTo(t.nombre);*/
        return a.compareTo(b);
    }
    
}
