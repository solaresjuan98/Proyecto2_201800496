/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructuras;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author juan333
 */
public class ArbolB {

    NodoArbolB raiz;
    //ArrayList<Usuario> ListaUsuarios;
    int t;

    public ArbolB(int t) {
        this.t = t;
        //ArrayList<E> lista = new ArrayList<E>();
        raiz = new NodoArbolB(t);
    }

    public int buscarClaveMayor() {

        int claveMax = 0;
        return claveMax;

    }

    public void insertar(int clave) {

        NodoArbolB r = raiz;
        /*
            Dos casos 
            1. Si el nodo esta lleno
            2. Si el nodo no esta lleno
         */

        // Separar el nodo antes de insertar
        //System.out.println(t-1);
        if (raiz.n == ((2 * t) - 1)) {// esta lleno

            NodoArbolB separar = new NodoArbolB(t);
            System.out.println(t);
            raiz = separar;
            separar.hoja = false;
            separar.n = 0;
            separar.hijo[0] = r;
            partir(separar, 0, r);
            insertarNoLleno(separar, clave);
        } else {
            insertarNoLleno(r, clave);
        }
    }

    private void partir(NodoArbolB nodo, int i, NodoArbolB nodo_aux) {

        // Nodo temporal que será el hijo i+1 de nodo
        NodoArbolB nodo_aux2 = new NodoArbolB(t);
        nodo_aux2.hoja = nodo_aux.hoja;
        nodo_aux2.n = (t - 1);

        // copiar las ultimas (n-1) claves del nodo_aux al inicio de nodo_aux3
        for (int j = 0; j < (t - 1); j++) {
            nodo_aux2.clave[j] = nodo_aux.clave[(j + t)];
        }

        // si no es hoja se reasignar los nodos hijos
        if (!nodo_aux.hoja) {
            for (int k = 0; k < t; k++) {
                nodo_aux2.hijo[k] = nodo_aux.hijo[(k + t)];
            }
        }

        // nuevo tamaño de 
        nodo_aux.n = (t - 1);

        // mover los hijos de nodo para darle espacio a nodo_aux2
        for (int j = nodo.n; j > i; j--) {
            nodo.hijo[(j + 1)] = nodo.hijo[j];
        }

        // reasignar el hijo (i+1) de nodo
        nodo.hijo[(i + 1)] = nodo_aux2;

        // mover las claves de nodo
        for (int j = nodo.n; j > i; j--) {
            nodo.clave[(j + 1)] = nodo.clave[j];
        }

        // Agregar la clave situada en medio
        nodo.clave[i] = nodo_aux.clave[(t - 1)];
        nodo.n++;
    }

    public void insertarNoLleno(NodoArbolB nodo, int clave) {

        //Si el nodo es hoja
        if (nodo.hoja) {
            int i = nodo.n;// cantidad de valores del nodo
            // Buscar la pos donde asignar el valor
            while (i >= 1 && clave < nodo.clave[i - 1]) {
                nodo.clave[i] = nodo.clave[i - 1];
                i--;
            }

            nodo.clave[i] = clave; // asignar el valor al nodo
            nodo.n++; // aumentar la cantidad de elemetos del nodo

        } else { // si no es hoja
            int j = 0;

            // buscar la pos del del hijo
            while (j < nodo.n && clave > nodo.clave[j]) {
                j++;
            }

            // si el nodo hijo está lleno
            if (nodo.hijo[j].n == (2 * t - 1)) {
                //System.out.println(2*t-1);
                partir(nodo, j, nodo.hijo[j]);

                if (clave > nodo.clave[j]) {
                    j++;
                }
            }

            insertarNoLleno(nodo.hijo[j], clave);
        }

    }

    public void mostrarArbolB() {
        imprimir(raiz);
    }

    private void imprimir(NodoArbolB n) {

        n.imprimir();

        if (!n.hoja) {

            for (int j = 0; j <= n.n; j++) {
                if (n.hijo[j] != null) {
                    System.out.println("");
                    imprimir(n.hijo[j]);
                }
            }
        }
    }
    
    public void buscarID(int id){
        
        NodoArbolB aux = buscar(raiz, id);
        
        if(aux == null){
            System.out.println(" >> Nodo no encontrado");
        }else{
            imprimir(aux);
        }
    }
    
    private NodoArbolB buscar(NodoArbolB act, int clave) {

        int i = 0;

        while (i < act.n && clave > act.clave[i]) {
            i++;
        }

        if (i < act.n && clave == act.clave[i]) {
            return act;
        }
        
        if(act.hoja){
            return null;
        }else{
            return buscar(act.hijo[i], clave);
        }
    }

    // Generar grafica del arbol
    // Utilizando graphviz 
    /*
    public void GraficarArbol() {

        StringBuilder cadena = new StringBuilder();

        cadena.append("digraph G {\n");
        cadena.append("node[shape=record];\n");
        cadena.append("node[shape=record color=blue style=filled, fillcolor=\"gray\", gradientangle=90];\n");
        
        cadena.append(raiz.GraficarNodo());
        
        cadena.append("}\n");
        
        FileWriter fichero = null;
        PrintWriter pw = null;
        
        
        
        try {

            fichero = new FileWriter("./graficaArbolB.dot");
            pw = new PrintWriter(fichero);
            pw.append(cadena.toString());

        } catch (Exception e) {
            e.printStackTrace();
        } finally {

            try {

                if (null != fichero) {
                    fichero.close();
                }

            } catch (Exception e_) {
                e_.printStackTrace();
            }

            try {
                String cmd = "dot -Tpdf ./graficaArbolB.dot -o ArbolB.pdf";
                Runtime.getRuntime().exec(cmd);
            } catch (IOException i) {
                System.out.println("f");
            }
        }
        
        

    }
*/


}
