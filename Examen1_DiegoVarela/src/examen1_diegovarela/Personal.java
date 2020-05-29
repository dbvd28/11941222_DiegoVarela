/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1_diegovarela;

/**
 *
 * @author diego
 */
public class Personal extends Persona {
    private String ocupacion;
    private String horario;
    private int semanas;
    private int sueldo;

    public Personal(String ocupacion, String horario, int semanas, int sueldo, int id, String nombre, int edad, String sexo, String estado, double altura, double peso) {
        super(id, nombre, edad, sexo, estado, altura, peso);
        this.ocupacion = ocupacion;
        this.horario = horario;
        this.semanas = semanas;
        this.sueldo = sueldo;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public int getSemanas() {
        return semanas;
    }

    public void setSemanas(int semanas) {
        this.semanas = semanas;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }
    
}
