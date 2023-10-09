
package provemax_grupo_5.Vistas;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sergi
 */
public class Producto extends javax.swing.JInternalFrame {
private DefaultTableModel modelo = new DefaultTableModel();
public boolean isCellEditable(int f, int c){
    return false;
}
    
    public Producto() {
        initComponents();
        armarCabecera();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTNombreElectro = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTElectros = new javax.swing.JTable();
        jBAgregar = new javax.swing.JButton();
        jBModificar = new javax.swing.JButton();
        jBEliminar = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setBackground(new java.awt.Color(255, 153, 153));
        jLabel1.setFont(new java.awt.Font("Arial Unicode MS", 1, 20)); // NOI18N
        jLabel1.setText("Registro de Electrodomésticos");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Nombre del producto");

        jTNombreElectro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTNombreElectroActionPerformed(evt);
            }
        });
        jTNombreElectro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTNombreElectroKeyReleased(evt);
            }
        });

        jTElectros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        jScrollPane1.setViewportView(jTElectros);

        jBAgregar.setBackground(new java.awt.Color(0, 204, 0));
        jBAgregar.setText("Agregar");

        jBModificar.setBackground(new java.awt.Color(255, 255, 0));
        jBModificar.setText("Modificar");

        jBEliminar.setBackground(new java.awt.Color(255, 51, 51));
        jBEliminar.setText("Eliminar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jLabel2)
                                .addGap(98, 98, 98)
                                .addComponent(jTNombreElectro, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(246, 246, 246)
                                .addComponent(jLabel1)))
                        .addGap(0, 197, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jBAgregar)
                .addGap(203, 203, 203)
                .addComponent(jBModificar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBEliminar)
                .addGap(77, 77, 77))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTNombreElectro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBAgregar)
                    .addComponent(jBModificar)
                    .addComponent(jBEliminar))
                .addGap(0, 130, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTNombreElectroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTNombreElectroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTNombreElectroActionPerformed

    private void jTNombreElectroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTNombreElectroKeyReleased
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_jTNombreElectroKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAgregar;
    private javax.swing.JButton jBEliminar;
    private javax.swing.JButton jBModificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTElectros;
    private javax.swing.JTextField jTNombreElectro;
    // End of variables declaration//GEN-END:variables

private void armarCabecera(){
    
    modelo.addColumn("idProducto");
    modelo.addColumn("descripcion");
    modelo.addColumn("precioActual");
    modelo.addColumn("stock");
    modelo.addColumn("estado");
    jTElectros.setModel(modelo);
}

}
