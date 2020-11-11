package edd_proyecto2_201800496;

import Clases.NodoGrafo;
import Estructuras.ArbolB;
import Estructuras.ArbolB_Facturas;
import Estructuras.ArbolB_Usuarios;
import Estructuras.ArbolB_Viajes;
import Estructuras.Dijkstra;
import Estructuras.Grafo;
import Estructuras.TablaHash;
import Vistas.IniciarSesion;

/**
 *
 * @author juan333
 */
public class EDD_Proyecto2_201800496 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //ME SERVIRÁ PARA HACER GRAFICA DEL ARBOL 
        //ArbolB arbol = new ArbolB(3);// no tocar
        
        
        /****** INSTANCIAS DE ESTUCTURAS **********/
        ArbolB_Viajes arbol_viajes = new ArbolB_Viajes(3);
        ArbolB_Usuarios arbol_usuarios = new ArbolB_Usuarios(3);
        ArbolB_Facturas arbol_facturas = new ArbolB_Facturas(3);
        TablaHash hash = new TablaHash(14);
        Grafo grafo = new Grafo();

        IniciarSesion login = new IniciarSesion(arbol_usuarios, hash, grafo, arbol_viajes, arbol_facturas);
        login.setVisible(true);
        
    }

}
