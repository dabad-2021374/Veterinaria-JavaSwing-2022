/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.denisabad.proyectvet.controlador;

import java.util.ArrayList; 
import org.denisabad.proyectvet.modelo.ModeloEmpleado; 

/**
 * Clase de controlador de Empleado
 * @author Denis Abad
 */
public class EmpleadoControlador {
    private static EmpleadoControlador instancia; 
    private ArrayList<ModeloEmpleado> listaEmpleado;
    private EmpleadoControlador(){
	listaEmpleado = new ArrayList<ModeloEmpleado>();
    }
    
    /**
     * Metodo para ver lista de Empleados
     * @return retorna la lista de empleados
     */
    public static EmpleadoControlador getInstancia(){
	if(instancia == null){
            instancia = new EmpleadoControlador();
	}return instancia;
    }
    
    /**
     * Metodo para ver cantidad de empleados
     * @return retorna la cantidad de empleados
     */
    public int cantidadDeEmpleados(){
		return listaEmpleado.size(); 
    }
    
    /**
     * Metodo para agregar empleado
     * @param nuevoEmpleado nuevo empleado a agregar
     */
    public void agregarEmpleado(ModeloEmpleado nuevoEmpleado){
        listaEmpleado.add(nuevoEmpleado); 
    }
    
    /**
     * Metodo para ver empleados
     * @return retorna lista de empleados
     */
    public ArrayList<ModeloEmpleado> mostarEmpleado(){
        return listaEmpleado;
    }
    
    /**
     * Metodo para ver empleado por carné
     * @param carne
     * @return Retorna empleado que se busco
     */
     public ModeloEmpleado verEmpleadoPorCarne(String carne){
		ModeloEmpleado empleadoEncontrado = new ModeloEmpleado(); 
		for (ModeloEmpleado empleado : listaEmpleado ) {
			if (empleado.getCarne().equals(carne)){
				empleadoEncontrado = empleado; 
			}
			break; 
		}
		return empleadoEncontrado; 
	}
     
     /**
      * Metodo para eliminar empleado
      * @param carne Carné del empleado a eliminar 
      */
      public void eliminarEmpleado(String carne){
        ModeloEmpleado empleadoEliminar = new ModeloEmpleado(); 
        for (ModeloEmpleado em : listaEmpleado) {
            if (em.getCarne().equals(carne)) {
                empleadoEliminar = em; 
                listaEmpleado.remove(empleadoEliminar); 
                break;
            }
        }
    }
      
      /**
       * Metodo para actualizar Empleado
       * @param empleAntiguo Empleado a Actualizar
       * @param empleActualiza Empleado Nuevo
       */
      public void actualizarEmpleado(String empleAntiguo, ModeloEmpleado empleActualiza ){ 
		for (ModeloEmpleado em : listaEmpleado ) {
			if (em.getCarne().equals(empleAntiguo)){
				int emAct; 
				emAct = em.getId(); 
				listaEmpleado.set(emAct-1, empleActualiza);
				
			break; 	
			}

		}

		
	}
    
    
    
}
