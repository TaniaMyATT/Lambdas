/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.netec.pedidos;

/**
 *
 * @author globalk
 */
public class TestPedido {
    
    public static void main(String[] args) {
        
        Pedido pedidoMexico = new PedidoMexico();
        pedidoMexico.setImporteSinIVA(10000);
        pedidoMexico.calcularPrecioConIVA();
        pedidoMexico.visualiza();
        
        Pedido pedidoEspaña = new PedidoEspaña();
        pedidoEspaña.setImporteSinIVA(10000);
        pedidoEspaña.calcularPrecioConIVA();
        pedidoEspaña.visualiza();
        
    }
    
}
