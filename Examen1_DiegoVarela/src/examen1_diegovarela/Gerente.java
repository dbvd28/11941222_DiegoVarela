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
public class Gerente extends Persona {
    private String usuario;
    private String contraseña;
    private String cargo;

    public Gerente(String usuario, String contraseña, String cargo, int id, String nombre, int edad, String sexo, String estado, double altura, double peso) {
        super(id, nombre, edad, sexo, estado, altura, peso);
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.cargo = cargo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
}
