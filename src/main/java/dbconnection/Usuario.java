/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dbconnection;

/**
 *
 * @author eduar
 */
public class Usuario {
    private String username;
    private String password;
    private String nombre;
    private String carrera;
    private String semestre;

    public Usuario(String username, String password, String nombre, String carrera, String semestre) {
        this.username = username;
        this.password = password;
        this.nombre = nombre;
        this.carrera = carrera;
        this.semestre = semestre;
    }

    public String getUsuario(){
        return username;
    }
    
    public String getPassword(){
        return password;
    }
    
    
    public String getNombre() {
        return nombre;
    }

    public String getCarrera() {
        return carrera;
    }

    public String getSemestre() {
        return semestre;
    }
}
