/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UniversidadEjemplo.Entidades;

/**
 *
 * @author noelia
 */
public class Usuario {
    private String nombre;
    private String pasword ;
    private int restriccion;
    private int idUsuario;
    public Usuario() {
    }

    public Usuario(String nombre, String pasword, int restriccion) {
        this.nombre = nombre;
        this.pasword = pasword;
        this.restriccion = restriccion;
    }

    public Usuario(String nombre, String pasword, int restriccion, int idUsuario) {
        this.nombre = nombre;
        this.pasword = pasword;
        this.restriccion = restriccion;
        this.idUsuario = idUsuario;
    }

   

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPasword() {
        return pasword;
    }

    public void setPasword(String pasword) {
        this.pasword = pasword;
    }

    public int getRestriccion() {
        return restriccion;
    }

    public void setRestriccion(int restriccion) {
        this.restriccion = restriccion;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", pasword=" + pasword + ", restriccion=" + restriccion + ", idUsuario=" + idUsuario + '}';
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

   
}
