/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import diaCuatro.MiExcepcion;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author globalk
 */
public class SalsaBaile {
    
    public static void main(String[] args) throws MiExcepcion {
        
        try{
            SalsaBaile.validarEntrar("Juan", 15);
        }catch (MiExcepcion ex){
            //throw new MiExcepcion(500, "Ocurre cuando un menor de edad quiere entrar al bar", new Date(), "Intenta entrar un menor de edad");
            JOptionPane.showMessageDialog(null, "Fecha:" + ex.getFecha() + "\nCódigo error: " + ex.getCode() + "\n" + ex.getDescripcion() + ".\nMensaje: " + ex.getMessage());
            
        }
                
    }
    public static boolean validarEntrar(String name, int edad) throws MiExcepcion{
        
        boolean esMayor = false;
        
        if (edad >= 18){
            System.out.println("Bienvenido: " + name);
            esMayor = true;
        }else{
            throw new MiExcepcion(500, "Ocurre cuando un menor de edad quiere entrar al bar", new Date(), "Intenta entrar un menor de edad");
            //throw new MiExcepcion("No eres mayor de edad");
        }
        
        return esMayor;
            
    }
    
}
