/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.denisabad.proyectvet.controlador;
import java.util.ArrayList;
import org.denisabad.proyectvet.modelo.ModeloCita;


/**
 * Clase de controlador de citas
 * @author Denis Abad
 */
public class CitaControlador {
        private static CitaControlador instancia; 
    private ArrayList<ModeloCita> listaDoctor;
    private CitaControlador(){
	listaDoctor = new ArrayList<ModeloCita>();
    }
    public static CitaControlador getInstancia(){
	if(instancia == null){
            instancia = new CitaControlador();
	}return instancia;
    }
    public int cantidadDeCitas(){
		return listaDoctor.size(); 
	}
    
    /**
     *
     * @param nuevoDoctor agregar nuevo doctor 
     */
    public void agregarCitas(ModeloCita nuevoDoctor){
        listaDoctor.add(nuevoDoctor); 
    }
    /**
     * 
     * @return retorna lista de Doctor
     */
    public ArrayList<ModeloCita> mostraCita(){
        return listaDoctor; 
    }
    /**
     * 
     * @param colegiado
     * @return ver citas
     */
     public ModeloCita verCita(String colegiado){
		ModeloCita doctorEncontrado = new ModeloCita(); 
                     
		for (ModeloCita em : listaDoctor ) {
                     System.out.println(em.getDpi());
                     
			if (em.getDpi().equals(colegiado)){
                            
				doctorEncontrado = em; 
			}
			break; 
		}
		return doctorEncontrado; 
	}
     
     /**
      * Metodo para eliminar cita
      * @param colegiado 
      */
     public void eliminarCita(String colegiado){
        ModeloCita docEliminar = new ModeloCita(); 
        for (ModeloCita em : listaDoctor) {
            if (em.getDpi().equals(colegiado)) {
                docEliminar = em; 
                listaDoctor.remove(docEliminar); 
                break;
            }
        }
    }
     /**
      * Metodo para actualizar cita
      * @param docAntiguo
      * @param DocActualiza 
      */
      public void actualizarCita(String docAntiguo, ModeloCita DocActualiza ){ 
		for (ModeloCita em : listaDoctor ) {
			if (em.getDpi().equals(docAntiguo)){
				int docAct; 
				docAct = em.getId(); 
				listaDoctor.set(docAct-1, DocActualiza);
				
                                 
			break; 	
			}

		}

		
	}
}
