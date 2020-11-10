/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructuras;

import Clases.Viaje;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author juan333
 */
public class ArbolB_Viajes extends ArbolB {

    ArrayList<Viaje> listaViajes = new ArrayList<>();
    ;

    int id_viaje;// = listaViajes.size();

    public ArbolB_Viajes(int t) {
        super(t);
        id_viaje = listaViajes.size() + 1;

    }

    public void AgregarViaje(Viaje v) {

        //v.setId_viaje(listaViajes.size() +1);// le setea el id del viaje (automatico) 
        if (!ExisteViaje(v.getId_viaje())) {
            this.insertar(v.getId_viaje());
            listaViajes.add(v);
            this.id_viaje++;

        } else {

            JOptionPane.showMessageDialog(null, "El viaje con el id " + v.getId_viaje() + " ya existe");
        }

    }

    private boolean ExisteViaje(int id) {

        boolean encontrado = false;

        for (Viaje v : listaViajes) {

            if (v.getId_viaje() == id) {
                encontrado = true;
                System.out.println(" >> Encontrado");
                return true;

            }
        }

        return encontrado;
    }

    public int getId_viaje() {
        return id_viaje;
    }

    public void setId_viaje(int id_viaje) {
        this.id_viaje = id_viaje;
    }

    public void GraficarArbolViajes() {

        StringBuilder cadena = new StringBuilder();

        cadena.append("digraph G {\n");
        cadena.append("node[shape=record];\n");
        cadena.append("node[shape=record color=blue style=filled, fillcolor=\"green\", gradientangle=90];\n");

        cadena.append(raiz.GraficarNodoViaje(listaViajes));

        cadena.append("}\n");

        FileWriter fichero = null;
        PrintWriter pw = null;

        try {

            fichero = new FileWriter("./graficaArbolBViajes.dot");
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
                String cmd = "dot -Tpdf ./graficaArbolBViajes.dot -o graficaArbolBViajes.pdf";
                Runtime.getRuntime().exec(cmd);
            } catch (IOException i) {
                System.out.println("f");
            }
        }

    }

}
