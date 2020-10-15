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
public class ArbolB_Usuarios extends ArbolB {

    ArrayList<Usuario> lista_usuarios = new ArrayList<>();

    public ArbolB_Usuarios(int t) {
        super(t);

    }

    public void agregarUsuario(Usuario u) {
        
        this.insertar(u.getId());
        lista_usuarios.add(u);
        
    }
    
    public void mostrarUsuarios(){
        
        System.out.println("\n");
        lista_usuarios.forEach((usuario) -> {
          
            System.out.println(" >> id: "+ usuario.getId() +"  nombre: "+usuario.getNombre_completo());
        });
    }
}
