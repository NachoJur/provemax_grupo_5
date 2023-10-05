/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provemax_grupo_5.AccesoADatos;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import provemax_grupo_5.Entidades.Proveedor;

/**
 *
 * @author nacho
 */
public class ProveedorData {
    
    private Connection con=null; 
    
    public ProveedorData(){
        con=Conexion.getconexion();
    }
    public void guardarProveedor(Proveedor proveedor){
      String sql="INSERT INTO proveedor (razonSocial, domicilio, telefono)"+"VALUES(?,?,?)";
      try {
            PreparedStatement ps=con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setString(1,proveedor.getRazonSocial());
            ps.setString(2, proveedor.getDomicilio());
            ps.setString(3, proveedor.getTelefono());
            ps.executeUpdate();
            ResultSet rs=ps.getGeneratedKeys();
            if (rs.next()){
                
                proveedor.setIdProveedor(rs.getInt(1));
                JOptionPane.showMessageDialog(null,"proveedor guardado");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"error al acceder a la tabla proveedores"+ex.getMessage());
        }
        
    }
    
}
