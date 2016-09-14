/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

/**
 *
 * @author kandskat
 */
public class D_Login {
    
    
    String idUsuario;
    String PwUsuario;
    String DsUsuario;
    String Usuario;

    public D_Login() {
    }

    public D_Login(String idUsuario, String PwUsuario, String DsUsuario, String Usuario) {
        this.idUsuario = idUsuario;
        this.PwUsuario = PwUsuario;
        this.DsUsuario = DsUsuario;
        this.Usuario = Usuario;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getPwUsuario() {
        return PwUsuario;
    }

    public void setPwUsuario(String PwUsuario) {
        this.PwUsuario = PwUsuario;
    }

    public String getDsUsuario() {
        return DsUsuario;
    }

    public void setDsUsuario(String DsUsuario) {
        this.DsUsuario = DsUsuario;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }
    
    
    
    
    
    
}
