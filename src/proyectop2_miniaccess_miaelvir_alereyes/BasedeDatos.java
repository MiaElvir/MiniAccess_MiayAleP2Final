/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectop2_miniaccess_miaelvir_alereyes;

import java.io.File;
import java.util.ArrayList;

/**
 *
 * @author aleja
 */
public class BasedeDatos {
    private String nombre;
    private ArrayList <File> tablas = new ArrayList();
    private ArrayList <File> scripts = new ArrayList();
    private ArrayList <Usuario> usuarios = new ArrayList();

    public BasedeDatos() {
    }

    public BasedeDatos(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<File> getTablas() {
        return tablas;
    }

    public void setTablas(ArrayList<File> tablas) {
        this.tablas = tablas;
    }

    public ArrayList<File> getScripts() {
        return scripts;
    }

    public void setScripts(ArrayList<File> scripts) {
        this.scripts = scripts;
    }

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(ArrayList<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
    
    
    
    
    
    
    
}
