/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructuras;

/**
 *
 * @author juan333
 */
public class NodoArbolB {

    int n;//grado 
    int maximo = n-1;
    int gradoMinimo = n / 2;//maximo
    boolean hoja;
    int clave[];
    NodoArbolB hijo[];

    //   
    public NodoArbolB(int n) {
        n = 0;
        hoja = true;
        clave = new int[maximo];
        hijo = new NodoArbolB[maximo];
    }

    public void imprimir() {

    }

    public int find(int n) {

        return -1;
    }
}
