/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Lizeth1304
 */
public class Usuario {
    int idUsuarios;
    String nombre,contrasena;

    public Usuario() {
    }

    public Usuario(int idUsuarios, String nombre, String contrasena//String tipo//
    ) {
        this.idUsuarios = idUsuarios;
        this.nombre = nombre;
        this.contrasena = contrasena;
//        this.tipo = tipo;
    }

    public int getIdUsuarios() {
        return idUsuarios;
    }

    public void setIdUsuarios(int idUsuarios) {
        this.idUsuarios = idUsuarios;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
    

   
    
}
