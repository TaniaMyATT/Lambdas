/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.netec.abstractclass;

/**
 *
 * @author globalk
 */
public abstract class Electrodomestico {
    
    public String name;
    
    public void medirEnergiaElectrica(){
        System.out.println("Este electrónico ahorra 20% de energía");
    }
    
    public abstract void encender();
    
    public abstract void apagar();
    
}
