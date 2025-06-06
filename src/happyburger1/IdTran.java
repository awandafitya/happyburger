/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package happyburger1;

import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Alvina Waihda
 */
public class IdTran extends javax.swing.JDialog {

    /**
     * Creates new form IDTrans
     */
    public IdTran(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    
    public String idtransaksi;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JdTabelTransaksi = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));

        JdTabelTransaksi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID_Transaksi", "ID_Pegawai", "ID_Pesanan", "Metode Pembayaran", "Total pembayaran", "Tanggal waktu transaksi"
            }
        ));
        JdTabelTransaksi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JdTabelTransaksiMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(JdTabelTransaksi);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(94, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(60, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

        private void populateTable() {
        try {
            // Mendapatkan koneksi dari objek Koneksi
            Koneksi koneksi = new Koneksi();
            Connection conn = koneksi.conn;

            // Menyiapkan pernyataan SQL untuk mengambil data dari database
            String sql = "SELECT * FROM transaksi";
            try ( java.sql.Statement stmt = conn.createStatement()) {
                // Mengosongkan model tabel
                DefaultTableModel model = (DefaultTableModel) JdTabelTransaksi.getModel();
                model.setRowCount(0);

                // Mengisi ulang data dari hasil query
                ResultSet rs = stmt.executeQuery(sql);
                while (rs.next()) {
                    String id_transaksi = rs.getString("id_transaksi");
                    String id_pegawai = rs.getString("id_pegawai");
                    String id_pesanan = rs.getString("id_pesanan");
                    String metode_pembayaran = rs.getString("metode_pembayaran");
                    String total_pembayaran = rs.getString("total_pembayaran");
                    String tanggal_waktu_transaksi = rs.getString("tanggal_waktu_transaksi");

                    // Menambahkan data ke model tabel
                    model.addRow(new Object[]{idtransaksi, id_pesanan, metode_pembayaran, total_pembayaran, tanggal_waktu_transaksi});
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Terjadi kesalahan saat mengambil data dari database.");
        }

    }
    private void JdTabelTransaksiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JdTabelTransaksiMouseClicked
        // TODO add your handling code here:
        int selectedRowIndex = JdTabelTransaksi.getSelectedRow();
        idtransaksi = JdTabelTransaksi.getValueAt(selectedRowIndex, 0).toString().trim();
        String id_pegawai = JdTabelTransaksi.getValueAt(selectedRowIndex, 1).toString().trim();
        String id_pesanan = JdTabelTransaksi.getValueAt(selectedRowIndex, 2).toString().trim();
        String metode_pembayaran = JdTabelTransaksi.getValueAt(selectedRowIndex, 3).toString().trim();
        String total_pembayaran = JdTabelTransaksi.getValueAt(selectedRowIndex, 4).toString().trim();
        String tanggal_waktu_transaksi = JdTabelTransaksi.getValueAt(selectedRowIndex, 3).toString().trim();
        dispose();
    }//GEN-LAST:event_JdTabelTransaksiMouseClicked
        
   
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
            java.util.logging.Logger.getLogger(IdTran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IdTran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IdTran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IdTran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                IdTran dialog = new IdTran(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JdTabelTransaksi;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
