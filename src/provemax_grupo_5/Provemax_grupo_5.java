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
       
       //Proveedor juan=new Proveedor(1,"los pollos hermanos","New Mexico","450450",true);
       //ProveedorData pro= new ProveedorData();
       //pro.guardarProveedor(juan);
       //pro.modificarProveedor(juan);
       //pro.activarProveedor(2);
//      Proveedor proveedorEncontrado=pro.buscarProveedor(1);
//      if(proveedorEncontrado!=null){
//          System.out.println("razonsocial "+proveedorEncontrado.getRazonSocial());
//          System.out.println("domicilio "+proveedorEncontrado.getDomicilio());
//          System.out.println("telefono "+proveedorEncontrado.getTelefono());
//      }
       //pro.eliminarProveedor(1);
//       for (Proveedor proveedor:(pro.listarProveedores())){
//           System.out.println("razonsocial "+proveedor.getRazonSocial());
//          System.out.println("domicilio "+proveedor.getDomicilio());
//         System.out.println("telefono "+proveedor.getTelefono());
//       }
        //Compra com= new Compra(1,juan,LocalDate.of(1999, 5, 27));
//        CompraData cd= new CompraData();
//        cd.registrarCompra(com);
           // Producto pro=new Producto(3,"POCHOCLOS DE POLLO","palomitas de pollo esfericas",3.99,20,true);
            //ProductoData pd=new ProductoData();
            //pd.guardarProducto(pro);
            //pd.modificarUnProducto(pro);
//            Producto proencontrado=pd.buscarProducto(1);
//            if(proencontrado!=null){
//                System.out.println("te encontre!");
//            }
           //DetalleCompra det= new DetalleCompra(3,15.99,com,pro,true);
           DetalleCompraData dcd=new DetalleCompraData();
           //dcd.agregarDetallecompra(det);
           //dcd.modificarDetallecompra(det);
//           DetalleCompra detalleEncontrado=dcd.buscarDetalleCompra(4);
//           if(detalleEncontrado!=null){
//               System.out.println("idDetalle: "+detalleEncontrado.getIdDetalle());
//               System.out.println("cantidad: "+detalleEncontrado.getCantidad());
//               System.out.println("cantidad: "+detalleEncontrado.getCantidad());
//               System.out.println("idcompra: "+detalleEncontrado.getCompra().getIdCompra());
//              System.out.println("idproducto: "+detalleEncontrado.getProducto().getIdProducto());
//          }
//           
            for (DetalleCompra detalle: (dcd.obtenerDetalles())){
                System.out.println("idDetalle: "+detalle.getIdDetalle());
                System.out.println("cantidad: "+detalle.getCantidad());
                System.out.println("cantidad: "+detalle.getCantidad());
                System.out.println("idcompra: "+detalle.getCompra().getIdCompra());
                System.out.println("idproducto: "+detalle.getProducto().getIdProducto());
            }

    }
   // Proveedor juan=new Proveedor(1,"Samsung","Av.Cordoba 1540","450450",true);
   // ProveedorData pro= new ProveedorData();
    //pro.guardarProveedor(juan);
//        pro.modificarProveedor(juan);
//        pro.activarProveedor(2);
        
//        Proveedor proveedorEncontrado=pro.buscarProveedor(1);
//        if(proveedorEncontrado!=null){
//            System.out.println("razonsocial "+proveedorEncontrado.getRazonSocial());
//            System.out.println("domicilio "+proveedorEncontrado.getDomicilio());
//            System.out.println("telefono "+proveedorEncontrado.getTelefono());
//        }
//        pro.eliminarProveedor(1);
//        for (Proveedor proveedor:(pro.listarProveedores())){
//            System.out.println("razonsocial " + proveedor.getRazonSocial());
//            System.out.println("domicilio " + proveedor.getDomicilio());
//            System.out.println("telefono " + proveedor.getTelefono());
//        }
//        Compra k = new Compra(1,);
//        CompraData h = new CompraData();
}


