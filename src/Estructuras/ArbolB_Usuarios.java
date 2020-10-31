/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructuras;

import Clases.Usuario;
import java.util.ArrayList;
import javax.swing.JOptionPane;

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

        if (!usuarioExiste(u.getId())) {
            this.insertar(u.getId());
            lista_usuarios.add(u);
        } else {
            //System.out.println(" ZZ n");
            JOptionPane.showMessageDialog(null, "El usuario con el id " + u.getId() + " ya existe");
        }

    }

    public void mostrarUsuarios() {

        System.out.println("\n");
        lista_usuarios.forEach((usuario) -> {

            System.out.println(" >> id: " + usuario.getId() + "  nombre: " + usuario.getNombre_completo());
        });
    }

    public boolean usuarioExiste(int id) {

        boolean encontrado = false;

        for (Usuario u : lista_usuarios) {

            if (u.getId() == id) {
                encontrado = true;
                System.out.println(" >> Encontrado");
                return true;

            }
        }

        return encontrado;
    }

    public void setCoordenadas(int id, float latitud, float longitud) {

        for (Usuario u : lista_usuarios) {
            if (u != null) {
                if (u.getId() == id) {
                    u.setLatitud(latitud);
                    u.setLongitud(longitud);
                }
            }
        }
    }

    public Usuario buscarUsuario(String username, String pass) {

        try {
            for (Usuario u : lista_usuarios) {

                if (u.getUsername().equals(username) && u.getContrasenia().equals(pass)) {
                    System.out.println(" >> Datos correctos. ");
                    return u;
                } else {
                    //System.out.println(" >> Datos incorrectos. ");

                }
            }
            return null;
        } catch (Exception e) {
            System.out.println(" >> no encontrado");
            return null;
        }
    }

    //public Usuario
}
