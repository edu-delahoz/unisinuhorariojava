/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;





/**
 *
 * @author eduar
 */
public class Dbconnectionjava {
    
    Connection conectar;
    
    String url = "jdbc:mysql://horariojava.cwcwxvkvu3pq.us-east-2.rds.amazonaws.com:3306";
    String usuario = "admin";   
    String password = "Eduardo.de.v";
    String bd = "Materias";
    String puerto = "3606";
    String cadena = "jdbc:mysql://"+url+":"+puerto+"/"+bd;

    public Connection estableceConexion(){
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); 
            conectar = DriverManager.getConnection(url, usuario, password);
            System.out.println("Conectado");
            
        } catch (Exception e) {
            System.out.println("La conexion fallo: " + e.toString());
        }
        return conectar;
    }
    
    public void desconectar() throws SQLException {
        if (conectar != null && !conectar.isClosed()) {
            conectar.close();
        }
    }
    
    
        
}
    
   
    
   
    
   
        
        
    
    
    
