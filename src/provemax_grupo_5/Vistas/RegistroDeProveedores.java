/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provemax_grupo_5.Vistas;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import provemax_grupo_5.AccesoADatos.ProveedorData;
import provemax_grupo_5.Entidades.Proveedor;



/**
 *
 * @author nacho
 */
public class RegistroDeProveedores extends javax.swing.JInternalFrame {

   private ProveedorData proData= new ProveedorData();
   private Proveedor proActual= null;
   private ArrayList <Proveedor> listaP;
    private DefaultTableModel modelo;
    public RegistroDeProveedores() {
        initComponents();
        JOptionPane.showMessageDialog(this, "BIENVENIDO, para mas informacion pulse los botones AYUDA");
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jFrame2 = new javax.swing.JFrame();
        jFrame3 = new javax.swing.JFrame();
        jLabel1 = new javax.swing.JLabel();
        jBsalir = new javax.swing.JButton();
        jBlistar = new javax.swing.JButton();
        jBbuscar = new javax.swing.JButton();
        jBlimpiar = new javax.swing.JButton();
        jBactivar = new javax.swing.JButton();
        jBeliminar = new javax.swing.JButton();
        jBguardar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTidpro = new javax.swing.JTextField();
        jTrazonssocial = new javax.swing.JTextField();
        jTdomicilio = new javax.swing.JTextField();
        jTtelefono = new javax.swing.JTextField();
        jRestado = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        AYUDA = new javax.swing.JButton();
        AYUDA2 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame2Layout.setVerticalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame3Layout = new javax.swing.GroupLayout(jFrame3.getContentPane());
        jFrame3.getContentPane().setLayout(jFrame3Layout);
        jFrame3Layout.setHorizontalGroup(
            jFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame3Layout.setVerticalGroup(
            jFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setBackground(new java.awt.Color(1, 102, 102));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 0));
        jLabel1.setText("REGISTRO DE PROVEEDORES");

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

        jBactivar.setText("ACTIVAR");
        jBactivar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBactivarActionPerformed(evt);
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

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "RAZON SOCIAL", "DOMICILIO", "TELEFONO", "ESTADO"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel2.setForeground(new java.awt.Color(153, 0, 0));
        jLabel2.setText("ID PROVEEDORES");

        jLabel3.setForeground(new java.awt.Color(153, 0, 0));
        jLabel3.setText("RAZON SOCIAL");

        jLabel4.setForeground(new java.awt.Color(153, 0, 0));
        jLabel4.setText("DOMICILIO");

        jLabel5.setForeground(new java.awt.Color(153, 0, 0));
        jLabel5.setText("TELEFONO");

        jLabel6.setForeground(new java.awt.Color(153, 0, 0));
        jLabel6.setText("ESTADO");

        jRestado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRestadoActionPerformed(evt);
            }
        });

        jButton1.setText("BUSCAR-");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        AYUDA.setText("AYUDA BOTONES");
        AYUDA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AYUDAActionPerformed(evt);
            }
        });

        AYUDA2.setText("AYUDA CAMPOS");
        AYUDA2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AYUDA2ActionPerformed(evt);
            }
        });

        jButton2.setText("LISTAR-");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBguardar)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBeliminar)
                                .addGap(18, 18, 18)
                                .addComponent(jBactivar)
                                .addGap(18, 18, 18)
                                .addComponent(jBlimpiar)
                                .addGap(18, 18, 18)
                                .addComponent(jBbuscar))
                            .addComponent(jButton1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBlistar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                                .addComponent(jBsalir))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(68, 68, 68)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(AYUDA2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(AYUDA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
            .addComponent(jScrollPane1)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3)
                        .addComponent(jLabel2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(35, 35, 35)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jRestado))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jTtelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTdomicilio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTrazonssocial, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTidpro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(AYUDA))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AYUDA2)
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTidpro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTrazonssocial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTdomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTtelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRestado)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBsalir)
                    .addComponent(jBlistar)
                    .addComponent(jBbuscar)
                    .addComponent(jBlimpiar)
                    .addComponent(jBactivar)
                    .addComponent(jBeliminar)
                    .addComponent(jBguardar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_jBsalirActionPerformed

    private void jBbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBbuscarActionPerformed
       try{ 
            Integer id=Integer.parseInt(jTidpro.getText());
            proActual=proData.buscarProveedor(id);
            if(proActual!=null){
                jTrazonssocial.setText(proActual.getRazonSocial());
                jTdomicilio.setText(proActual.getDomicilio());
                jTtelefono.setText(proActual.getTelefono());
                jRestado.setSelected(proActual.isEstado());
                
            }
        }catch(NumberFormatException ex){
           JOptionPane.showMessageDialog(this, "debe ingresar un numero valido");
        } 
    }//GEN-LAST:event_jBbuscarActionPerformed

    private void jBeliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBeliminarActionPerformed
        if(proActual!=null){
            proData.eliminarProveedor(proActual.getIdProveedor());
            proActual=null;
            limpiarCampos();
        }else{
           JOptionPane.showMessageDialog(this, "no hay un proveedor seleccionado");
        }
    }//GEN-LAST:event_jBeliminarActionPerformed

    private void jBactivarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBactivarActionPerformed
        if(proActual!=null){
            proData.activarProveedor(proActual.getIdProveedor());
            proActual=null;
            limpiarCampos();
        }else{
           JOptionPane.showMessageDialog(this, "no hay un proveedor seleccionado");
        }
    }//GEN-LAST:event_jBactivarActionPerformed

    private void jBguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBguardarActionPerformed
        try{ 
        Integer id=Integer.parseInt(jTidpro.getText());
        String razonsocial=jTrazonssocial.getText();
        String domicilio=jTdomicilio.getText();
        String telefono=jTtelefono.getText();
        if(razonsocial.isEmpty()||domicilio.isEmpty()){
            JOptionPane.showMessageDialog(this, "");
            return;
        }
        
        Boolean estado=jRestado.isSelected();
        if (proActual==null){
         proActual=new Proveedor(razonsocial,domicilio,telefono,estado);
         proData.guardarProveedor(proActual);
        }else{
         proActual.setRazonSocial(razonsocial);
         proActual.setDomicilio(domicilio);
         proActual.setTelefono(telefono);
         
         proData.modificarProveedor(proActual);
        }
        
         }catch(NumberFormatException nfe){
             
           JOptionPane.showMessageDialog(this, "debe ingresar un numero valido");
       }
    }//GEN-LAST:event_jBguardarActionPerformed

    private void jBlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBlimpiarActionPerformed
        limpiarCampos();
        proActual=null;  
    }//GEN-LAST:event_jBlimpiarActionPerformed

    private void jRestadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRestadoActionPerformed
 
    }//GEN-LAST:event_jRestadoActionPerformed

    private void jBlistarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBlistarActionPerformed
        listaP = (ArrayList<Proveedor>) proData.listarProveedores();

    
    modelo = (DefaultTableModel) jTable1.getModel();

    
    modelo.setRowCount(0);

    for (Proveedor p : listaP) {
        modelo.addRow(new Object[]{p.getIdProveedor(), p.getRazonSocial(), p.getDomicilio(),p.getTelefono(),p.isEstado()});
    }

    jTable1.setModel(modelo);
    }//GEN-LAST:event_jBlistarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{ 
            Integer id=Integer.parseInt(jTidpro.getText());
            proActual=proData.buscarProveedorNE(id);
            if(proActual!=null){
                jTrazonssocial.setText(proActual.getRazonSocial());
                jTdomicilio.setText(proActual.getDomicilio());
                jTtelefono.setText(proActual.getTelefono());
                jRestado.setSelected(proActual.isEstado());
                
            }
        }catch(NumberFormatException ex){
           JOptionPane.showMessageDialog(this, "debe ingresar un numero valido");
        } 
    }//GEN-LAST:event_jButton1ActionPerformed

    private void AYUDAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AYUDAActionPerformed
        JOptionPane.showMessageDialog(this, "AYUDA CON LOS BOTONES: lea atentamente los siguientes carteles ");
        JOptionPane.showMessageDialog(this,"GUARDAR: sirve para guardar o modificar un proveedor, para modificar asegurese de haber buscado su ID con el boton BUSCAR ");
        JOptionPane.showMessageDialog(this,"ELIMINAR:sirve para elimanar un proveedor,asegurese de haber buscado su ID con el boton BUSCAR");
        JOptionPane.showMessageDialog(this,"ACTIVAR:sirve para activarar un proveedor,asegurese de haber buscado su ID con el boton BUSCAR-");
        JOptionPane.showMessageDialog(this,"LIMPIAR: limpia los campos de texto  ");
        JOptionPane.showMessageDialog(this,"BUSCAR: buscar un proveedor activo teniendo en cuenta el campo id detalle");
        JOptionPane.showMessageDialog(this,"BUSCAR-: buscar un proveedor eliminado teniendo en cuenta el campo id detalle");
        JOptionPane.showMessageDialog(this,"LISTAR: llena la tabla con los proveedores activos");
        JOptionPane.showMessageDialog(this,"LISTAR-: llena la tabla con los proveedores eliminados");
        JOptionPane.showMessageDialog(this,"SALIR: sale de la aplicacion");
        
    }//GEN-LAST:event_AYUDAActionPerformed

    private void AYUDA2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AYUDA2ActionPerformed
        JOptionPane.showMessageDialog(this, "AYUDA CON LOS CAMPOS DE TEXTO: lea atentamente los siguientes carteles para saber que datos cargar");
        JOptionPane.showMessageDialog(this,"ID PROVEEDORES: en este campo debera ir el ID del proveedor servira para cear un nuevo proveedor o la busqueda o modificacion de uno ya existente ");
        JOptionPane.showMessageDialog(this,"RAZON SOCIAL: debera colocar la razon social del proveedor");
        JOptionPane.showMessageDialog(this,"DOMICILIO: debere colocar la residencia del proveedor");
        JOptionPane.showMessageDialog(this,"TELEFONO: debera colocar el numero de telefono del proveedor");
        JOptionPane.showMessageDialog(this,"ESTADO: indica si el proveedor se encuentra activado o eliminado");
        JOptionPane.showMessageDialog(this,"ADVERTENCIA: EVITE INGRESAR DATOS ERRONEOS EN LOS CAMPOS");
    }//GEN-LAST:event_AYUDA2ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        listaP = (ArrayList<Proveedor>) proData.listarProveedoresne();

    
    modelo = (DefaultTableModel) jTable1.getModel();

    
    modelo.setRowCount(0);

    for (Proveedor p : listaP) {
        modelo.addRow(new Object[]{p.getIdProveedor(), p.getRazonSocial(), p.getDomicilio(),p.getTelefono(),p.isEstado()});
    }

    jTable1.setModel(modelo);
    }//GEN-LAST:event_jButton2ActionPerformed
    private void limpiarCampos(){
        jTidpro.setText("");
        jTrazonssocial.setText("");
        jTdomicilio.setText(""); 
        jTtelefono.setText(""); 
        jRestado.setSelected(true);
    }
        
        

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AYUDA;
    private javax.swing.JButton AYUDA2;
    private javax.swing.JButton jBactivar;
    private javax.swing.JButton jBbuscar;
    private javax.swing.JButton jBeliminar;
    private javax.swing.JButton jBguardar;
    private javax.swing.JButton jBlimpiar;
    private javax.swing.JButton jBlistar;
    private javax.swing.JButton jBsalir;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JFrame jFrame3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JRadioButton jRestado;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTdomicilio;
    private javax.swing.JTextField jTidpro;
    private javax.swing.JTextField jTrazonssocial;
    private javax.swing.JTextField jTtelefono;
    // End of variables declaration//GEN-END:variables
}
