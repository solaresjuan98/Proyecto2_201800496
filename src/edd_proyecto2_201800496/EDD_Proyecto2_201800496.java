package edd_proyecto2_201800496;

import Clases.Usuario;
import Estructuras.ArbolB_Usuarios;
import Vistas.DashbordAministrador;

/**
 *
 * @author juan333
 */
public class EDD_Proyecto2_201800496 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // CARGANDO ESTRUCTURAS
        ArbolB_Usuarios Arbolb_usuarios = new ArbolB_Usuarios(3);

//        long matrizA[][] = {{0, 3, 4, 999999999, 8, 999999999}, {999999999, 0, 999999999,
//            999999999, 5, 999999999}, {999999999, 999999999, 0, 999999999, 3, 999999999},
//        {999999999, 999999999, 999999999, 0, 999999999, 999999999}, {999999999, 999999999,
//            999999999, 7, 0, 3}, {999999999, 999999999, 999999999, 2, 999999999, 0}};
//        CaminoMinimo ruta = new CaminoMinimo();
//
//        /*for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                System.out.print(matrizA[i][j]);
//            }
//            System.out.println("\n");
//        }*/
//        
//        System.out.println(ruta.algoritmoFloyd(matrizA));
//    }
//        Registro registro = new Registro();
//        registro.setVisible(true);
        /*ArbolB arbol = new ArbolB(3);// no tocar
        
        for(int i = 0; i < 100; i++) {
            arbol.insertar(i);
        }*
        
        arbol.mostrarArbolB();*/
 /*
        int[] valores = {20, 10, 50, 30, 40};

        for (int i = 0; i < valores.length; i++) {
            arbol.insertar(valores[i]);
        }

        arbol.insertar(60);
        arbol.insertar(80);
        arbol.insertar(70);
        arbol.insertar(90);
        arbol.insertar(100);
        arbol.insertar(4);
        arbol.insertar(5);
        arbol.insertar(6);
        arbol.insertar(7);
        arbol.insertar(8);
        arbol.insertar(3);
        arbol.insertar(15);
        arbol.insertar(21);

        arbol.mostrarArbolB();*/
        /*ArbolB_Usuarios arbol_usuarios = new ArbolB_Usuarios(3);

        for (int i = 0; i < 24; i++) {
            arbol_usuarios.agregarUsuario(new Usuario((int) i, "juan", "juan333", "correo", "1212", 4343434, "conductor"));
        }

        //arbol_usuarios.mostrarArbolB();
        arbol_usuarios.agregarUsuario(new Usuario((int) 7, "juan", "juan333", "correo", "1212", 4343434, "conductor"));
        arbol_usuarios.mostrarUsuarios();*/

        //arbol_usuarios.agregarUsuario();
        
        /**
         *
         * TABLA HASH
         */
        /*TablaHash hash = new TablaHash(10);

        hash.insertar(new Lugar(2, "Miraflores", "Zara", 0, 0));
        hash.insertar(new Lugar(3, "Miraflores", "Berskha", 0, 0));
        hash.insertar(new Lugar(33, "umg", "El duende", 0, 0));
        hash.insertar(new Lugar(35, "Miraflores", "El cine", 0, 0));
        hash.insertar(new Lugar(4, "USAC", "S-12", 0, 0));
        hash.insertar(new Lugar(5, "pcs", "Domino's", 0, 0));
        hash.insertar(new Lugar(5, "c", "Domino's", 0, 0));
        hash.insertar(new Lugar(5, "p", "Domino's", 0, 0));
        hash.insertar(new Lugar(5, "s", "Domino's", 0, 0));
        hash.insertar(new Lugar(5, "v", "Domino's", 0, 0));
        
        hash.insertar(new Lugar(9, "Santa Clara", "Little ceasars", 0, 0));
        hash.mostrarTabla();*/
        //IniciarSesion login = new IniciarSesion();
        //login.setVisible(true);
        DashbordAministrador d = new DashbordAministrador();
        d.setVisible(true);

    }

}
