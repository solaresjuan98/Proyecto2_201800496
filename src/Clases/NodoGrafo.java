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

    // Validar si la arista existe
    public void existeArista(AristaGrafo arista) {
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

    }

    @Override
    public String toString() {
        
        return lugar;
        //return "\n \tNodo [lugar =" + lugar + ", aristas= " + aristas + "]";
    }

}
