/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructuras;

import Clases.Usuario;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
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

    public ArrayList<Usuario> getLista_usuarios() {
        return lista_usuarios;
    }

    public void setLista_usuarios(ArrayList<Usuario> lista_usuarios) {
        this.lista_usuarios = lista_usuarios;
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

        try {
            for (Usuario u : lista_usuarios) {
                if (u != null) {
                    if (u.getId() == id) {
                        u.setLatitud(latitud);
                        u.setLongitud(longitud);
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("El usuario");
        }

    }

    // Cambiar la disponibilidad de los usuarios 
    public void setDisponibilidad(int id, boolean disponibilidad) {

        try {
            for (Usuario u : lista_usuarios) {

                if (u != null) {
                    if (u.getId() == id) {
                        u.setDisponibilidad(disponibilidad);
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("No encontrado");
        }

    }

    public Usuario buscarUsuario(String username, String pass) {

        try {
            for (Usuario u : lista_usuarios) {

                if (u.getUsername().equals(username) && u.getContrasenia().equals(pass)) {

                    //System.out.println(" >> Datos correctos. ");
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

    public void modificarUsr(Usuario u) {

        try {

            for (int i = 0; i < lista_usuarios.size(); i++) {

                if (lista_usuarios.get(i).getId() == u.getId()) {

                    lista_usuarios.set(i, u);
                    JOptionPane.showMessageDialog(null, "Usuario modificado con exito");
                    break;
                }

            }

        } catch (Exception e) {
            System.out.println("Ha ocurrido un error");

        }

    }
 
    public void GraficarArbolUsuarios() {

        StringBuilder cadena = new StringBuilder();

        cadena.append("digraph G {\n");
        cadena.append("node[shape=record];\n");
        cadena.append("node[shape=record color=blue style=filled, fillcolor=\"gray\", gradientangle=90];\n");

        //cadena.append(raiz.GraficarNodo()); no tocar
        
        //
        cadena.append(raiz.GraficarNodoDatosUsuario(lista_usuarios));

        cadena.append("}\n");

        FileWriter fichero = null;
        PrintWriter pw = null;

        try {

            fichero = new FileWriter("./graficaArbolB.dot");
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
                String cmd = "dot -Tpdf ./graficaArbolB.dot -o ArbolB.pdf";
                Runtime.getRuntime().exec(cmd);
            } catch (IOException i) {
                System.out.println("f");
            }
        }

    }
}
