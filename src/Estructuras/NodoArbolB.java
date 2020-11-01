/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructuras;

import Clases.Usuario;

/**
 *
 * @author juan333
 */
public class NodoArbolB {
    
    int n;//grado 
    Usuario usuario;
    boolean hoja;
    int clave[];// almacenar claves en el nodo
    NodoArbolB hijo[]; // enlace a referencias a los hijos

    public NodoArbolB(int t) {
        n = 0;
        hoja = true;
        clave = new int[((2 * t) - 1)];
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
    
    public String obtenerCodigo() {
        
        return "Clave" + this.hashCode();
    }
    
    public String GraficarNodo() {
        StringBuilder cadena = new StringBuilder();
        
        cadena.append(obtenerCodigo());
        cadena.append("[label=\"<P0>");
        
        for (int i = 0; i < n; i++) {
            
            cadena.append("|").append(clave[i]).append("|<P").append(i + 1).append(">");
            
        }
        
        cadena.append("\"];\n");
        
        for (int i = 0; i <= n; i++) {
            
            if (hijo[i] != null) {
                cadena.append(hijo[i].GraficarNodo());
                cadena.append(obtenerCodigo()).append(":P").append(i).append("->").append(hijo[i].obtenerCodigo()).append(";\n");
            }
        }
        
        return cadena.toString();
    }
    
    public int find(int n) {
        
        return -1;
    }
    
}
