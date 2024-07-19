/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.denisabad.proyectvet.controlador;

import java.util.ArrayList;
import org.denisabad.proyectvet.modelo.ModeloMascota;

/**
 * Clase de Controlador de Mascotas
 * @author Denis Abad
 */
public class MascotaControlador {
    
   private static MascotaControlador instancia; 
    private ArrayList<ModeloMascota> listaMascota;
    private MascotaControlador(){
	listaMascota = new ArrayList<ModeloMascota>();
    }
    
    /**
     * 
     * @return la instancia de mascotas
     */
    public static MascotaControlador getInstancia(){
	if(instancia == null){
            instancia = new MascotaControlador();
	}return instancia;
    }
    
    /**
     * Metodo para ver cantidad de Mascotas
     * @return retorna lista de mascotas
     */
    public int cantiadadDeMascotas(){
		return listaMascota.size(); 
    }
    
    /**
     * Metodo para agregar Mascotas
     * @param nuevaMascota 
     */ 
    public void agregarMascota(ModeloMascota nuevaMascota){
        listaMascota.add(nuevaMascota); 
    }
    
    /**
     * Metodo para ver lista de mascotas
     * @return Retorna lista de mascotas
     */
    public ArrayList<ModeloMascota> mostarMascota(){
        return listaMascota; 
    }
    
    /**
     * Metodo para ver mascotas
     * @param dueno dueño de la mascota
     * @return retorna ver mascota
     */
    public ModeloMascota verMascotaId(String dueno){
		ModeloMascota mascotaEncontrada = new ModeloMascota(); 
		for (ModeloMascota mascota : listaMascota ) {
			if (mascota.getDpi().equals(dueno)){
				mascotaEncontrada = mascota; 
			}
			break; 
		}
		return mascotaEncontrada; 
	}
    
    /**
     * Metodo para eliminar Mascota
     * @param dueno por medio del cual se quiere eliminar mascota 
     */
     public void eliminarMascota(String dueno){
        ModeloMascota mascotaEliminar = new ModeloMascota(); 
        for (ModeloMascota mascota : listaMascota) {
            if (mascota.getDpi().equals(dueno)) {
                mascotaEliminar = mascota; 
                listaMascota.remove(mascotaEliminar); 
                break;
            }
        }
    }
    
    /**
     * Metodo para actualizar mascotas
     * @param ant mascota a actualizar
     * @param actt mascota nueva
     */
    public void actualizarMascota(String ant, ModeloMascota actt ){ 
		for (ModeloMascota mascota : listaMascota ) {
			if (mascota.getDpi().equals(ant)){
				int cliAct; 
				cliAct = mascota.getId(); 
				listaMascota.set(cliAct-1, actt);
                                

			break; 	
			}

		}

		
	}

    

    
}
