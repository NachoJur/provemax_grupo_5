/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provemax_grupo_5.Entidades;

import java.time.LocalDate;

/**
 *
 * @author nacho
 */
public class Compra {
    private int idCompra;
    private Proveedor proveedor;
    private LocalDate fecha;

    public Compra(Proveedor proveedor, LocalDate fecha) {
        this.proveedor = proveedor;
        this.fecha = fecha;
    }

    public Compra() {
    }

    public Compra(int idCompra, Proveedor proveedor, LocalDate fecha) {
        this.idCompra = idCompra;
        this.proveedor = proveedor;
        this.fecha = fecha;
    }

    public int getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(int idCompra) {
        this.idCompra = idCompra;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "idCompra=" + idCompra + " fecha=" + fecha;
    }
    
}
