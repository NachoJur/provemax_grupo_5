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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import provemax_grupo_5.Entidades.Compra;
import provemax_grupo_5.Entidades.DetalleCompra;

/**
 *
 * @author July
 */
public class DetalleCompraData {
    private Connection con = null;
    
    public DetalleCompraData (){
        con=Conexion.getconexion();
    }
    
    public void agregarDetallecompra(DetalleCompra detalleCompra){
        String sql = "INSERT INTO detallecompra (cantidad,precioCosto,idCompra,idProducto,estado)" + "VALUES(?,?,?,?,?)";
        try {
            PreparedStatement ps=con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1,detalleCompra.getCantidad());
            ps.setDouble(2,detalleCompra.getPrecioCosto());
            ps.setInt(3,detalleCompra.getCompra().getIdCompra());
            ps.setInt(4,detalleCompra.getProducto().getIdProducto());
            ps.setBoolean(5,detalleCompra.isEstado());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
        if (rs.next()){
                
                detalleCompra.setIdDetalle(rs.getInt(1));
                JOptionPane.showMessageDialog(null,"detalle de compra agregada");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"error al acceder al detalle compra"+ex.getMessage());
        }
    }
}
