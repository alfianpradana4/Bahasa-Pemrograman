/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktek;

/**
 *
 * @author User
 */
public class PenggunaanComboBox extends javax.swing.JFrame {

    /**
     * Creates new form PenggunaanComboBox
     */
    public PenggunaanComboBox() {
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

        jLabel1 = new javax.swing.JLabel();
        jCBarang = new javax.swing.JComboBox();
        txtIndex = new javax.swing.JTextField();
        txtItem = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jCMerkLaptop = new javax.swing.JComboBox();
        btnOk = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Jenis Barang : ");

        jCBarang.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Gadget", "Hybrid Laptop", "PC Laptop", "PC Desktop", "Server Computer" }));
        jCBarang.setSelectedIndex(1);
        jCBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBarangActionPerformed(evt);
            }
        });

        txtIndex.setText("Index");

        txtItem.setText("Selected Item");

        jLabel2.setText("Merk Laptop :");

        jCMerkLaptop.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Acer", "Asus", "Dell", "HP", "Lenovo", "Sony", "Toshiba" }));
        jCMerkLaptop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCMerkLaptopActionPerformed(evt);
            }
        });

        btnOk.setText("Ok");
        btnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jCBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCMerkLaptop, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(txtIndex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(txtItem, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(btnOk)))
                .addContainerGap(100, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jCBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIndex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jCMerkLaptop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOk))
                .addContainerGap(316, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBarangActionPerformed
        // TODO add your handling code here:
        
        txtIndex.setText(jCBarang.getSelectedIndex() + "");
        txtItem.setText(jCBarang.getSelectedItem() + "");
    }//GEN-LAST:event_jCBarangActionPerformed

    private void jCMerkLaptopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCMerkLaptopActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCMerkLaptopActionPerformed

    private void btnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkActionPerformed
        // TODO add your handling code here:
        
        jCMerkLaptop.removeAllItems();
        
        if (jCBarang.getSelectedItem().equals("Gadget")) {
            jCMerkLaptop.addItem("ASUS");
            jCMerkLaptop.addItem("Google Pixel");
            jCMerkLaptop.addItem("Lenovo");
            jCMerkLaptop.addItem("Nexus");
            
        }
        
        if(jCBarang.getSelectedItem().equals("Hybrid Laptop")){
         
            jCMerkLaptop.addItem("ASUS");
            jCMerkLaptop.addItem("Dell");
            jCMerkLaptop.addItem("Lenovo");
            jCMerkLaptop.addItem("Toshiba");
        
        }
        
        if(jCBarang.getSelectedItem().equals("PC Laptop")){
         
            jCMerkLaptop.addItem("ASUS");
            jCMerkLaptop.addItem("Dell");
            jCMerkLaptop.addItem("Lenovo");
            jCMerkLaptop.addItem("Toshiba");
        
        }
        
        if(jCBarang.getSelectedItem().equals("PC Desktop")){
         
            jCMerkLaptop.addItem("ASUS");
            jCMerkLaptop.addItem("Dell");
            jCMerkLaptop.addItem("Lenovo");
            jCMerkLaptop.addItem("Toshiba");
        
        }
        
         if(jCBarang.getSelectedItem().equals("Server Computer")){
         
            jCMerkLaptop.addItem("ASUS");
            jCMerkLaptop.addItem("Dell");
            jCMerkLaptop.addItem("Lenovo");
            jCMerkLaptop.addItem("Toshiba");
        
        }
    }//GEN-LAST:event_btnOkActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PenggunaanComboBox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PenggunaanComboBox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PenggunaanComboBox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PenggunaanComboBox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PenggunaanComboBox().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOk;
    private javax.swing.JComboBox jCBarang;
    private javax.swing.JComboBox jCMerkLaptop;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField txtIndex;
    private javax.swing.JTextField txtItem;
    // End of variables declaration//GEN-END:variables
}