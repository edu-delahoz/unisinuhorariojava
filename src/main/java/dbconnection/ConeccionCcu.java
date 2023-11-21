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
public class ConeccionCcu {
    public static void main(String[] args){
        ConeccionCcu conexionCcu = new ConeccionCcu();
        conexionCcu.CcuTabla();
        
        
        
    }
    
    public void CcuTabla(){
        Dbconnectionjava coneccion_Ccu = new Dbconnectionjava();
        String query = "SELECT * FROM Usuarios.Usuarios";
        Connection conexion = coneccion_Ccu.estableceConexion();
        Statement statement = null;
        
        try {
            statement = conexion.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
            
                System.out.println(resultSet.getString(1));
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
                coneccion_Ccu.desconectar();
            } catch (SQLException ex) {
                Logger.getLogger(ConeccionBasicas.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
}
