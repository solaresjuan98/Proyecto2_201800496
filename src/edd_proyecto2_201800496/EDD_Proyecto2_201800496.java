package edd_proyecto2_201800496;

import Clases.AristaGrafo;
import Clases.Lugar;
import Clases.NodoGrafo;
import Clases.Usuario;
import Estructuras.ArbolB;
import Estructuras.ArbolB_Usuarios;
import Estructuras.Block;
import Estructuras.Dijkstra;
import Estructuras.Grafo;
import Estructuras.TablaHash;
import Mapa.Mapa;
import Vistas.IniciarSesion;
import Vistas.InterfazPago;
import com.teamdev.jxmaps.LatLng;
import com.teamdev.jxmaps.MapViewOptions;
import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

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
        ArbolB arbol = new ArbolB(3);// no tocar
        
        for(int i = 0; i < 21; i++) {
            arbol.insertar(i);
        }
        
        //arbol.mostrarArbolB();
        arbol.GraficarArbol();
 /*
        ArbolB_Usuarios arbol_usuarios = new ArbolB_Usuarios(3);
        
        //instantcias de usuario
        Usuario u1 = new Usuario((int) 232, "juan", "juan333", "correo", "pass", 4343434, "conductor");
        Usuario u2 = new Usuario((int) 221, "pablo", "pabloxd", "correo", "pass", 4343434, "usuario");
        Usuario u3 = new Usuario((int) 10, "maria", "maria_22", "correo", "pass", 4343434, "usuario");
        Usuario u4 = new Usuario((int) 23, "laura", "laurita_1", "correo", "pass", 4343434, "conductor");
        Usuario u5 = new Usuario((int) 72, "Mario", "mario22", "correo", "pass", 4343434, "usuario");
        arbol_usuarios.agregarUsuario(u1);
        arbol_usuarios.agregarUsuario(u2);
        arbol_usuarios.agregarUsuario(u3);
        arbol_usuarios.agregarUsuario(u4);
        arbol_usuarios.agregarUsuario(u5);
        
        
        arbol_usuarios.setCoordenadas(221, (float) 14.537999, (float) -90.581349);
        
        System.out.println(" -> "+u2.getLatitud() +" "+u2.getLongitud());*/
        //arbol_usuarios.buscarUsuario("juan333", "paess");

        /*for (int i = 0; i < 24; i++) {
            arbol_usuarios.agregarUsuario(new Usuario((int) i, "juan", "juan333", "correo", "1212", 4343434, "conductor"));
        }*/
        //arbol_usuarios.mostrarArbolB();
        /*arbol_usuarios.agregarUsuario(new Usuario((int) 7, "juan", "juan333", "correo", "1212", 4343434, "conductor"));
        arbol_usuarios.mostrarUsuarios();*/
        //arbol_usuarios.agregarUsuario();
        /**
         *
         * TABLA HASH
         */
//        TablaHash hash = new TablaHash(10);
//
//        hash.insertar(new Lugar(3, "Plaza Villa Nueva", "La torre", (float) 14.538548, (float) -90.584275));
//        hash.insertar(new Lugar(33, "Miraflores", "El duende", (float) 14.621191, (float) -90.553277));
//        hash.insertar(new Lugar(35, "Miraflores", "El cine", (float) 14.622067, (float) -90.552845));
//        hash.insertar(new Lugar(4, "USAC", "S-12", (float) 14.583194, (float) -90.554603));
//        hash.insertar(new Lugar(5, "Santa Clara", "Burger King", (float) 14.530889, (float) -90.596541));
//        hash.insertar(new Lugar(8, "San cristobal", "Futeca", (float) 14.593123, (float) -90.578017));
//        hash.insertar(new Lugar(9, "Villa Nueva", "Pollo pinulito", (float) 14.538473, (float) -90.582663));
//        hash.insertar(new Lugar(10, "Villa Nueva", "Shell", (float) 14.541550, (float) -90.584514));
//        hash.insertar(new Lugar(11, "Agilar batres", "Dunkin Donuts", (float) 14.594010, (float) -90.557692));
        //hash.graficar();
        //hash.mostrarTabla();
        // Para buscar un lugar en la tabla hash
        /*try {
            Lugar lbuscado = hash.buscarLugar("El duende");
            System.out.println(" >> " + " - " + lbuscado.getId_lugar() + " " + lbuscado.getNombre());
        } catch (Exception e) {
            System.out.println(" El lugar no existe. Prueba con otro lugar. ");
        }*/
        //IniciarSesion login = new IniciarSesion(arbol_usuarios, hash);
        //login.setVisible(true);
        /*Grafos*/
        //Grafo grafo = obtenerCiudades();
        //MAPA 
//            MapViewOptions options = new MapViewOptions();
//            options.importPlaces();
//            options.setApiKey("AIzaSyAu_wHDWkQ4oI98SuwtK1pVqKjIJitE_nw");
//            Mapa mapa = new Mapa(options);
//            mapa.Renderizar(mapa);
//
//            LatLng c1 = new LatLng(14.538548, -90.584275);
//            LatLng c2 = new LatLng(14.538473, -90.582663);
//            LatLng c3 = new LatLng(14.541550, -90.584514);
//
//            LatLng[] camino = {c1, c2, c3};
//            mapa.agregarGrafo(camino, true);
        // Agregrando linea
        //mapa.agregarLinea(inicio, fin, true);
        //mapa.agregarMarcador(new LatLng(14.538548, -90.584275));
        //mapa.agregarMarcador(new LatLng(14.538473, -90.582663));
        /*JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setSize(1000, 800);
        frame.add(mapa, BorderLayout.CENTER);
        frame.setVisible(true);*/
        //System.out.println(grafo);
        //List<Block> blockchain = new ArrayList<>();
        //int prefijo = 4;
        //String cadenaPrefijo = new String(new char[prefijo]).replace('\0', '0');
    }

    public static Grafo obtenerCiudades() {

        NodoGrafo df = new NodoGrafo("DF", 60);
        NodoGrafo toluca = new NodoGrafo("Toluca", 100);
        NodoGrafo cuernavaca = new NodoGrafo("Cuernavaca", 75);
        NodoGrafo puebla = new NodoGrafo("puebla", 40);
        NodoGrafo tlaxcala = new NodoGrafo("Tlaxcala", 90);
        NodoGrafo h = new NodoGrafo("h", 25);
        NodoGrafo f = new NodoGrafo("F", 175);

        // Generando los nodos no dirigidos
        df.agregarAristaNoDirigida(df, toluca, 100);
        df.agregarAristaNoDirigida(df, cuernavaca, 300);

        toluca.agregarAristaNoDirigida(toluca, puebla, 30);
        toluca.agregarAristaNoDirigida(toluca, tlaxcala, 340);
        toluca.agregarAristaNoDirigida(toluca, cuernavaca, 10);

        cuernavaca.agregarAristaNoDirigida(cuernavaca, tlaxcala, 20);

        puebla.agregarAristaNoDirigida(puebla, tlaxcala, 50);
        puebla.agregarAristaNoDirigida(puebla, f, 80);
        puebla.agregarAristaNoDirigida(puebla, h, 40);

        h.agregarAristaNoDirigida(h, f, 20);

        Grafo grafo = new Grafo();
        grafo.agregarNodo(df);
        grafo.agregarNodo(toluca);
        grafo.agregarNodo(cuernavaca);
        grafo.agregarNodo(puebla);
        grafo.agregarNodo(tlaxcala);
        grafo.agregarNodo(f);
        grafo.agregarNodo(h);

        //cuernavaca.existeArista("Cuernavaca", "Toluca");
        // eliminando aristas
        //cuernavaca.eliminarArista(cuer_to l);
        //cuernavaca.existeArista(cuer_tol);
        Dijkstra dijkstra = new Dijkstra();

        // ruta menor
        dijkstra.hallarRutaMenor(grafo, df, f);

        return grafo;
    }

}
