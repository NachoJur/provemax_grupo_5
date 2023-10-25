package provemax_grupo_5.Vistas;

import java.util.List;
import javax.swing.JOptionPane;
import javax.xml.bind.annotation.XmlElement;
import provemax_grupo_5.AccesoADatos.ProductoData;
import provemax_grupo_5.Entidades.Producto;

/**
 *
 * @author sergi
 */
public class ProductosPorNombre extends javax.swing.JInternalFrame {

  private void mensaje(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje);
    }
    private ProductoData pData = new ProductoData();
    private Producto productoActual = null;
    private List<Producto> listP;

    public ProductosPorNombre() {
        
        listP = pData.listarProductos();
       
        initComponents();
        cargarCombo();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jRBEstado = new javax.swing.JRadioButton();
        jTFId = new javax.swing.JTextField();
        jTFDescripcion = new javax.swing.JTextField();
        jTFPrecioActual = new javax.swing.JTextField();
        jTFStock = new javax.swing.JTextField();
        jCBProducto = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(0, 102, 102));
        setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 51, 204)));
        setClosable(true);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setText("Productos por nombre");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 102, 102));
        jLabel2.setText("Seleccionar un Producto:");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 102, 102));
        jLabel3.setText("Id");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 102, 102));
        jLabel4.setText("Descripción");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 102, 102));
        jLabel5.setText("Precio Actual");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 102, 102));
        jLabel6.setText("Stock");

        jRBEstado.setBackground(new java.awt.Color(0, 153, 153));
        jRBEstado.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jRBEstado.setForeground(new java.awt.Color(255, 102, 102));
        jRBEstado.setText("Estado");

        jTFId.setEditable(false);

        jTFDescripcion.setEditable(false);

        jTFPrecioActual.setEditable(false);

        jTFStock.setEditable(false);

        jCBProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBProductoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(205, 205, 205)
                        .addComponent(jRBEstado))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jCBProducto, 0, 469, Short.MAX_VALUE)
                            .addComponent(jTFId)
                            .addComponent(jTFDescripcion)
                            .addComponent(jTFPrecioActual)
                            .addComponent(jTFStock)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jLabel1)))))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCBProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTFId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTFDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTFPrecioActual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTFStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(jRBEstado)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCBProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBProductoActionPerformed
        // TODO add your handling code here:
        
        Producto productoSeleccionado = (Producto)jCBProducto.getSelectedItem();
        jTFId.setText(productoSeleccionado.getIdProducto()+"");
        jTFDescripcion.setText(productoSeleccionado.getDescripcion());
        jTFPrecioActual.setText(productoSeleccionado.getPrecioActual()+"");
        jTFStock.setText(productoSeleccionado.getStock()+"");
        jRBEstado.setSelected(true);
        
        if (productoSeleccionado.getStock() <= 3) {
            
            mensaje("¡ATENCIÓN! El Stock esta por debajo del minimo establecido");
        }
    }//GEN-LAST:event_jCBProductoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Producto> jCBProducto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JRadioButton jRBEstado;
    private javax.swing.JTextField jTFDescripcion;
    private javax.swing.JTextField jTFId;
    private javax.swing.JTextField jTFPrecioActual;
    private javax.swing.JTextField jTFStock;
    // End of variables declaration//GEN-END:variables

  private void cargarCombo() {
      
      jCBProducto.addItem(null);
      for (Producto aux:listP){
          jCBProducto.addItem(aux);
      }
  }
   
}
