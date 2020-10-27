package edd_proyecto2_201800496;

import Clases.AristaGrafo;
import Clases.Lugar;
import Clases.NodoGrafo;
import Clases.Usuario;
import Estructuras.ArbolB_Usuarios;
import Estructuras.Dijkstra;
import Estructuras.Grafo;
import Estructuras.TablaHash;
import Mapa.Mapa;
import Vistas.IniciarSesion;
import com.teamdev.jxmaps.LatLng;
import com.teamdev.jxmaps.MapViewOptions;
import java.awt.BorderLayout;
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

        /*
        
            ME SERVIRÁ PARA HACER GRAFICA DEL ARBOL 
        ArbolB arbol = new ArbolB(3);// no tocar
        
        for(int i = 0; i <= 20; i++) {
            arbol.insertar(i);
        }
        
        arbol.mostrarArbolB();
         */
        ArbolB_Usuarios arbol_usuarios = new ArbolB_Usuarios(3);

        arbol_usuarios.agregarUsuario(new Usuario((int) 232, "juan", "juan333", "correo", "pass", 4343434, "conductor"));
        arbol_usuarios.agregarUsuario(new Usuario((int) 221, "pablo", "pabloxd", "correo", "pass", 4343434, "usuario"));
        arbol_usuarios.agregarUsuario(new Usuario((int) 10, "maria", "maria_22", "correo", "pass", 4343434, "usuario"));
        arbol_usuarios.agregarUsuario(new Usuario((int) 23, "laura", "laurita_1", "correo", "pass", 4343434, "conductor"));
        arbol_usuarios.agregarUsuario(new Usuario((int) 72, "Mario", "mario22", "correo", "pass", 4343434, "usuario"));

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
        TablaHash hash = new TablaHash(10);
        /*
        hash.insertar(new Lugar(3, "Miraflores", "Berskha", 0, 0));
        hash.insertar(new Lugar(33, "Miraflores", "El duende", 0, 0));
        hash.insertar(new Lugar(35, "Miraflores", "El cine", 0, 0));
        hash.insertar(new Lugar(4, "Miraflores", "S-12", 0, 0));
        hash.insertar(new Lugar(5, "Miraflores", "Domino's", 0, 0));

        hash.insertar(new Lugar(8, "Miraflores", "Lugar random", 0, 0));
        hash.insertar(new Lugar(9, "Miraflores", "f", 0, 0));
        hash.insertar(new Lugar(9, "Miraflores", "g", 0, 0));
        hash.insertar(new Lugar(9, "Miraflores", "p", 0, 0));
         */
        hash.mostrarTabla();

        //IniciarSesion login = new IniciarSesion(arbol_usuarios, hash);
        //login.setVisible(true);
        //DashbordAministrador d = new DashbordAministrador(arbol_usuarios);
        //d.setVisible(true);
        //Registro reg = new Registro(arbol_usuarios);
        //reg.setVisible(true);
        /*
        TablaHashExpL tablaexp = new TablaHashExpL(7);
        
        tablaexp.insertarConductor(new Localidad(20, 13, false));
        tablaexp.insertarConductor(new Localidad(33, 41, false));
        tablaexp.insertarConductor(new Localidad(21, 14, false));
        tablaexp.insertarConductor(new Localidad(10, 21, false));
        tablaexp.insertarConductor(new Localidad(12, 55, false));
        tablaexp.insertarConductor(new Localidad(14, 46, false));
        tablaexp.insertarConductor(new Localidad(56, 30, false));
        tablaexp.insertarConductor(new Localidad(100, 21, false));
        tablaexp.insertarConductor(new Localidad(56, 22, false));
        tablaexp.insertarConductor(new Localidad(100, 2221, false));
        
        tablaexp.mostrarLocalidades();*/

 /*Grafos*/
        Grafo grafo = obtenerCiudades();

        
            //MAPA 
        
            MapViewOptions options = new MapViewOptions();
            options.importPlaces();
            options.setApiKey("AIzaSyAu_wHDWkQ4oI98SuwtK1pVqKjIJitE_nw");
            Mapa mapa = new Mapa(options);
            mapa.Renderizar(mapa);

            LatLng c1 = new LatLng(14.538548, -90.584275);
            LatLng c2 = new LatLng(14.538473, -90.582663);
            LatLng c3 = new LatLng(14.541550, -90.584514);

            LatLng[] camino = {c1, c2, c3};
            mapa.agregarGrafo(camino, true);
       
         
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
    }

    public static Grafo obtenerCiudades() {
        NodoGrafo df = new NodoGrafo("DF");
        NodoGrafo toluca = new NodoGrafo("Toluca");
        NodoGrafo cuernavaca = new NodoGrafo("Cuernavaca");
        NodoGrafo puebla = new NodoGrafo("puebla");
        NodoGrafo tlaxcala = new NodoGrafo("Tlaxcala");
        NodoGrafo h = new NodoGrafo("h");
        NodoGrafo f = new NodoGrafo("F");

        // arista del df a toluca 
        AristaGrafo tol = new AristaGrafo(df, toluca, 100);
        df.agregarArista(tol);

        df.agregarArista(new AristaGrafo(df, cuernavaca, 300));

        // toluca - cuernavaca / cuernavaca - toluca
        AristaGrafo cuer_tol = new AristaGrafo(cuernavaca, toluca, 10);
        toluca.agregarArista(new AristaGrafo(toluca, cuernavaca, 10));
        cuernavaca.agregarArista(cuer_tol);
        
        
        toluca.agregarArista(new AristaGrafo(toluca, puebla, 30));
        toluca.agregarArista(new AristaGrafo(toluca, tlaxcala, 340));

        // arista de df a tlaxcala (no existe) 
        AristaGrafo tl = new AristaGrafo(df, tlaxcala, 23);

        // cuernavaca - tlaxcala / tlaxcala - cuernavaca
        cuernavaca.agregarArista(new AristaGrafo(cuernavaca, tlaxcala, 20));
        tlaxcala.agregarArista(new AristaGrafo(tlaxcala, cuernavaca, 20));
        

        
        
        // ARISTAS PARA PUEBLA
        // puebla -tl / tl - puebla
        puebla.agregarArista(new AristaGrafo(puebla, tlaxcala, 50));
        tlaxcala.agregarArista(new AristaGrafo(tlaxcala, puebla, 50));
        
        // puebla - F / F - puebla
        puebla.agregarArista(new AristaGrafo(puebla, f, 80));
        f.agregarArista(new AristaGrafo(f, puebla, 80));
        
        // puebla - h / h -puebla
        puebla.agregarArista(new AristaGrafo(puebla, h, 40));
        h.agregarArista(new AristaGrafo(h, puebla, 40));
        
        
        // f - h / h - f
        f.agregarArista(new AristaGrafo(f, h, 20));
        h.agregarArista(new AristaGrafo(h, f, 20));
        //AristaGrafo puebla_f = new AristaGrafo(puebla, f, 23);
        
       

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
        //cuernavaca.eliminarArista(cuer_tol);

        //cuernavaca.existeArista(cuer_tol);
        System.out.println("\n");
        /*for(AristaGrafo a: toluca.getAristas()){
           
            System.out.println(" >> Destino "+a.getDestino() +" Distancia "+ a.getDistancia());
        }*/

        Dijkstra dijkstra = new Dijkstra();
        
        // ruta menor
        dijkstra.hallarRutaMenor(grafo, df, f);


        return grafo;
    }

}
