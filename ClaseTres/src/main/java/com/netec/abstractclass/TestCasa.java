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
public class TestCasa {

    public static void main(String[] args) {
        
        Television televisor = new Television();
        LineaBlanca lavadora = new Lavadora();
        
        System.out.println("Quiero ver Tele:");
        televisor.encender();
        televisor.medirEnergiaElectrica();
        System.out.println("Control Remoto: " + (televisor.controlRemoto.marca="Sony"));
        System.out.println("Canal: " + (televisor.controlRemoto.combinacion("123")));
        televisor.tareaDomestica();
        televisor.apagar();
        System.out.println("");
        
        System.out.println("Necesito lavar:");
        lavadora.encender();
        lavadora.tareaDomestica();
        lavadora.apagar();
        
    }
}
