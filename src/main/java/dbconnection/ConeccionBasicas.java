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
public class ConeccionBasicas {
    
    public static void main(String[] args){
        ConeccionBasicas conexionBasicas = new ConeccionBasicas();
        conexionBasicas.MateriasBasicasTabla();
        
        
        
    }
    
    public void MateriasBasicasTabla(){
        Dbconnectionjava coneccion_basicas = new Dbconnectionjava();
        String query = "SELECT * FROM Materias.Basicas";
        Connection conexion = coneccion_basicas.estableceConexion();
        Statement statement = null;
        
        try {
            statement = conexion.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
            
                System.out.println(resultSet.getString(3));
            }
        } catch (Exception e) {
            try {
                if (statement != null) {
                    try {
                        statement.close();
                    } catch (SQLException ex) {
                        Logger.getLogger(ConeccionBasicas.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                coneccion_basicas.desconectar();
            } catch (SQLException ex) {
                Logger.getLogger(ConeccionBasicas.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
        
    
    
}
