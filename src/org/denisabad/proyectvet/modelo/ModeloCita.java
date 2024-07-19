/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.denisabad.proyectvet.modelo;

/**
 * Clase de Modelo de citas
 * @author Denis Abad
 */
public class ModeloCita {
    
    private int id; 
    private String nombre; 
    private String dpi; 
    private String fecha;
    private String hora; 

    /**
     * 
     * @param id
     * @param nombre
     * @param dpi
     * @param fecha
     * @param hora 
     */
    public ModeloCita(int id, String nombre, String dpi, String fecha, String hora) {
        this.id = id;
        this.nombre = nombre;
        this.dpi = dpi;
        this.fecha = fecha;
        this.hora = hora;
    }

    
    public ModeloCita() {
       
    }

    /**
     * get del id de la cita
     * @return retorna el id 
     */
    public int getId() {
        return id;
    }

    /**
     * set del idd de la cita
     * @param id 
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * get nombre de la persona que hizo cita
     * @return nombre de la persona 
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * set del nombre de la persona 
     * @param nombre nombre de la persona 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * get del DPI de la persona que hizo cita 
     * @return dpi de la persona 
     */
    public String getDpi() {
        return dpi;
    }
    /**
     * set del dpi de la persona
     * @param dpi dpi de la persona 
     */
    public void setDpi(String dpi) {
        this.dpi = dpi;
    }

    /**
     * get de la fecha de la cita de la persona
     * @return fecha de la cita
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * set de la fecha de la cita
     * @param fecha fecha que sera la cita 
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    /**
     * get hora de la cita agendada
     * @return retorna hora
     */
    public String getHora() {
        return hora;
    }

    /**
     * set de la hora de la cita
     * @param hora hora que sera la cita 
     */
    public void setHora(String hora) {
        this.hora = hora;
    }
    
    
}
