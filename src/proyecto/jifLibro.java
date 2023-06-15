/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package proyecto;

import Clases.Libro;
import Clases.Pila;
import Clases.Seccion;
import frames.frmMenu;
import javax.swing.JOptionPane;

/**
 *
 * @author emanu
 */
public class jifLibro extends javax.swing.JInternalFrame {

    frmMenu regresar;
    Pila libros;
    Seccion seccion;
    Libro libros2;
    public jifLibro(frmMenu me, Pila lib, Seccion sec, Libro libro) {
        regresar = me;
        libros = lib;
        seccion = sec;
        libros2 = libro;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jPanel2 = new javax.swing.JPanel();
        jlblMensaje = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jlblNombre = new javax.swing.JLabel();
        jtfNombreL = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jtfCant = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jtfPrecio = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jtfEditorial = new javax.swing.JTextField();
        jbtnAgregarL = new javax.swing.JButton();
        jcbGen = new javax.swing.JComboBox<>();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jDesktopPane1.setBackground(new java.awt.Color(255, 204, 153));

        jPanel2.setBackground(new java.awt.Color(204, 255, 51));

        jlblMensaje.setText("|");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jlblMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 584, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jlblMensaje)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 153));

        jlblNombre.setText("Titulo del libro:");

        jtfNombreL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfNombreLActionPerformed(evt);
            }
        });

        jLabel2.setText("Cantidad a insertar:");

        jtfCant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfCantActionPerformed(evt);
            }
        });

        jLabel5.setText("Genero:");

        jLabel6.setText("Precio:");

        jtfPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfPrecioActionPerformed(evt);
            }
        });

        jLabel7.setText("Editorial:");

        jtfEditorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfEditorialActionPerformed(evt);
            }
        });

        jbtnAgregarL.setText("Agregar Libro");
        jbtnAgregarL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAgregarLActionPerformed(evt);
            }
        });

        jcbGen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elige:", "Terror", "Suspenso", "Fantasia", "Novelas", "Manga" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtfCant, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(73, 73, 73)
                        .addComponent(jcbGen, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(68, 68, 68)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfEditorial, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jlblNombre)
                        .addGap(35, 35, 35)
                        .addComponent(jtfNombreL, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(jbtnAgregarL)))
                .addContainerGap(116, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblNombre)
                    .addComponent(jtfNombreL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtfCant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jcbGen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfEditorial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(39, 39, 39)
                .addComponent(jbtnAgregarL)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        jDesktopPane1.setLayer(jPanel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtfNombreLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfNombreLActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfNombreLActionPerformed

    private void jtfCantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfCantActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfCantActionPerformed

    private void jtfPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfPrecioActionPerformed

    private void jtfEditorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfEditorialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfEditorialActionPerformed

    private void jbtnAgregarLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAgregarLActionPerformed
        int cantidad = 0;
        double precio = 0;                
        if (jtfNombreL.getText().equals("")) {
            jlblMensaje.setText("No se registro titulo");
        } else if (jtfCant.getText().equals("")) {
            cantidad = Integer.parseInt(jtfCant.getText());
            jlblMensaje.setText("No se registro cantidad de libros");
        } else if (jcbGen.getSelectedItem().toString().equals("Elige:")) {
            jlblMensaje.setText("No selecciono genero");
        } else if (jtfPrecio.getText().equals("")) {
            precio = Double.parseDouble(jtfPrecio.getText());
            jlblMensaje.setText("No establecio precio");
        } else if (jtfEditorial.getText().equals("")) {
            jlblMensaje.setText("No registro editorial");
        } else {
            if (!libros.verificarEspacio(cantidad, seccion, libros2, jcbGen.getSelectedItem().toString()))
            {
                JOptionPane.showMessageDialog(null, "No hay espacio suficiente o no existe la seccion del genero: " + jcbGen.getSelectedItem().toString());
            }
            else
            {
                libros.pushLibro(cantidad, jtfNombreL.getText(), jcbGen.getSelectedItem().toString(), jtfEditorial.getText(), precio);                
            }            
        }         }//GEN-LAST:event_jbtnAgregarLActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jbtnAgregarL;
    private javax.swing.JComboBox<String> jcbGen;
    private javax.swing.JLabel jlblMensaje;
    private javax.swing.JLabel jlblNombre;
    private javax.swing.JTextField jtfCant;
    private javax.swing.JTextField jtfEditorial;
    private javax.swing.JTextField jtfNombreL;
    private javax.swing.JTextField jtfPrecio;
    // End of variables declaration//GEN-END:variables
}