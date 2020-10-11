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
    //int maximo = n - 1;
    //int gradoMinimo = n / 2;//maximo
    boolean hoja;
    int clave[];// almacenar claves en el nodo
    NodoArbolB hijo[]; // enlace a referencias a los hijos

    //   
    public NodoArbolB(int t) {
        n = 0;
        hoja = true;
        clave = new int[((2 * t) - 1)];
        //System.out.println(t - 1);
        hijo = new NodoArbolB[(2 * t)];
    }

    public void imprimir() {
        System.out.print("[");
        for (int i = 0; i < n; i++) {
            if (i < n - 1) {
                System.out.print(clave[i] + " | ");
            } else {
                System.out.print(clave[i]);
            }
        }

        System.out.print("]");
    }

    public int find(int n) {

        return -1;
    }
}
