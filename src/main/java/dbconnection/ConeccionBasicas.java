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
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author eduar
 */
public class ConeccionBasicas {
    
    public static void main(String[] args){
        ConeccionBasicas conexionBasicas = new ConeccionBasicas();
        conexionBasicas.MateriasBasicasTabla(3);
        
        
        
    }
    
    public void MateriasBasicasTabla(int columna){
        Dbconnectionjava coneccion_basicas = new Dbconnectionjava();
        String query = "SELECT * FROM Materias.Basicas";
        Connection conexion = coneccion_basicas.estableceConexion();
        Statement statement = null;
        
        try {
            statement = conexion.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
            
                System.out.println(resultSet.getString(columna));
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
    
    public List<AsignaturaInfo> obtenerInfoAsignaturasBasicas() {
        Dbconnectionjava conexionBasicas = new Dbconnectionjava();
        String query = "SELECT Codigo, Asignatura, Dia, Inicio, Fin, Aula, Dia2, Inicio2, Fin2, Aula2 FROM Materias.Basicas";
        Connection conexion = conexionBasicas.estableceConexion();
        List<AsignaturaInfo> asignaturasInfo = new ArrayList<>();
        
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            preparedStatement = conexion.prepareStatement(query);
            resultSet = preparedStatement.executeQuery();
            
            while (resultSet.next()) {
                AsignaturaInfo info = new AsignaturaInfo(
                    resultSet.getString("Codigo"),
                    resultSet.getString("Asignatura"),
                    resultSet.getString("Dia"),
                    resultSet.getString("Inicio"),
                    resultSet.getString("Fin"),
                    resultSet.getString("Aula"),
                    resultSet.getString("Dia2"),
                    resultSet.getString("Inicio2"),
                    resultSet.getString("Fin2"),
                    resultSet.getString("Aula2")
                );
                asignaturasInfo.add(info);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
                if (preparedStatement != null) {
                    preparedStatement.close();
                }
                conexionBasicas.desconectar();
            } catch (SQLException ex) {
                Logger.getLogger(ConeccionBasicas.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        return asignaturasInfo;
    }
}

class AsignaturaInfo {
    private String codigo;
    private String asignatura;
    private String dia;
    private String inicio;
    private String fin;
    private String aula;
    private String dia2;
    private String inicio2;
    private String fin2;
    private String aula2;

    public AsignaturaInfo(String codigo, String asignatura, String dia, String inicio, String fin, String aula, String dia2, String inicio2, String fin2, String aula2) {
        this.codigo = codigo;
        this.asignatura = asignatura;
        this.dia = dia;
        this.inicio = inicio;
        this.fin = fin;
        this.aula = aula;
        this.dia2 = dia2;
        this.inicio2 = inicio2;
        this.fin2 = fin2;
        this.aula2 = aula2;
    }

    @Override
    public String toString() {
        return "AsignaturaInfo{" +
                "codigo='" + codigo + '\'' +
                ", asignatura='" + asignatura + '\'' +
                ", dia='" + dia + '\'' +
                ", inicio='" + inicio + '\'' +
                ", fin='" + fin + '\'' +
                ", aula='" + aula + '\'' +
                ", dia2='" + dia2 + '\'' +
                ", inicio2='" + inicio2 + '\'' +
                ", fin2='" + fin2 + '\'' +
                ", aula2='" + aula2 + '\'' +
                '}';
    }
        
    
    
}
