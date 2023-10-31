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
        jTidpro = new javax.swing.JTextField();
        jTidde = new javax.swing.JTextField();
        jTcantidad = new javax.swing.JTextField();
        jTprecio = new javax.swing.JTextField();
        jTidcom = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTdetalles = new javax.swing.JTable();
        jBpopular = new javax.swing.JButton();
        AYUDA = new javax.swing.JButton();
        comprapopu = new javax.swing.JButton();
        AYUDA2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

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
        jLabel1.setForeground(new java.awt.Color(153, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("DETALLES DE COMPRA");

        jLabel2.setForeground(new java.awt.Color(153, 0, 0));
        jLabel2.setText("ID DETALLE");

        jLabel3.setForeground(new java.awt.Color(153, 0, 0));
        jLabel3.setText("CANTIDAD");

        jLabel4.setForeground(new java.awt.Color(153, 0, 0));
        jLabel4.setText("PRECIO/COSTO");

        jLabel5.setForeground(new java.awt.Color(153, 0, 0));
        jLabel5.setText("ID COMPRA");

        jLabel6.setForeground(new java.awt.Color(153, 0, 0));
        jLabel6.setText("ID PRODUCTO");

        jLabel7.setForeground(new java.awt.Color(153, 0, 0));
        jLabel7.setText("ESTADO");

        jRestado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRestadoActionPerformed(evt);
            }
        });

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

        AYUDA.setText("AYUDA BOTONES");
        AYUDA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AYUDAActionPerformed(evt);
            }
        });

        comprapopu.setText("COMPRAS AL PROVEEDOR");
        comprapopu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comprapopuActionPerformed(evt);
            }
        });

        AYUDA2.setText("AYUDA CAMPOS");
        AYUDA2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AYUDA2ActionPerformed(evt);
            }
        });

        jButton1.setText("PROVEEDOR Y PRODUCTO");
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
                                    .addComponent(jRestado))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addGap(31, 31, 31)
                                    .addComponent(jTidcom, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(87, 87, 87)
                                .addComponent(jTcantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 571, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 536, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(AYUDA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(AYUDA2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel3))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jTidpro, javax.swing.GroupLayout.DEFAULT_SIZE, 403, Short.MAX_VALUE)
                                            .addComponent(jTidde)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(comprapopu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jBpopular, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)))
                                .addGap(20, 20, 20)
                                .addComponent(jButton1)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(AYUDA))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTidde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AYUDA2))
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
                            .addComponent(jRestado)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTidpro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBpopular)
                            .addComponent(jButton1))))
                .addGap(18, 18, 18)
                .addComponent(comprapopu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBsalir)
                    .addComponent(jBlistar)
                    .addComponent(jBbuscar)
                    .addComponent(jBlimpiar)
                    .addComponent(jBeliminar)
                    .addComponent(jBguardar)))
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
     
    }//GEN-LAST:event_jRestadoActionPerformed

    private void AYUDAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AYUDAActionPerformed
        JOptionPane.showMessageDialog(this, "AYUDA CON LOS BOTONES: lea atentamente los siguientes carteles ");
        JOptionPane.showMessageDialog(this,"GUARDAR: sirve para guardar o modificar un detalle de compra, para modificar asegurese de haber buscado su detalle con el boton BUSCAR ");
        JOptionPane.showMessageDialog(this,"ELIMINAR:sirve para elimanar un detalle de compra ");
        JOptionPane.showMessageDialog(this,"LIMPIAR: limpia los campos de texto  ");
        JOptionPane.showMessageDialog(this,"BUSCAR: buscar un detalle de compra teniendo en cuenta el campo id detalle   ");
        JOptionPane.showMessageDialog(this,"LISTAR: llena la tabla con los detalles de compra   ");
        JOptionPane.showMessageDialog(this,"SALIR: sale de la aplicacion   ");
        JOptionPane.showMessageDialog(this,"PRODUCTO POPULAR: llena la tabla con aquellos productos mas populares en funcion del campo id producto ");
        JOptionPane.showMessageDialog(this,"COMPRAS AL PROVEEDOR: llena la tabla con aquellas compras mas populares en funcion del campo id compra, con ese id compra se puede llegar al id proveedor en COMPRA PRODUCTOS ");
        JOptionPane.showMessageDialog(this,"PRODUCTOS Y PROVEEDOR: llena la tabla con aquellas compras mas populares en funcion del campo id compra, con ese id compra se puede llegar al id proveedor en COMPRA PRODUCTOS ");
    }//GEN-LAST:event_AYUDAActionPerformed

    private void comprapopuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comprapopuActionPerformed
       
    listaD = (ArrayList<DetalleCompra>) deData.obtenerDetalles();

    // Inicializar el modelo de la tabla
    modelo = (DefaultTableModel) jTdetalles.getModel();

    // Limpiar el modelo de la tabla
    modelo.setRowCount(0);

    // Usar un HashMap para agrupar DetalleCompra por IdCompra
    Map<Integer, List<DetalleCompra>> detallePorCompra = new HashMap<>();

    for (DetalleCompra d : listaD) {
        int idCompra = d.getCompra().getIdCompra();
        if (!detallePorCompra.containsKey(idCompra)) {
            detallePorCompra.put(idCompra, new ArrayList<>());
        }
        detallePorCompra.get(idCompra).add(d);
    }

    // Agregar solo los grupos con más de un elemento al modelo de la tabla
    for (List<DetalleCompra> grupo : detallePorCompra.values()) {
        if (grupo.size() > 1) {
            for (DetalleCompra d : grupo) {
                modelo.addRow(new Object[]{d.getIdDetalle(), d.getCantidad(), d.getPrecioCosto(), d.getCompra().getIdCompra(), d.getProducto().getIdProducto()});
            }
        }
    }

    jTdetalles.setModel(modelo);
    // Crear un mensaje con la cantidad de repeticiones de IdCompra
    StringBuilder mensaje = new StringBuilder("Repeticiones de IdCompra:\n");
    for (int idCompra : detallePorCompra.keySet()) {
        int repeticiones = detallePorCompra.get(idCompra).size();
        mensaje.append("PROVEEDOR (IdCompra) ").append(idCompra).append(": ").append(repeticiones).append(" veces\n");
    }
    
    // Mostrar el mensaje con la cantidad de repeticiones
    JOptionPane.showMessageDialog(this, mensaje.toString());


    }//GEN-LAST:event_comprapopuActionPerformed

    private void AYUDA2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AYUDA2ActionPerformed
        JOptionPane.showMessageDialog(this, "AYUDA CON LOS CAMPOS DE TEXTO: lea atentamente los siguientes carteles para saber que datos cargar");
        JOptionPane.showMessageDialog(this,"ID DETALLE: en este campo debera ir el ID de su detalle en cual servira para cear un nuevo detalle o la busqueda o modificacion de uno ya existente ");
        JOptionPane.showMessageDialog(this,"CANTIDAD: debera indicar cuantas existencias desea adquirir de dicho producto");
        JOptionPane.showMessageDialog(this,"PRECIO/COSTO: debere colocar el costo del total del prodcuto");
        JOptionPane.showMessageDialog(this,"ID COMPRA: debera colocar el numero ID de su compra para poder acercarle al proveedor, consultle el ID en compras");
        JOptionPane.showMessageDialog(this,"ID PRODUCTO: debera colocar el numero ID del producto que desea ordenar, consulte el ID en productos por nombre");
        JOptionPane.showMessageDialog(this,"ESTADO: indica si el detalle se encuentra activado y listo para  cargar o desactivado y a la espera");
        JOptionPane.showMessageDialog(this,"ADVERTENCIA: EVITE INGRESAR DATOS ALFABETICOS O ERRONEOS EN LOS CAMPOS");
       
    }//GEN-LAST:event_AYUDA2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
    listaD = (ArrayList<DetalleCompra>) deData.obtenerDetalles();

    // Usar un HashMap para agrupar DetalleCompra por IdCompra
    Map<Integer, List<DetalleCompra>> detallePorCompra = new HashMap<>();

    for (DetalleCompra d : listaD) {
        int idCompra = d.getCompra().getIdCompra();

        if (!detallePorCompra.containsKey(idCompra)) {
            detallePorCompra.put(idCompra, new ArrayList<>());
        }

        detallePorCompra.get(idCompra).add(d);
    }

    // Actualizar el modelo de la tabla
    modelo = (DefaultTableModel) jTdetalles.getModel();
    modelo.setRowCount(0);

    for (List<DetalleCompra> grupo : detallePorCompra.values()) {
        if (grupo.size() > 1) {
            for (DetalleCompra d : grupo) {
                modelo.addRow(new Object[]{d.getIdDetalle(), d.getCantidad(), d.getPrecioCosto(), d.getCompra().getIdCompra(), d.getProducto().getIdProducto()});
            }
        }
    }

    jTdetalles.setModel(modelo);

    // Crear un mensaje con los IdProducto para cada IdCompra
    StringBuilder mensaje = new StringBuilder("IdProducto para cada IdCompra:\n");
    for (int idCompra : detallePorCompra.keySet()) {
        mensaje.append("PROVEEDOR (IdCompra) ").append(idCompra).append(": ");
        List<DetalleCompra> compras = detallePorCompra.get(idCompra);
        for (DetalleCompra d : compras) {
            mensaje.append(d.getProducto().getIdProducto()).append(", ");
        }
        mensaje.delete(mensaje.length() - 2, mensaje.length());  // Eliminar la coma al final
        mensaje.append("\n");
    }

    // Mostrar el mensaje con los IdProducto para cada IdCompra
    JOptionPane.showMessageDialog(this, mensaje.toString());


    }//GEN-LAST:event_jButton1ActionPerformed

 private void limpiarCampos(){
        jTidpro.setText("");
        jTidcom.setText("");
        jTcantidad.setText(""); 
        jTidde.setText(""); 
        jTprecio.setText("");
        jRestado.setSelected(true);
        
        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AYUDA;
    private javax.swing.JButton AYUDA2;
    private javax.swing.JButton comprapopu;
    private javax.swing.JButton jBbuscar;
    private javax.swing.JButton jBeliminar;
    private javax.swing.JButton jBguardar;
    private javax.swing.JButton jBlimpiar;
    private javax.swing.JButton jBlistar;
    private javax.swing.JButton jBpopular;
    private javax.swing.JButton jBsalir;
    private javax.swing.JButton jButton1;
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
