/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktek;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author alfia
 */
public class frmPasien extends javax.swing.JFrame {

    
public static Connection koneksi;
public static Statement st;
public static ResultSet rs;

    
    /**
     * Creates new form frmPasien
     */
    public frmPasien() {
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

        tambahPasien = new javax.swing.JDialog();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txAlamat = new javax.swing.JTextArea();
        txNama = new javax.swing.JTextField();
        txIdPasien = new javax.swing.JTextField();
        txTelpRumah = new javax.swing.JTextField();
        txTgLahir = new javax.swing.JTextField();
        txHP = new javax.swing.JTextField();
        btSimpan = new javax.swing.JButton();
        btKeluar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPasien = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();

        tambahPasien.setMinimumSize(new java.awt.Dimension(650, 450));
        tambahPasien.setPreferredSize(new java.awt.Dimension(650, 400));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("TAMBAH DATA PASIEN");

        jLabel3.setText("ID Pasien");

        jLabel4.setText("Alamat");

        jLabel5.setText("Nama");

        jLabel6.setText("Telp. Rumah");

        jLabel7.setText("HP");

        jLabel8.setText("Tanggal Lahir");

        txAlamat.setColumns(20);
        txAlamat.setRows(5);
        jScrollPane2.setViewportView(txAlamat);

        btSimpan.setText("Simpan");
        btSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSimpanActionPerformed(evt);
            }
        });

        btKeluar.setText("Keluar");

        javax.swing.GroupLayout tambahPasienLayout = new javax.swing.GroupLayout(tambahPasien.getContentPane());
        tambahPasien.getContentPane().setLayout(tambahPasienLayout);
        tambahPasienLayout.setHorizontalGroup(
            tambahPasienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tambahPasienLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(tambahPasienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tambahPasienLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(tambahPasienLayout.createSequentialGroup()
                        .addGroup(tambahPasienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5))
                        .addGap(31, 31, 31)
                        .addGroup(tambahPasienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txNama, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                            .addComponent(txIdPasien, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                        .addGroup(tambahPasienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btSimpan, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tambahPasienLayout.createSequentialGroup()
                                .addGroup(tambahPasienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6))
                                .addGap(5, 5, 5))
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(tambahPasienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tambahPasienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txTgLahir, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txHP, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txTelpRumah, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btKeluar, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(85, 85, 85))))
        );
        tambahPasienLayout.setVerticalGroup(
            tambahPasienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tambahPasienLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel2)
                .addGap(57, 57, 57)
                .addGroup(tambahPasienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tambahPasienLayout.createSequentialGroup()
                        .addGroup(tambahPasienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txTelpRumah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addComponent(txHP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addGroup(tambahPasienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txTgLahir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(tambahPasienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btSimpan)
                            .addComponent(btKeluar))
                        .addGap(48, 48, 48))
                    .addGroup(tambahPasienLayout.createSequentialGroup()
                        .addGroup(tambahPasienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(tambahPasienLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(46, 46, 46)
                                .addComponent(jLabel5))
                            .addGroup(tambahPasienLayout.createSequentialGroup()
                                .addComponent(txIdPasien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addGroup(tambahPasienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7))))
                        .addGap(46, 46, 46)
                        .addGroup(tambahPasienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addContainerGap(59, Short.MAX_VALUE))))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        tblPasien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID Pasien", "Nama Pasien", "Alamat", "Telepon Rumah", "HP", "Tanggal Lahir"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, true, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblPasien.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                tblPasienComponentShown(evt);
            }
        });
        jScrollPane1.setViewportView(tblPasien);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("DAFTAR DATA PASIEN");

        jToggleButton1.setText("Tambah Data");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jToggleButton1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 645, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jToggleButton1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblPasienComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_tblPasienComponentShown
        // TODO add your handling code here:
        
       


        
    }//GEN-LAST:event_tblPasienComponentShown

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
         try {
            String database="jdbc:mysql://localhost/pasien";
            String user="root";
            String pass="";
            Class.forName("com.mysql.jdbc.Driver");
            koneksi=DriverManager.getConnection(database,user,pass);
            st = koneksi.createStatement();
            rs = st.executeQuery("select * from pasien;");
System.out.println("koneksi berhasil;");
} catch (Exception e) {
JOptionPane.showMessageDialog (null, "koneksi gagal" +e.getMessage());
} //catch
         
         DefaultTableModel tbl = (DefaultTableModel) tblPasien.getModel();
tbl.setNumRows(0);
 try{
      while(rs.next())
        {tbl.addRow(new Object[]{rs.getString("idPasien"),
          rs.getString("Nama"),
          rs.getString("Alamat"),
          rs.getString("telpRumah"),
          rs.getString("HP"),
          rs.getDate("TgLahir")});       
         }
      }
 catch (Exception ex) {
JOptionPane.showMessageDialog (null, "data error" +ex.getMessage());
}

    }//GEN-LAST:event_formComponentShown

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here:
        tambahPasien.show();

    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void btSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSimpanActionPerformed
        // TODO add your handling code here:
        
        
        
        String strIdPasien = txIdPasien.getText();
        String strNama = txNama.getText(); 
        String strAlamat = txAlamat.getText();
        String strTelpRumah = txTelpRumah.getText();
        String strHP = txHP.getText();
        String strTgLahir = txTgLahir.getText();
        
        String query = "insert into pasien(idPasien,Nama,Alamat,TelpRumah,HP,TgLahir) values ('" + strIdPasien + "', '" + strNama +    "', '" + strAlamat+ "', '" + strTelpRumah + "', '" + strHP + "', '" + strTgLahir +"')";

        
    try {
        
        st.executeUpdate(query);
	JOptionPane.showMessageDialog(this, "Data berhasil disimpan");

        
        txIdPasien.setText("");
        txNama.setText(""); 
        txAlamat.setText("");
        txTelpRumah.setText("");
        txHP.setText("");
        txTgLahir.setText("");
        
        
        //update table , agar tablenya bertambah
        rs = st.executeQuery("select * from pasien");
        DefaultTableModel tbl = (DefaultTableModel) tblPasien.getModel();

        tbl.setNumRows(0);
        
        while(rs.next()) {
          tbl.addRow(new Object[]{rs.getString("idPasien"),
          rs.getString("Nama"),
          rs.getString("Alamat"),
          rs.getString("telpRumah"),
          rs.getString("HP"),
          rs.getDate("TgLahir")}); 
        }
        
    } catch (SQLException ex) {
        Logger.getLogger(frmPasien.class.getName()).log(Level.SEVERE, null, ex);
        JOptionPane.showMessageDialog(this, "Data tidak disimpan" + ex.getMessage());

    }

        


        
    }//GEN-LAST:event_btSimpanActionPerformed

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
            java.util.logging.Logger.getLogger(frmPasien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPasien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPasien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPasien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPasien().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btKeluar;
    private javax.swing.JButton btSimpan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JDialog tambahPasien;
    private javax.swing.JTable tblPasien;
    private javax.swing.JTextArea txAlamat;
    private javax.swing.JTextField txHP;
    private javax.swing.JTextField txIdPasien;
    private javax.swing.JTextField txNama;
    private javax.swing.JTextField txTelpRumah;
    private javax.swing.JTextField txTgLahir;
    // End of variables declaration//GEN-END:variables
}
