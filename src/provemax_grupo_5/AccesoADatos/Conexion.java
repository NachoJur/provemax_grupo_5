/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provemax_grupo_5.AccesoADatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author nacho
 */
public class Conexion {
    private static final String URL="jdbc:mariadb://localhost/";
    private static final String DB="provemax_grupo_5";
    private static final String USUARIO="root";
    private static final String PASSWORD="";
    
    private static Connection connection;

    //metodo constructor
    private Conexion() {}
    
    public static Connection getconexion(){
        if (connection==null){
            try {
                Class.forName("org.mariadb.jdbc.Driver");
                //establece la conexion con la base de datos
                connection = DriverManager.getConnection(URL+DB,USUARIO,PASSWORD);
                JOptionPane.showMessageDialog(null,"conectado");

            } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null,"error de conexion con mariadb");
            } catch (SQLException ex) {
               JOptionPane.showMessageDialog(null,"error al conectarse a la base de datos");
            }
        }
        return connection;
    }
}
