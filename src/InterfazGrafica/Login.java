/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfazGrafica;

//import AppPackage.AnimationClass;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    public void OpenInternet(){
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlaCalculadora = new javax.swing.JLabel();
        jLabelInternet1 = new javax.swing.JLabel();
        jLabelCalculadora = new javax.swing.JLabel();
        jLabelMusica = new javax.swing.JLabel();
        jlaMundo = new javax.swing.JLabel();
        jlaMusica = new javax.swing.JLabel();
        jpingreso = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();

        jlaCalculadora.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_Calculator_32px.png"))); // NOI18N
        jlaCalculadora.setText("jLabel16");

        jLabelInternet1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_Globe_32px.png"))); // NOI18N
        jLabelInternet1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelInternet1MouseClicked(evt);
            }
        });

        jLabelCalculadora.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_Calculator_32px.png"))); // NOI18N
        jLabelCalculadora.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCalculadoraMouseClicked(evt);
            }
        });

        jLabelMusica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_Musical_Notes_32px.png"))); // NOI18N

        jlaMundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_Globe_32px.png"))); // NOI18N
        jlaMundo.setText("jLabel18");

        jlaMusica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_Musical_Notes_32px.png"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 1050, 575));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpingreso.setBackground(new java.awt.Color(255, 255, 255));
        jpingreso.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jpingreso.setForeground(new java.awt.Color(255, 255, 255));
        jpingreso.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(238, 112, 82));
        jLabel3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(238, 112, 82));
        jLabel3.setText("Password: ");
        jpingreso.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 100, -1));

        jLabel8.setBackground(new java.awt.Color(238, 112, 82));
        jLabel8.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(238, 112, 82));
        jLabel8.setText("User: ");
        jpingreso.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 60, -1));

        jTextField1.setBackground(new java.awt.Color(255, 255, 255));
        jTextField1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(153, 153, 153));
        jTextField1.setText("Ingrese Usuario");
        jTextField1.setBorder(null);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jpingreso.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, 180, 30));
        jpingreso.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, 220, 20));
        jpingreso.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 220, 20));

        jPasswordField1.setBackground(new java.awt.Color(255, 255, 255));
        jPasswordField1.setForeground(new java.awt.Color(153, 153, 153));
        jPasswordField1.setText("jPasswordField1");
        jPasswordField1.setBorder(null);
        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });
        jpingreso.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 330, 180, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_customer_32px_1.png"))); // NOI18N
        jpingreso.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, -1, 40));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_Key_32px.png"))); // NOI18N
        jpingreso.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, -1, 40));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_Menu_32px.png"))); // NOI18N
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jpingreso.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, -1, 40));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Enter_OFF.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Enter_ON.png"))); // NOI18N
        jButton1.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Enter_ON.png"))); // NOI18N
        jButton1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Enter_ON.png"))); // NOI18N
        jpingreso.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 450, 100, 40));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_Multiply_32px.png"))); // NOI18N
        jLabel16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 0, -1, 40));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_Expand_Arrow_32px.png"))); // NOI18N
        jLabel17.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel17MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 0, 30, 40));

        jpingreso.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, -1));

        getContentPane().add(jpingreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 580));
        jpingreso.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
       /*
        AnimationClass calculadora = new AnimationClass();
       calculadora.jLabelXRight(-40,10,10,5, jlaCalculadora);
       //<--
       AnimationClass calculadoraa = new AnimationClass();
       calculadoraa.jLabelXLeft(-40,10,10,5, jlaCalculadora);
       
       
       AnimationClass internet = new AnimationClass();
       internet.jLabelXRight(10,-40,10,5, jLabelInternet1);
       //<--
       AnimationClass internett = new AnimationClass();
       internett.jLabelXLeft(-40,10,10,5, jLabelInternet1);
       
       
       AnimationClass musica = new AnimationClass();
       musica.jLabelXRight(10,-40,10,5, jLabelMusica);
       //<--
       AnimationClass musicaa = new AnimationClass();
       musicaa.jLabelXLeft(-40,10,10,5, jLabelMusica);
       */
        
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabelInternet1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelInternet1MouseClicked
        
    }//GEN-LAST:event_jLabelInternet1MouseClicked

    private void jLabelCalculadoraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCalculadoraMouseClicked
        
    }//GEN-LAST:event_jLabelCalculadoraMouseClicked

    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked
      this.setState(Login.ICONIFIED);
    }//GEN-LAST:event_jLabel17MouseClicked

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        int dialog =JOptionPane.YES_NO_CANCEL_OPTION;
        int result = JOptionPane.showConfirmDialog(null,"Desea Salir del LOgin?","Exit",dialog);
        if(result == 0){
            System.exit(0);
        }
    }//GEN-LAST:event_jLabel16MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelCalculadora;
    private javax.swing.JLabel jLabelInternet1;
    private javax.swing.JLabel jLabelMusica;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel jlaCalculadora;
    private javax.swing.JLabel jlaMundo;
    private javax.swing.JLabel jlaMusica;
    private javax.swing.JPanel jpingreso;
    // End of variables declaration//GEN-END:variables
}
