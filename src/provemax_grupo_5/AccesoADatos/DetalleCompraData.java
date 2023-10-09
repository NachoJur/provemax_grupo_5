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
import provemax_grupo_5.Entidades.Compra;

/**
 *
 * @author July
 */
public class DetalleCompraData {
    private Connection con = null;
    
    public DetalleCompraData (){
        con=Conexion.getconexion();
    }
    
    public void mostrarCompras(Compra compra){
        String sql = "INSERT INTO detallecompra (cantidad,precioCosto,idCompra,idProducto)" + "VALUES(?,?,?,?)";
        try {
            PreparedStatement ps=con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1,compra.getIdCompra());
            ps.setInt(2,compra.getProveedor().getIdProveedor());
            ps.setDate(3, Date.valueOf(compra.getFecha()));            
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
        } catch (SQLException ex) {
            Logger.getLogger(DetalleCompraData.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }
}
