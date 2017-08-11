/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oracle.consultas.dao;

import com.oracle.consultas.model.Doctor;
import java.util.List;
/**
 *
 * @author globalk
 */
public interface DoctorDAO {
    
    public void crearDoctor(Doctor doctor);
    
    public void eliminarDoctor(Doctor doctor);
    
    public void modificarDoctor(Doctor doctor);
    
    public Doctor buscarDoctor(Doctor doctor);
    
    public List<Doctor> listarDoctores();
    
}
