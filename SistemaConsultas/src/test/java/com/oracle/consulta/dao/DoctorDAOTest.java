/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oracle.consulta.dao;

import com.oracle.consultas.dao.DoctorDAO;
import com.oracle.consultas.dao.DoctorDAOImpl;
import com.oracle.consultas.model.Doctor;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author globalk
 */
public class DoctorDAOTest {
    
    public DoctorDAOTest() {
    }
    
    @Test
    public void crearDoctorTest(){
        DoctorDAO doctorDao = new DoctorDAOImpl();
        
        Doctor simi = new Doctor();
        simi.setCodigo(3);
        simi.setNombre("Dr. Simi");
        simi.setApellido("Juarez");
        simi.setEspecialidad("Generico");
        
        doctorDao.crearDoctor(simi);
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
