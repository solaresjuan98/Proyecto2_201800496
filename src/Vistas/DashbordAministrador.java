/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Clases.AristaGrafo;
import Clases.Localidad;
import Clases.Lugar;
import Clases.NodoGrafo;
import Clases.Usuario;
import Estructuras.ArbolB_Facturas;
import Estructuras.ArbolB_Usuarios;
import Estructuras.ArbolB_Viajes;
import Estructuras.Dijkstra;
import Estructuras.Grafo;
import Estructuras.TablaHash;
import Estructuras.TablaHashExpL;
import InterfazGrafica.Login;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 *
 * @author juan333
 */
public class DashbordAministrador extends javax.swing.JFrame {

    // Arbol b usuarios
    ArbolB_Usuarios arbol;
    // Arbol b viajes
    ArbolB_Viajes arbol_viajes;
    // Arbol b facturas
    ArbolB_Facturas arbol_facturas;
    // Tabla hash de lugares
    TablaHash hash;
    public Grafo grafo;

    ArrayList<NodoGrafo> listaNodosG;

    /**
     * Creates new form DashbordAministrador
     *
     * @param arbolb_usuarios
     * @param g
     * @param h
     * @param hash
     * @param a_viajes
     * @param a_facturas
     */
    public DashbordAministrador(ArbolB_Usuarios arbolb_usuarios, Grafo g, TablaHash h, ArbolB_Viajes a_viajes, ArbolB_Facturas a_facturas) {
        initComponents();
        setLocationRelativeTo(null);

        if (arbolb_usuarios == null) {
            System.out.println("arbol B nulo");

        } else {

            arbol = arbolb_usuarios;
            grafo = g;
            hash = h;
            arbol_viajes = a_viajes;
            arbol_facturas = a_facturas;
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btn_subirLugares = new javax.swing.JButton();
        btn_usuariosJSON = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btn_subirLocalidades = new javax.swing.JButton();
        btn_subirLocalidadesUsr = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btn_subirConexiones = new javax.swing.JButton();
        verReportes = new javax.swing.JButton();
        cerrarSesion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(33, 45, 62));
        jPanel1.setRequestFocusEnabled(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Gotham Thin", 0, 40)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Dashboard");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 27, 227, 53));

        btn_subirLugares.setBackground(new java.awt.Color(33, 45, 62));
        btn_subirLugares.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_marker_96px.png"))); // NOI18N
        btn_subirLugares.setFocusable(false);
        btn_subirLugares.setBorder(null);
        btn_subirLugares.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_subirLugaresActionPerformed(evt);
            }
        });
        jPanel1.add(btn_subirLugares, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 110, 124, 118));

        btn_usuariosJSON.setBackground(new java.awt.Color(33, 45, 62));
        btn_usuariosJSON.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_upload_96px.png"))); // NOI18N
        btn_usuariosJSON.setFocusable(false);
        btn_usuariosJSON.setBorder(null);
        btn_usuariosJSON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_usuariosJSONActionPerformed(evt);
            }
        });
        jPanel1.add(btn_usuariosJSON, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 110, 124, 118));

        jLabel4.setFont(new java.awt.Font("Gotham Thin", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Crear usuario");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(326, 246, -1, 53));

        jLabel5.setFont(new java.awt.Font("Gotham Thin", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Cargar archivo de usuarios (JSON)");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 246, -1, 53));

        jButton3.setBackground(new java.awt.Color(33, 45, 62));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_gender_neutral_user_96px.png"))); // NOI18N
        jButton3.setBorder(null);
        jButton3.setFocusable(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(304, 108, 124, 119));

        jLabel6.setFont(new java.awt.Font("Gotham Thin", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Cargar lugares");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 250, -1, 53));

        jLabel7.setFont(new java.awt.Font("Gotham Thin", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Cargar localidades");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 441, -1, 53));

        btn_subirLocalidades.setBackground(new java.awt.Color(33, 45, 62));
        btn_subirLocalidades.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_car_96px.png"))); // NOI18N
        btn_subirLocalidades.setBorder(null);
        btn_subirLocalidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_subirLocalidadesActionPerformed(evt);
            }
        });
        jPanel1.add(btn_subirLocalidades, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 317, 124, 118));

        btn_subirLocalidadesUsr.setBackground(new java.awt.Color(33, 45, 62));
        btn_subirLocalidadesUsr.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_staff_96px_3.png"))); // NOI18N
        btn_subirLocalidadesUsr.setBorder(null);
        btn_subirLocalidadesUsr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_subirLocalidadesUsrActionPerformed(evt);
            }
        });
        jPanel1.add(btn_subirLocalidadesUsr, new org.netbeans.lib.awtextra.AbsoluteConstraints(304, 317, 124, 118));

        jLabel8.setFont(new java.awt.Font("Gotham Thin", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Cargar localidades (usuario)");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(286, 441, -1, 53));

        jLabel9.setFont(new java.awt.Font("Gotham Thin", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Cargar conexiones");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 441, -1, 53));

        btn_subirConexiones.setBackground(new java.awt.Color(33, 45, 62));
        btn_subirConexiones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_split_96px.png"))); // NOI18N
        btn_subirConexiones.setBorder(null);
        btn_subirConexiones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_subirConexionesActionPerformed(evt);
            }
        });
        jPanel1.add(btn_subirConexiones, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 317, 124, 118));

        verReportes.setBackground(new java.awt.Color(51, 153, 255));
        verReportes.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
        verReportes.setText("Ver reportes");
        verReportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verReportesActionPerformed(evt);
            }
        });
        jPanel1.add(verReportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, -1, -1));

        cerrarSesion.setBackground(new java.awt.Color(255, 51, 51));
        cerrarSesion.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
        cerrarSesion.setText("Cerrar sesión");
        cerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarSesionActionPerformed(evt);
            }
        });
        jPanel1.add(cerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 20, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 689, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_subirLugaresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_subirLugaresActionPerformed

        // Variables de datos del lugar 
        int id_lugar;
        String categoria;
        String nombre;
        String latitud;
        String longitud;

        JFileChooser subirLugar = new JFileChooser();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivos JSON", "json");
        subirLugar.setFileFilter(filtro);
        JSONParser parser = new JSONParser();

        int r = subirLugar.showOpenDialog(null);

        if (r == JFileChooser.APPROVE_OPTION) {
            System.out.println(subirLugar.getSelectedFile().getName());
            try {
                Reader reader = new FileReader(subirLugar.getSelectedFile());
                JSONObject jsonobj = (JSONObject) parser.parse(reader);

                // array
                JSONArray lugares = (JSONArray) jsonobj.get("Lugares");

                for (int i = 0; i < lugares.size(); i++) {

                    JSONObject lugar = (JSONObject) lugares.get(i);

                    long id = ((Number) lugar.get("id")).longValue();
                    categoria = (String) lugar.get("Categoria");
                    nombre = lugar.get("Nombre").toString();
                    latitud = lugar.get("Lat").toString();
                    longitud = lugar.get("Lon").toString();

                    hash.insertar(new Lugar((int) id, categoria, nombre, Float.parseFloat(latitud), Float.parseFloat(longitud)));

                }

                //hash.mostrarTabla();

            } catch (FileNotFoundException ex) {
                Logger.getLogger(DashbordAministrador.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(DashbordAministrador.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ParseException ex) {
                Logger.getLogger(DashbordAministrador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }


    }//GEN-LAST:event_btn_subirLugaresActionPerformed

    private void btn_usuariosJSONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_usuariosJSONActionPerformed

        // Variables de datos del usuario
        int id_usuario;
        String nombre, usuario, correo, password, rol;
        int telefono;

        JFileChooser subirJSON = new JFileChooser();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivos JSON", "json");
        subirJSON.setFileFilter(filtro);

        JSONParser parser = new JSONParser();

        int r = subirJSON.showOpenDialog(null);
        if (r == JFileChooser.APPROVE_OPTION) {
            System.out.println(subirJSON.getSelectedFile().getName());
            try {
                Reader reader = new FileReader(subirJSON.getSelectedFile());
                JSONObject jsonobj = (JSONObject) parser.parse(reader);

                // array
                JSONArray usuarios = (JSONArray) jsonobj.get("usuarios");

                for (int i = 0; i < usuarios.size(); i++) {

                    JSONObject user = (JSONObject) usuarios.get(i);

                    long id = ((Number) user.get("id")).longValue();
                    nombre = (String) user.get("nombre");
                    usuario = (String) user.get("usuario");
                    correo = (String) user.get("correo");
                    password = (String) user.get("pass");
                    String tel = (String) user.get("telefono");
                    rol = (String) user.get("rol");

                    //System.out.println(getSHA256(password));
                    arbol.agregarUsuario(new Usuario((int) id, nombre, usuario, correo, password,tel, rol));

                }

                //arbol.mostrarArbolB();
                //arbol.mostrarUsuarios();

            } catch (FileNotFoundException ex) {
                Logger.getLogger(DashbordAministrador.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(DashbordAministrador.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ParseException ex) {
                Logger.getLogger(DashbordAministrador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btn_usuariosJSONActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btn_subirLocalidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_subirLocalidadesActionPerformed
        // TODO add your handling code here:
        JFileChooser subirJSON = new JFileChooser();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivos JSON", "json");
        subirJSON.setFileFilter(filtro);

        JSONParser parser = new JSONParser();

        int r = subirJSON.showOpenDialog(null);
        if (r == JFileChooser.APPROVE_OPTION) {
            System.out.println(subirJSON.getSelectedFile().getName());
            try {
                Reader reader = new FileReader(subirJSON.getSelectedFile());
                JSONObject jsonobj = (JSONObject) parser.parse(reader);

                // array
                JSONArray localidades = (JSONArray) jsonobj.get("localidades");

                for (int i = 0; i < localidades.size(); i++) {

                    JSONObject localidad = (JSONObject) localidades.get(i);

                    long id_conductor = ((Number) localidad.get("id_conductor")).longValue();
                    String lugar = (String) localidad.get("lugar");
                    boolean disponibilidad = (boolean) localidad.get("disponibilidad");
                    // cambiar la disponibilidad 
                    arbol.setDisponibilidad((int) id_conductor, disponibilidad);
                    // setear coordenadas del lugar en donde está el conductor
                    Lugar l = hash.buscarLugar(lugar);

                    try {
                        arbol.setCoordenadas((int) id_conductor, l.getLatitud(), l.getLongitud());
                    } catch (Exception e) {

                    }
                }

            } catch (FileNotFoundException ex) {
                Logger.getLogger(DashbordAministrador.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(DashbordAministrador.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ParseException ex) {
                Logger.getLogger(DashbordAministrador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_btn_subirLocalidadesActionPerformed

    private void btn_subirLocalidadesUsrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_subirLocalidadesUsrActionPerformed

        JFileChooser subirJSON = new JFileChooser();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivos JSON", "json");
        subirJSON.setFileFilter(filtro);

        JSONParser parser = new JSONParser();

        int r = subirJSON.showOpenDialog(null);
        if (r == JFileChooser.APPROVE_OPTION) {
            System.out.println(subirJSON.getSelectedFile().getName());
            try {
                Reader reader = new FileReader(subirJSON.getSelectedFile());
                JSONObject jsonobj = (JSONObject) parser.parse(reader);

                // array
                JSONArray localidades = (JSONArray) jsonobj.get("localidades");

                for (int i = 0; i < localidades.size(); i++) {

                    JSONObject localidad = (JSONObject) localidades.get(i);

                    long id_usuario = ((Number) localidad.get("id_usuario")).longValue();
                    System.out.println(" ----> " + id_usuario);
                    String lugar = (String) localidad.get("nombre");
                    Lugar l = hash.buscarLugar(lugar);

                    try {
                        arbol.setCoordenadas((int) id_usuario, l.getLatitud(), l.getLongitud());
                    } catch (Exception e) {

                    }
                }

            } catch (FileNotFoundException ex) {
                Logger.getLogger(DashbordAministrador.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(DashbordAministrador.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ParseException ex) {
                Logger.getLogger(DashbordAministrador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }


    }//GEN-LAST:event_btn_subirLocalidadesUsrActionPerformed

    private void btn_subirConexionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_subirConexionesActionPerformed
        // TODO add your handling code here:

        JFileChooser subirJSON = new JFileChooser();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivos JSON", "json");
        subirJSON.setFileFilter(filtro);

        JSONParser parser = new JSONParser();

        int r = subirJSON.showOpenDialog(null);
        if (r == JFileChooser.APPROVE_OPTION) {
            try {
                Reader reader = new FileReader(subirJSON.getSelectedFile());
                JSONObject jsonobj = (JSONObject) parser.parse(reader);

                // array
                JSONArray conexiones = (JSONArray) jsonobj.get("Grafo");

                for (int i = 0; i < conexiones.size(); i++) {

                    JSONObject conexion = (JSONObject) conexiones.get(i);
                    String lugar_inicio = (String) conexion.get("inicio");
                    String lugar_final = (String) conexion.get("final");
                    long peso = ((Number) conexion.get("peso")).longValue();// = distancia
                    long precio = ((Number) conexion.get("precio")).longValue();

                    NodoGrafo inicio = grafo.buscarNodo(lugar_inicio);
                    NodoGrafo fin = grafo.buscarNodo(lugar_final);

                    if (inicio == null) {
                        inicio = new NodoGrafo(lugar_inicio, precio);
                    }

                    if (fin == null) {
                        fin = new NodoGrafo(lugar_final, precio);
                    }

                    inicio.agregarAristaNoDirigida(inicio, fin, peso);
                    grafo.agregarNodo(inicio);
                    grafo.agregarNodo(fin);

                }

                //Dijkstra d = new Dijkstra();
                //d.hallarRutaMenor(grafo, grafo.buscarNodo("T-3"), grafo.buscarNodo("Pollo pinulito"));

            } catch (FileNotFoundException ex) {
                Logger.getLogger(DashbordAministrador.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException | ParseException ex) {
                Logger.getLogger(DashbordAministrador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btn_subirConexionesActionPerformed

    private void verReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verReportesActionPerformed
        // TODO add your handling code here:

        ModuloReportes reportes = new ModuloReportes(arbol, hash, arbol_facturas, arbol_viajes);
        reportes.setVisible(true);

    }//GEN-LAST:event_verReportesActionPerformed

    private void cerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarSesionActionPerformed

        int dRes = JOptionPane.showConfirmDialog(null, "¿Deseas cerrar sesión?");

        if (dRes == JOptionPane.YES_OPTION) {

            IniciarSesion login = new IniciarSesion(arbol, hash, grafo, arbol_viajes, arbol_facturas);
            login.setVisible(true);
            dispose();
        }

    }//GEN-LAST:event_cerrarSesionActionPerformed

//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Windows".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(DashbordAministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(DashbordAministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(DashbordAministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(DashbordAministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new DashbordAministrador(arbol).setVisible(true);
//            }
//        });
//    }
    public String getSHA256(String pass) {

        String salida = null;

        try {

            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            digest.reset();
            digest.update(pass.getBytes("utf8"));
            salida = String.format("%064x", new BigInteger(1, digest.digest()));

        } catch (Exception e) {
            e.printStackTrace();
        }

        return salida;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_subirConexiones;
    private javax.swing.JButton btn_subirLocalidades;
    private javax.swing.JButton btn_subirLocalidadesUsr;
    private javax.swing.JButton btn_subirLugares;
    private javax.swing.JButton btn_usuariosJSON;
    private javax.swing.JButton cerrarSesion;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton verReportes;
    // End of variables declaration//GEN-END:variables
}
