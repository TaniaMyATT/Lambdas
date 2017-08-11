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
@FunctionalInterface
public interface Operacion {
 
    double calcular(double n1, double n2);
    
    default void multiplicar(){}
    
    //int calc (int a, int b);
}
