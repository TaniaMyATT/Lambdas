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
public class Lavadora extends LineaBlanca{

    @Override
    public void tareaDomestica() {
        System.out.println("Lavar Ropa");
    }

    @Override
    public void encender() {
        System.out.println("Encendido automático de lavadora");
    }

    @Override
    public void apagar() {
        System.out.println("Apagar cuanto termine de lavar");
    }
    
}
