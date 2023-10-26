/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package provemax_grupo_5.Vistas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import provemax_grupo_5.AccesoADatos.CompraData;
import provemax_grupo_5.AccesoADatos.DetalleCompraData;
import provemax_grupo_5.AccesoADatos.ProductoData;
import provemax_grupo_5.Entidades.Compra;
import provemax_grupo_5.Entidades.DetalleCompra;
import provemax_grupo_5.Entidades.Producto;

/**
 *
 * @author nacho
 */
public class DetallesDeCompra extends javax.swing.JInternalFrame {

    private DetalleCompraData deData= new DetalleCompraData();
    private DetalleCompra deActual= null;
    private CompraData comd= new CompraData();
    private ProductoData prod= new ProductoData();
    private Compra comA= new Compra();
    private Producto proA= new Producto();
    private ArrayList <DetalleCompra> listaD;
    private DefaultTableModel modelo;
    public DetallesDeCompra() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jBsalir = new javax.swing.JButton();
        jBlistar = new javax.swing.JButton();
        jBbuscar = new javax.swing.JButton();
        jBlimpiar = new javax.swing.JButton();
        jBeliminar = new javax.swing.JButton();
        jBguardar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jRestado = new javax.swing.JRadioButton();
        jLESTADO = new javax.swing.JLabel();
        jTidpro = new javax.swing.JTextField();
        jTidde = new javax.swing.JTextField();
        jTcantidad = new javax.swing.JTextField();
        jTprecio = new javax.swing.JTextField();
        jTidcom = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTdetalles = new javax.swing.JTable();
        jBpopular = new javax.swing.JButton();

        setBackground(new java.awt.Color(1, 102, 102));

        jBsalir.setText("SALIR");
        jBsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsalirActionPerformed(evt);
            }
        });

        jBlistar.setText("LISTAR");
        jBlistar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBlistarActionPerformed(evt);
            }
        });

        jBbuscar.setText("BUSCAR");
        jBbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBbuscarActionPerformed(evt);
            }
        });

        jBlimpiar.setText("LIMPIAR");
        jBlimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBlimpiarActionPerformed(evt);
            }
        });

        jBeliminar.setText("ELIMINAR");
        jBeliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBeliminarActionPerformed(evt);
            }
        });

        jBguardar.setText("GUARDAR");
        jBguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBguardarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("DETALLES DE COMPRA");

        jLabel2.setForeground(new java.awt.Color(255, 255, 0));
        jLabel2.setText("ID DETALLE");

        jLabel3.setForeground(new java.awt.Color(255, 255, 0));
        jLabel3.setText("CANTIDAD");

        jLabel4.setForeground(new java.awt.Color(255, 255, 0));
        jLabel4.setText("PRECIO/COSTO");

        jLabel5.setForeground(new java.awt.Color(255, 255, 0));
        jLabel5.setText("ID COMPRA");

        jLabel6.setForeground(new java.awt.Color(255, 255, 0));
        jLabel6.setText("ID PRODUCTO");

        jLabel7.setForeground(new java.awt.Color(255, 255, 0));
        jLabel7.setText("ESTADO");

        jRestado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRestadoActionPerformed(evt);
            }
        });

        jLESTADO.setForeground(new java.awt.Color(255, 255, 0));
        jLESTADO.setText("ACTIVO");

        jTdetalles.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID DETALLE", "CANTIDAD", "PRECIO/COSTO", "ID COMPRA", "ID PRODUCTO"
            }
        ));
        jScrollPane1.setViewportView(jTdetalles);

        jBpopular.setText("PRODUCTO POPULAR");
        jBpopular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBpopularActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 571, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jBguardar)
                            .addGap(18, 18, 18)
                            .addComponent(jBeliminar)
                            .addGap(18, 18, 18)
                            .addComponent(jBlimpiar)
                            .addGap(18, 18, 18)
                            .addComponent(jBbuscar)
                            .addGap(18, 18, 18)
                            .addComponent(jBlistar)
                            .addGap(18, 18, 18)
                            .addComponent(jBsalir))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(45, 45, 45)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTprecio))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(59, 59, 59)
                                        .addComponent(jRestado)
                                        .addGap(27, 27, 27)
                                        .addComponent(jLESTADO))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(31, 31, 31)
                                        .addComponent(jTidcom, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(87, 87, 87)
                                    .addComponent(jTcantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 536, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jBpopular, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel3))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jTidpro, javax.swing.GroupLayout.DEFAULT_SIZE, 403, Short.MAX_VALUE)
                                            .addComponent(jTidde))))))))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTidde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTcantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jTprecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jTidcom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLESTADO)
                            .addComponent(jRestado))
                        .addGap(71, 71, 71)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBsalir)
                            .addComponent(jBlistar)
                            .addComponent(jBbuscar)
                            .addComponent(jBlimpiar)
                            .addComponent(jBeliminar)
                            .addComponent(jBguardar)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTidpro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jBpopular)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBlimpiarActionPerformed
        limpiarCampos();
        deActual=null; 
    }//GEN-LAST:event_jBlimpiarActionPerformed

    private void jBsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_jBsalirActionPerformed

    private void jBguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBguardarActionPerformed
    
    try {
    String iddeText = jTidde.getText();
    int cantidad = Integer.parseInt(jTcantidad.getText());
    double precio = Double.parseDouble(jTprecio.getText());

    String idproText = jTidpro.getText();
    String idcomText = jTidcom.getText();

    if (idproText.isEmpty() || idcomText.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Los campos idProducto e idCompra no deben estar vacíos.");
        return;
    }

    int idpro = Integer.parseInt(idproText);
    int idcom = Integer.parseInt(idcomText);

    Producto proA = prod.buscarProducto(idpro);
    Compra comA = comd.buscarCompra(idcom);

    boolean estado = jRestado.isSelected();

    if (iddeText.isEmpty()) {
        // Si jTidde está vacío, agrega un nuevo detalle de compra
        deActual = new DetalleCompra(cantidad, precio, comA, proA, estado);
        deData.agregarDetallecompra(deActual);
        JOptionPane.showMessageDialog(this, "Detalle de compra agregado");
    } else {
        // Si jTidde no está vacío, modifica el detalle de compra existente
        int idde = Integer.parseInt(iddeText);
        DetalleCompra detalleExistente = deData.buscarDetalleCompra(idde);

        if (detalleExistente != null) {
            detalleExistente.setCompra(comA);
            detalleExistente.setProducto(proA);
            detalleExistente.setCantidad(cantidad);
            detalleExistente.setPrecioCosto(precio);
            deData.modificarDetallecompra(detalleExistente);
            JOptionPane.showMessageDialog(this, "Detalle de compra modificado");
        } else {
            JOptionPane.showMessageDialog(this, "No se encontró un detalle de compra con el ID especificado.");
        }
    }
} catch (NumberFormatException nfe) {
    JOptionPane.showMessageDialog(this, "Debe ingresar un número válido en el campo Cantidad o Precio");
}







    }//GEN-LAST:event_jBguardarActionPerformed

    private void jBbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBbuscarActionPerformed
         try { 
        Integer id = Integer.parseInt(jTidde.getText());
        DetalleCompra deActual = deData.buscarDetalleCompra(id);
        
        if (deActual != null) {
            jTidpro.setText(String.valueOf(deActual.getProducto().getIdProducto()));
            jTidcom.setText(String.valueOf(deActual.getCompra().getIdCompra()));
            jTcantidad.setText(String.valueOf(deActual.getCantidad()));
            jTprecio.setText(String.valueOf(deActual.getPrecioCosto()));
            jRestado.setSelected(deActual.isEstado());
        }
    } catch (NumberFormatException ex) {
       JOptionPane.showMessageDialog(this, "Debe ingresar un número válido");
    } 

    }//GEN-LAST:event_jBbuscarActionPerformed

    private void jBeliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBeliminarActionPerformed
        if(deActual!=null){
            deData.eliminarDetallecompra(deActual.getIdDetalle());
            deActual=null;
            limpiarCampos();
        }else{
           JOptionPane.showMessageDialog(this, "no hay un detalle seleccionado");
        }
    }//GEN-LAST:event_jBeliminarActionPerformed

    private void jBlistarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBlistarActionPerformed
        listaD = (ArrayList<DetalleCompra>) deData.obtenerDetalles();

    
    modelo = (DefaultTableModel) jTdetalles.getModel();

    
    modelo.setRowCount(0);

    for (DetalleCompra d : listaD) {
        modelo.addRow(new Object[]{d.getIdDetalle(), d.getCantidad(), d.getPrecioCosto(), d.getCompra().getIdCompra(), d.getProducto().getIdProducto()});
    }

    jTdetalles.setModel(modelo);
    }//GEN-LAST:event_jBlistarActionPerformed

    private void jBpopularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBpopularActionPerformed
        listaD = (ArrayList<DetalleCompra>) deData.obtenerDetalles();

    // Inicializar el modelo de la tabla
    modelo = (DefaultTableModel) jTdetalles.getModel();

    // Limpiar el modelo de la tabla
    modelo.setRowCount(0);

    // Usar un HashMap para agrupar DetalleCompra por idProducto
    Map<Integer, List<DetalleCompra>> detallePorProducto = new HashMap<>();

    for (DetalleCompra d : listaD) {
        int idProducto = d.getProducto().getIdProducto();
        if (!detallePorProducto.containsKey(idProducto)) {
            detallePorProducto.put(idProducto, new ArrayList<>());
        }
        detallePorProducto.get(idProducto).add(d);
    }

    // Agregar solo los grupos con más de un elemento al modelo de la tabla
    for (List<DetalleCompra> grupo : detallePorProducto.values()) {
        if (grupo.size() > 1) {
            for (DetalleCompra d : grupo) {
                modelo.addRow(new Object[]{d.getIdDetalle(), d.getCantidad(), d.getPrecioCosto(), d.getCompra().getIdCompra(), d.getProducto().getIdProducto()});
            }
        }
    }

    jTdetalles.setModel(modelo);
    }//GEN-LAST:event_jBpopularActionPerformed

    private void jRestadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRestadoActionPerformed
        jRestado.setSelected(true);
        jLESTADO.setText("ACTIVO");
         jRestado.setSelected(false);
         jLESTADO.setText("INACTIVO");  
    }//GEN-LAST:event_jRestadoActionPerformed

 private void limpiarCampos(){
        jTidpro.setText("");
        jTidcom.setText("");
        jTcantidad.setText(""); 
        jTidde.setText(""); 
        jTprecio.setText("");
        jRestado.setSelected(true);
        
        jLESTADO.setText("ACTIVO");
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBbuscar;
    private javax.swing.JButton jBeliminar;
    private javax.swing.JButton jBguardar;
    private javax.swing.JButton jBlimpiar;
    private javax.swing.JButton jBlistar;
    private javax.swing.JButton jBpopular;
    private javax.swing.JButton jBsalir;
    private javax.swing.JLabel jLESTADO;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JRadioButton jRestado;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTcantidad;
    private javax.swing.JTable jTdetalles;
    private javax.swing.JTextField jTidcom;
    private javax.swing.JTextField jTidde;
    private javax.swing.JTextField jTidpro;
    private javax.swing.JTextField jTprecio;
    // End of variables declaration//GEN-END:variables

}
