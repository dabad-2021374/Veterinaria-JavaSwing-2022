/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.denisabad.proyectvet.modelo;

/**
 * Modelo de la clase doctor
 * @author Denis Abad
 */
public class ModeloDoctor extends Persona {
    
     private int id;
     private String especialidad; 
     private String colegiado; 


public ModeloDoctor(){
    
}   

    /**
     * Constructor de Doctor
     * @param id
     * @param especialidad
     * @param colegiado
     * @param nombre
     * @param telefono 
     */
    public ModeloDoctor(int id, String especialidad, String colegiado, String nombre, String telefono ) {
        super(nombre, telefono);
        this.id = id;
        this.especialidad = especialidad;
        this.colegiado = colegiado;
    }

    /**
     * get del ID del Doctor
     * @return retorna el id del doctor 
     */
    public int getId() {
        return id;
    }

    /**
     * set del id del doctor 
     * @param id del doctor  
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * get de la especialidad del doctor
     * @return retorna la especialidad
     */
    public String getEspecialidad() {
        return especialidad;
    }

    /**
     * set de la especialidad del doctor 
     * @param especialidad Especialidad del Doctor 
     */
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    /**
     * get del colegiado del doctor
     * @return retorna colegiado
     */
    public String getColegiado() {
        return colegiado;
    }

    /**
     * set del colegiado del Doctor 
     * @param colegiado colegiado del Doc 
     */
    public void setColegiado(String colegiado) {
        this.colegiado = colegiado;
    }
    
    
    
}
