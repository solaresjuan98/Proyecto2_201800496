/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructuras;

import Clases.AristaGrafo;
import Clases.NodoGrafo;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author juan333
 */
public class Dijkstra {

    public ArrayList<NodoGrafo> nodosVisistados;

    public Dijkstra() {
        this.nodosVisistados = new ArrayList<>();

    }

    public Grafo hallarRutaMenor(Grafo grafo, NodoGrafo inicio, NodoGrafo destino) {

        System.out.println(" Lugar de inicio: " + inicio.getLugar());

        NodoGrafo actual = hallarNodoMasCercano(inicio.getAristas());
        NodoGrafo anterior = null;
        // se agrega el nodo de inicio a la lista de nodos visitados
        nodosVisistados.add(inicio);

        System.out.print("" + actual.getLugar() + " -> ");
        // ejecutar el ciclo mientras no se llegue al nodo destino
        while (actual != destino) {
            

            nodosVisistados.add(actual);
            anterior = actual;
            actual = hallarNodoMasCercano(actual.getAristas());
            //System.out.println(" Actual -> " + actual.getLugar());
            //int aux = menorDistancia(anterior.getAristas());

            //System.out.println("Eliminando de " +actual.getLugar() +" a "+anterior.getLugar());
            

            AristaGrafo nodoaBorrar = actual.existeArista(actual.getLugar(), anterior.getLugar());
            //actual.agregarArista(a);
            
            actual.eliminarArista(nodoaBorrar);
            
            //System.out.println("\n");


            System.out.print("" + actual.getLugar() + " -> ");
        }

            //System.out.println(nodosVisistados);
        return grafo;
    }

    // Returna un objeto tipo nodo (nodo mas cercano)
    private NodoGrafo hallarNodoMasCercano(List<AristaGrafo> listaAdy) {

        NodoGrafo nodomenor = null;

        int distanciamenor = Integer.MAX_VALUE;

        for (AristaGrafo a : listaAdy) {

            int distancia = (int) a.getDistancia();

            if (distancia < distanciamenor) {
                distanciamenor = distancia;
                nodomenor = a.getDestino();
            }

        }

        return nodomenor;
    }

    private int menorDistancia(List<AristaGrafo> listaAdy) {
        int distanciamenor = Integer.MAX_VALUE;

        for (AristaGrafo a : listaAdy) {

            int distancia = (int) a.getDistancia();

            if (distancia < distanciamenor) {
                distanciamenor = distancia;
                //nodomenor = a.getDestino();
            }

        }

        return distanciamenor;
    }

    private boolean yaFueVisitado(NodoGrafo nodo) {

        boolean existe = false;

        for (NodoGrafo visitado : nodosVisistados) {

            if (visitado == nodo) {
                existe = true;
                return existe;
            }
        }

        return existe;
    }

}
