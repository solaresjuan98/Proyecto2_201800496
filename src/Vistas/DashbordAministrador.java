/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Clases.Localidad;
import Clases.Lugar;
import Clases.Usuario;
import Estructuras.ArbolB_Usuarios;
import Estructuras.TablaHash;
import Estructuras.TablaHashExpL;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
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
    public static ArbolB_Usuarios arbol;
    // Tabla hash de lugares
    TablaHash hash = new TablaHash(10);
    // Tabla hash de localidad
    TablaHashExpL hashlocalidades = new TablaHashExpL(20);
    
    // Tabla hash de localidad
    TablaHashExpL hashlocalidadesusr = new TablaHashExpL(7);
    

    /**
     * Creates new form DashbordAministrador
     *
     * @param arbolb_usuarios
     */
    public DashbordAministrador(ArbolB_Usuarios arbolb_usuarios) {
        initComponents();
        setLocationRelativeTo(null);

        if (arbolb_usuarios == null) {
            System.out.println("arbol B nulo");

        } else {
            System.out.println("no f");
            arbolb_usuarios.mostrarUsuarios();
            arbol = arbolb_usuarios;
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(33, 45, 62));
        jPanel1.setRequestFocusEnabled(false);

        jLabel3.setFont(new java.awt.Font("Gotham Thin", 0, 40)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Dashboard");

        btn_subirLugares.setBackground(new java.awt.Color(33, 45, 62));
        btn_subirLugares.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_marker_96px.png"))); // NOI18N
        btn_subirLugares.setFocusable(false);
        btn_subirLugares.setBorder(null);
        btn_subirLugares.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_subirLugaresActionPerformed(evt);
            }
        });

        btn_usuariosJSON.setBackground(new java.awt.Color(33, 45, 62));
        btn_usuariosJSON.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_upload_96px.png"))); // NOI18N
        btn_usuariosJSON.setFocusable(false);
        btn_usuariosJSON.setBorder(null);
        btn_usuariosJSON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_usuariosJSONActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Gotham Thin", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Crear usuario");

        jLabel5.setFont(new java.awt.Font("Gotham Thin", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Cargar archivo de usuarios (JSON)");

        jButton3.setBackground(new java.awt.Color(33, 45, 62));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_gender_neutral_user_96px.png"))); // NOI18N
        jButton3.setBorder(null);
        jButton3.setFocusable(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Gotham Thin", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Cargar lugares");

        jLabel7.setFont(new java.awt.Font("Gotham Thin", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Cargar localidades");

        btn_subirLocalidades.setBackground(new java.awt.Color(33, 45, 62));
        btn_subirLocalidades.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_car_96px.png"))); // NOI18N
        btn_subirLocalidades.setBorder(null);
        btn_subirLocalidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_subirLocalidadesActionPerformed(evt);
            }
        });

        btn_subirLocalidadesUsr.setBackground(new java.awt.Color(33, 45, 62));
        btn_subirLocalidadesUsr.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_staff_96px_3.png"))); // NOI18N
        btn_subirLocalidadesUsr.setBorder(null);
        btn_subirLocalidadesUsr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_subirLocalidadesUsrActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Gotham Thin", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Cargar localidades (usuario)");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addComponent(btn_usuariosJSON, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(78, 78, 78)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_subirLugares, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jLabel5)
                        .addGap(79, 79, 79)
                        .addComponent(jLabel4)
                        .addGap(100, 100, 100)
                        .addComponent(jLabel6)
                        .addGap(0, 19, Short.MAX_VALUE)))
                .addGap(111, 111, 111))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel7))
                    .addComponent(btn_subirLocalidades, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(btn_subirLocalidadesUsr, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jLabel8)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_usuariosJSON, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_subirLugares, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_subirLocalidades, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btn_subirLocalidadesUsr, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

                hash.mostrarTabla();

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

                    System.out.println(getSHA256(password));
                    arbol.agregarUsuario(new Usuario((int) id, nombre, usuario, correo, password, Integer.parseInt(tel), rol));

                }

                arbol.mostrarArbolB();
                arbol.mostrarUsuarios();

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
                    long id_lugar = ((Number) localidad.get("id_lugar")).longValue();
                    boolean disponibilidad = (boolean) localidad.get("disponibilidad");
                    hashlocalidades.insertarConductor(new Localidad((int) id_conductor, (int) id_lugar, disponibilidad));

                }

                hashlocalidades.mostrarLocalidades();

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
                    System.out.println(" ----> "+id_usuario);
                    long id_lugar = ((Number) localidad.get("id_lugar")).longValue();
                    hashlocalidadesusr.insertarLocUsuario(new Localidad((int) id_usuario, (int) id_lugar));

                }

                hashlocalidadesusr.mostrarLocalidades();

            } catch (FileNotFoundException ex) {
                Logger.getLogger(DashbordAministrador.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(DashbordAministrador.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ParseException ex) {
                Logger.getLogger(DashbordAministrador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }


    }//GEN-LAST:event_btn_subirLocalidadesUsrActionPerformed

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
    private javax.swing.JButton btn_subirLocalidades;
    private javax.swing.JButton btn_subirLocalidadesUsr;
    private javax.swing.JButton btn_subirLugares;
    private javax.swing.JButton btn_usuariosJSON;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
