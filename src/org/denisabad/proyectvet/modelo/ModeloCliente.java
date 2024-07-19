/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.denisabad.proyectvet.modelo;

/**
 * Clase del modelo cliente
 * @author Denis Abad 
 */
public class ModeloCliente extends Persona{
    
    private int id; 
    private String dpi; 
    public ModeloCliente(){}
    public ModeloCliente(int id, String dpi, String nombre, String telefono) {
        super(nombre, telefono);
        this.id = id;
        this.dpi = dpi;
    }

    /**
     * get del id del cliente
     * @return retorna id 
     */
    public int getId() {
        return id;
    }
    
    /**
     * set del id del cliente
     * @param id id del cliente 
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * get del DPI del cliente
     * @return retorna dpi
     */
    public String getDpi() {
        return dpi;
    }

    /**
     * set del dpi del cliente
     * @param idPersonal dpi del cliente 
     */
    public void setDpi(String idPersonal) {
        this.dpi = idPersonal;
    }
    
}
