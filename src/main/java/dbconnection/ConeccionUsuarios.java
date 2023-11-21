/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dbconnection;

import java.sql.Connection;
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
        // Query para buscar al usuario por nombre de usuario y contraseña
        String query = "SELECT * FROM Usuarios.Usuarios WHERE Usuario = '" + username + "' AND Contraseña = '" + password + "'";
        statement = conexion.createStatement();
        ResultSet resultSet = statement.executeQuery(query);

        // Si se encuentra un resultado, las credenciales son válidas
        return resultSet.next();
    } catch (SQLException e) {
        // Manejar la excepción (puedes imprimir un mensaje de error o lanzar una excepción)
        e.printStackTrace();
        return false;
    } finally {
        // Asegurarse de cerrar la conexión y el statement
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

}
