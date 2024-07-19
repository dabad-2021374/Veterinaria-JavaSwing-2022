/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.denisabad.proyectvet.modelo;

/**
 * Clase del Modelo de Mascota
 * @author Denis Abad
 */
public class ModeloMascota {
    
     private int id; 
    private String nombre; 
    private String dueno; 
    private String dpi; 
    private String tipo; 
    
    /**
     * 
     * @param id id de la mascota
     * @param nombre nombre de la mascota
     * @param dueno dueño de la mascota
     * @param dpi dpi del dueño
     * @param tipo raza de la mascota
     */
    public ModeloMascota(int id, String nombre, String dueno, String dpi, String tipo) {
        this.id = id;
        this.nombre = nombre;
        this.dueno = dueno;
        this.dpi = dpi;
        this.tipo = tipo;
    }

    public ModeloMascota() {
       
    }

    /**
     * Get de Id de la mascota
     * @return retorna id de mascota
     */
    public int getId() {
        return id;
    }

    /**
     * Set del id 
     * @param id id de mascota
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * get del nombre de la mascota
     * @return retorna nombre de la mascota
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * set del nombre de la mascota
     * @param nombre nombre de la mascota
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * get del dueño de la mascota
     * @return retorna dueño de la mascota
     */
    public String getDueno() {
        return dueno;
    }

    /**
     * set del dueño de la mascota
     * @param dueno dueño de la mascota
     */
    public void setDueno(String dueno) {
        this.dueno = dueno;
    }

    /**
     * get del dpi del sueño
     * @return retorna dpi del dueño
     */
    public String getDpi() {
        return dpi;
    }

    /**
     * set del dpi del sueño
     * @param dpi dpi del dueño
     */
    public void setDpi(String dpi) {
        this.dpi = dpi;
    }

    /**
     * get de la raza/tipo de la mascota
     * @return retorna la raza 
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * set de la raza/tipo de mascota
     * @param tipo raza/tipo de mascota
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
}
