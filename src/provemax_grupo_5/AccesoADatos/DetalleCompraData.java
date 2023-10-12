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
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import provemax_grupo_5.Entidades.Compra;
import provemax_grupo_5.Entidades.DetalleCompra;
import provemax_grupo_5.Entidades.Producto;
import provemax_grupo_5.AccesoADatos.CompraData;
import provemax_grupo_5.AccesoADatos.ProductoData;


/**
 *
 * @author July
 */
public class DetalleCompraData {
    private Connection con = null;
    private ProductoData prodata=new ProductoData();
    private CompraData comdata=new CompraData();
    
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
    public void modificarDetallecompra(DetalleCompra detalleCompra) {
       String sql = "UPDATE detallecompra SET cantidad = ?, precioCosto = ?, idCompra = ?,idProducto = ? WHERE idDetalle = ?";
       try {
           PreparedStatement ps = con.prepareStatement(sql);
           ps.setInt(1,detalleCompra.getCantidad());
           ps.setDouble(2,detalleCompra.getPrecioCosto());
           ps.setInt(3,detalleCompra.getCompra().getIdCompra());
           ps.setInt(4,detalleCompra.getProducto().getIdProducto());
           
           ps.setInt(5,detalleCompra.getIdDetalle());
           int exito = ps.executeUpdate();
           if (exito == 1) {
               JOptionPane.showMessageDialog(null, "Detalle Compra modificado");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Detalle Compra: " + ex.getMessage());
        }
       
    }
    public void eliminarDetallecompra(int idDetalle){
        String sql = "UPDATE detallecompra SET estado = 0 WHERE idDetalle = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idDetalle);
            int fila = ps.executeUpdate();
            
            if (fila == 1){
                JOptionPane.showMessageDialog(null,"Se elimino el Detalle Compra");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al acceder a la tabla Detalle Compra");
        }
        
    }
    public DetalleCompra buscarDetalleCompra (int id){
        String sql="SELECT cantidad,precioCosto,idCompra,idProducto,estado FROM detallecompra WHERE idDetalle = ? AND estado = 1";
        DetalleCompra detalle=null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs=ps.executeQuery();
            if (rs.next()){
                detalle=new DetalleCompra();
                detalle.setIdDetalle(id);
                detalle.setCantidad(rs.getInt("cantidad"));
                detalle.setPrecioCosto(rs.getDouble("precioCosto"));
                Compra com = comdata.buscarCompra(rs.getInt("idCompra"));
                detalle.setCompra(com);
                Producto pro= prodata.buscarProducto(rs.getInt("idProducto"));
                detalle.setProducto(pro);
                detalle.setEstado(true);
            }else{
                JOptionPane.showMessageDialog(null, "no existe ese detalle");
            }
            ps.close();    
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla detalle: " + ex.getMessage());
        }
        return detalle;
    
}
    public List<DetalleCompra> obtenerDetalles (){
        
        String sql = "SELECT idDetalle,cantidad,precioCosto,idCompra,idProducto FROM detallecompra WHERE estado = 1";
        ArrayList<DetalleCompra> detalles=new ArrayList<>();
        try{
            PreparedStatement ps = con.prepareStatement(sql);            
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                DetalleCompra det = new DetalleCompra();
                det.setIdDetalle(rs.getInt("idDetalle"));
                Compra com = comdata.buscarCompra(rs.getInt("idCompra"));
                det.setCompra(com);
                 Producto pro= prodata.buscarProducto(rs.getInt("idProducto"));
                det.setProducto(pro);
                det.setCantidad(rs.getInt("cantidad"));
                det.setPrecioCosto(rs.getDouble("precioCosto"));
                det.setEstado(true);
                detalles.add(det);
            }
            ps.close();
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null,"Error al acceder a la tabla Detalle Compra");
        
    } return detalles;
}
    
    
}

