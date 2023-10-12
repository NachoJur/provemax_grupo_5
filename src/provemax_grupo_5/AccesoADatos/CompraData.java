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


/**
 *
 * @author July
 */
public class CompraData {
    private Connection con = null;

    public CompraData() {
        con = Conexion.getconexion();
    }
    
    public void registrarCompra(Compra compra){
        String sql="INSERT INTO compra (idCompra, idProveedor, fecha)" + "VALUES(?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1,compra.getIdCompra());
            ps.setInt(2, compra.getProveedor().getIdProveedor());
            ps.setDate(3, Date.valueOf(compra.getFecha()));            
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                compra.setIdCompra(rs.getInt(1));;
                JOptionPane.showMessageDialog(null,"Compra Registrada");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al acceder a la tabla compra" + ex.getMessage());
        }
    }
    
    public void modificarCompra(Compra compra){
        String sql = "UPDATE compra SET proveedor = ?, fecha = ? WHERE idCompra = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1,compra.getIdCompra());
            ps.setObject(2,compra.getProveedor());
            ps.setDate(3, Date.valueOf(compra.getFecha()));            
            int exito = ps.executeUpdate();
            if (exito == 1) {
               JOptionPane.showMessageDialog(null, "Compra Modificada");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al acceder a la tabla compra" + ex.getMessage());
        }
    }
     
    public void cancelarCompra(Compra compra){
        String sql = "UPDATE compra SET idCompra = ? WHERE 1";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1,compra.getIdCompra());
            int fila = ps.executeUpdate();
            if (fila == 1) {
               JOptionPane.showMessageDialog(null, "Compra Cancelada");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al acceder a la tabla compra" + ex.getMessage());
        }
    }
    
    public List<Compra> obtenerCompra(int idCompra){
        String sql = "SELECT * FROM compra WHERE idCompra = ?";
        ArrayList<Compra> realizadas = new ArrayList<>();
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idCompra);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Compra comp = new Compra();
                comp.setIdCompra(rs.getInt("idCompra"));
                realizadas.add(comp);
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error al acceder a la tabla compra" + ex.getMessage());
        }
        return realizadas;
    }
}
