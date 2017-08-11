/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaceFuncional;

/**
 *
 * @author globalk
 */
public class OperacionTest {
    
    public static void main(String[] args) {
        double valor = OperacionTest.operar(10, 80);
        
        System.out.println("::: " + valor);
    }
    
    public static double operar(double x, double y){
        Operacion op = (double n1, double n2) -> n1 + n2;
        return op.calcular(x, y);
    }
    
}