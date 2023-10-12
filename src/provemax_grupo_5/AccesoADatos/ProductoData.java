package provemax_grupo_5.AccesoADatos;

import com.sun.javafx.scene.control.skin.VirtualFlow;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
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
        String sql = "INSERT INTO producto ( nombreProducto, descripcion, precioActual, stock, estado)" + " VALUES (?,?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
            ps.setString(1, producto.getNombreProducto());
            ps.setString(2, producto.getDescripcion());
            ps.setDouble(3, producto.getPrecioActual());
            ps.setInt(4, producto.getStock());
            ps.setBoolean(5, producto.isEstado());
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

    public void modificarUnProducto(Producto producto) {
        String sql = "UPDATE producto SET  nombreProducto=?, descripcion=?, precioActual=?, stock=?, estado=? WHERE idProducto=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setString(1, producto.getNombreProducto());
            ps.setString(2, producto.getDescripcion());
            ps.setDouble(3, producto.getPrecioActual());
            ps.setInt(4, producto.getStock());
            ps.setBoolean(5, producto.isEstado());
            ps.setInt(6, producto.getIdProducto());

            int exito = ps.executeUpdate();
            if (exito == 1) {
                mensaje("Producto modificado");
            }
        } catch (SQLException ex) {
            mensaje("Producto modificado");
        }
    }

    public Producto buscarProducto(int id) {

        String sql = "SELECT nombreProducto, descripcion, precioActual, stock FROM producto WHERE idProducto = ? AND estado = 1";
        Producto producto = null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                producto = new Producto();
                producto.setIdProducto(id);
                producto.setNombreProducto(rs.getString("nombreProducto"));
                producto.setDescripcion(rs.getString("descripcion"));
                producto.setPrecioActual(rs.getDouble("precioActual"));
                producto.setStock(rs.getInt("stock"));
                producto.setEstado(true);
            } else {
                mensaje("No existe ese producto");
            }
            ps.close();
        } catch (SQLException ex) {
            mensaje("Error al acceder a la tabla de productos");
        }
        return producto;
    }

    public void eliminarProducto(int idProducto) {
        String sql = "UPDATE producto SET estado = 0 WHERE idProducto = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idProducto);
            int fila = ps.executeUpdate();

            if (fila == 1) {
                mensaje("Se elimino el producto");
            }
            ps.close();
        } catch (SQLException ex) {
            mensaje("Error al acceder a la tabla productos");
        }
    }

    public List<Producto> listarProductos() {
        List<Producto> productos = new ArrayList<Producto>();
        try {
            String sql = "SELECT * FROM producto WHERE estado = 1";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Producto producto = new Producto();
                producto.setIdProducto(rs.getInt("idProducto"));
                producto.setNombreProducto(rs.getString("nombreProducto"));
                producto.setDescripcion(rs.getString("descripcion"));
                producto.setPrecioActual(rs.getDouble("precioActual"));
                producto.setStock(rs.getInt("stock"));
                producto.setEstado(rs.getBoolean("estado"));
                productos.add(producto);
            }
            ps.close();
        } catch (SQLException ex) {
            mensaje("Error al acceder a la tabla de productos");
        }
        return productos;
    }

    public void consultarStock(int idProducto) {
        int stock = 0;
        String nombreProducto = "";
        String sql = "SELECT stock, nombreProducto FROM producto WHERE idProducto = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idProducto);// Se asigna el valor del idProducto al primer parámetro de la sentencia SQL
            ResultSet rs = ps.executeQuery();

            if (rs.next()) { // Si hay un resultado, se asignan los valores a las variables
                stock = rs.getInt("stock");
                nombreProducto = rs.getString("nombreProducto");
            }
            ps.close();
            
            if (stock < 3) { // Se verifica si el stock es menor a 3
                mensaje("El electrodomestico " + nombreProducto + " tiene un stock por debajo del minimo establecido: " + stock + " unidades");
            }
        } catch (SQLException ex) {
            mensaje("Error al acceder a la tabla de productos");
        }

    }
}
