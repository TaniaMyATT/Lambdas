/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.netec.pedidos.enums;

/**
 *
 * @author globalk
 */
public enum Paises {
    MEXICO(0.16f, "www.sat.gob"), 
    PARIS(0.20f, "contact name"), 
    ESPAÑA(0.21f, "www.shcp.gob"), 
    CUBA(0.31f, "my name");
    
    private float iva;
    private String contacto;
    
    private Paises (float iva, String contacto){
        this.iva = iva;
        this.contacto = contacto;
    }

    public float getIva() {
        return iva;
    }

    public void setIva(float iva) {
        this.iva = iva;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    
}
