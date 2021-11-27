/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testproject.view;

import com.opencsv.exceptions.CsvValidationException;
import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
//import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import testproject.model.DocGhiFile;
import testproject.model.DatPhong;
import testproject.model.Phong;

/**
 *
 * @author phuon
 */
public class DatPhongView extends javax.swing.JFrame {

    /**
     * Creates new form DatPhong
     */
    DefaultTableModel tableModel;
    int id = 0;

    List<DatPhong> listDP = new ArrayList<>();
    List<Phong> listP = new ArrayList<>();
    DocGhiFile docGhiFile = new DocGhiFile();
    private static final String curentDir = System.getProperty("user.dir");
    private static final String separator = File.separator;
    private static final String PATH_FILE_CSV_DatPhong = curentDir + separator + "data" + separator + "DatPhong.csv";
    private static final String PATH_FILE_CSV_PHONG = curentDir + separator + "data" + separator + "Phong.csv";
    public static File fileDP = new File(PATH_FILE_CSV_DatPhong);
    public static File fileP = new File(PATH_FILE_CSV_PHONG);

    public DatPhongView() {
        this.dispose();
        System.out.println(PATH_FILE_CSV_DatPhong);
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Nhập thông tin đặt phòng");
        tableModel = (DefaultTableModel) tblDatPhong.getModel();

        if (fileDP.exists()) {
            try {
                listDP = docGhiFile.docFileDatPhong();
                String ma = listDP.get(listDP.size() - 1).getMaDatPhong();
                id = Integer.parseInt(ma.substring(2)) + 1;
                hienTHi(listDP);
            } catch (CsvValidationException ex) {
                Logger.getLogger(DatPhongView.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ParseException ex) {
                Logger.getLogger(DatPhongView.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (fileP.exists()) {

            try {
                listP = docGhiFile.docFilePhong();
            } catch (CsvValidationException ex) {
                Logger.getLogger(DatPhongView.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }

    public void hienTHi(List<DatPhong> DatPhong) {
        tableModel.setRowCount(0);
        SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
        for (DatPhong item : DatPhong) {
            String maDatPhong = item.getMaDatPhong();
            String maPhong = item.getMaPhong();
            String maKhachHang = item.getMaKhachHang();
            Date ngayDat = item.getNgayDat();
            Date ngayTra = item.getNgayTra();
            double thanhToan = item.getTongTien();

            tableModel.addRow(new Object[]{maDatPhong, maPhong, maKhachHang, df.format(ngayDat), df.format(ngayTra), thanhToan});
        }
    }

    public double ThanhToan(Date ngayDat, Date ngayTra, double giaPhong) {
        long getDate = ngayTra.getTime() - ngayDat.getTime();
        long Days = TimeUnit.MILLISECONDS.toDays(getDate);

        return giaPhong * (double) Days;
    }

    public void reset() {
        txtMaPhong.setText("");
        txtMaKhachHang.setText("");

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtMaPhong = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtMaKhachHang = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnDatPhong = new javax.swing.JButton();
        chinhSua = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnSort = new javax.swing.JButton();
        btnFinding = new javax.swing.JButton();
        txtFind = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDatPhong = new javax.swing.JTable();
        btnReset = new javax.swing.JButton();
        txtSort = new javax.swing.JComboBox<>();
        txtNgayDat = new com.toedter.calendar.JDateChooser();
        txtNgayTra = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(190, 220, 227));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Đặt Phòng");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1044, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 217, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Mã Phòng: ");

        txtMaPhong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaPhongActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Mã Khách Hàng: ");

        txtMaKhachHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaKhachHangActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Ngày đặt:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Ngày trả:");

        btnDatPhong.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnDatPhong.setText("Đặt Phòng");
        btnDatPhong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDatPhongActionPerformed(evt);
            }
        });

        chinhSua.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        chinhSua.setText("Chỉnh sửa ");
        chinhSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chinhSuaActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnDelete.setText("Xóa");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnSort.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnSort.setText("Sắp xếp");
        btnSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSortActionPerformed(evt);
            }
        });

        btnFinding.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnFinding.setText("Tìm kiếm");
        btnFinding.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindingActionPerformed(evt);
            }
        });

        txtFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFindActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Tìm kiếm: ");

        tblDatPhong.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Đặt Phòng", "Mã Phòng", "Mã Khách Hàng", "Ngày Đặt", "Ngày Trả", "Tổng Tiền"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblDatPhong.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDatPhongMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblDatPhong);
        if (tblDatPhong.getColumnModel().getColumnCount() > 0) {
            tblDatPhong.getColumnModel().getColumn(0).setMinWidth(100);
            tblDatPhong.getColumnModel().getColumn(0).setMaxWidth(50);
            tblDatPhong.getColumnModel().getColumn(1).setMinWidth(100);
            tblDatPhong.getColumnModel().getColumn(1).setMaxWidth(50);
            tblDatPhong.getColumnModel().getColumn(2).setMinWidth(100);
            tblDatPhong.getColumnModel().getColumn(2).setMaxWidth(50);
        }

        btnReset.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        txtSort.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ma Phong", "Ma Khach Hang", "Tong Tien" }));
        txtSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSortActionPerformed(evt);
            }
        });

        txtNgayDat.setDateFormatString("dd-MM-yyyy");

        txtNgayTra.setDateFormatString("dd-MM-yyyy");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(10, 10, 10)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtMaPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(74, 74, 74)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)))
                            .addComponent(txtMaKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFind, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNgayTra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNgayDat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnDatPhong)
                        .addGap(18, 18, 18)
                        .addComponent(chinhSua)
                        .addGap(18, 18, 18)
                        .addComponent(btnDelete)
                        .addGap(18, 18, 18)
                        .addComponent(btnFinding)
                        .addGap(18, 18, 18)
                        .addComponent(btnReset)
                        .addGap(18, 18, 18)
                        .addComponent(btnSort)
                        .addGap(18, 18, 18)
                        .addComponent(txtSort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(398, Short.MAX_VALUE))
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel2)
                        .addGap(74, 74, 74)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(txtMaKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnDatPhong)
                            .addComponent(chinhSua)
                            .addComponent(btnDelete)
                            .addComponent(btnFinding)
                            .addComponent(btnReset)
                            .addComponent(btnSort)
                            .addComponent(txtSort, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel3)
                                    .addComponent(txtMaPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(33, 33, 33)
                                .addComponent(jLabel6))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtNgayDat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtNgayTra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtFind, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtMaPhongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaPhongActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaPhongActionPerformed

    private void txtMaKhachHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaKhachHangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaKhachHangActionPerformed

    private void chinhSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chinhSuaActionPerformed
        int selectedRow = tblDatPhong.getSelectedRow();
        if (selectedRow >= 0) {
            String maDatPhong = (String) tblDatPhong.getValueAt(selectedRow, 0);
            for (DatPhong item : listDP) {
                if (maDatPhong.equals(item.getMaDatPhong())) {
                    item.setMaPhong(txtMaPhong.getText());
                    item.setMaKhachHang(txtMaKhachHang.getText());
                    item.setNgayDat(txtNgayDat.getDate());
                    item.setNgayTra(txtNgayTra.getDate());
                    break;
                }
            }
            fileDP.delete();
            docGhiFile.ghiFileDatPhong(listDP);
            hienTHi(listDP);
            reset();
        }
    }//GEN-LAST:event_chinhSuaActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        int selectedRow = tblDatPhong.getSelectedRow();
        if (selectedRow >= 0) {
            String maDatPhong = (String) tblDatPhong.getValueAt(selectedRow, 0);
            for (DatPhong item : listDP) {
                if (maDatPhong.equals(item.getMaDatPhong())) {
                    listDP.remove(item);
                    break;
                }
            }
            String maPhong = (String) tblDatPhong.getValueAt(selectedRow, 1);
            for (Phong item : listP) {
            if (item.getMaPhong().equals(maPhong)) {
                item.setTrangThai("Con Trong");
                break;
            } 
        }
            fileP.delete();
            docGhiFile.ghiFilePhong(listP);
            fileDP.delete();
            docGhiFile.ghiFileDatPhong(listDP);
            hienTHi(listDP);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSortActionPerformed
        if (txtSort.getSelectedItem().equals("Ma Phong")) {
            Collections.sort(listDP, new Comparator<DatPhong>() {
                @Override
                public int compare(DatPhong o1, DatPhong o2) {
                    int item1 = Integer.parseInt(o1.getMaPhong().substring(2));
                    int item2 = Integer.parseInt(o2.getMaPhong().substring(2));
                    return item1 > item2 ? 1 : -1;
                }

            });
        } else if (txtSort.getSelectedItem().equals("Ma Khach Hang")) {
            Collections.sort(listDP, new Comparator<DatPhong>() {
                @Override
                public int compare(DatPhong o1, DatPhong o2) {
                    int item1 = Integer.parseInt(o1.getMaKhachHang().substring(2));
                    int item2 = Integer.parseInt(o2.getMaKhachHang().substring(2));
                    return item1 > item2 ? 1 : -1;
                }
            });
        } else if (txtSort.getSelectedItem().equals("Tong Tien")) {
            Collections.sort(listDP, new Comparator<DatPhong>() {
                @Override
                public int compare(DatPhong o1, DatPhong o2) {
                    return o1.getTongTien() > o2.getTongTien() ? 1 : -1;
                }
            });
        }
        hienTHi(listDP);
    }//GEN-LAST:event_btnSortActionPerformed

    private void btnFindingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindingActionPerformed
        String textFinding = txtFind.getText();
        tableModel.setRowCount(0);
        boolean flagFinding = false;
        for (DatPhong item : listDP) {
            if (item.getMaDatPhong().equals(textFinding)) {
                String maDatPhong = item.getMaDatPhong();
                String maPhong = item.getMaPhong();
                String maKhachHang = item.getMaKhachHang();
                Date ngayDat = item.getNgayDat();
                Date ngayTra = item.getNgayTra();
                double thanhToan = item.getTongTien();
                flagFinding = true;

                tableModel.addRow(new Object[]{maDatPhong, maPhong, maKhachHang, ngayDat, ngayTra, thanhToan});
            } else if (item.getMaPhong().equals(textFinding)) {
                String maDatPhong = item.getMaDatPhong();
                String maPhong = item.getMaPhong();
                String maKhachHang = item.getMaKhachHang();
                Date ngayDat = item.getNgayDat();
                Date ngayTra = item.getNgayTra();
                double thanhToan = item.getTongTien();
                flagFinding = true;

                tableModel.addRow(new Object[]{maDatPhong, maPhong, maKhachHang, ngayDat, ngayTra, thanhToan});
            } else if (item.getMaKhachHang().equals(textFinding)) {
                String maDatPhong = item.getMaDatPhong();
                String maPhong = item.getMaPhong();
                String maKhachHang = item.getMaKhachHang();
                Date ngayDat = item.getNgayDat();
                Date ngayTra = item.getNgayTra();
                double thanhToan = item.getTongTien();
                flagFinding = true;

                tableModel.addRow(new Object[]{maDatPhong, maPhong, maKhachHang, ngayDat, ngayTra, thanhToan});
            }
        }
        if (flagFinding == false) {
            JOptionPane.showMessageDialog(rootPane, "Không tìm thấy thông tin đặt phòng");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFindingActionPerformed

    private void btnDatPhongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDatPhongActionPerformed
        String maPhong = txtMaPhong.getText();
        boolean flag = false;
        
        for (Phong item : listP) {
            if (item.getMaPhong().equals(maPhong) && item.getTrangThai().equals("Con Trong")) {
                Date ngayDat = txtNgayDat.getDate();
                Date ngayTra = txtNgayTra.getDate();
                String maDatPhong = "DP" + id++;
                String maKhachHang = txtMaKhachHang.getText();
                item.setTrangThai("Da dat");
                double giaPhong = item.getGiaPhong();
                Double TongTien = ThanhToan(ngayDat, ngayTra, giaPhong);
                DatPhong dp = new DatPhong(maDatPhong, maPhong, maKhachHang, ngayDat, ngayTra, TongTien);
                listDP.add(dp);
                tableModel.addRow(new Object[]{maDatPhong, maPhong, maKhachHang, ngayDat, ngayTra, TongTien});
                fileDP.delete();
                docGhiFile.ghiFileDatPhong(listDP);
                fileP.delete();
                docGhiFile.ghiFilePhong(listP);
                hienTHi(listDP);
                reset();
                flag = true;
                break;
            } 
        }
        if (flag == false) {
                JOptionPane.showMessageDialog(rootPane, "Mã Phòng không hợp lệ hoặc đã được đặt");
            }

//        Xử lý set trạng thái phòng tương ứng với mã phòng

    }//GEN-LAST:event_btnDatPhongActionPerformed

    private void txtFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFindActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFindActionPerformed

    private void tblDatPhongMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDatPhongMouseClicked
        int selectedRow = tblDatPhong.getSelectedRow();
        if (selectedRow >= 0) {
            String maDatPhong = (String) tblDatPhong.getValueAt(selectedRow, 0);
            for (DatPhong item : listDP) {
                if (maDatPhong.equals(item.getMaDatPhong())) {
                    txtMaPhong.setText(item.getMaPhong());
                    txtMaKhachHang.setText(item.getMaKhachHang());
                    txtNgayDat.setDate(item.getNgayDat());
                    txtNgayTra.setDate(item.getNgayTra());
                    break;
                }
            }
        }
    }//GEN-LAST:event_tblDatPhongMouseClicked

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        hienTHi(listDP);
    }//GEN-LAST:event_btnResetActionPerformed

    private void txtSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSortActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSortActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main() {
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
            java.util.logging.Logger.getLogger(DatPhongView.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DatPhongView.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DatPhongView.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DatPhongView.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DatPhongView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDatPhong;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnFinding;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSort;
    private javax.swing.JButton chinhSua;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblDatPhong;
    private javax.swing.JTextField txtFind;
    private javax.swing.JTextField txtMaKhachHang;
    private javax.swing.JTextField txtMaPhong;
    private com.toedter.calendar.JDateChooser txtNgayDat;
    private com.toedter.calendar.JDateChooser txtNgayTra;
    private javax.swing.JComboBox<String> txtSort;
    // End of variables declaration//GEN-END:variables
}
