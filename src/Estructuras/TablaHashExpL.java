/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructuras;

import Clases.Localidad;

/**
 *
 * @author juan333
 *
 */
public class TablaHashExpL {

    int tamanio;
    public Localidad localidad;
    Localidad[] arr;

    public TablaHashExpL(int tamanio) {
        this.tamanio = tamanio;
        arr = new Localidad[tamanio];
    }

    public void insertarConductor(Localidad l) {
        int indice = l.getId_conductor() % tamanio;
        System.out.println(indice);
        if (!LocalidadExiste(indice)) {
            arr[indice] = l;
        } else {

            
            for(int j = indice; j < arr.length; j++){

                System.out.println(" >> "+j);
                if(!LocalidadExiste(j)){
                    arr[j] = l;
                    System.out.println("Agregado");
                    break;
                }
            }

        }
    }
    
    public void insertarLocUsuario(Localidad l){
        int indice = l.getId_conductor() % tamanio;
        System.out.println(" modulo: "+indice);
        if (!LocalidadExiste(indice)) {
            arr[indice] = l;
        } else {

            
            for(int j = indice; j < arr.length; j++){

                System.out.println(" >> "+j);
                if(!LocalidadExiste(j)){
                    arr[j] = l;
                    System.out.println("Agregado");
                    break;
                }
            }

        }
    }

    private boolean LocalidadExiste(int i) {

        return arr[i] != null;
    }

    public void mostrarLocalidades() {

        for (Localidad l : arr) {
            if (l != null) {
                System.out.println(" >> id: " + l.getId_conductor() + " id_lugar: " + l.getId_lugar());
            }

        }
    }
}
