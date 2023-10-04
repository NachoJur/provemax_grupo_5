package provemax_grupo_5.AccesoADatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import provemax_grupo_5.Entidades.Producto;

public class ProductoData {

    private Connection con = null;

    private void mensaje(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje);
    }

    public ProductoData() {
        con = Conexion.getconexion();
    }

    public void guardarProducto(Producto producto) {
        String sql = "INSERT INTO producto (idProducto, nombreProducto, descripcion, precioActual, stock, estado)" + " VALUES (?,?,?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, producto.getIdProducto());
            ps.setString(2, producto.getNombreProducto());
            ps.setString(3, producto.getDescripcion());
            ps.setDouble(4, producto.getPrecioActual());
            ps.setInt(5, producto.getStock());
            ps.setBoolean(6, producto.isEstado());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                producto.setIdProducto(rs.getInt(1));
                mensaje("Producto guardado");
            }
            ps.close();

        } catch (SQLException ex) {
            mensaje("Error al acceder a la tabla de productos");
        }
    }
    
    public void modificarUnProducto(Producto producto){
        String sql = "UPDATE producto SET idProducto=?, nombreProducto=?, descripcion=?, precioActual=?, stock=?, estado=? WHERE 1";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, producto.getIdProducto());
            ps.setString(2, producto.getNombreProducto());
            ps.setString(3, producto.getDescripcion());
            ps.setDouble(4, producto.getPrecioActual());
            ps.setInt(5, producto.getStock());
            ps.setBoolean(6, producto.isEstado());
            
            int exito = ps.executeUpdate();
            if (exito == 1){
                mensaje("Producto modificado");
            }
        } catch (SQLException ex) {
            mensaje("Producto modificado");
        }
    }
}
