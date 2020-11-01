/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructuras;

import Clases.Lugar;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author juan333
 */
public class TablaHash {

    public int tamanio;
    private int carga;
    // private Lugar lugar;
    public Lugar[] arreglo_lugares;
    public Lugar lugares_redimensionado[];

    /*
        bandera = true; -> se está usando el arreglo de lugares redimensionado
        bandera = false; -> se inicia con el tamanio inicial del arreglo
     */
    private boolean bandera;
    //private Lugar[] lugares_redimensionado;
    //int tam_nuevo;

    public TablaHash(int tamanio) {
        this.tamanio = tamanio;
        this.bandera = false;
        arreglo_lugares = new Lugar[tamanio];

        for (int i = 0; i < tamanio; i++) {
            arreglo_lugares[i] = null;
        }
    }

    public void insertar(Lugar lugar) {
        //System.out.println(" "+lugar.getNombre() +" "+ lugar.getCategoria());
        int pos = posicion(lugar.getNombre());
        //System.out.println(pos);
        this.arreglo_lugares[pos] = lugar;
        this.carga++;
        //System.out.println("Carga -> " +carga);
        if (((carga * 100 / this.tamanio) > 70)) {

            int nuevo_tamanio = tamanio;

            do {
                //System.out.println("*** "+nuevo_tamanio);
                nuevo_tamanio++;

            } while ((carga * 100 / nuevo_tamanio) > 30);

            nuevo_tamanio = ((nuevo_tamanio % 2) == 0) ? nuevo_tamanio + 1 : nuevo_tamanio;

            lugares_redimensionado = new Lugar[nuevo_tamanio];
            // aqui empiezo a usar el nuevo arreglo (setear el valor de la bandera a true)
            this.setBandera(true);
            System.out.println("Nuevo tamaño -> " + lugares_redimensionado.length);
            Lugar anterior[] = arreglo_lugares;
            this.arreglo_lugares = lugares_redimensionado;
            this.tamanio = nuevo_tamanio;
            int aux = 0;

            for (Lugar l : anterior) {

                if (l != null) {

                    aux = posicion(l.getNombre());
                    lugares_redimensionado[aux] = l;
                    System.out.println("agregado al nuevo arreglo -> " + aux);
                }
            }
            //imprimirTablaHash(lugares_redimensionado);

        }

    }

    private int posicion(String nombreLugar) {
        //System.out.println(nombreLugar);
        int aux = getAscii(nombreLugar);
        int i = 0, p;

        p = (int) aux % this.tamanio;
        //System.out.println(p);
        while (arreglo_lugares[p] != null && getAscii(arreglo_lugares[p].getNombre()) != aux) {
            i++;
            p = (int) aux % this.tamanio;
            p = p + i;
            p = p == tamanio ? p - tamanio : p;
        }

        //System.out.println("** Posicion del lugar " + nombreLugar + " es " + p);
        return p;

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

    public Lugar buscarLugar(String lugar) {

        int pos = posicion(lugar);
        Lugar lugarbuscado = null;
        //boolean disponible = false;

        for (int i = 0; i < this.arreglo_lugares.length; i++) {

            if (i == pos && this.arreglo_lugares[pos] != null) {
                lugarbuscado = this.arreglo_lugares[pos];
                return lugarbuscado;
            }

        }

        return lugarbuscado;
    }

    public void mostrarTabla() {

        // Validar que arreglo tengo que imprimir 
        if (this.isBandera()) {
            System.out.println(" >> hay que imprimir el arreglo grande");
            imprimirTablaHash(lugares_redimensionado);
        } else {
            System.out.println(" >> hay que imprimir el arreglo pequeño");
            imprimirTablaHash(arreglo_lugares);
        }

    }

    private void imprimirTablaHash(Lugar[] arr) {

        for (Lugar l : arr) {
            if (l != null) {
                System.out.println(" >> id: " + l.getId_lugar() + " ----  Nombre: " + l.getNombre());
            }

        }

    }

    public void graficar() {

        // validar que arreglo tengo que graficar en graphviz
        if (this.isBandera()) {
            System.out.println(" >> graficar el arreglo grande");
            graficarTabla(lugares_redimensionado);
        } else {
            System.out.println(" >> graficando el arreglo pequeño");
            graficarTabla(arreglo_lugares);
        }

    }

    private void graficarTabla(Lugar[] arr) {

        StringBuilder cadena = new StringBuilder();

        cadena.append("digraph G {\n");
        cadena.append("node[shape=record];\n");

        int a = 1, n = 0, contador = 0;
        cadena.append("node").append(n).append("[label=\"");

        boolean yaTermino = false;

        for (Lugar lugar : arr) {

            if (a == 10) {
                cadena.append(lugar != null ? lugar.getId_lugar() : "").append("\"];\n");
                a = 1;
                n++;

                if (contador == tamanio - 1) {
                    yaTermino = true;
                    break;
                }

                cadena.append("node").append(n).append("[label=\"");
                continue;
            } else {
                cadena.append(lugar != null ? lugar.getId_lugar() : "").append("|");
            }

            a++;
            contador++;
        }

        if (!yaTermino) {
            cadena.append("carga: ").append(carga).append(" Tamaño: ").append(tamanio).append("\"] \n");
        }

        for (int i = 0; i < n; i++) {
            cadena.append("node").append(i).append("->node").append(i + 1).append("[style=\"invis\"]").append("\n");
        }

        cadena.append("} \n");

        FileWriter fichero = null;
        PrintWriter pw = null;

        try {

            fichero = new FileWriter("./grafica.dot");
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
                String cmd = "dot -Tpdf ./grafica.dot -o grafica.pdf";
                Runtime.getRuntime().exec(cmd);
            } catch (IOException i) {
                System.out.println("f");
            }
        }

    }

    public Lugar retornarLugares() {
        Lugar lug;
        for (Lugar l : this.arreglo_lugares) {
            if (l != null) {
                lug = l;
                System.out.println("f");
                return l;
                //System.out.println(" >> id: " + l.getId_lugar() + " ----  Nombre: " + l.getCategoria());
            }
        }
        System.out.println(".,,,");
        return null;
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

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public Lugar[] getArreglo_lugares() {
        return arreglo_lugares;
    }

    public void setArreglo_lugares(Lugar[] arreglo_lugares) {
        this.arreglo_lugares = arreglo_lugares;
    }

    public Lugar[] getLugares_redimensionado() {
        return lugares_redimensionado;
    }

    public void setLugares_redimensionado(Lugar[] lugares_redimensionado) {
        this.lugares_redimensionado = lugares_redimensionado;
    }

    public boolean isBandera() {
        return bandera;
    }

    public void setBandera(boolean bandera) {
        this.bandera = bandera;
    }

}
