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
        
        //System.out.print("" + actual.getLugar() + " -> ");
        

        //System.out.print("" + actual.getAristas()+ " -> ");
        // ejecutar el ciclo mientras no se llegue al nodo destino
        while (actual != destino) {
            System.out.println(" Estoy en -> "+actual.getLugar());
            nodosVisistados.add(actual);
            anterior = actual;
            actual = hallarNodoMasCercano(actual.getAristas());
            precioViaje += actual.getPrecio();
            if (yaFueVisitado(actual)) {
                // borrar este nodo y buscar de nuevo 
       
                NodoGrafo aux = anterior; // auxiliar = puebla (anterior)
                //System.out.println("-> actual " +actual.getLugar());
                //System.out.println("-> anterior " +actual.getLugar());
                AristaGrafo nodoaBorrar = anterior.existeArista(anterior.getLugar(), actual.getLugar());
                anterior.eliminarArista(nodoaBorrar);
                
                System.out.println(" Estaba en " +anterior.getLugar());
                System.out.println(" Tengo que visitar " + actual.getLugar());
                actual = hallarNodoMasCercano(anterior.getAristas());
                
                if(yaFueVisitado(actual)){
                    System.out.println("Ya lo visité :v");
                    AristaGrafo borrar2 = anterior.existeArista(anterior.getLugar(), actual.getLugar());
                    anterior.eliminarArista(borrar2);
                    System.out.println(" Anterior -> " + anterior.getLugar());
                    // volver a setear el nodo
                    actual = hallarNodoMasCercano(anterior.getAristas());
                    
                }

                
            } else {
                // seguir el camino normal
                AristaGrafo nodoaBorrar = actual.existeArista(actual.getLugar(), anterior.getLugar());
                actual.eliminarArista(nodoaBorrar);
            }

            //System.out.print("" + actual.getLugar() + " -> ");
            
        }
        
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
