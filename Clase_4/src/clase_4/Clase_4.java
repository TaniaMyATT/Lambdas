/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase_4;

import java.awt.BorderLayout;

/**
 *
 * @author globalk
 */
public class Clase_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*int a = 5;
        int b = 0;
        
        int division = a/b;*/
        
        String[] nombres = {"nombre 1", "nombre 2", "nombre 3"};
        
        try {
            int div = 1/1;
            for (int x=0; x<=3; x++){
            System.out.println(nombres[x]);
        }
        }catch (ArithmeticException | ArrayIndexOutOfBoundsException ex){
            if (ex instanceof ArithmeticException){
                System.out.println("La división fue erronea");
            }
            if (ex instanceof ArrayIndexOutOfBoundsException){
                System.out.println("Índice del arreglo fuera de límite");
            }
        }
        /*catch (ArithmeticException e){
            System.out.println("Falló al intentar dividir");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Falló al intentar ingresar a una posición que no existe");
        }catch (Exception e){
            System.out.println("Excepción no esperada");
        }*/finally{
            System.out.println("Bloque finally");
            System.out.println("Cerrando recurso");
        }        
        System.out.println("Programa continúa");
        
    }
    
}
