/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.netec.statictest;
import com.netec.util.Herramientas;
import java.util.Date;

//Importamos todos los metodos static de Herramientas y podemos usarlos sin hacer referencia a la clase.
import static com.netec.util.Herramientas.*;
//import com.netect.varargs.Operaciones;

/**
 *
 * @author globalk
 */
public class TestStatic {
    
    private static final boolean [] switches = new boolean[5];
    private static final String FORMATO="10/11/1990";

    public static void main(String[] args) {
        
        //TestStatic ts = new TestStatic();
        
        //Herramientas herramientas = new Herramientas();
        
        Date fecha = getFecha(FORMATO); //se usa getFecha de Herramientas.
        
        //Operaciones.main(args);
        
        System.out.println("::: " + fecha);
    }
    
      
    //bloques estaticos solo se ejecutan 1 sola vez. Al iniciar ejecución.
    /*static {
        System.out.println("Iniciando.....");
        for (int i=0; i < 5; i++){
            switches[i] = true;
        }
    }
    
    public static void main(String[] args) {
        switches[1] = false;
        switches[0] = false;
        
        for (boolean swit: switches){
            System.out.println(swit);
        }
    }*/
}
