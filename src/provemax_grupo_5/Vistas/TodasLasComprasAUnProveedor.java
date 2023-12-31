/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provemax_grupo_5.Vistas;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
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
public class TodasLasComprasAUnProveedor extends javax.swing.JInternalFrame {
    public CompraData compData = new CompraData();
    public Compra compNueva = null;
    private DetalleCompraData deData= new DetalleCompraData();
    private DetalleCompra deActual= null;
    
    private ProveedorData proData= new ProveedorData();
   private Proveedor proActual= null;
   private List<Proveedor>listaP;
   private List<Producto>listProd;
   private ArrayList <DetalleCompra> listaD;
    ProductoData prodDta = new ProductoData();
    private DefaultTableModel modelo;
    public TodasLasComprasAUnProveedor() {
         initComponents();
    listaP = proData.listarProveedores();
    cargarProveedor();
    
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
        jButton1 = new javax.swing.JButton();
        jcbProveedor = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Todas las compras a un Proveedor");

        jButton1.setText("SALIR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jcbProveedor.setSelectedIndex(-1);
        jcbProveedor.setSelectedItem(null);
        jcbProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbProveedorActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "PROVEEDOR", "PRODUCTO", "PRECIO", "CANTIDAD"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jcbProveedor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(143, 143, 143))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(42, 42, 42))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jcbProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jcbProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbProveedorActionPerformed
       
    Proveedor proSeleccionado = (Proveedor) jcbProveedor.getSelectedItem();
    if (proSeleccionado == null) {
        return;
    }

    listaD = (ArrayList<DetalleCompra>) deData.obtenerDetalles();

    DefaultTableModel modelo = new DefaultTableModel();
    modelo.addColumn("IdProveedor");
    modelo.addColumn("Producto");
    modelo.addColumn("Precio");
    modelo.addColumn("Cantidad");

    int contadorCompras = 0;

    for (DetalleCompra d : listaD) {
        if (d.getCompra().getProveedor().getIdProveedor() == proSeleccionado.getIdProveedor()) {
            int idProveedor = d.getCompra().getProveedor().getIdProveedor();
            String nombreProducto = d.getProducto().getNombreProducto();
            double precio = d.getPrecioCosto();
            int cantidad = d.getCantidad();

            modelo.addRow(new Object[]{idProveedor, nombreProducto, precio, cantidad});

            contadorCompras++;
        }
    }

    jTable1.setModel(modelo);

    JOptionPane.showMessageDialog(this, "Se le compró " + contadorCompras + " veces al proveedor con IdProveedor: " + proSeleccionado.getIdProveedor());


    }//GEN-LAST:event_jcbProveedorActionPerformed



public void cargarProveedor(){
        for (Proveedor item:listaP){
            jcbProveedor.addItem(item);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox<Proveedor> jcbProveedor;
    // End of variables declaration//GEN-END:variables
}
