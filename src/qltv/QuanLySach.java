/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package qltv;

import java.awt.Color;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Fptshop
 */
public class QuanLySach extends javax.swing.JFrame {

    private ArrayList<Sach> danhSachSach = Sach.getSach();
    private DefaultTableModel tblModel = new DefaultTableModel();
    public QuanLySach() {
        initComponents();
        initTable();
        fillTable();
        setLocationRelativeTo(null); 
    }

     private void fillTable() {
    tblModel.setRowCount(0);  // Xóa toàn bộ dữ liệu trong bảng

    if (danhSachSach != null && !danhSachSach.isEmpty()) {
        for (Sach s : danhSachSach) {
            tblModel.addRow(new Object[]{s.getTen(), s.getMaSach(), s.getTacGia(), s.getSoLuong()});
        }
    }
}
     
     private void initTable() {
        String[] columns = new String[]{"Tên sách", "Mã sách", "Tác giả", "Số lượng"};
        tblModel.setColumnIdentifiers(columns);
        tblSach.setModel(tblModel);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtTenSach = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtTacGia = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtMaSach = new javax.swing.JTextField();
        txtSoLuong = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSach = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        btlAdd = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btlRemove = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Tên sách :");

        txtTenSach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTenSachActionPerformed(evt);
            }
        });

        jLabel2.setText("Mã sách :");

        txtTacGia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTacGiaActionPerformed(evt);
            }
        });

        jLabel3.setText("Tác giả: ");

        txtMaSach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaSachActionPerformed(evt);
            }
        });

        txtSoLuong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSoLuongActionPerformed(evt);
            }
        });

        jLabel4.setText("Số lượng còn lại: ");

        tblSach.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblSach.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tblSachFocusGained(evt);
            }
        });
        tblSach.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSachMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblSach);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Quản lý sách");

        btlAdd.setText("Thêm sách");
        btlAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btlAddActionPerformed(evt);
            }
        });

        btnClear.setText("Xóa hết");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btlRemove.setText("Xóa sách");
        btlRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btlRemoveActionPerformed(evt);
            }
        });

        btnEdit.setText("Sửa sách");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnBack.setText("Quay lại");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtTenSach, javax.swing.GroupLayout.DEFAULT_SIZE, 379, Short.MAX_VALUE)
                    .addComponent(txtMaSach))
                .addGap(77, 77, 77)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtTacGia, javax.swing.GroupLayout.DEFAULT_SIZE, 371, Short.MAX_VALUE)
                    .addComponent(txtSoLuong))
                .addGap(68, 68, 68))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(290, 1050, Short.MAX_VALUE)
                .addComponent(btnBack)
                .addGap(15, 15, 15))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(510, 510, 510)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnClear)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btlAdd)
                                .addGap(326, 326, 326)
                                .addComponent(btnEdit)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btlRemove)))))
                .addGap(117, 117, 117))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(btnBack)
                .addGap(2, 2, 2)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTenSach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtTacGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtMaSach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnClear)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btlAdd)
                    .addComponent(btnEdit)
                    .addComponent(btlRemove))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtTenSachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTenSachActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTenSachActionPerformed

    private void txtTacGiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTacGiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTacGiaActionPerformed

    private void txtMaSachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaSachActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaSachActionPerformed

    private void txtSoLuongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSoLuongActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSoLuongActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        int selectedRow = tblSach.getSelectedRow();
    if (selectedRow >= 0) {
        Sach sach = danhSachSach.get(selectedRow);
        sach.setMaSach(txtMaSach.getText().trim());
        sach.setTen(txtTenSach.getText().trim());
        sach.setTacGia(txtTacGia.getText().trim());
        sach.setSoLuong(Integer.parseInt(txtSoLuong.getText().trim()));

        fillTable();  // Cập nhật lại bảng

        // Ghi lại toàn bộ danh sách vào file
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("CSDL\\Sach.txt"))) {
            for (Sach s : danhSachSach) {
                bw.write(s.toString());
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Lỗi ghi file: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

        JOptionPane.showMessageDialog(this, "Sửa sách thành công!", "Success", JOptionPane.INFORMATION_MESSAGE);
    } else {
        JOptionPane.showMessageDialog(this, "Vui lòng chọn sách để sửa!", "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
            QuanLyThuVien qltv = new QuanLyThuVien();
            qltv.setVisible(true);
            dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void tblSachFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tblSachFocusGained
        
    }//GEN-LAST:event_tblSachFocusGained

    private void tblSachMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSachMouseClicked
        int SelectedRow = tblSach.getSelectedRow();
        if (SelectedRow >= 0) {
            String maSach = (String) tblSach.getValueAt(SelectedRow, 1);
            for (Sach sach : danhSachSach) {
                if (maSach.equals(sach.getMaSach())) {
                    txtMaSach.setText(sach.getMaSach());
                    txtTenSach.setText(sach.getTen());
                    txtTacGia.setText(sach.getTacGia());
                    txtSoLuong.setText("" + sach.getSoLuong());
                    break;
                }
            }
        }
    }//GEN-LAST:event_tblSachMouseClicked

    private void btlAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btlAddActionPerformed
        StringBuilder sb = new StringBuilder();

    // Kiểm tra mã sách
    if (txtMaSach.getText().trim().equals("")) {
        sb.append("Mã sách không được để trống\n");
        txtMaSach.setBackground(Color.gray);
    } else {
        txtMaSach.setBackground(Color.white);
    }

    // Kiểm tra tên sách
    if (txtTenSach.getText().trim().equals("")) {
        sb.append("Tên sách không được để trống\n");
        txtTenSach.setBackground(Color.gray);
    } else {
        txtTenSach.setBackground(Color.white);
    }

    // Kiểm tra tác giả
    if (txtTacGia.getText().trim().equals("")) {
        sb.append("Tác giả không được để trống\n");
        txtTacGia.setBackground(Color.gray);
    } else {
        txtTacGia.setBackground(Color.white);
    }

    // Kiểm tra số lượng (phải là số nguyên hợp lệ)
    int soLuong = 0;
    try {
        soLuong = Integer.parseInt(txtSoLuong.getText().trim());
        txtSoLuong.setBackground(Color.white);
    } catch (NumberFormatException e) {
        sb.append("Số lượng phải là số nguyên hợp lệ\n");
        txtSoLuong.setBackground(Color.gray);
    }

    // Nếu có lỗi, hiển thị thông báo và thoát khỏi hàm
    if (sb.length() > 0) {
        JOptionPane.showMessageDialog(this, sb.toString(), "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Kiểm tra trùng mã sách
    for (Sach sach : danhSachSach) {
        if (sach.getMaSach().equals(txtMaSach.getText().trim())) {
            JOptionPane.showMessageDialog(this, "Đã tồn tại mã sách này", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
    }

    // Tạo và thêm sách mới
    Sach a = new Sach();
    a.setMaSach(txtMaSach.getText().trim());
    a.setTen(txtTenSach.getText().trim());
    a.setTacGia(txtTacGia.getText().trim());
    a.setSoLuong(soLuong);
    a.setMuon(false);

    danhSachSach.add(a);
    fillTable();

    // Ghi vào file
    try (BufferedWriter bw = new BufferedWriter(new FileWriter("CSDL\\Sach.txt", true))) {
    bw.write(a.toString());
    bw.newLine();
    } catch (IOException e) {
    e.printStackTrace();  // Log lỗi vào console
    JOptionPane.showMessageDialog(this, "Lỗi ghi file: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }

    JOptionPane.showMessageDialog(this, "Thêm sách thành công!", "Success", JOptionPane.INFORMATION_MESSAGE);
    btnClearActionPerformed(evt);
    }//GEN-LAST:event_btlAddActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        txtMaSach.setText("");
        txtTenSach.setText("");
        txtTacGia.setText("");
        txtSoLuong.setText("");
    }//GEN-LAST:event_btnClearActionPerformed

    private void btlRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btlRemoveActionPerformed
        int selectedRow = tblSach.getSelectedRow();
    if (selectedRow >= 0) {
        String maSach = (String) tblSach.getValueAt(selectedRow, 1);

        // Xóa sách khỏi danh sách
        danhSachSach.removeIf(sach -> sach.getMaSach().equals(maSach));
        fillTable();  // Cập nhật lại bảng

        JOptionPane.showMessageDialog(this, "Xóa sách thành công!", "Success", JOptionPane.INFORMATION_MESSAGE);
    } else {
        JOptionPane.showMessageDialog(this, "Vui lòng chọn sách để xóa!", "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_btlRemoveActionPerformed

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
            java.util.logging.Logger.getLogger(QuanLySach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuanLySach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuanLySach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuanLySach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuanLySach().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btlAdd;
    private javax.swing.JButton btlRemove;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnEdit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblSach;
    private javax.swing.JTextField txtMaSach;
    private javax.swing.JTextField txtSoLuong;
    private javax.swing.JTextField txtTacGia;
    private javax.swing.JTextField txtTenSach;
    // End of variables declaration//GEN-END:variables
}
