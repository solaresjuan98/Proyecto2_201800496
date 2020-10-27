/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author juan333
 */
public class NodoGrafo {

    private String lugar;
    private List<AristaGrafo> aristas;

    public NodoGrafo(String lugar) {
        this.lugar = lugar;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public List<AristaGrafo> getAristas() {
        return aristas;
    }

    public void agregarArista(AristaGrafo arista) {
        if (aristas == null) {
            aristas = new ArrayList<>();
        }

        aristas.add(arista);
    }

    public void eliminarArista(AristaGrafo arista) {

        //System.out.println(" Eliminando arista de "+arista.getInicio()+" a "+arista.getDestino());
        for(AristaGrafo a : aristas) {
            //System.out.println(aristas);
            if (a != null) {
                if (a.equals(arista)) {
                    //System.out.println(" Borrado");
                    aristas.remove(arista);
                    break;
                }
            }

        }

    }
    
    
    public AristaGrafo existeArista(String lugarInicio, String lugarFinal) {
        //boolean encontrado = false;
        AristaGrafo aristaEncontrado = null;
        for (AristaGrafo a : aristas) {
            if (a != null) {
                if (a.getInicio().getLugar().equals(lugarInicio) && a.getDestino().getLugar().equals(lugarFinal)) {
                    //System.out.println("El nodo está a una distancia de  " + a.getDistancia());
                    aristaEncontrado = a;
                    
                    return aristaEncontrado;
                    //encontrado = true;
                }
            }
        }
        
        if(aristaEncontrado == null){
            System.out.println("No hay arista entre esos lugares");
        }

        return aristaEncontrado;
    }
    

    // Validar si la arista existe (boolean)
    /*public void existeArista(AristaGrafo arista) {
        boolean encontrado = false;
        for (AristaGrafo a : aristas) {
            if (a != null) {
                if (a == arista) {
                    System.out.println("El nodo está a una distancia de  " + a.getDistancia());
                    encontrado = true;
                }
            }
        }

        if (encontrado == false) {
            System.out.println("No tiene nodo adyacente");
        }

    }*/

    
    //public AristaGrafo aristaExiste(Nodo)
            
            
    @Override
    public String toString() {

        return lugar;
        //return "\n \tNodo [lugar =" + lugar + ", aristas= " + aristas + "]";
    }

}
