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

    public static Grafo hallarRutaMenor(Grafo grafo, NodoGrafo inicio, NodoGrafo destino) {

        ArrayList<NodoGrafo> nodosVisistados = new ArrayList<>();// se agregarán aqui los nodos ya visitados
        NodoGrafo actual = hallarDistanciaMenor(inicio.getAristas());

        // ejecutar el ciclo mientras no se llegue al nodo destino
        System.out.print("" + actual.getLugar() + " -> ");
        while (actual != destino) {
            actual = hallarDistanciaMenor(actual.getAristas());

            System.out.print("" + actual.getLugar() + " -> ");
        }

        return grafo;
    }

    public static NodoGrafo hallarDistanciaMenor(List<AristaGrafo> listaAdy) {
        NodoGrafo nodomenor = null;

        int distanciamenor = Integer.MAX_VALUE;

        // System.out.println(" >> lista de nodos adyacentes: ");
        //System.out.println(listaAdy.size());
        for (AristaGrafo a : listaAdy) {
            //System.out.println(" >> " + a.getDestino());
            int distancia = (int) a.getDistancia();

            if (distancia < distanciamenor) {
                distanciamenor = distancia;
                nodomenor = a.getDestino();
            }

        }

        //System.out.println(" >> Distancia menor"+distanciamenor);
        //System.out.println(" >> Nodo con la menor distancia " +  nodomenor.getLugar());
        return nodomenor;
    }
}
