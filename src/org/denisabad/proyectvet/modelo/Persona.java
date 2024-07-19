/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.denisabad.proyectvet.modelo;

/**
 *
 * @author denis
 */
public class Persona {
    
    private String nombre; 
    private String telefono; 
    
    
    
    public Persona(){}
    /**
     * contructor de persona
     * @param nombre
     * @param telefono 
     */
    public Persona(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
      
       
    }

    /**
     * get del nombre de la persona 
     * @return retorna nombre de la persona
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
     * get del telefono de la persona
     * @return retorna el telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * set del telefono de la persona 
     * @param telefono telefono de la persona 
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    

   
    
    
}
