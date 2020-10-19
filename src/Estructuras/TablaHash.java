/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructuras;

import Clases.Lugar;

/**
 *
 * @author juan333
 */
public class TablaHash {

    int tamanio;
    Lugar lugar;
    Lugar[] arreglo_lugares;
    Lugar[] lugares_redimensionado;
    int tam_nuevo;
    
    public TablaHash(int tamanio) {
        this.tamanio = tamanio;
        tam_nuevo = (int) (tamanio / 0.3);
        arreglo_lugares = new Lugar[tamanio];
    }

    public void insertar(Lugar lugar) {
        //Hallar la posicion donde se va a ubicar el lugar a ingresar

        // metodo de la multiplicación
        float R = 0.201800496f;// constante con numero de carnet
        int x = getAscii(lugar.getCategoria()); // catergoria convertida a ascii
        float d = (R * x) - (int) (R * x);
        int h = (int) ((tamanio - 1) * d);

        System.out.println("posicion --> " + h);

        //Insertar el valor en la pos. del arreglo
        // - Caso donde la pos "h" no está ocupada
        // - Caso donde la pos "h" si está ocupada -> metodo cuadratico
        if (buscarPos(h, arreglo_lugares)) {

            if (!posMinimasLlenas(arreglo_lugares)) {
                // caso base, cuando la pos "h" está disponible en el arreglo
                arreglo_lugares[h] = lugar;
                System.out.println("Ingresado en pos: " + h);
            } else {
                System.out.println("Se debe redimensionar el arreglo");
                //empezar a usar el otro arreglo aqui 
            }

        } else {
            // colision
            if (!posMinimasLlenas(arreglo_lugares)) {
                insertar_colision(h, arreglo_lugares, lugar);
            } else {
           
                System.out.println("Se debe redimensionar el arreglo");
                //empezar a usar el otro arreglo aqui
            }

        }

    }

    // Metodo cuadratico para manejar la colision
    private void insertar_colision(int pos, Lugar[] arr, Lugar lugar) {

        //boolean insertado = false;
        try {
            if (arr[pos] == null) {
                arr[pos] = lugar;
                System.out.println(" >> Ingresado en pos: " + pos);
            } else if (arr[pos] != null) {
                //System.out.println("La posicion " + pos + " ya esta ocupada, usar el metodo cuadratico");
                insertar_colision(metodoCuadratico(pos), arr, lugar);// no tocar
                
                
            }
        } catch (Exception e) {
            System.out.println("Arreglo lleno");
        }

    }

    private boolean buscarPos(int pos, Lugar[] arr) {

        boolean disponible = false;

        for (int i = 0; i < arr.length; i++) {

            if (i == pos && arr[pos] == null) {
                //System.out.println("Posicion vacia");
                disponible = true;
                break;
            } else if (i == pos && arr[pos] != null) {
                disponible = false;
            } else {
                disponible = false;
            }
        }

        return disponible;
    }

    private boolean posMinimasLlenas(Lugar[] arr) {

        boolean estaLleno = false;
        int pos_llenas = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] != null) {
                pos_llenas++;
            }
        }

        estaLleno = pos_llenas > 7;

        return estaLleno;
    }

    public void mostrarTabla() {

        imprimirTablaHash(arreglo_lugares);
    }

    private void imprimirTablaHash(Lugar[] arr) {

        for (Lugar l : arr) {
            if (l != null) {
                System.out.println(" >> id: " + l.getId_lugar() + " ----  Nombre: " + l.getCategoria());
            }

        }

    }

    private int metodoCuadratico(int h) {
        int nueva_pos = 0;
        int p = h;
        int i = 1;
        float R = 0.201800496f;
        int m = tamanio;
        p = h + i * i;
        int x = p;
        float t = R * x;
        System.out.println("t " + (int) t);
        float d = t - (int) t;
        nueva_pos = (int) ((int) m * d);
        return nueva_pos;

    }

    public int getAscii(String nombre_lugar) {
        int val_ascii = 0;

        for (int i = 0; i < nombre_lugar.length(); i++) {
            char c = nombre_lugar.charAt(i);
            val_ascii += (int) c;
        }

        //System.out.println(val_ascii);
        return val_ascii;
    }
   
}
