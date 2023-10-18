package provemax_grupo_5.Vistas;

import javax.swing.JOptionPane;
import provemax_grupo_5.AccesoADatos.ProductoData;
import provemax_grupo_5.Entidades.Producto;

/**
 *
 * @author sergi
 */
public class Productos extends javax.swing.JInternalFrame {
    
    private ProductoData prodD = new ProductoData();
    
    private provemax_grupo_5.Entidades.Producto ProductoActual = null;
    
    private void mensaje(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje);
    }
    
    private void mensajes(String mensaje) {
        JOptionPane.showMessageDialog(this, mensaje);
    }
    
    public Productos() {
        initComponents();
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTIdProducto = new javax.swing.JTextField();
        jBNuevo = new javax.swing.JButton();
        jBGuardar = new javax.swing.JButton();
        jBEliminar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jRBEstado = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        jTNombreProducto = new javax.swing.JTextField();
        jTDescripcion = new javax.swing.JTextField();
        jTPrecioActual = new javax.swing.JTextField();
        jTStock = new javax.swing.JTextField();
        jBBuscar = new javax.swing.JButton();
        jBSalir = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setBackground(new java.awt.Color(255, 153, 153));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Registro de Productos");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("Id Producto");

        jTIdProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTIdProductoActionPerformed(evt);
            }
        });
        jTIdProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTIdProductoKeyReleased(evt);
            }
        });

        jBNuevo.setBackground(new java.awt.Color(0, 204, 0));
        jBNuevo.setText("Nuevo");
        jBNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNuevoActionPerformed(evt);
            }
        });

        jBGuardar.setBackground(new java.awt.Color(255, 255, 0));
        jBGuardar.setText("Guardar");
        jBGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuardarActionPerformed(evt);
            }
        });

        jBEliminar.setBackground(new java.awt.Color(255, 51, 51));
        jBEliminar.setText("Eliminar");
        jBEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEliminarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("Nombre del Producto");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText("Descripcion");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setText("Precio Actual");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setText("Stock");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setText("Estado");

        jBBuscar.setBackground(new java.awt.Color(204, 255, 204));
        jBBuscar.setText("Buscar");
        jBBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarActionPerformed(evt);
            }
        });

        jBSalir.setBackground(new java.awt.Color(255, 255, 255));
        jBSalir.setText("Salir");
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(54, 54, 54)
                        .addComponent(jRBEstado)
                        .addGap(42, 42, 42))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(164, 164, 164))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(47, 47, 47)
                                        .addComponent(jBNuevo)))
                                .addGap(49, 49, 49)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTDescripcion, javax.swing.GroupLayout.DEFAULT_SIZE, 326, Short.MAX_VALUE)
                                    .addComponent(jTPrecioActual)
                                    .addComponent(jTStock)
                                    .addComponent(jTNombreProducto, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jBGuardar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jBEliminar)
                                .addGap(57, 57, 57))
                            .addComponent(jTIdProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(61, 61, 61))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jBBuscar)
                                .addGap(38, 38, 38))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTIdProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBBuscar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTNombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTPrecioActual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jTStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jRBEstado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBNuevo)
                    .addComponent(jBGuardar)
                    .addComponent(jBEliminar)
                    .addComponent(jBSalir))
                .addGap(40, 40, 40))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTIdProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTIdProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTIdProductoActionPerformed

    private void jTIdProductoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTIdProductoKeyReleased
        // TODO add your handling code here:


    }//GEN-LAST:event_jTIdProductoKeyReleased

    private void jBNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNuevoActionPerformed
        // TODO add your handling code here:

        limpiarCampos();
        ProductoActual = null;
    }//GEN-LAST:event_jBNuevoActionPerformed

    private void jBBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarActionPerformed
        // TODO add your handling code here:

        try {
            
            Integer id = Integer.parseInt(jTIdProducto.getText());
            ProductoActual = prodD.buscarProducto(id);
            if (ProductoActual != null) {
                jTNombreProducto.setText(ProductoActual.getNombreProducto());
                jTDescripcion.setText(ProductoActual.getDescripcion());
                jRBEstado.setSelected(ProductoActual.isEstado());
                jTPrecioActual.setText(String.valueOf(ProductoActual.getPrecioActual()));
                jTStock.setText(String.valueOf(ProductoActual.getStock()));
                
            }
            
        } catch (NumberFormatException ex) {
            mensajes("Debe ingresar un codigo válido");
            
        }
    }//GEN-LAST:event_jBBuscarActionPerformed

    private void jBGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarActionPerformed
        // TODO add your handling code here:

        try {
            Integer idProducto = Integer.parseInt(jTIdProducto.getText());
            String nombreProducto = jTNombreProducto.getText();
            String descripcion = jTDescripcion.getText();
            Double precioActual = Double.parseDouble(jTPrecioActual.getText());
            Integer stock = Integer.parseInt(jTStock.getText());
            
            if (nombreProducto.isEmpty() || descripcion.isEmpty()) {
                mensaje("No puede haber campos vacios");
                return;
            }
            boolean estado = jRBEstado.isSelected();
            if (ProductoActual == null) {
                ProductoActual = new Producto(idProducto, nombreProducto, descripcion, precioActual, stock, estado);
                prodD.guardarProducto(ProductoActual);
            }else{
                ProductoActual.setIdProducto(idProducto);
                ProductoActual.setNombreProducto(nombreProducto);
                ProductoActual.setDescripcion(descripcion);
                ProductoActual.setPrecioActual(precioActual);
                ProductoActual.setStock(stock);
                ProductoActual.setEstado(estado);
                prodD.modificarUnProducto(ProductoActual);
            }
        } catch (NumberFormatException nfe) {
            
            mensaje("Debe ingresar un codigo valido");
        }
        

    }//GEN-LAST:event_jBGuardarActionPerformed

    private void jBEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEliminarActionPerformed
        // TODO add your handling code here:
        
        if (ProductoActual!=null) {
            
            prodD.eliminarProducto(ProductoActual.getIdProducto());
            ProductoActual=null;
            limpiarCampos();
        }else{
            
            mensaje("No hay un producto seleccionado");
        }
    }//GEN-LAST:event_jBEliminarActionPerformed

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        // TODO add your handling code here:
        
        dispose();
    }//GEN-LAST:event_jBSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBBuscar;
    private javax.swing.JButton jBEliminar;
    private javax.swing.JButton jBGuardar;
    private javax.swing.JButton jBNuevo;
    private javax.swing.JButton jBSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JRadioButton jRBEstado;
    private javax.swing.JTextField jTDescripcion;
    private javax.swing.JTextField jTIdProducto;
    private javax.swing.JTextField jTNombreProducto;
    private javax.swing.JTextField jTPrecioActual;
    private javax.swing.JTextField jTStock;
    // End of variables declaration//GEN-END:variables
private void limpiarCampos() {
        
        jTDescripcion.setText("");
        jTIdProducto.setText("");
        jTNombreProducto.setText("");
        jTPrecioActual.setText("");
        jTStock.setText("");
        jRBEstado.setSelected(true);
    }
}
