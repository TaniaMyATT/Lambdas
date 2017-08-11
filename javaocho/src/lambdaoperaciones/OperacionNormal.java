/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambdaoperaciones;

/**
 *
 * @author globalk
 */
public class OperacionNormal {
    
    public static void main(String[] args) {
        
        OperacionNormal test = new OperacionNormal();
        test.calcular();
    }

    private void calcular() {
        
        Operacion operacion = (double x, double y) -> (x+y)/2;
        System.out.println(operacion.calcularPromedio(18, 20));
        
    }
}
