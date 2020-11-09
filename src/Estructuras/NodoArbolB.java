/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructuras;

import Clases.Usuario;
import java.util.ArrayList;

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

    // GRAFICA DATOS DEL USUARIO
    public String GraficarNodoDatosUsuario(ArrayList<Usuario> lista) {
        StringBuilder cadena = new StringBuilder();

        cadena.append(obtenerCodigo());
        cadena.append("[label=\"<P0>");

        for (int i = 0; i < n; i++) {

            for (Usuario u : lista) {

                if (u.getId() == clave[i]) {
                    System.out.println(u.getNombre_completo());
         
                    cadena.append("|");
                    cadena.append(" Id usuario: ").append(clave[i]).append("\\n");
                    cadena.append(" Nombre: ").append(u.getNombre_completo()).append("\\n");
                    cadena.append(" Usuario: ").append(u.getUsername()).append("\\n");
                    cadena.append(" Correo: ").append(u.getCorreo()).append("\\n");
                    cadena.append(" Telefono: ").append(u.getTelefono()).append("\\n");
                    cadena.append(" Rol: ").append(u.getRol()).append("\\n");
                    
                    
                }

            }
            
            cadena.append("|<P").append(i + 1).append(">");
            

        }

        cadena.append("\"];\n");

        for (int i = 0; i <= n; i++) {

            if (hijo[i] != null) {
                cadena.append(hijo[i].GraficarNodoDatosUsuario(lista));
                cadena.append(obtenerCodigo()).append(":P").append(i).append("->").append(hijo[i].obtenerCodigo()).append(";\n");
            }
        }

        return cadena.toString();
    }

    public int find(int n) {

        return -1;
    }

}
