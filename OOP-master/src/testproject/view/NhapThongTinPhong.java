/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testproject.view;

import com.opencsv.exceptions.CsvValidationException;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import testproject.model.DocGhiFile;
import testproject.model.MaPhongComparator;
import testproject.model.Phong;
import testproject.model.TangComparator;
import testproject.model.giaComparator;

/**
 *
 * @author phuon
 */
public class NhapThongTinPhong extends javax.swing.JFrame {

    /**
     * Creates new form NhapThongTinPhong
     */
    private DefaultTableModel tableModel;
    private int id = 0;
    private List<Phong> listPhong = new ArrayList<>();
    private DocGhiFile docGhiFile = new DocGhiFile();
    private static final String curentDir = System.getProperty("user.dir");
    private static final String separator = File.separator;
    private static final String PATH_FILE_CSV_Phong = curentDir + separator + "data" + separator + "Phong.csv";
    private static File file = new File(PATH_FILE_CSV_Phong);

    public NhapThongTinPhong() {
        this.dispose();
        System.out.println(PATH_FILE_CSV_Phong);
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Nhập thông tin phòng");
        tableModel = (DefaultTableModel) tblPhong.getModel();
  if (file.exists()) {
            try {
                listPhong = docGhiFile.docFilePhong();
                if(listPhong.size()==0){
                    file.delete();
                    NhapThongTinPhong phong = new NhapThongTinPhong();
                    phong.setVisible(true);
                }
                else{
                    String ma = listPhong.get(listPhong.size() - 1).getMaPhong();
                    id = Integer.parseInt(ma.substring(2)) + 1;
                    hienTHi(listPhong);
                }
               
            } catch (CsvValidationException ex) {
                Logger.getLogger(NhapThongTinPhong.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void hienTHi(List<Phong> phong) {
        tableModel.setRowCount(0);
        for (Phong item : phong) {
            String maPhong = item.getMaPhong();
            int SoTang = item.getSoTang();
            int sucChua = item.getLoaiPhong();
            String trangThai = item.getTrangThai();
            double giaPhong = item.getGiaPhong();
            tableModel.addRow(new Object[]{maPhong, SoTang, sucChua, trangThai, giaPhong});
        }
    }

    public void resetForm() {
        txtGiaPhong.setText("");
        txtLoaiPhong.setText("");
        txtSoTang.setText("");
        txtTimKiem.setText("");
    }

    public static boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtSoTang = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtLoaiPhong = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtGiaPhong = new javax.swing.JTextField();
        ThemThongTin = new javax.swing.JButton();
        ChinhSua = new javax.swing.JButton();
        xoa = new javax.swing.JButton();
        btnLocThongTin = new javax.swing.JButton();
        tablePhong = new javax.swing.JScrollPane();
        tblPhong = new javax.swing.JTable();
        btnTimKiem = new javax.swing.JButton();
        txtTimKiem = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        boxSapXep = new javax.swing.JComboBox<>();
        btnReSet = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(190, 220, 227));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Nhập thông tin phòng");

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/testproject/view/icon/iconBaack.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jButton3)
                .addGap(184, 184, 184)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 624, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(298, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jButton3)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1179, 61));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 0));
        jLabel3.setText("Loại Phòng: ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, -1, -1));

        txtSoTang.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtSoTangFocusLost(evt);
            }
        });
        txtSoTang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSoTangActionPerformed(evt);
            }
        });
        getContentPane().add(txtSoTang, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, 240, 33));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 51));
        jLabel4.setText("Số tầng: ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, -1, -1));

        txtLoaiPhong.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtLoaiPhongFocusLost(evt);
            }
        });
        txtLoaiPhong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLoaiPhongActionPerformed(evt);
            }
        });
        getContentPane().add(txtLoaiPhong, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 180, 240, 33));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 0, 51));
        jLabel6.setText("Giá Phòng:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 120, -1, -1));

        txtGiaPhong.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtGiaPhongFocusLost(evt);
            }
        });
        txtGiaPhong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGiaPhongActionPerformed(evt);
            }
        });
        getContentPane().add(txtGiaPhong, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 120, 240, 33));

        ThemThongTin.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ThemThongTin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/testproject/view/icon/sign-add-icon.png"))); // NOI18N
        ThemThongTin.setText("Thêm thông tin ");
        ThemThongTin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ThemThongTinActionPerformed(evt);
            }
        });
        getContentPane().add(ThemThongTin, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, -1, -1));

        ChinhSua.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ChinhSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/testproject/view/icon/icons8-pencil-48.png"))); // NOI18N
        ChinhSua.setText("Chỉnh sửa ");
        ChinhSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChinhSuaActionPerformed(evt);
            }
        });
        getContentPane().add(ChinhSua, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 250, -1, -1));

        xoa.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        xoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/testproject/view/icon/icons8-trash-48.png"))); // NOI18N
        xoa.setText("Xóa");
        xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xoaActionPerformed(evt);
            }
        });
        getContentPane().add(xoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 250, -1, -1));

        btnLocThongTin.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnLocThongTin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/testproject/view/icon/icon-sapxep.png"))); // NOI18N
        btnLocThongTin.setText("Sắp xếp");
        btnLocThongTin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLocThongTinActionPerformed(evt);
            }
        });
        getContentPane().add(btnLocThongTin, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 250, -1, -1));

        tblPhong.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Phòng", "Số tầng", "Loại Phòng", "Trạng thái ", "Giá Phòng"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblPhong.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPhongMouseClicked(evt);
            }
        });
        tablePhong.setViewportView(tblPhong);
        if (tblPhong.getColumnModel().getColumnCount() > 0) {
            tblPhong.getColumnModel().getColumn(0).setMinWidth(100);
            tblPhong.getColumnModel().getColumn(0).setMaxWidth(150);
            tblPhong.getColumnModel().getColumn(1).setMinWidth(100);
            tblPhong.getColumnModel().getColumn(1).setMaxWidth(100);
        }

        getContentPane().add(tablePhong, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 334, 1179, 512));

        btnTimKiem.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnTimKiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/testproject/view/icon/iconTimKiem.png"))); // NOI18N
        btnTimKiem.setText("Tìm kiếm");
        btnTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemActionPerformed(evt);
            }
        });
        getContentPane().add(btnTimKiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 250, -1, -1));

        txtTimKiem.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtTimKiem.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtTimKiemFocusLost(evt);
            }
        });
        txtTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTimKiemActionPerformed(evt);
            }
        });
        getContentPane().add(txtTimKiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 180, 113, 33));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 0, 51));
        jLabel7.setText("Chức năng:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 190, -1, 20));

        boxSapXep.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        boxSapXep.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ma Phong", "Gia", "Tang", "Gia Tang", "Tang Gia" }));
        getContentPane().add(boxSapXep, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 180, 113, 33));

        btnReSet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/testproject/view/icon/iconLamMoi.png"))); // NOI18N
        btnReSet.setText("Reset");
        btnReSet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReSetActionPerformed(evt);
            }
        });
        getContentPane().add(btnReSet, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 250, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/testproject/view/icon/background-don-gian-va-dep_110342896.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 1180, 270));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtSoTangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSoTangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSoTangActionPerformed

    private void txtLoaiPhongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLoaiPhongActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLoaiPhongActionPerformed

    private void txtGiaPhongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGiaPhongActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGiaPhongActionPerformed

    private void ChinhSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChinhSuaActionPerformed
        StringBuilder sb = new StringBuilder();
        if (txtGiaPhong.getText().equals("")) {
            sb.append("Mã sinh viên không được để trống\n");
        }
        if (txtLoaiPhong.getText().equals("")) {
            sb.append("Loại phòng không được để trống\n");
        }
        if (txtSoTang.getText().equals("")) {
            sb.append("Số tầng không được để trống\n");
        }
        if (sb.length() > 0) {
            JOptionPane.showMessageDialog(rootPane,
                    sb.toString(), "Backup problem", JOptionPane.WARNING_MESSAGE);
            return;
        }
       
        int choice = JOptionPane.showConfirmDialog(rootPane, "Bạn có muốn chỉnh sửa thông tin không?", "Hỏi", JOptionPane.YES_NO_OPTION);
        if (choice == JOptionPane.NO_OPTION) {
            return;
        }
         int check = 0;
        int selectedRow = tblPhong.getSelectedRow();
        String maPhong = (String) tblPhong.getValueAt(selectedRow, 0);
      
        int soTang =0;
        int loaiPhong =0;
        double giaPhong =0;
        String trangThai = "Con Trong";
        try {
             soTang = Integer.parseInt(txtSoTang.getText());
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null,"Bạn đã nhập sai định dạng số tầng\n Xin vui lòng nhập sô ", "Thông bápo",JOptionPane.CANCEL_OPTION);
        }
        try {
             loaiPhong =Integer.parseInt(txtLoaiPhong.getText());
        } catch (Exception e) {
             JOptionPane.showConfirmDialog(null,"Bạn đã nhập sai định dạng loại phòng\n Xin vui lòng nhập sô ", "Thông bápo",JOptionPane.CANCEL_OPTION);
          
        }
        try {
            giaPhong= Double.parseDouble(txtGiaPhong.getText());
        } catch (Exception e) {
             JOptionPane.showConfirmDialog(null,"Bạn đã nhập sai định dạng giá phòng\n Xin vui lòng nhập sô tiền cụ thể ", "Thông bápo",JOptionPane.CANCEL_OPTION);
        }
        for (Phong item : listPhong) {
            if (item.getMaPhong().equals(maPhong)) {
                item.setSoTang(soTang);
                item.setGiaPhong(giaPhong);
                item.setLoaiPhong(loaiPhong);
                check = 1;
                break;
            }
        }
        if (check == 1) {
             if(soTang==0 || loaiPhong==0 || giaPhong==0){
            System.out.println("lỗi");
        }  else if(soTang>50 || soTang <0){
         JOptionPane.showConfirmDialog(null,"Khách sạn chỉ tối đa 50 tầng\nHãy nhập tầng khác bé hơn 50 và lớn hơn 0 ", "Thông báo",JOptionPane.CANCEL_OPTION);    
        }
        if(  loaiPhong >4 || loaiPhong <1){
             JOptionPane.showConfirmDialog(null,"Xin thông báo chỉ có loại phòng\n 1 người\n2 người\n3 người \n4 người\n Hãy nhập loại phòng thích hợp ", "Thông báo",JOptionPane.CANCEL_OPTION); 
        }
        else {
            
              file.delete();
            docGhiFile.ghiFilePhong(listPhong);
            hienTHi(listPhong);
            resetForm();
            JOptionPane.showMessageDialog(rootPane, "Sửa thành công");
        }
          
        } else {
            JOptionPane.showMessageDialog(rootPane, "Thông tin phòng không tồn tại", "Backup problem", JOptionPane.WARNING_MESSAGE);
                
        } 
      
         
        
    }//GEN-LAST:event_ChinhSuaActionPerformed
 public boolean checkTrangThai(){
        for(Phong x: listPhong){
            if(x.getTrangThai().equalsIgnoreCase("Da dat")){
               //  JOptionPane.showConfirmDialog(null,"Phòng này đã được đặt nên không  xóa được\nHãy check lại thông tin", "Thông bápo",JOptionPane.CANCEL_OPTION);
                return false ;
            }
               
        }
        return true ;
    }
    private void xoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xoaActionPerformed
       
        int selectedRow = tblPhong.getSelectedRow();
        String maPhong = (String) tblPhong.getValueAt(selectedRow, 0);
        int choice = JOptionPane.showConfirmDialog(rootPane, "Bạn có muốn xóa  thông tin phòng  không?", "Hỏi", JOptionPane.YES_NO_OPTION);
        if (choice == JOptionPane.NO_OPTION) {
            return;
        }
        int check = 0;
        for (int i = 0; i < listPhong.size(); i++) {
            if (listPhong.get(i).getMaPhong().equals(maPhong) && listPhong.get(i).getTrangThai().equalsIgnoreCase("Con Trong")) {
                listPhong.remove(listPhong.get(i));
                check = 1;
                break;
            }
        }
        if (check == 1) {
            file.delete();
            docGhiFile.ghiFilePhong(listPhong);
            hienTHi(listPhong);
            resetForm();
            JOptionPane.showMessageDialog(rootPane, "Xóa thành công");
        } else {
            JOptionPane.showMessageDialog(rootPane,
                    "Phòng này đã được khách đặt\nhãy check lại thông tin", "Backup problem", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_xoaActionPerformed

    private void btnLocThongTinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLocThongTinActionPerformed
        if (boxSapXep.getSelectedItem().toString().equals("Tang")) {
            Collections.sort(listPhong, new TangComparator());
            hienTHi(listPhong);
        } else if (boxSapXep.getSelectedItem().toString().equals("Gia")) {
            Collections.sort(listPhong, new giaComparator());
            hienTHi(listPhong);
        } else if (boxSapXep.getSelectedItem().toString().equals("Tang Gia")) {
            Collections.sort(listPhong, new TangComparator().thenComparing(new giaComparator()));
            hienTHi(listPhong);
        } else if (boxSapXep.getSelectedItem().toString().equals("Gia Tang")) {
            Collections.sort(listPhong, new giaComparator().thenComparing(new TangComparator()));
            hienTHi(listPhong);
        } else if (boxSapXep.getSelectedItem().toString().equals("Ma Phong")) {
            Collections.sort(listPhong, new MaPhongComparator());
            hienTHi(listPhong);
        } 
        else {
            JOptionPane.showMessageDialog(rootPane,
                    "Hãy nhập thông tin vào ô chức năng\nCó thể sắp xếp theo tăng dần tầng và theo giá\nVí dụ: tang là sắp xếp theo tầng", "Backup problem", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnLocThongTinActionPerformed

    private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemActionPerformed
        boolean flag1 = false;
        boolean flag2 = false;
        tableModel.setRowCount(0);
        if (isNumeric(txtTimKiem.getText()) == false) {
            for (Phong item : listPhong) {
                if (item.getMaPhong().equals(txtTimKiem.getText())) {
                    tableModel.addRow(new Object[]{item.getMaPhong(), item.getSoTang(), item.getLoaiPhong(), item.getTrangThai(), item.getGiaPhong()});
                }
                if (item.getTrangThai().equals(txtTimKiem.getText())) {
                    tableModel.addRow(new Object[]{item.getMaPhong(), item.getSoTang(), item.getLoaiPhong(), item.getTrangThai(), item.getGiaPhong()});
                }
                flag1 = true;
            }
             if (flag1 == false) {
                JOptionPane.showMessageDialog(rootPane,
                        "Thông tin phòng không tồn tại", "Backup problem", JOptionPane.WARNING_MESSAGE);
            }
           
        } else {
            for (Phong item : listPhong) {
                if (item.getSoTang() == Integer.parseInt(txtTimKiem.getText())) {
                    tableModel.addRow(new Object[]{item.getMaPhong(), item.getSoTang(), item.getLoaiPhong(), item.getTrangThai(), item.getGiaPhong()});
                }
                if (item.getGiaPhong() == Integer.parseInt(txtTimKiem.getText())) {
                    tableModel.addRow(new Object[]{item.getMaPhong(), item.getSoTang(), item.getLoaiPhong(), item.getTrangThai(), item.getGiaPhong()});
                }

                flag2 = true;
            }
            if (flag2 == false) {
                JOptionPane.showMessageDialog(rootPane,
                        "Thông tin phòng không tồn tại", "Backup problem", JOptionPane.WARNING_MESSAGE);
            }
        }

    }//GEN-LAST:event_btnTimKiemActionPerformed

    private void txtTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTimKiemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTimKiemActionPerformed

    private void ThemThongTinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ThemThongTinActionPerformed

        StringBuilder sb = new StringBuilder();
        if (txtGiaPhong.getText().equals("")) {
            sb.append("Giá phòng không được để trống\n");
        }
        if (txtLoaiPhong.getText().equals("")) {
            sb.append("Loại phòng không được để trống\n");
        }
        if (txtSoTang.getText().equals("")) {
            sb.append("Số tầng không được để trống\n");
        }
        if (sb.length() > 0) {
            JOptionPane.showMessageDialog(rootPane,
                    sb.toString(), "Backup problem", JOptionPane.WARNING_MESSAGE);
            return;
        }

        //kiểm tra sau khi xóa 
        int max = 0;
        for (Phong item : listPhong) {
            if (Integer.parseInt(item.getMaPhong().substring(2)) > max) {
                max = Integer.parseInt(item.getMaPhong().substring(2));
                id = max + 1;
            }
        }

        String maPhong = "MP" + id++;
        int soTang =0;
        int loaiPhong =0;
        double giaPhong =0;
        String trangThai = "Con Trong";
        try {
             soTang = Integer.parseInt(txtSoTang.getText());
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null,"Bạn đã nhập sai định dạng số tầng\n Xin vui lòng nhập sô ", "Thông bápo",JOptionPane.CANCEL_OPTION);
        }
        try {
             loaiPhong =Integer.parseInt(txtLoaiPhong.getText());
        } catch (Exception e) {
             JOptionPane.showConfirmDialog(null,"Bạn đã nhập sai định dạng loại phòng\n Xin vui lòng nhập sô ", "Thông bápo",JOptionPane.CANCEL_OPTION);
        }
        try {
            giaPhong= Double.parseDouble(txtGiaPhong.getText());
        } catch (Exception e) {
             JOptionPane.showConfirmDialog(null,"Bạn đã nhập sai định dạng giá phòng\n Xin vui lòng nhập sô tiền cụ thể ", "Thông bápo",JOptionPane.CANCEL_OPTION);
        }
        if(soTang==0 || loaiPhong==0 || giaPhong==0){
            System.out.println("lỗi");
        }
        else if(soTang>50 || soTang <0){
         JOptionPane.showConfirmDialog(null,"Khách sạn chỉ tối đa 50 tầng\nHãy nhập tầng khác bé hơn 50 và lớn hơn 0 ", "Thông báo",JOptionPane.CANCEL_OPTION);    
        }
        if(  loaiPhong >4 || loaiPhong <1){
             JOptionPane.showConfirmDialog(null,"Xin thông báo chỉ có loại phòng\n 1 người\n2 người\n3 người \n4 người\n Hãy nhập loại phòng thích hợp ", "Thông báo",JOptionPane.CANCEL_OPTION); 
        }
        else { 
           
             Phong phong = new Phong(maPhong, soTang, soTang, trangThai, giaPhong);
        listPhong.add(phong);
        tableModel.addRow(new Object[]{maPhong, soTang, loaiPhong, trangThai, giaPhong});
        file.delete();
        docGhiFile.ghiFilePhong(listPhong);
        resetForm();
        }
        
        
        
       
    }//GEN-LAST:event_ThemThongTinActionPerformed
   
    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
       
    }//GEN-LAST:event_formWindowClosing
  
    private void txtSoTangFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSoTangFocusLost

    }//GEN-LAST:event_txtSoTangFocusLost

    private void txtLoaiPhongFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtLoaiPhongFocusLost

    }//GEN-LAST:event_txtLoaiPhongFocusLost

    private void txtGiaPhongFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtGiaPhongFocusLost

    }//GEN-LAST:event_txtGiaPhongFocusLost

    private void txtTimKiemFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTimKiemFocusLost

    }//GEN-LAST:event_txtTimKiemFocusLost

    private void tblPhongMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPhongMouseClicked
        int selectedRow = tblPhong.getSelectedRow();
        if (selectedRow >= 0) {
            String maPhong = (String) tblPhong.getValueAt(selectedRow, 0);
            for (Phong item : listPhong) {
                if (item.getMaPhong().equals(maPhong)) {
                    txtSoTang.setText(Integer.toString(item.getSoTang()));
                    txtLoaiPhong.setText(Integer.toString(item.getLoaiPhong()));
                    txtGiaPhong.setText(Double.toString(item.getGiaPhong()));
                    break;
                }
            }
        }
    }//GEN-LAST:event_tblPhongMouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
close();
 new Menu().setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnReSetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReSetActionPerformed
  txtGiaPhong.setText("");
  txtLoaiPhong.setText("");
  txtSoTang.setText("");
  txtTimKiem.setText("");
        // TODO add your handling code here:
    }//GEN-LAST:event_btnReSetActionPerformed
public void close(){
       WindowEvent closeWindow= new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
       Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
   }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
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
            java.util.logging.Logger.getLogger(NhapThongTinPhong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NhapThongTinPhong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NhapThongTinPhong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NhapThongTinPhong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NhapThongTinPhong().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ChinhSua;
    private javax.swing.JButton ThemThongTin;
    private javax.swing.JComboBox<String> boxSapXep;
    private javax.swing.JButton btnLocThongTin;
    private javax.swing.JButton btnReSet;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane tablePhong;
    private javax.swing.JTable tblPhong;
    private javax.swing.JTextField txtGiaPhong;
    private javax.swing.JTextField txtLoaiPhong;
    private javax.swing.JTextField txtSoTang;
    private javax.swing.JTextField txtTimKiem;
    private javax.swing.JButton xoa;
    // End of variables declaration//GEN-END:variables
}
