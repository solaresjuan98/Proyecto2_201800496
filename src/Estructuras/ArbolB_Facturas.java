/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructuras;

import Clases.Factura;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author juan333
 */
public class ArbolB_Facturas extends ArbolB {

    ArrayList<Factura> lista_facturas = new ArrayList<>();

    public ArbolB_Facturas(int t) {
        super(t);
    }

    public void agregarUsuario(Factura f) {

        if (!facturaExiste(f.getId_pago())) {
            this.insertar(f.getId_pago());
            lista_facturas.add(f);
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

}
