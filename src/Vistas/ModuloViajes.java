/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Clases.Lugar;
import Clases.Usuario;
import Estructuras.ArbolB_Usuarios;
import Estructuras.TablaHash;
import Mapa.Mapa;
import com.teamdev.jxmaps.LatLng;
import com.teamdev.jxmaps.MapViewOptions;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author juan333
 */
public class ModuloViajes extends javax.swing.JFrame {

    public static ArbolB_Usuarios arbol;
    public static TablaHash hash;
    public static Usuario user;
    // lista de conductores
    public ArrayList<Usuario> listaaux = new ArrayList<>();
    //public ArrayList<Usuario> listaaux2 = new ArrayList<>();
    /**
     * Creates new form ModuloViajes
     *
     * @param t
     * @param a
     * @param u
     */
    public ModuloViajes(TablaHash t, ArbolB_Usuarios a, Usuario u) {
        initComponents();
        setTitle("Modulo de viaje");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setResizable(false);

        hash = t;
        arbol = a;
        user = u;

        //System.out.println("->"+user.getLatitud()+" "+user.getLongitud());
        //Lugar inicio = hash.buscarLugarPorCoordenada((long)user.getLatitud(), (long)user.getLongitud());
        // setear el lugar de inicio (UNICO) en la lista
        //LugarInicio.addItem(inicio.getNombre());
        // arreglo grande
        if (hash.isBandera()) {
            for (Lugar l : hash.lugares_redimensionado) {

                if (l != null) {

                    LugarInicio.addItem(l.getNombre());
                    LugarFinal.addItem(l.getNombre());
                }
            }
            // arreglo pequeño
        } else {

            for (Lugar l : hash.arreglo_lugares) {

                if (l != null) {

                    LugarInicio.addItem(l.getNombre());
                    LugarFinal.addItem(l.getNombre());

                }
            }

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
        jLabel4 = new javax.swing.JLabel();
        verConductores = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        LugarFinal = new javax.swing.JComboBox<>();
        LugarInicio = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        txt_nombreConductor = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        txt_idConductor = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        txt_lugarinicio = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        txt_lugarfinal = new javax.swing.JTextField();
        buscarConductor = new javax.swing.JButton();
        verLugares = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(33, 45, 62));
        jPanel1.setRequestFocusEnabled(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Gotham Thin", 0, 40)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Solicitar viaje");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 270, 53));

        jLabel4.setFont(new java.awt.Font("Gotham Thin", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Lugar de destino");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 140, 53));

        verConductores.setBackground(new java.awt.Color(51, 153, 255));
        verConductores.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
        verConductores.setText("Ver conductores");
        verConductores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verConductoresActionPerformed(evt);
            }
        });
        jPanel1.add(verConductores, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 420, 220, -1));

        jLabel5.setFont(new java.awt.Font("Gotham Thin", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Datos de conductor");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 30, 200, 53));

        jPanel1.add(LugarFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 220, -1));

        jPanel1.add(LugarInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 220, -1));

        jLabel6.setFont(new java.awt.Font("Gotham Thin", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Lugar de inicio");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 140, 53));

        jSeparator1.setBackground(new java.awt.Color(73, 181, 172));
        jSeparator1.setForeground(new java.awt.Color(73, 181, 172));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 140, 200, 10));

        txt_nombreConductor.setEditable(false);
        txt_nombreConductor.setBackground(new java.awt.Color(33, 45, 62));
        txt_nombreConductor.setFont(new java.awt.Font("Gotham Thin", 0, 18)); // NOI18N
        txt_nombreConductor.setForeground(new java.awt.Color(73, 181, 172));
        txt_nombreConductor.setBorder(null);
        txt_nombreConductor.setCaretColor(new java.awt.Color(73, 181, 172));
        jPanel1.add(txt_nombreConductor, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 100, 200, 40));

        jSeparator2.setBackground(new java.awt.Color(73, 181, 172));
        jSeparator2.setForeground(new java.awt.Color(73, 181, 172));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 210, 200, 10));

        txt_idConductor.setEditable(false);
        txt_idConductor.setBackground(new java.awt.Color(33, 45, 62));
        txt_idConductor.setFont(new java.awt.Font("Gotham Thin", 0, 18)); // NOI18N
        txt_idConductor.setForeground(new java.awt.Color(73, 181, 172));
        txt_idConductor.setBorder(null);
        txt_idConductor.setCaretColor(new java.awt.Color(73, 181, 172));
        jPanel1.add(txt_idConductor, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 170, 200, 40));

        jSeparator3.setBackground(new java.awt.Color(73, 181, 172));
        jSeparator3.setForeground(new java.awt.Color(73, 181, 172));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 270, 200, 10));

        txt_lugarinicio.setEditable(false);
        txt_lugarinicio.setBackground(new java.awt.Color(33, 45, 62));
        txt_lugarinicio.setFont(new java.awt.Font("Gotham Thin", 0, 18)); // NOI18N
        txt_lugarinicio.setForeground(new java.awt.Color(73, 181, 172));
        txt_lugarinicio.setBorder(null);
        txt_lugarinicio.setCaretColor(new java.awt.Color(73, 181, 172));
        jPanel1.add(txt_lugarinicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 230, 200, 40));

        jSeparator4.setBackground(new java.awt.Color(73, 181, 172));
        jSeparator4.setForeground(new java.awt.Color(73, 181, 172));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 330, 200, 10));

        txt_lugarfinal.setEditable(false);
        txt_lugarfinal.setBackground(new java.awt.Color(33, 45, 62));
        txt_lugarfinal.setFont(new java.awt.Font("Gotham Thin", 0, 18)); // NOI18N
        txt_lugarfinal.setForeground(new java.awt.Color(73, 181, 172));
        txt_lugarfinal.setBorder(null);
        txt_lugarfinal.setCaretColor(new java.awt.Color(73, 181, 172));
        jPanel1.add(txt_lugarfinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 290, 200, 40));

        buscarConductor.setBackground(new java.awt.Color(51, 153, 255));
        buscarConductor.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
        buscarConductor.setText("Buscar conductor");
        buscarConductor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarConductorActionPerformed(evt);
            }
        });
        jPanel1.add(buscarConductor, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, 220, -1));

        verLugares.setBackground(new java.awt.Color(51, 153, 255));
        verLugares.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
        verLugares.setText("Ver lugares en mapa");
        verLugares.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verLugaresActionPerformed(evt);
            }
        });
        jPanel1.add(verLugares, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, 220, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 718, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 508, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void verConductoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verConductoresActionPerformed

        for (Usuario u : arbol.getLista_usuarios()) {

            if (u != null) {

                if (u.getRol().equals("conductor")) {
                    listaaux.add(u);

                    float d = obtenerDistancia(user.getLatitud(), user.getLongitud(), u.getLatitud(), u.getLongitud());
                    System.out.println(" El conductor esta a " + d);
                    //System.out.println(" Conductor con nombre: " + u.getNombre_completo());                }
                }
            }
        }
        
        MapViewOptions options = new MapViewOptions();
        options.importPlaces();
        options.setApiKey("AIzaSyAu_wHDWkQ4oI98SuwtK1pVqKjIJitE_nw");
        Mapa mapa = new Mapa(options);
        mapa.Renderizar(mapa);
        JOptionPane.showMessageDialog(null, "Renderizando mapa...");

        StringBuilder info = new StringBuilder();

        for (Usuario conductor : listaaux) {

            if (conductor != null) {
                info.append("Nombre: ").append(conductor.getNombre_completo()).append("\n");
                if (conductor.isDisponibilidad()) {
                    info.append("Disponible: ").append("si\n");
                } else {
                    info.append("Disponible: ").append("no\n");
                }
                mapa.agregarMarcadorInfo(new LatLng(conductor.getLatitud(), conductor.getLongitud()), info.toString());

                info.setLength(0);
            }
        }

        mapa.agregarMarcadorInfo(new LatLng(user.getLatitud(), user.getLongitud()), "MI UBICACION ACTUAL");


    }//GEN-LAST:event_verConductoresActionPerformed

    private void buscarConductorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarConductorActionPerformed
        // TODO add your handling code here:
        
        // validar si mi "listaaux" esta vacia
        if(listaaux != null){
            
            //obtenerConductorMasCercano(listaaux);
            Usuario conductor = obtenerConductorMasCercano(listaaux);
            System.out.println(" >> Conductor más cercano es: " + conductor.getNombre_completo());
            txt_nombreConductor.setText(conductor.getNombre_completo());
        }else{
            System.out.println(" >> Lista vacía");
        }
        
        

    }//GEN-LAST:event_buscarConductorActionPerformed

    private void verLugaresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verLugaresActionPerformed
        // TODO add your handling code here:
        String inicio = (String) LugarInicio.getSelectedItem();
        String fin = (String) LugarFinal.getSelectedItem();

        System.out.println("inicio >> " + inicio);
        System.out.println("fin >> " + fin);

        Lugar inicio_ = hash.buscarLugar(inicio);
        Lugar final_ = hash.buscarLugar(fin);

        MapViewOptions options = new MapViewOptions();
        options.importPlaces();
        options.setApiKey("AIzaSyAu_wHDWkQ4oI98SuwtK1pVqKjIJitE_nw");
        Mapa mapa = new Mapa(options);
        mapa.Renderizar(mapa);
        JOptionPane.showMessageDialog(null, "Renderizando mapa...");

        mapa.agregarMarcadorInfo(new LatLng(user.getLatitud(), user.getLongitud()), "Mi ubicación actual");

        LatLng c1 = new LatLng(inicio_.getLatitud(), inicio_.getLongitud());
        LatLng c2 = new LatLng(final_.getLatitud(), final_.getLongitud());
        //LatLng c3 = new LatLng(14.541550, -90.584514);

        LatLng[] camino = {c1, c2};
        mapa.agregarGrafo(camino, true);

    }//GEN-LAST:event_verLugaresActionPerformed

    public static float obtenerDistancia(float lat1, float lat2, float lng1, float lng2) {

        float radioTierra = 6371;//en kilómetros  
        double dLat = Math.toRadians(lat2 - lat1);
        double dLng = Math.toRadians(lng2 - lng1);
        double sindLat = Math.sin(dLat / 2);
        double sindLng = Math.sin(dLng / 2);
        double va1 = Math.pow(sindLat, 2) + Math.pow(sindLng, 2)* Math.cos(Math.toRadians(lat1)) * Math.cos(Math.toRadians(lat2));
        double va2 = 2 * Math.atan2(Math.sqrt(va1), Math.sqrt(1 - va1));
        double distancia = radioTierra * va2;

        return (float) distancia;

    }
    
    public static Usuario obtenerConductorMasCercano(ArrayList<Usuario> lista){
        
        Usuario conductorCercano = null;

        float distanciamenor = Float.MAX_VALUE;
        
        for (Usuario u : lista) {

            // sacar la distancia a partir del usuario que está solicitando el viaje
            float distancia = obtenerDistancia(user.getLatitud(), user.getLongitud(), u.getLatitud(), u.getLongitud());

            if (distancia < distanciamenor) {
                distanciamenor = distancia;
                conductorCercano = u;
                System.out.println(" :D");
                //return conductorCercano;
                
            }

        }

        return conductorCercano;
        
    }
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
//            java.util.logging.Logger.getLogger(ModuloViajes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(ModuloViajes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(ModuloViajes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(ModuloViajes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new ModuloViajes().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> LugarFinal;
    private javax.swing.JComboBox<String> LugarInicio;
    private javax.swing.JButton buscarConductor;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextField txt_idConductor;
    private javax.swing.JTextField txt_lugarfinal;
    private javax.swing.JTextField txt_lugarinicio;
    private javax.swing.JTextField txt_nombreConductor;
    private javax.swing.JButton verConductores;
    private javax.swing.JButton verLugares;
    // End of variables declaration//GEN-END:variables
}
