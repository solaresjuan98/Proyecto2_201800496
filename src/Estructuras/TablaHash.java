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

    public TablaHash(int tamanio) {
        this.tamanio = tamanio;
        arreglo_lugares = new Lugar[tamanio - 1];
    }

    public void insertar(Lugar lugar) {
        //Hallar la posicion donde se va a ubicar el lugar a ingresar
        float R = 0.201800496f;
        int x = getAscii(lugar.getCategoria());
        //System.out.println(R * x);
        //System.out.println((int) R * x);
        float d = (R * x) - (int) (R * x);
        //System.out.println(d);
        int h = (int) ((tamanio - 1) * d);

        System.out.println("posicion --> " + h);

        //Insertar el valor en la pos. del arreglo
        // - Caso donde la pos "h" no está ocupada
        // - Caso donde la pos "h" si está ocupada -> metodo cuadratico
        if (buscarPos(h, arreglo_lugares)) {
            System.out.println("Ingresando ... ");
            arreglo_lugares[h] = lugar;

        } else {
            // colision
            System.out.println("No se ingresara, hay colision en el indice " + h);
            h++;
            if (buscarPos(h, arreglo_lugares)) {
                System.out.println("Ingresando aqui....");
                arreglo_lugares[h] = lugar;
            }
        }

        

    }

    private void insertar_colision(int pos, Lugar[] arr) {
        
        boolean insertado = false;
        
        for(int i = 0; i < arr.length; i++) { 
            
            if(i == pos && arr[pos] == null){
                //Me quedé Aqui
                System.out.println("Se ingresará aqui");
                break;
            }
            else if(i == pos && arr[pos] != null){
               
            }
        }
    }

    private boolean buscarPos(int pos, Lugar[] arr) {
        boolean disponible = false;

        for (int i = 0; i < arr.length; i++) {

            if (i == pos && arr[pos] == null) {
                System.out.println("Posicion vacia");
                disponible = true;
                break;
            } else if (i == pos && arr[pos] != null) {
                System.out.println("Posicion ocupada");
            } else {
                //System.out.println("No encontrado");
            }
        }

        return disponible;
    }

    public int getAscii(String nombre_lugar) {
        int val_ascii = 0;

        for (int i = 0; i < nombre_lugar.length(); i++) {
            char c = nombre_lugar.charAt(i);
            val_ascii += (int) c;
            //System.out.println((int) c);
        }

        //System.out.println(val_ascii);
        return val_ascii;
    }

}
