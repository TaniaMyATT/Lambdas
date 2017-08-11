/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import operaciones.Operaciones;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author globalk
 */
public class TestOperaciones {

    @Test
    public void test(){
        Operaciones op = new Operaciones();
        int sum = op.sumar(5, 4);
        Assert.assertEquals(9, sum);
    }
    
    
}
