/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructuras;

import Clases.NodoGrafo;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author juan333
 */
public class Grafo {

    private List<NodoGrafo> nodos;

    public void agregarNodo(NodoGrafo nodo) {

        if (nodos == null) {
            nodos = new ArrayList<>();
        }

        nodos.add(nodo);
    }

    public List<NodoGrafo> obtenerNodos() {
        return nodos;
    }
    
    public void buscarNodoc(String nombre_lugar){
        
        try{
            
            for(NodoGrafo n : nodos){
                
                if(n != null){
                    
                    if(n.getLugar().equals(nombre_lugar)){
                        System.out.println(n.getLugar());
                    }
                }
            }
        }catch(Exception e){
            System.out.println("Error");
        }

    }

    
    public NodoGrafo buscarNodo(String nombre_lugar){
        
        NodoGrafo nodo = null;
        try{
            
            for(NodoGrafo n : nodos){
                
                if(n != null){
                    
                    if(n.getLugar().equals(nombre_lugar)){
                        nodo = n;
                        
                        return nodo;
                    }
                }
            }
        }catch(Exception e){
            System.out.println("Error");
        }
        
        return nodo;
    }

    @Override
    public String toString() {
        return "Grafo [nodos=" + nodos + "]";
    }
}
