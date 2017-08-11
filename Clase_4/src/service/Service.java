/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import dao.AccesoDao;

/**
 *
 * @author globalk
 */
public class Service {

    public static void main(String[] args) {
        
        try {
        Service.conectarOracle("url:Oracle");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    
    public static void conectarOracle(String url) throws Exception{
        AccesoDao dao = new AccesoDao();
        dao.connectarBase();
    }
}

