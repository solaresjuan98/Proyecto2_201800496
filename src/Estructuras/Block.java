/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructuras;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author juan333
 */
public class Block {

    private int indice;
    private String hash;
    private String hashPrevio;
    private String data; // Cambiar por el objeto luego
    private long fecha;
    private int nonce;

    public Block(String data, String hashPrevio, long fecha) {

        this.data = data;
        this.hashPrevio = hashPrevio;
        this.fecha = fecha;
        this.hashPrevio = calcularHashBlock();//metodo

    }

    public String calcularHashBlock() {
        // (falta indice) +  fecha + hash previo + data + nonce
        String dataHash = Long.toString(fecha) + hashPrevio + data + Integer.toString(nonce);

        MessageDigest digest = null;
        byte[] bytes = null;

        try {

            digest = MessageDigest.getInstance("SHA-256");
            bytes = digest.digest(dataHash.getBytes("UTF-8"));

        } catch (UnsupportedEncodingException | NoSuchAlgorithmException e) {
            System.out.println("Error al calcular el hash");
        }

        StringBuilder buffer = new StringBuilder();

        for (byte b : bytes) {
            buffer.append(String.format("%02x", b));

        }

        return buffer.toString();

    }
    
    public String minarBloque(int prefijo){
        
        String cadenaPrefijo = new String(new char[prefijo]).replace('\0', '0');
    
        while(!hash.substring(0, prefijo).equals(cadenaPrefijo)){
            
            nonce++;
            hash = calcularHashBlock();
        }
        
        
        return hash;
    
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public String getHashPrevio() {
        return hashPrevio;
    }

    public void setHashPrevio(String hashPrevio) {
        this.hashPrevio = hashPrevio;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
    
    
    

}
