/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.netec.pedidos;

import static com.netec.pedidos.enums.Paises.*;

/**
 *
 * @author globalk
 */
public class PedidoEspaña extends Pedido{

    @Override
    protected void calcularIVA() {
      this.pais = ESPAÑA.toString();
      this.contacto = ESPAÑA.getContacto();
      importeIVA = importeSinIVA * ESPAÑA.getIva();
    } 
}
