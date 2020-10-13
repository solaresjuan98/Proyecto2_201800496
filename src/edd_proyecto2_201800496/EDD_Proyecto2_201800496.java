package edd_proyecto2_201800496;

import Clases.Usuario;
import Estructuras.ArbolB_Usuarios;


/**
 *
 * @author juan333
 */
public class EDD_Proyecto2_201800496 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

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
        

        //IniciarSesion login = new IniciarSesion();
        //login.setVisible(true);
        //DashbordAministrador d = new DashbordAministrador();
        //d.setVisible(true);
        
        ArbolB_Usuarios ab = new ArbolB_Usuarios(3);
        
        ab.agregarUsuario(new Usuario(1, "Juan", "juan", "djfldkfj", "fjkdjfl", 3232323));
        ab.agregarUsuario(new Usuario(30, "Juan", "juan", "djfldkfj", "fjkdjfl", 3232323));
        ab.agregarUsuario(new Usuario(231, "Juan", "juan", "djfldkfj", "fjkdjfl", 3232323));
        ab.agregarUsuario(new Usuario(221, "Juan", "juan", "djfldkfj", "fjkdjfl", 3232323));
        ab.agregarUsuario(new Usuario(111, "Juan", "juan", "djfldkfj", "fjkdjfl", 3232323));
        ab.agregarUsuario(new Usuario(331, "Juan", "juan", "djfldkfj", "fjkdjfl", 3232323));
        ab.agregarUsuario(new Usuario(11, "Juan", "juan", "djfldkfj", "fjkdjfl", 3232323));
        
        ab.mostrarArbolB();
    }

}
