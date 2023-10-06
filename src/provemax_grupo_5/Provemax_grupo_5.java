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
       //pro.activarProveedor(1);
      Proveedor proveedorEncontrado=pro.buscarProveedor(1);
      if(proveedorEncontrado!=null){
          System.out.println("razonsocial "+proveedorEncontrado.getRazonSocial());
      }
       //pro.eliminarProveedor(1);
//    Alumno alumnoEncontrado=alu.buscarAlumnopordni(22312312);
//    if(alumnoEncontrado!=null){
//        System.out.println("DNI: "+alumnoEncontrado.getDNI());
//        System.out.println("Apellido: "+alumnoEncontrado.getApellido());
//        System.out.println("Nombre: "+alumnoEncontrado.getNombre());
//        System.out.println("fechaNacimiento: "+alumnoEncontrado.getFechaNac());
//    }else{
        
    }
    
}
