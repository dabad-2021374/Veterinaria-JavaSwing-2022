/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.denisabad.proyectvet.controlador;

import java.util.ArrayList;
import org.denisabad.proyectvet.modelo.ModeloCliente;

/**
 * Clase de controlador de Cliente
 * @author Denis Abad
 */
public class ClienteControlador {
    
     private static ClienteControlador instancia; 
    private ArrayList<ModeloCliente> listaDoctor;
    private ClienteControlador(){
	listaDoctor = new ArrayList<ModeloCliente>();
    }
    
    /**
     * Ver lista de Cliente
     * @return lista de doctores
     */
    public static ClienteControlador getInstancia(){
	if(instancia == null){
            instancia = new ClienteControlador();
	}return instancia;
    }
    public int cantidadDeDoctores(){
		return listaDoctor.size(); 
	}
    /**
     * agregar cliente
     * @param nuevoDoctor nuevo cliente a agregar
     */
    public void agregarCliente(ModeloCliente nuevoDoctor){
        listaDoctor.add(nuevoDoctor); 
    }
    public ArrayList<ModeloCliente> mostraCliente(){
        return listaDoctor; 
    }
    
    /**
     * metodo para ver cliente
     * @param colegiado cliente a ver
     * @return retorna el cliente
     */
     public ModeloCliente verCliente(String colegiado){
		ModeloCliente doctorEncontrado = new ModeloCliente(); 
                     
		for (ModeloCliente doc : listaDoctor ) {
                     System.out.println(doc.getDpi());
                     
			if (doc.getDpi().equals(colegiado)){
                            
				doctorEncontrado = doc; 
			}
			break; 
		}
		return doctorEncontrado; 
	}
     
     /**
      * Metodo para eliminar cliente
      * @param colegiado cliente a eliminar 
      */
     public void eliminarCliente(String colegiado){
        ModeloCliente docEliminar = new ModeloCliente(); 
        for (ModeloCliente em : listaDoctor) {
            if (em.getDpi().equals(colegiado)) {
                docEliminar = em; 
                listaDoctor.remove(docEliminar); 
                break;
            }
        }
    }
     
     /**
      * metodo para actualizar cliente
      * @param docAntiguo cliente que se quiere actualizar
      * @param DocActualiza cliente actualizado
      */
      public void actualizarCliente(String docAntiguo, ModeloCliente DocActualiza ){ 
		for (ModeloCliente em : listaDoctor ) {
			if (em.getDpi().equals(docAntiguo)){
				int docAct; 
				docAct = em.getId(); 
				listaDoctor.set(docAct-1, DocActualiza);
				
                                 
			break; 	
			}

		}

		
	}
}
