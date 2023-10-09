/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provemax_grupo_5;

import provemax_grupo_5.AccesoADatos.Conexion;
import provemax_grupo_5.AccesoADatos.ProveedorData;
import provemax_grupo_5.Entidades.Proveedor;

/**
 *
 * @author nacho
 */
public class Provemax_grupo_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Conexion.getconexion();
       
       //Proveedor juan=new Proveedor(1,"los pollos hermanos","nuevo mexico","450450",true);
       ProveedorData pro= new ProveedorData();
       //pro.guardarProveedor(juan);
       // pro.modificarProveedor(juan);
       //pro.activarProveedor(2);
//      Proveedor proveedorEncontrado=pro.buscarProveedor(1);
//      if(proveedorEncontrado!=null){
//          System.out.println("razonsocial "+proveedorEncontrado.getRazonSocial());
//          System.out.println("domicilio "+proveedorEncontrado.getDomicilio());
//          System.out.println("telefono "+proveedorEncontrado.getTelefono());
//      }
       //pro.eliminarProveedor(1);
       for (Proveedor proveedor:(pro.listarProveedores())){
           System.out.println("razonsocial "+proveedor.getRazonSocial());
          System.out.println("domicilio "+proveedor.getDomicilio());
         System.out.println("telefono "+proveedor.getTelefono());
       }

    }
    //        for (Alumno alumno:alu.listarAlumno()){
//            System.out.println(alumno.getDNI());
//            System.out.println(alumno.getApellido());
//            System.out.println(alumno.getNombre());
//            System.out.println(alumno.getFechaNac());
//        }
    
}
