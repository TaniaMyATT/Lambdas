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
public class Television extends LineaBlanca{
    
    //Has-a --> tiene un control remoto con sus propias propiedades y acciones. Es otra clase.
    public ControlRemotoUniversal controlRemoto = new ControlRemotoUniversal();

    @Override
    public void tareaDomestica() {
        System.out.println("Ver Netflix");
    }

    @Override
    public void encender() {
        System.out.println("Encender como un television");  
    }

    @Override
    public void apagar() {
        System.out.println("Apagar como una television");
    }
    
}
