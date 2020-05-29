/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1_diegovarela;

import java.awt.Color;

/**
 *
 * @author diego
 */
public class Hogar extends Objetos {
    private String descripcioncasa;
    private String instrucciones;
    private int garantia;

    public Hogar(String descripcioncasa, String instrucciones, int garantia, Color color, String descripcion, String marca, String tamaño, String calidad, Persona persona) {
        super(color, descripcion, marca, tamaño, calidad, persona);
        this.descripcioncasa = descripcion;
        this.instrucciones = instrucciones;
        this.garantia = garantia;
    }

    public String getDescripcioncasa() {
        return descripcioncasa;
    }

    public void setDescripcioncasa(String descripcion) {
        this.descripcioncasa = descripcion;
    }

    public String getInstrucciones() {
        return instrucciones;
    }

    public void setInstrucciones(String instrucciones) {
        this.instrucciones = instrucciones;
    }

    public int getGarantia() {
        return garantia;
    }

    public void setGarantia(int garantia) {
        this.garantia = garantia;
    }
    
}
