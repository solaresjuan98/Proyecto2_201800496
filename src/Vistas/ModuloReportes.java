/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Estructuras.TablaHash;
import javax.swing.JOptionPane;

/**
 *
 * @author juan333
 */
public class ModuloReportes extends javax.swing.JFrame {

    public static TablaHash hash;

    /**
     * Creates new form ModuloReportes
     *
     * @param h
     */
    public ModuloReportes(TablaHash h) {
        initComponents();
        setResizable(false);
        setTitle("Modulo de reportes");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        hash = h;
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
        btn_reporteConductores = new javax.swing.JButton();
        btn_ReporteUsuarios = new javax.swing.JButton();
        btn_reporteViajes = new javax.swing.JButton();
        btn_reporteHash = new javax.swing.JButton();
        btn_reporteTransacciones = new javax.swing.JButton();
        btn_regresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(33, 45, 62));
        jPanel1.setRequestFocusEnabled(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Gotham Thin", 0, 40)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Reportes");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 270, 53));

        btn_reporteConductores.setBackground(new java.awt.Color(51, 153, 255));
        btn_reporteConductores.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
        btn_reporteConductores.setText("Reporte conductores");
        btn_reporteConductores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_reporteConductoresActionPerformed(evt);
            }
        });
        jPanel1.add(btn_reporteConductores, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, 210, -1));

        btn_ReporteUsuarios.setBackground(new java.awt.Color(51, 153, 255));
        btn_ReporteUsuarios.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
        btn_ReporteUsuarios.setText("Reporte usuarios");
        btn_ReporteUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ReporteUsuariosActionPerformed(evt);
            }
        });
        jPanel1.add(btn_ReporteUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 210, -1));

        btn_reporteViajes.setBackground(new java.awt.Color(51, 153, 255));
        btn_reporteViajes.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
        btn_reporteViajes.setText("Reporte viajes");
        btn_reporteViajes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_reporteViajesActionPerformed(evt);
            }
        });
        jPanel1.add(btn_reporteViajes, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 340, 210, -1));

        btn_reporteHash.setBackground(new java.awt.Color(51, 153, 255));
        btn_reporteHash.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
        btn_reporteHash.setText("Reporte lugares");
        btn_reporteHash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_reporteHashActionPerformed(evt);
            }
        });
        jPanel1.add(btn_reporteHash, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, 210, -1));

        btn_reporteTransacciones.setBackground(new java.awt.Color(51, 153, 255));
        btn_reporteTransacciones.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
        btn_reporteTransacciones.setText("Reporte transacciones");
        btn_reporteTransacciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_reporteTransaccionesActionPerformed(evt);
            }
        });
        jPanel1.add(btn_reporteTransacciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, 210, -1));

        btn_regresar.setBackground(new java.awt.Color(255, 51, 51));
        btn_regresar.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
        btn_regresar.setText("Regresar");
        btn_regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_regresarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 400, 210, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 366, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 458, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_reporteConductoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_reporteConductoresActionPerformed


    }//GEN-LAST:event_btn_reporteConductoresActionPerformed

    private void btn_ReporteUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ReporteUsuariosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_ReporteUsuariosActionPerformed

    private void btn_reporteViajesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_reporteViajesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_reporteViajesActionPerformed

    private void btn_reporteHashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_reporteHashActionPerformed

        // graficando la tabla hash
        hash.graficar();
        JOptionPane.showMessageDialog(null, "Tabla de lugares graficada con exito");

    }//GEN-LAST:event_btn_reporteHashActionPerformed

    private void btn_reporteTransaccionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_reporteTransaccionesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_reporteTransaccionesActionPerformed

    private void btn_regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_regresarActionPerformed

    }//GEN-LAST:event_btn_regresarActionPerformed

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
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(ModuloReportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(ModuloReportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(ModuloReportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(ModuloReportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new ModuloReportes().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_ReporteUsuarios;
    private javax.swing.JButton btn_regresar;
    private javax.swing.JButton btn_reporteConductores;
    private javax.swing.JButton btn_reporteHash;
    private javax.swing.JButton btn_reporteTransacciones;
    private javax.swing.JButton btn_reporteViajes;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
