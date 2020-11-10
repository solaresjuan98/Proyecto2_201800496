/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author juan333
 */
public class Viaje {

    int id_viaje;
    String lugar_inicio, lugar_final;
    String fecha;

    public Viaje(int id_viaje, String lugar_inicio, String lugar_final, String fecha) {

        this.id_viaje = id_viaje;
        this.lugar_inicio = lugar_inicio;
        this.lugar_final = lugar_final;
        this.fecha = fecha;
    }
//
//    public Viaje(int i, String inicio, String afinal, String fecha) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

    public int getId_viaje() {
        return id_viaje;
    }

    public void setId_viaje(int id_viaje) {
        this.id_viaje = id_viaje;
    }

    public String getLugar_inicio() {
        return lugar_inicio;
    }

    public void setLugar_inicio(String lugar_inicio) {
        this.lugar_inicio = lugar_inicio;
    }

    public String getLugar_final() {
        return lugar_final;
    }

    public void setLugar_final(String lugar_final) {
        this.lugar_final = lugar_final;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

}
