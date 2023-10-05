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
       pro.eliminarProveedor(1);
//       Alumno juan=new Alumno(5,22312312,"Julio","Cezar",LocalDate.of(1999, 5, 27),true);
//       AlumnoData alu=new AlumnoData();
//       alu.guardarAlumno(juan);
        
    }
    
}
