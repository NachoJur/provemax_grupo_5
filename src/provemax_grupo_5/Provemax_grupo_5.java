/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provemax_grupo_5;


import java.time.LocalDate;
import provemax_grupo_5.AccesoADatos.CompraData;
import provemax_grupo_5.AccesoADatos.Conexion;
import provemax_grupo_5.AccesoADatos.DetalleCompraData;
import provemax_grupo_5.AccesoADatos.ProductoData;
import provemax_grupo_5.AccesoADatos.ProveedorData;
import provemax_grupo_5.Entidades.Compra;
import provemax_grupo_5.Entidades.DetalleCompra;
import provemax_grupo_5.Entidades.Proveedor;
import provemax_grupo_5.Entidades.Producto;

/**
 *
 * @author nacho
 */
public class Provemax_grupo_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Conexion.getconexion();
        Proveedor juan=new Proveedor(1,"Mucho mas","salta","2247932",true);
        //ProveedorData pro= new ProveedorData();
        //pro.guardarProveedor(juan);
        //Proveedor julia=new Proveedor(1,"Todo hogar","Av. Independencia","2245789",true);
        //pro.guardarProveedor(julia);
        //pro.modificarProveedor(juan);
        //pro.activarProveedor(2);
        //Proveedor proveedorEncontrado=pro.buscarProveedor(1);
//        if(proveedorEncontrado!=null){
//            System.out.println("razonsocial "+proveedorEncontrado.getRazonSocial());
//            System.out.println("domicilio "+proveedorEncontrado.getDomicilio());
//            System.out.println("telefono "+proveedorEncontrado.getTelefono());
//        }
        //pro.eliminarProveedor(1);
//        for (Proveedor proveedor:(pro.listarProveedores())){
//            System.out.println("razonsocial "+proveedor.getRazonSocial());
//            System.out.println("domicilio "+proveedor.getDomicilio());
//            System.out.println("telefono "+proveedor.getTelefono());
//        }
        Compra com= new Compra(1,juan,LocalDate.of(1999, 5, 27));
        //CompraData cd= new CompraData();
        //cd.registrarCompra(com);
        //Producto pro=new Producto(3,"Maquina de Pochoclos","maquina que rinde para 6 personas",7.500,20,true);
        //ProductoData pd=new ProductoData();
        //pd.guardarProducto(pro);
        //pd.modificarUnProducto(pro);
        //Producto proencontrado=pd.buscarProducto(1);
//        if(proencontrado!=null){
//            System.out.println("te encontre!");
//            System.out.println("id ");
//        }
        Producto pro=new Producto(3,"Heladera puerta doble","heladera con freezer",10.500,20,true);
        //pd.guardarProducto(pro);
        DetalleCompra det= new DetalleCompra(3,15.99,com,pro,true);
        DetalleCompraData dcd=new DetalleCompraData();
        dcd.agregarDetallecompra(det);
        //dcd.modificarDetallecompra(det);
        //DetalleCompra detalleEncontrado=dcd.buscarDetalleCompra(4);
//        if(detalleEncontrado!=null){
//            System.out.println("idDetalle: "+detalleEncontrado.getIdDetalle());
//            System.out.println("cantidad: "+detalleEncontrado.getCantidad());
//            System.out.println("cantidad: "+detalleEncontrado.getCantidad());
//            System.out.println("idcompra: "+detalleEncontrado.getCompra().getIdCompra());
//            System.out.println("idproducto: "+detalleEncontrado.getProducto().getIdProducto());
//        }           
//        for (DetalleCompra detalle: (dcd.obtenerDetalles())){
//            System.out.println("idDetalle: "+detalle.getIdDetalle());
//            System.out.println("cantidad: "+detalle.getCantidad());
//            System.out.println("cantidad: "+detalle.getCantidad());
//            System.out.println("idcompra: "+detalle.getCompra().getIdCompra());
//            System.out.println("idproducto: "+detalle.getProducto().getIdProducto());
//        }
    }
}


