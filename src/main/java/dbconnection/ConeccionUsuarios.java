/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dbconnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author eduar
 */
public class ConeccionUsuarios {
    
    
    
    
    
    public boolean verificarCredenciales(String username, String password) {
    Dbconnectionjava coneccion_usuarios = new Dbconnectionjava();
    Connection conexion = coneccion_usuarios.estableceConexion();
    Statement statement = null;

    try {
        String query = "SELECT * FROM Usuarios.Usuarios WHERE Usuario = '" + username + "' AND Contraseña = '" + password + "'";
        statement = conexion.createStatement();
        ResultSet resultSet = statement.executeQuery(query);

        return resultSet.next();
    } catch (SQLException e) {
        e.printStackTrace();
        return false;
    } finally {
            try {
                if (statement != null) {
                    statement.close();
                }
            coneccion_usuarios.desconectar();
            } catch (SQLException ex) {
                Logger.getLogger(ConeccionUsuarios.class.getName()).log(Level.SEVERE, null, ex);
                }
        }
    }

    public boolean agregarUsuario(String usuario, String contraseña, String nombre, String carrera, String semestre) {
        Dbconnectionjava coneccion_usuarios = new Dbconnectionjava();
        Connection conexion = coneccion_usuarios.estableceConexion();
        PreparedStatement preparedStatement = null;

        try {
            // Query para la inserción del nuevo usuario
            String query = "INSERT INTO Usuarios.Usuarios (Usuario, Contraseña, Nombre, Carrera, Semestre) VALUES (?, ?, ?, ?, ?)";
            preparedStatement = conexion.prepareStatement(query);

            // Establecer los valores de los parámetros
            preparedStatement.setString(1, usuario);
            preparedStatement.setString(2, contraseña);
            preparedStatement.setString(3, nombre);
            preparedStatement.setString(4, carrera);
            preparedStatement.setString(5, semestre);

            // Ejecutar la inserción
            int filasAfectadas = preparedStatement.executeUpdate();

            return filasAfectadas > 0; // Devuelve true si se insertó al menos una fila, false en caso contrario

        } catch (SQLException e) {
            // Manejar la excepción (puedes imprimir un mensaje de error o lanzar una excepción)
            e.printStackTrace();
            return false; // Devuelve false en caso de excepción
        } finally {
            // Asegurarse de cerrar la conexión y el preparedStatement
            try {
                if (preparedStatement != null) {
                    preparedStatement.close();
                }
                coneccion_usuarios.desconectar();
            } catch (SQLException ex) {
                Logger.getLogger(ConeccionUsuarios.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public Usuario obtenerInfoUsuario(String username, String password) {
        Dbconnectionjava coneccion_usuarios = new Dbconnectionjava();
        Connection conexion = coneccion_usuarios.estableceConexion();
        PreparedStatement preparedStatement = null;

        try {
            if (!verificarCredenciales(username, password)) {
                return null; 
            }

            String query = "SELECT Nombre, Carrera, Semestre FROM Usuarios.Usuarios WHERE Usuario = ?";
            preparedStatement = conexion.prepareStatement(query);
            preparedStatement.setString(1, username);

            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                String nombre = resultSet.getString("Nombre");
                String carrera = resultSet.getString("Carrera");
                String semestre = resultSet.getString("Semestre");

                return new Usuario(null,null, nombre, carrera, semestre);
            } else {
                return null; 
            }

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        } finally {
            try {
                if (preparedStatement != null) {
                    preparedStatement.close();
                }
                coneccion_usuarios.desconectar();
            } catch (SQLException ex) {
                Logger.getLogger(ConeccionUsuarios.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
