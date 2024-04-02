/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectop2_miniaccess_miaelvir_alereyes;

import java.util.ArrayList;

/**
 *
 * @author aleja
 */
public class Usuario {
    private String usuario, contrasenia;
    private ArrayList<String> permisos = new ArrayList<>(); 
    private ArrayList<String> bases = new ArrayList<>();
    
    
    public Usuario() {
    }

    public Usuario(String usuario, String contrasenia) {
        this.usuario = usuario;
        this.contrasenia = contrasenia;
    }


    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public ArrayList<String> getPermisos() {
        return permisos;
    }

    public void setPermisos(ArrayList<String> permisos) {
        this.permisos = permisos;
    }

    public ArrayList<String> getBases() {
        return bases;
    }

    public void setBases(ArrayList<String> bases) {
        this.bases = bases;
    }
    
    

    @Override
    public String toString() {
        return "Usuario{" + "usuario=" + usuario + ", contrasenia=" + contrasenia + '}';
    }
    
    
    
}
