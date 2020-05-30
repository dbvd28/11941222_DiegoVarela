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
public class Objetos {
    private Color color;
    private String descripcion;
    private String marca;
    private String tamaño;
    private String calidad;
    private Persona persona;

    public Objetos(Color color, String descripcion, String marca, String tamaño, String calidad, Persona persona) {
        this.color = color;
        this.descripcion = descripcion;
        this.marca = marca;
        this.tamaño = tamaño;
        this.calidad = calidad;
        this.persona = persona;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public String getCalidad() {
        return calidad;
    }

    public void setCalidad(String calidad) {
        this.calidad = calidad;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    @Override
    public String toString() {
        return    marca + ", persona=" + persona + '}';
    }
    
}
