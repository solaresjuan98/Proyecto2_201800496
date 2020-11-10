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
    // arreglo o lista para latitud y longitud para agregar al mapa
    public double precioViaje;

    public Dijkstra() {
        this.nodosVisistados = new ArrayList<>();
        this.precioViaje = 0;
        // Agregar una lista de tipo LatLng para añadirlos en el mapa luego

    }

    // esto me va a retornar la lista 
    public Grafo hallarRutaMenor(Grafo grafo, NodoGrafo inicio, NodoGrafo destino) {

        System.out.println(" Lugar de inicio: " + inicio.getLugar());

        NodoGrafo actual = hallarNodoMasCercano(inicio.getAristas());
        NodoGrafo anterior;
        // se agrega el nodo de inicio a la lista de nodos visitados
        nodosVisistados.add(inicio);
        // sumo el precio del nodo
        precioViaje += actual.getPrecio();

        while (actual != destino) {
            System.out.println(" Estoy en -> " + actual.getLugar());
            nodosVisistados.add(actual);
            anterior = actual;
            actual = hallarNodoMasCercano(actual.getAristas());
            if (yaFueVisitado(actual)) {
                // borrar este nodo y buscar de nuevo 

                AristaGrafo nodoaBorrar = anterior.existeArista(anterior.getLugar(), actual.getLugar());
                anterior.eliminarArista(nodoaBorrar);

                actual = hallarNodoMasCercano(anterior.getAristas());

                if (yaFueVisitado(actual)) {
                    AristaGrafo borrar2 = anterior.existeArista(anterior.getLugar(), actual.getLugar());
                    anterior.eliminarArista(borrar2);
                    actual = hallarNodoMasCercano(anterior.getAristas());
                    precioViaje += actual.getPrecio();

                }

            } else {
                // seguir el camino normal
                AristaGrafo nodoaBorrar = actual.existeArista(actual.getLugar(), anterior.getLugar());
                actual.eliminarArista(nodoaBorrar);
                precioViaje += actual.getPrecio();
            }

            //System.out.print("" + actual.getLugar() + " -> ");
        }

        precioViaje += actual.getPrecio();
        nodosVisistados.add(actual);

        System.out.println("Precio a pagar: " + this.precioViaje);
        System.out.println("\n" + nodosVisistados);
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
//
//    private int menorDistancia(List<AristaGrafo> listaAdy) {
//        int distanciamenor = Integer.MAX_VALUE;
//
//        for (AristaGrafo a : listaAdy) {
//
//            int distancia = (int) a.getDistancia();
//
//            if (distancia < distanciamenor) {
//                distanciamenor = distancia;
//                //nodomenor = a.getDestino();
//            }
//
//        }
//
//        return distanciamenor;
//    }

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
