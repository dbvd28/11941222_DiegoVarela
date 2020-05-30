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
public class Mensaje {
    private String receptor;
    private String mensaje;
    private String emisor;

    public Mensaje(String receptor, String mensaje, String emisor) {
        this.receptor = receptor;
        this.mensaje = mensaje;
        this.emisor = emisor;
    }

    public String getReceptor() {
        return receptor;
    }

    public void setReceptor(String receptor) {
        this.receptor = receptor;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getEmisor() {
        return emisor;
    }

    public void setEmisor(String emisor) {
        this.emisor = emisor;
    }

    @Override
    public String toString() {
        return "Mensaje{" + "mensaje=" + mensaje + '}';
    }
    
    
}
