/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Clases;

/**
 * 
 * @author juan333
 */
public class Localidad {
    
    int id_conductor, id_lugar, id_usuario;
    boolean disponibilidad;
    
    // para conductores
    public Localidad(int id_conductor, int id_lugar, boolean disponibilidad){
        this.id_conductor = id_conductor;
        this.id_lugar = id_lugar;
        this.disponibilidad = disponibilidad;
    }
    
    // para usuarios
    public Localidad(int id_usuario, int id_lugar){
        this.id_usuario = id_usuario;
        this.id_lugar = id_lugar;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    
    public int getId_conductor() {
        return id_conductor;
    }

    public void setId_conductor(int id_conductor) {
        this.id_conductor = id_conductor;
    }

    public int getId_lugar() {
        return id_lugar;
    }

    public void setId_lugar(int id_lugar) {
        this.id_lugar = id_lugar;
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }
    
    
    
}
