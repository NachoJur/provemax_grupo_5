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
      String sql="INSERT INTO proveedor (razonSocial, domicilio, telefono,estado)"+"VALUES(?,?,?,?)";
      try {
            PreparedStatement ps=con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setString(1,proveedor.getRazonSocial());
            ps.setString(2, proveedor.getDomicilio());
            ps.setString(3, proveedor.getTelefono());
            ps.setBoolean(4,proveedor.isEstado());
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
    public void modificarProveedor(Proveedor proveedor) {
       String sql = "UPDATE proveedor SET razonSocial = ?, domicilio = ?, telefono = ?WHERE idProveedor = ?";
       try {
           PreparedStatement ps = con.prepareStatement(sql);
           ps.setString(1, proveedor.getRazonSocial());
           ps.setString(2, proveedor.getDomicilio());
           ps.setString(3, proveedor.getTelefono());
           
           ps.setInt(4,proveedor.getIdProveedor());
           int exito = ps.executeUpdate();
           if (exito == 1) {
               JOptionPane.showMessageDialog(null, "proveedor modificado");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla proveedores: " + ex.getMessage());
        }
    }
    
    public void eliminarProveedor(int idProveedor){
        String sql = "UPDATE proveedor SET estado = 0 WHERE idProveedor = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idProveedor);
            int fila = ps.executeUpdate();
            
            if (fila == 1){
                JOptionPane.showMessageDialog(null,"Se elimino el proveedor");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al acceder a la tabla proovedores");
        }
    }
    public void activarProveedor(int idProveedor){
        String sql = "UPDATE proveedor SET estado = 1 WHERE idProveedor = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idProveedor);
            int fila = ps.executeUpdate();
            
            if (fila == 1){
                JOptionPane.showMessageDialog(null,"Se reactivo el proveedor");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al acceder a la tabla proovedores");
        }
    }
    public Proveedor buscarProveedor (int id){
        String sql="SELECT razonSocial, domicilio, telefono,estado FROM proveedor WHERE idProveedor = ? AND estado = 1";
        Proveedor proveedor=null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs=ps.executeQuery();
            if (rs.next()){
                proveedor=new Proveedor();
                proveedor.setIdProveedor(id);
                proveedor.setRazonSocial(rs.getString("razonSocial"));
                proveedor.setDomicilio(rs.getString("domicilio"));
                proveedor.setTelefono(rs.getString("telefono"));
                proveedor.setEstado(true);
            }else{
                JOptionPane.showMessageDialog(null, "no existe ese proveedor");
            }
            ps.close();    
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla proveedores: " + ex.getMessage());
        }
        return proveedor;
    }
    public Proveedor buscarProveedorNE (int id){
        String sql="SELECT razonSocial, domicilio, telefono,estado FROM proveedor WHERE idProveedor = ? AND estado = 0";
        Proveedor proveedor=null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs=ps.executeQuery();
            if (rs.next()){
                proveedor=new Proveedor();
                proveedor.setIdProveedor(id);
                proveedor.setRazonSocial(rs.getString("razonSocial"));
                proveedor.setDomicilio(rs.getString("domicilio"));
                proveedor.setTelefono(rs.getString("telefono"));
                proveedor.setEstado(true);
            }else{
                JOptionPane.showMessageDialog(null, "no existe ese proveedor");
            }
            ps.close();    
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla proveedores: " + ex.getMessage());
        }
        return proveedor;
    }
    public List<Proveedor> listarProveedores() {
        String sql = "SELECT idProveedor, razonSocial, domicilio, telefono FROM proveedor WHERE estado = 1";
        ArrayList<Proveedor> proveedores = new ArrayList<>();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Proveedor proveedor = new Proveedor();
                proveedor.setIdProveedor(rs.getInt("idProveedor"));
                proveedor.setRazonSocial(rs.getString("razonSocial"));
                proveedor.setDomicilio(rs.getString("domicilio"));
                proveedor.setTelefono(rs.getString("telefono"));
                proveedor.setEstado(true);
                proveedores.add(proveedor);
                
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Proveedores: " + ex.getMessage());
        }
        return proveedores;
    } 
    
}
