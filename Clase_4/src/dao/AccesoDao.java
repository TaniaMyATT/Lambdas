/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

/**
 *
 * @author globalk
 */
public class AccesoDao {
    
    public void connectarBase() throws Exception{
        
        try{
        System.out.println("Intentando conectarme...");
        throw new Exception("La url es incorrecta");
        } catch (Exception e){
            throw new Exception(e);
        }
    }
}
