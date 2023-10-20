package provemax_grupo_5.Vistas;

import java.util.List;
import javax.swing.table.DefaultTableModel;
import javax.xml.bind.annotation.XmlElement;
import provemax_grupo_5.AccesoADatos.ProductoData;
import provemax_grupo_5.Entidades.Producto;

/**
 *
 * @author sergi
 */
public class ProductosPorNombre extends javax.swing.JInternalFrame {

    private DefaultTableModel modelo = new DefaultTableModel() {

        public boolean isCellEditable(int f, int c) {
            return false;
        }
    };
    private ProductoData pData = new ProductoData();
    private Producto productoActual = null;
    private List<Producto> listP;

    public ProductosPorNombre() {
        pData = new ProductoData();
        listP = pData.listarProductos();
        initComponents();
        armarCabecera();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTProductos = new javax.swing.JTable();
        jTFProdXNombre = new javax.swing.JTextField();

        setClosable(true);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Productos por nombre");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Escriba un nombre:");

        jTProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTProductos);

        jTFProdXNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTFProdXNombreKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 542, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFProdXNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTFProdXNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTFProdXNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFProdXNombreKeyReleased
        // TODO add your handling code here:
        borreaFilas();
        for (Producto prod : listP) {
            if (prod.getNombreProducto().startsWith(jTFProdXNombre.getText())) {

                modelo.addRow(new Object[]{
                    prod.getIdProducto(),
                    prod.getDescripcion(),
                    prod.getPrecioActual(),
                    prod.getStock(),
                    prod.isEstado()
                });
            }
        }
    }//GEN-LAST:event_jTFProdXNombreKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTFProdXNombre;
    private javax.swing.JTable jTProductos;
    // End of variables declaration//GEN-END:variables

    private void armarCabecera() {

        modelo.addColumn("idProducto");
        modelo.addColumn("descripción");
        modelo.addColumn("precioActual");
        modelo.addColumn("stock");
        modelo.addColumn("estado");
        jTProductos.setModel(modelo);
    }

    private void borreaFilas() {
        int f = jTProductos.getRowCount() - 1;
        for (; f >= 0; f--) {
            modelo.removeRow(f);
        }
    }

}
