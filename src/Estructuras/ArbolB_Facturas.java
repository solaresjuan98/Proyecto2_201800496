/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructuras;

import Clases.Factura;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author juan333
 */
public class ArbolB_Facturas extends ArbolB {

    ArrayList<Factura> lista_facturas;
    int id_viaje;

    public ArbolB_Facturas(int t) {
        super(t);
        lista_facturas = new ArrayList<>();
        id_viaje = lista_facturas.size() + 1;
    }

    public void agregarFactura(Factura f) {

        if (!facturaExiste(f.getId_pago())) {
            this.insertar(f.getId_pago());
            lista_facturas.add(f);
            this.id_viaje++;
        } else {
            //System.out.println(" ZZ n");
            JOptionPane.showMessageDialog(null, "La factura  " + f.getId_pago() + " ya existe");
        }

    }

    public void mostrarFacturas() {

        System.out.println("\n");
        lista_facturas.forEach((factura) -> {

            System.out.println(" >> id: " + factura.getId_pago() + "  Precio: " + factura.getMonto());
        });
    }

    public boolean facturaExiste(int id) {

        boolean encontrado = false;

        for (Factura f : lista_facturas) {

            if (f.getId_pago() == id) {
                encontrado = true;
                System.out.println(" >> Encontrado");
                return true;

            }
        }

        return encontrado;
    }

    public void GraficarArbolFacturas() {

        StringBuilder cadena = new StringBuilder();

        cadena.append("digraph G {\n");
        cadena.append("node[shape=record];\n");
        cadena.append("node[shape=record color=blue style=filled, fillcolor=\"azure2\", gradientangle=90];\n");

        cadena.append(raiz.GraficarNodoTransaccion(lista_facturas));

        cadena.append("}\n");

        FileWriter fichero = null;
        PrintWriter pw = null;

        try {

            fichero = new FileWriter("./graficaArbolBFacturas.dot");
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
                String cmd = "dot -Tpdf ./graficaArbolBFacturas.dot -o graficaArbolBFacturas.pdf";
                Runtime.getRuntime().exec(cmd);
            } catch (IOException i) {
                System.out.println("f");
            }
        }

    }

    public int getId_viaje() {
        return id_viaje;
    }

    public void setId_viaje(int id_viaje) {
        this.id_viaje = id_viaje;
    }

    public ArrayList<Factura> getLista_facturas() {
        return lista_facturas;
    }

    public void setLista_facturas(ArrayList<Factura> lista_facturas) {
        this.lista_facturas = lista_facturas;
    }

}
