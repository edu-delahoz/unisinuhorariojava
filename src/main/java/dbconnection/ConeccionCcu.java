/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dbconnection;

import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author eduar
 */
public class ConeccionCcu {
    
    public List<String> obtenerAsignaturas() {
        Dbconnectionjava conexionCcu = new Dbconnectionjava();
        Connection conexion = conexionCcu.estableceConexion();
        List<String> asignaturas = new ArrayList<>();

        try {
            String query = "SELECT Asignatura FROM Materias.Ccu";
            PreparedStatement preparedStatement = conexion.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                String asignatura = resultSet.getString("Asignatura");
                asignaturas.add(asignatura);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (conexion != null) {
                    conexion.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(ConeccionCcu.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return asignaturas;
    }
    
    
    
}
