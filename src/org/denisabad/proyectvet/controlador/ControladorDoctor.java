/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.denisabad.proyectvet.controlador;
import java.util.ArrayList;
import org.denisabad.proyectvet.modelo.ModeloDoctor; 

/**
 * Clase de controlador de Doctor
 * @author Denis Abad
 */
public class ControladorDoctor {
    
    private static ControladorDoctor instancia; 
    private ArrayList<ModeloDoctor> listaDoctor;
    private ControladorDoctor(){
	listaDoctor = new ArrayList<ModeloDoctor>();
    }
    
    /**
     * 
     * @return retorna lista de doctores
     */
    public static ControladorDoctor getInstancia(){
	if(instancia == null){
            instancia = new ControladorDoctor();
	}return instancia;
    }
    public int cantidadDeDoctores(){
		return listaDoctor.size(); 
	}
    
    /**
     * metoedo para agregar Doctor
     * @param nuevoDoctor nuevo doctor 
     */
    public void agregarDoctor(ModeloDoctor nuevoDoctor){
        listaDoctor.add(nuevoDoctor); 
    }
    public ArrayList<ModeloDoctor> mostrarDoctor(){
        return listaDoctor; 
    }
    
    /**
     * metodo para ver doctor
     * @param colegiado Doctor a ver
     * @return retorna Doctor
     */
     public ModeloDoctor verDoctorCole(String colegiado){
		ModeloDoctor doctorEncontrado = new ModeloDoctor(); 
                     
		for (ModeloDoctor doc : listaDoctor ) {
                     System.out.println(doc.getColegiado());
                     
			if (doc.getColegiado().equals(colegiado)){
                            
				doctorEncontrado = doc; 
			}
			break; 
		}
		return doctorEncontrado; 
	}
     
     /**
      * metodo para eliminar doctor
      * @param colegiado doctor a eliminar
      */
     public void eliminarDoctor(String colegiado){
        ModeloDoctor docEliminar = new ModeloDoctor(); 
        for (ModeloDoctor doc : listaDoctor) {
            if (doc.getColegiado().equals(colegiado)) {
                docEliminar = doc; 
                listaDoctor.remove(docEliminar); 
                break;
            }
        }
    }
     
     /**
      * metodo para actualizar doctor
      * @param docAntiguo Doctor a Actualizar 
      * @param DocActualiza Doctor Nuevo
      */
      public void actualizarDoctor(String docAntiguo, ModeloDoctor DocActualiza ){ 
		for (ModeloDoctor doc : listaDoctor ) {
			if (doc.getColegiado().equals(docAntiguo)){
				int docAct; 
				docAct = doc.getId(); 
				listaDoctor.set(docAct-1, DocActualiza);
				
                                 
			break; 	
			}

		}

		
	}
    
}
