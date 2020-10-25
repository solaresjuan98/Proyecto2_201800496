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

    public int tamanio;
    private int carga;
    // private Lugar lugar;
    public Lugar[] arreglo_lugares;
    Lugar lugares_redimensionado[];
    //private Lugar[] lugares_redimensionado;
    //int tam_nuevo;

    public TablaHash(int tamanio) {
        this.tamanio = tamanio;
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
        System.out.println(p);
        while (arreglo_lugares[p] != null && getAscii(arreglo_lugares[p].getNombre()) != aux) {
            i++;
            p = (int) aux % this.tamanio;
            p = p + i;
            p = p == tamanio ? p - tamanio : p;
        }
        //System.out.println("** " + p);
        return p;

    }

    /*
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
     */
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
   
    /*
    public void retornarValores(){
        
    }
    */
    public Lugar retornarLugares(){
        Lugar lug;
        for (Lugar l : this.arreglo_lugares){
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

    
    
}
