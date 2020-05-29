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
public class Zapatos extends Objetos{
    private int talla;
    private String suela;
    private int comodidad;

    public Zapatos(int talla, String suela, int comodidad, Color color, String descripcion, String marca, String tamaño, String calidad, Persona persona) {
        super(color, descripcion, marca, tamaño, calidad, persona);
        this.talla = talla;
        this.suela = suela;
        this.setComodidad(comodidad);
    }

    public int getTalla() {
        return talla;
    }

    public void setTalla(int talla) {
        this.talla = talla;
    }

    public String getSuela() {
        return suela;
    }

    public void setSuela(String suela) {
        this.suela = suela;
    }

    public int getComodidad() {
        return comodidad;
    }

    public void setComodidad(int comodidad) {
       if(comodidad<1&&comodidad>10){
        this.comodidad = comodidad;
       }
    }
    
}
