/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.denisabad.proyectvet.modelo;

/**
 *
 * @author Denis Abad
 */
public class ModeloEmpleado extends Persona {
    
    
    private String carne; 
    private String area;
     private int id; 

   
 public ModeloEmpleado(){}
    /**
     * contructor de empleado
     * @param carne
     * @param area
     * @param id
     * @param nombre
     * @param telefono 
     */
    public ModeloEmpleado(String carne, String area, int id, String nombre, String telefono) {
        super(nombre, telefono);
        this.carne = carne;
        this.area = area;
        this.id = id;
    }

    /**
     * get del carné del empleado
     * @return 
     */
    public String getCarne() {
        return carne;
    }

    /**
     * set del carné del empleado
     * @param carne carné del empleado
     */
    public void setCarne(String carne) {
        this.carne = carne;
    }

    /**
     * get del area que ocupa el empleado
     * @return retorna Area del empleado
     */
    public String getArea() {
        return area;
    }

    /**
     * set del area que ocupa el empleado
     * @param area area del empleado
     */
    public void setArea(String area) {
        this.area = area;
    }

    /**
     * get del id del empleado
     * @return retorna id del empleado
     */
    public int getId() {
        return id;
    }

    /**
     * set del id del empleado 
     * @param id id del empleado
     */
    public void setId(int id) {
        this.id = id;
    }
    
     
}
