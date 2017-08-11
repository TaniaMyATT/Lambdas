/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oracle.animales;

class Animal {

    String nombre;
    
    public Animal(String nombre){
        this.nombre = nombre;
    }
    
    Animal reproducirse(Animal a){
        Animal hijo = new Animal(nombre);
        return hijo;
    }
}

class Gato extends Animal{

    public Gato (String nombre){
        super(nombre);
    }

    @Override
    Animal reproducirse(Animal a) {
        Gato gato = null;
        if (!(a instanceof Gato)){
            System.out.println("No se puede reproducir");    
        }else{
            gato = new Gato("Minino");
        }    
    return gato;
}
}

class Perro extends Animal{
    
    public Perro (String nombre){
        super(nombre);
    }

    @Override
    Animal reproducirse(Animal a) {
        Perro perro = null;
        if (!(a instanceof Perro)){
            System.out.println("No se puede reproducir");    
        }else{
            perro = new Perro("Cachorro");
        }    
        return perro; 
    }
}
/**
 *
 * @author globalk
 */
public class TestAnimales {

    public static void main(String[] args) {
        Perro p = new Perro("Scoobydoo");
        Gato g = new Gato("Benito");
        
        System.out.println("Padre: " + p.nombre);
        System.out.println("Nuevo hijo: " + p.reproducirse(p).nombre);
        
        System.out.println("Padre: " + g.nombre);
        System.out.println("Nuevo hijo: " + g.reproducirse(g).nombre);
    }
}
    
