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

    @Override
    public String toString() {
        return "Grafo [nodos=" + nodos + "]";
    }
}
