/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mapa;

import com.teamdev.jxmaps.ControlPosition;
import com.teamdev.jxmaps.LatLng;
import com.teamdev.jxmaps.Map;
import com.teamdev.jxmaps.MapOptions;
import com.teamdev.jxmaps.MapReadyHandler;
import com.teamdev.jxmaps.MapStatus;
import com.teamdev.jxmaps.MapTypeControlOptions;
import com.teamdev.jxmaps.MapViewOptions;
import com.teamdev.jxmaps.Marker;
import com.teamdev.jxmaps.Polyline;
import com.teamdev.jxmaps.swing.MapView;
import java.awt.BorderLayout;
import java.util.concurrent.TimeUnit;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

/**
 *
 * @author juan333
 */
public class Mapa extends MapView {

    private Map map;

    public Mapa(MapViewOptions options) {
        super(options);
        setOnMapReadyHandler((MapStatus ms) -> {
           
            if (ms == MapStatus.MAP_STATUS_OK) {
                map = getMap();
                MapOptions mapOptions = new MapOptions();
                MapTypeControlOptions mt = new MapTypeControlOptions();
                mt.setPosition(ControlPosition.BOTTOM_LEFT);
                mapOptions.setMapTypeControlOptions(mt);
                map.setOptions(mapOptions);
                map.setCenter(new LatLng(14.533199, -90.585043));
                map.setZoom(15);
                
            }
        });

        System.out.println(" Esperando a que se genere el mapa");
        try {
            for (int i = 0; i < 5; i++) {
                TimeUnit.SECONDS.sleep(1);
                System.out.println("...");
            }
        } catch (Exception e) {
            System.out.println("Hubo un error :(");
        }

        System.out.println("Generado :)");
    }

    public void Renderizar(Mapa mapa) {

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        frame.setSize(1000, 800);
        frame.setLocationRelativeTo(null);
        frame.add(mapa, BorderLayout.CENTER);
        frame.setVisible(true);

    }
    
    public Marker agregarMarcador(LatLng coordenada){
        
        Marker marcador = new Marker(map);
        marcador.setPosition(coordenada);
        map.setCenter(coordenada);
        System.out.println("Marcador agregado :DDD");
        return marcador;
        
    }
    
    public void agregarLinea(LatLng inicio, LatLng fin, boolean marcador){
        
        LatLng[] linea = {inicio, fin};
        Polyline pl = new Polyline(map);
        pl.setPath(linea);
        
        if(marcador){
            agregarMarcador(inicio);
            agregarMarcador(fin);
        }
    }
    
    public void agregarGrafo(LatLng[] camino, boolean marcador){
        
        Polyline pl  = new Polyline(map);
        pl.setPath(camino);
        
        if(marcador){
            for(LatLng c : camino){
                agregarMarcador(c);
            }
        }
    }
}
