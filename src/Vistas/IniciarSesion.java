/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Clases.NodoGrafo;
import Clases.Usuario;
import Estructuras.ArbolB_Facturas;
import Estructuras.ArbolB_Usuarios;
import Estructuras.ArbolB_Viajes;
import Estructuras.Grafo;
import Estructuras.TablaHash;
import com.sun.awt.AWTUtilities;
import java.awt.Shape;
import java.awt.geom.RoundRectangle2D;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class IniciarSesion extends javax.swing.JFrame {

    ArrayList<NodoGrafo> listaNodosG;
    ArbolB_Usuarios arbol;
    TablaHash hash;
    ArbolB_Viajes arbol_viajes;
    ArbolB_Facturas arbol_facturas;
    Grafo grafo;

    /**
     * Creates new form IniciarSesion
     *
     * @param arbol_usuarios
     * @param t
     * @param g
     * @param a_viajes
     * @param a_facturas
     */
    public IniciarSesion(ArbolB_Usuarios arbol_usuarios, TablaHash t, Grafo g, ArbolB_Viajes a_viajes, ArbolB_Facturas a_facturas) {
        initComponents();
        setLocationRelativeTo(null); //Centra la vantana en la pantalla
        //
        //Shape forma = new RoundRectangle2D.Double(0, 0, getBounds().width, getBounds().height, 20, 20);
        //AWTUtilities.setWindowShape(this, forma);
        //arbol = new ArbolB_Usuarios(3);

        if (arbol_usuarios == null) {
            //System.out.println("arbol B nulo");

        } else {
            //System.out.println("no f");
            //arbol_usuarios.mostrarUsuarios();
            hash = t;
            arbol = arbol_usuarios;
            grafo = g;
            arbol_viajes = a_viajes;
            arbol_facturas = a_facturas;
            //hash.mostrarTabla();;
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

        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnIngresar = new javax.swing.JButton();
        txt_usuario = new javax.swing.JTextField();
        txt_contrasenia = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        rol = new javax.swing.JComboBox<>();
        btnIngresar1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(33, 45, 62));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Gotham Thin", 0, 40)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Iniciar Sesión");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 275, 53));

        jLabel4.setFont(new java.awt.Font("Gotham Thin", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("USUARIO");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));

        jLabel5.setFont(new java.awt.Font("Gotham Thin", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("CONTRASEÑA");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, -1, -1));

        btnIngresar.setBackground(new java.awt.Color(73, 181, 172));
        btnIngresar.setFont(new java.awt.Font("Gotham Extra Light", 0, 18)); // NOI18N
        btnIngresar.setForeground(new java.awt.Color(255, 255, 255));
        btnIngresar.setText("Registrarse");
        btnIngresar.setBorderPainted(false);
        btnIngresar.setContentAreaFilled(false);
        btnIngresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIngresar.setFocusPainted(false);
        btnIngresar.setFocusable(false);
        btnIngresar.setRequestFocusEnabled(false);
        btnIngresar.setVerifyInputWhenFocusTarget(false);
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });
        jPanel2.add(btnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 500, 150, 60));

        txt_usuario.setBackground(new java.awt.Color(33, 45, 62));
        txt_usuario.setFont(new java.awt.Font("Gotham Thin", 0, 18)); // NOI18N
        txt_usuario.setForeground(new java.awt.Color(73, 181, 172));
        txt_usuario.setBorder(null);
        txt_usuario.setCaretColor(new java.awt.Color(73, 181, 172));
        jPanel2.add(txt_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 310, 40));

        txt_contrasenia.setBackground(new java.awt.Color(33, 45, 62));
        txt_contrasenia.setFont(txt_contrasenia.getFont().deriveFont(txt_contrasenia.getFont().getSize()+7f));
        txt_contrasenia.setForeground(new java.awt.Color(73, 181, 172));
        txt_contrasenia.setBorder(null);
        txt_contrasenia.setCaretColor(new java.awt.Color(73, 181, 172));
        jPanel2.add(txt_contrasenia, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, 270, 36));

        jSeparator1.setBackground(new java.awt.Color(73, 181, 172));
        jSeparator1.setForeground(new java.awt.Color(73, 181, 172));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 310, 10));

        jSeparator2.setBackground(new java.awt.Color(73, 181, 172));
        jSeparator2.setForeground(new java.awt.Color(73, 181, 172));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 310, 10));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagees/icons8_Lock_25px.png"))); // NOI18N
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 48, 42));

        jLabel9.setFont(new java.awt.Font("Gotham Thin", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(73, 181, 172));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("x");
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 0, 30, 30));

        rol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "normal", "conductor", "administrador" }));
        rol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rolActionPerformed(evt);
            }
        });
        jPanel2.add(rol, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, 310, -1));

        btnIngresar1.setBackground(new java.awt.Color(73, 181, 172));
        btnIngresar1.setFont(new java.awt.Font("Gotham Extra Light", 0, 18)); // NOI18N
        btnIngresar1.setForeground(new java.awt.Color(255, 255, 255));
        btnIngresar1.setText("Ingresar");
        btnIngresar1.setBorderPainted(false);
        btnIngresar1.setContentAreaFilled(false);
        btnIngresar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIngresar1.setFocusPainted(false);
        btnIngresar1.setFocusable(false);
        btnIngresar1.setRequestFocusEnabled(false);
        btnIngresar1.setVerifyInputWhenFocusTarget(false);
        btnIngresar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresar1ActionPerformed(evt);
            }
        });
        jPanel2.add(btnIngresar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 500, 150, 60));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        // TODO add your handling code here:

        Registro registro = new Registro(arbol);
        registro.setVisible(true);
        //dispose();

    }//GEN-LAST:event_btnIngresarActionPerformed

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        // TODO add your handling code here:

        System.exit(0);
    }//GEN-LAST:event_jLabel9MouseClicked

    private void rolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rolActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rolActionPerformed

    private void btnIngresar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresar1ActionPerformed
        String usuario = txt_usuario.getText();
        String contrasenia = txt_contrasenia.getText();
        String rol_seleccionado = rol.getSelectedItem().toString();

        try {
            Usuario user = arbol.buscarUsuario(usuario, contrasenia);

            // Logeando como administrador
            if (usuario.equals("marvin_martinez") && contrasenia.equals("admin") && rol_seleccionado.equals("administrador")) {
                JOptionPane.showMessageDialog(null, "Bienvenido");
                DashbordAministrador dashboard = new DashbordAministrador(arbol, grafo, hash, arbol_viajes, arbol_facturas);
                dashboard.setVisible(true);
                dispose();
            } else if (usuario.equals(user.getUsername()) && contrasenia.equals(user.getContrasenia()) && rol_seleccionado.equals(user.getRol())) {

                if (user.getRol().equals("normal")) {
                    // abrir el form de usuarios
                    DashboardUsuario dash = new DashboardUsuario(user, hash, arbol, grafo, arbol_viajes, arbol_facturas);
                    dash.setVisible(true);
                    dispose();

                } else if (user.getRol().equals("conductor")) {
                    // abrir el form de conductores
                    DashboardConductor dashc = new DashboardConductor(user, hash, arbol, grafo, arbol_viajes, arbol_facturas);
                    dashc.setVisible(true);
                    dispose();
                }

            } else {
                JOptionPane.showMessageDialog(null, "Datos incorrectos");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Usuario no encontrado. Intentalo de nuevo");
            //System.out.println(" >> usuario no encontrado");
        }

    }//GEN-LAST:event_btnIngresar1ActionPerformed
//
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
//            java.util.logging.Logger.getLogger(IniciarSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(IniciarSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(IniciarSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(IniciarSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new IniciarSesion(arbol, hash).setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnIngresar1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JComboBox<String> rol;
    private javax.swing.JPasswordField txt_contrasenia;
    private javax.swing.JTextField txt_usuario;
    // End of variables declaration//GEN-END:variables
}
