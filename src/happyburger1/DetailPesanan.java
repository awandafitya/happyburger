
package happyburger1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

public class DetailPesanan extends javax.swing.JInternalFrame {
    DefaultTableModel model;
    private Statement st;
    private Connection connection;

    public DetailPesanan() {
        initComponents();
        model = (DefaultTableModel) tabeldetail.getModel();
        connection = new Koneksi().conn; // Menggunakan koneksi yang sudah ada
        
        refreshTable();
    }
    
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        iddetail = new javax.swing.JTextField();
        idmenu = new javax.swing.JTextField();
        pilihidmenu = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jumlah = new javax.swing.JTextField();
        hargasatuan = new javax.swing.JTextField();
        subtotal = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        bersihkan = new javax.swing.JButton();
        simpandata = new javax.swing.JButton();
        simpan = new javax.swing.JButton();
        edit = new javax.swing.JButton();
        hapus = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabeldetail = new javax.swing.JTable();
        back = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DETAIL PESANAN", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ID Detail Pesanan");

        idmenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idmenuActionPerformed(evt);
            }
        });

        pilihidmenu.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        pilihidmenu.setForeground(new java.awt.Color(153, 153, 255));
        pilihidmenu.setText("+");
        pilihidmenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pilihidmenuActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ID Menu");

        jumlah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jumlahActionPerformed(evt);
            }
        });

        hargasatuan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hargasatuanActionPerformed(evt);
            }
        });

        subtotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subtotalActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Jumlah");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Harga Satuan");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Sub Total");

        bersihkan.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bersihkan.setForeground(new java.awt.Color(153, 153, 255));
        bersihkan.setText("Bersihkan");
        bersihkan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bersihkanActionPerformed(evt);
            }
        });

        simpandata.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        simpandata.setForeground(new java.awt.Color(153, 153, 255));
        simpandata.setText("Simpan Data");
        simpandata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpandataActionPerformed(evt);
            }
        });

        simpan.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        simpan.setForeground(new java.awt.Color(153, 153, 255));
        simpan.setText("Simpan Perubahan");
        simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanActionPerformed(evt);
            }
        });

        edit.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        edit.setForeground(new java.awt.Color(153, 153, 255));
        edit.setText("Edit");
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });

        hapus.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        hapus.setForeground(new java.awt.Color(153, 153, 255));
        hapus.setText("Hapus");
        hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusActionPerformed(evt);
            }
        });

        tabeldetail.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID Detail Pesanan", "ID Menu", "Jumlah", "Harga Satuan", "Sub Total"
            }
        ));
        tabeldetail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabeldetailMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabeldetail);

        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(bersihkan, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(68, 68, 68)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(idmenu, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                                        .addComponent(pilihidmenu, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(iddetail)
                                    .addComponent(jumlah)
                                    .addComponent(hargasatuan)
                                    .addComponent(subtotal)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(simpandata)
                                .addGap(18, 18, 18)
                                .addComponent(simpan)
                                .addGap(18, 18, 18)
                                .addComponent(edit, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(hapus, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(64, 64, 64)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 556, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(back)))
                .addContainerGap(245, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(iddetail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(idmenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pilihidmenu)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jumlah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(hargasatuan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(subtotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(49, 49, 49)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bersihkan, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(simpandata, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(simpan, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(edit, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hapus, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 247, Short.MAX_VALUE)
                .addComponent(back)
                .addGap(66, 66, 66))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pilihidmenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pilihidmenuActionPerformed
        // TODO add your handling code here:
        IdMenu imn = new IdMenu(null,true);
        imn.setVisible(true);
        idmenu.setText(imn.idmenu);
        hargasatuan.setText(imn.hargaValue);

    }//GEN-LAST:event_pilihidmenuActionPerformed

    private void idmenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idmenuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idmenuActionPerformed

    private void hargasatuanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hargasatuanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hargasatuanActionPerformed

    private void bersihkanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bersihkanActionPerformed
        iddetail.setText("");
        idmenu.setText("");
        jumlah.setText("");
        hargasatuan.setText("");
        subtotal.setText("");
    }//GEN-LAST:event_bersihkanActionPerformed

    private void simpandataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpandataActionPerformed
        try {
       String query = "INSERT INTO detail_pesanan (id_detail_pesanan, id_menu, jumlah, harga_satuan, sub_total) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement pstmt = connection.prepareStatement(query);

            pstmt.setString(1, iddetail.getText());
            pstmt.setString(2, idmenu.getText());
            pstmt.setInt(3, Integer.parseInt(jumlah.getText()));
            float Harga_Satuan = Float.parseFloat(hargasatuan.getText());
pstmt.setFloat(4, Harga_Satuan);
            float Sub_Total = Float.parseFloat(subtotal.getText());
pstmt.setFloat(5, Sub_Total);

        pstmt.executeUpdate();
        pstmt.close();

        // Menyegarkan tabel setelah menambahkan data baru
        model.setRowCount(0);
        

        // Refresh tabel
        refreshTable();
    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Terjadi kesalahan saat mengambil data dari database.");
    }
        
        
    }//GEN-LAST:event_simpandataActionPerformed

    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed
        // TODO add your handling code here:
        int selectedRow = tabeldetail.getSelectedRow();

    // Pastikan baris terpilih
    if (selectedRow == -1) {
        JOptionPane.showMessageDialog(this, "Pilih baris yang akan diedit.");
        return;
    }

    // Mendapatkan nilai kolom dari baris terpilih
    String ID_Detail = model.getValueAt(selectedRow, 0).toString();
        String ID_Menu = model.getValueAt(selectedRow, 1).toString();
        String Jumlah = model.getValueAt(selectedRow, 2).toString();
        String Harga_Satuan = model.getValueAt(selectedRow, 3).toString();
        String Sub_Total = model.getValueAt(selectedRow, 4).toString();

    // Menampilkan nilai saat ini pada inputan
    iddetail.setText(ID_Detail);
        idmenu.setText(ID_Menu);
        jumlah.setText(Jumlah);
        hargasatuan.setText(Harga_Satuan);
        subtotal.setText(Sub_Total);
        
    }//GEN-LAST:event_editActionPerformed

    private void hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusActionPerformed
        int selectedRow = tabeldetail.getSelectedRow();
        if (selectedRow >= 0) {
            try {
                String ID_DETAIL = (String) model.getValueAt(selectedRow, 0);

                String query = "DELETE FROM detail_pesanan WHERE id_detail_pesanan = ?";
                PreparedStatement pstmt = connection.prepareStatement(query);
                pstmt.setString(1, ID_DETAIL);
                pstmt.executeUpdate();
                pstmt.close();

                // Meid_pegawaian tabel setelah menghapus data
                model.setRowCount(0);
                
            } catch (Exception e) {
                e.printStackTrace();
            }
            // Refresh tabel
            refreshTable();
        } else {
            JOptionPane.showMessageDialog(this, "Pilih baris yang akan dihapus!");
        }
    }//GEN-LAST:event_hapusActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        Dashboard brd = new Dashboard(); 
        brd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        brd.pack();
        brd.setVisible(true);

        // Tutup form 
        JFrame thisFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
        thisFrame.dispose();
    }//GEN-LAST:event_backActionPerformed

    private void jumlahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jumlahActionPerformed
        // TODO add your handling code here:
        try {
            // Ambil nilai dari jumlah dan harga satuan
            double jml = Double.parseDouble(jumlah.getText());
            double hgsatuan = Double.parseDouble(hargasatuan.getText());

            // Hitung sub total
            double subTotal = jml * hgsatuan;

            // Tampilkan hasil pada subTotalTextField
            subtotal.setText(String.valueOf(subTotal));
        } catch (NumberFormatException e) {
            // Tangani kesalahan jika input tidak valid
            JOptionPane.showMessageDialog(this, "Masukkan jumlah dan harga satuan dengan benar.");
        }
    
    }//GEN-LAST:event_jumlahActionPerformed

    private void subtotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subtotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_subtotalActionPerformed

    private void simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanActionPerformed
        // TODO add your handling code here:
        String ID_Detail = iddetail.getText();
        String ID_Menu = idmenu.getText();
        int Jumlah = Integer.parseInt(jumlah.getText());
        float Harga_Satuan = Float.parseFloat(hargasatuan.getText());
        float Sub_Total = Float.parseFloat(subtotal.getText());

        try {
            // Convert the String to Double for total_harga_pesanan

            String sql = "UPDATE detail_pesanan SET id_detail_pesanan=?, id_menu=?, jumlah=?, harga_satuan=?, sub_total=? WHERE id_detail_pesanan=?";
            try (PreparedStatement pstmt = connection.prepareStatement(sql)) {
                pstmt.setString(1, ID_Detail);
                pstmt.setString(2, ID_Menu);
                pstmt.setInt(3, Jumlah);
                pstmt.setFloat(4, Harga_Satuan);
                pstmt.setFloat(5, Sub_Total);
                pstmt.setString(6, ID_Detail);


                int rowsUpdated = pstmt.executeUpdate();

                if (rowsUpdated > 0) {
                    JOptionPane.showMessageDialog(this, "Data berhasil disimpan!");
                } else {
                    JOptionPane.showMessageDialog(this, "Gagal menyimpan data. Periksa kembali inputan Anda.");
                }

                // Clear input fields and refresh table
                iddetail.setText("");
                idmenu.setText("");
                jumlah.setText("");
                hargasatuan.setText("");
                subtotal.setText("");
                
                refreshTable();
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Terjadi kesalahan saat menyimpan data.");
        }
        }

        private void refreshTable() {
            try {
                // Mendapatkan koneksi dari objek Koneksi
                Koneksi koneksi = new Koneksi();
                Connection conn = koneksi.conn;

                // Menyiapkan pernyataan SQL untuk mengambil data dari database
                String sql = "SELECT * FROM detail_pesanan";
                try (PreparedStatement pstmt = conn.prepareStatement(sql); ResultSet rs = pstmt.executeQuery()) {
                    // Mengosongkan model tabel
                    DefaultTableModel model = (DefaultTableModel) tabeldetail.getModel();
                    model.setRowCount(0);

                    // Mengisi ulang data dari hasil query
                    while (rs.next()) {
                        String ID_Detail = rs.getString("id_detail_pesanan");
                        String ID_Menu = rs.getString("id_menu");
                        int Jumlah = rs.getInt("jumlah");
                        float Harga_Satuan = rs.getFloat("harga_satuan");
                        float Sub_Total = rs.getFloat("sub_total");

                        model.addRow(new Object[]{ID_Detail, ID_Menu, Jumlah, Harga_Satuan, Sub_Total});
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Terjadi kesalahan saat merefresh tabel.");
            }
    }//GEN-LAST:event_simpanActionPerformed

    private void tabeldetailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabeldetailMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tabeldetailMouseClicked

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JButton bersihkan;
    private javax.swing.JButton edit;
    private javax.swing.JButton hapus;
    private javax.swing.JTextField hargasatuan;
    private javax.swing.JTextField iddetail;
    private javax.swing.JTextField idmenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jumlah;
    private javax.swing.JButton pilihidmenu;
    private javax.swing.JButton simpan;
    private javax.swing.JButton simpandata;
    private javax.swing.JTextField subtotal;
    private javax.swing.JTable tabeldetail;
    // End of variables declaration//GEN-END:variables
}
