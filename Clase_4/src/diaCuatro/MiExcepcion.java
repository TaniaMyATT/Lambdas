/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diaCuatro;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author globalk
 */
public class MiExcepcion extends Exception {

    protected int code;
    protected String descripcion;
    protected Date fecha;

    public int getCode() {
        return code;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getFecha() {
        DateFormat date = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        return date.format(fecha);
    }
    
    

    public MiExcepcion(int code, String descripcion, Date fecha, String mensaje){
        super(mensaje);
        this.code = code;
        this.descripcion = descripcion;
        this.fecha = fecha;
        
    }
    
    public MiExcepcion() {
    }

    public MiExcepcion(String string) {
        super(string);
    }

    public MiExcepcion(String string, Throwable thrwbl) {
        super(string, thrwbl);
    }

    public MiExcepcion(Throwable thrwbl) {
        super(thrwbl);
    }

    public MiExcepcion(String string, Throwable thrwbl, boolean bln, boolean bln1) {
        super(string, thrwbl, bln, bln1);
    }
    
    
}
