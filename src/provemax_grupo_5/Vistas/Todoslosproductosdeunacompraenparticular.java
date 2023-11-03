/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provemax_grupo_5.Vistas;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import provemax_grupo_5.AccesoADatos.CompraData;
import provemax_grupo_5.AccesoADatos.DetalleCompraData;
import provemax_grupo_5.AccesoADatos.ProductoData;
import provemax_grupo_5.AccesoADatos.ProveedorData;
import provemax_grupo_5.Entidades.Compra;
import provemax_grupo_5.Entidades.DetalleCompra;
import provemax_grupo_5.Entidades.Producto;
import provemax_grupo_5.Entidades.Proveedor;

/**
 *
 * @author nacho
 */
public class Todoslosproductosdeunacompraenparticular extends javax.swing.JInternalFrame {

    public CompraData compData = new CompraData();
    public Compra compNueva = null;
    private DetalleCompraData deData= new DetalleCompraData();
    private DetalleCompra deActual= null;
    private List<Compra>listcom;
    private ArrayList<Compra>listc;
    private ProveedorData proData= new ProveedorData();
   private Proveedor proActual= null;
   private List<Proveedor>listaP;
   private List<Producto>listProd;
   private ArrayList <DetalleCompra> listaD;
    ProductoData prodDta = new ProductoData();
    private DefaultTableModel modelo;
    public Todoslosproductosdeunacompraenparticular() {
        initComponents();
        listcom=compData.listarCompras();
        cargarcompra();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jcbcompra = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Todos los productos de una compra");

        jcbcompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbcompraActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "PROVEEDOR", "PRODUCTO", "PRECIO", "CANTIDAD"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("SALIR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 583, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(185, 185, 185)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jcbcompra, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcbcompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jcbcompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbcompraActionPerformed
        Compra comSeleccionado = (Compra) jcbcompra.getSelectedItem();
    if (comSeleccionado == null) {
        return;
    }

    listaD = (ArrayList<DetalleCompra>) deData.obtenerDetalles();

    DefaultTableModel modelo = new DefaultTableModel();
    modelo.addColumn("ID");
    modelo.addColumn("PROVEEDOR");
    modelo.addColumn("PRODUCTO");
    modelo.addColumn("PRECIO");
    modelo.addColumn("CANTIDAD");

    for (DetalleCompra d : listaD) {
        if (d.getCompra().getIdCompra() == comSeleccionado.getIdCompra()) {
            String razonSocial = d.getCompra().getProveedor().getRazonSocial(); // Obtener la razón social del proveedor
            String nombreProducto = d.getProducto().getNombreProducto();
            double precio = d.getPrecioCosto();
            int cantidad = d.getCantidad();

            modelo.addRow(new Object[]{comSeleccionado.getIdCompra(), razonSocial, nombreProducto, precio, cantidad});
        }
    }

    jTable1.setModel(modelo);
    }//GEN-LAST:event_jcbcompraActionPerformed
public void cargarcompra(){
        for (Compra item:listcom){
            jcbcompra.addItem(item);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox<Compra> jcbcompra;
    // End of variables declaration//GEN-END:variables
}
