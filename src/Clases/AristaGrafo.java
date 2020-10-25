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
public class AristaGrafo {

    private NodoGrafo inicio;
    private NodoGrafo destino;
    private double distancia;
    
    public AristaGrafo(NodoGrafo inicio, NodoGrafo destino, double distancia){
        this.inicio = inicio;
        this.destino = destino;
        this.distancia = distancia;
    }

    public NodoGrafo getInicio() {
        return inicio;
    }

    public void setInicio(NodoGrafo inicio) {
        this.inicio = inicio;
    }

    public NodoGrafo getDestino() {
        return destino;
    }

    public void setDestino(NodoGrafo destino) {
        this.destino = destino;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }
    
    @Override
    public String toString(){
        return "\n Arista [origen=" + inicio.getLugar() +", destino="+destino.getLugar()+", distancia="+distancia+"]";
    }

}
