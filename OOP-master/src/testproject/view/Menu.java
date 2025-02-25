/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testproject.view;

import java.awt.Desktop;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.net.URL;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author phuon
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Menu");
    }
public void close(){
       WindowEvent closeWindow= new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
       Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
   }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        datPhongView1 = new testproject.view.DatPhongView();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        nhapThongTinPhong = new javax.swing.JButton();
        nhapThongTinKhachHang = new javax.swing.JButton();
        DatPhong = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        DoanhTHu = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(190, 220, 227));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("HỆ THỐNG QUẢN LÍ KHÁCH SẠN 5 ");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/testproject/view/icon/sao.png"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/testproject/view/icon/back-arrow.png"))); // NOI18N
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(303, 303, 303)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addContainerGap(320, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 60));

        nhapThongTinPhong.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        nhapThongTinPhong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/testproject/view/icon/iconROm.png"))); // NOI18N
        nhapThongTinPhong.setText("Thông Tin Phòng");
        nhapThongTinPhong.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                nhapThongTinPhongFocusLost(evt);
            }
        });
        nhapThongTinPhong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nhapThongTinPhongActionPerformed(evt);
            }
        });
        getContentPane().add(nhapThongTinPhong, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 100, 440, 73));

        nhapThongTinKhachHang.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        nhapThongTinKhachHang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/testproject/view/icon/iconNguoi.png"))); // NOI18N
        nhapThongTinKhachHang.setText("Thông Tin Khách Hàng");
        nhapThongTinKhachHang.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                nhapThongTinKhachHangFocusLost(evt);
            }
        });
        nhapThongTinKhachHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nhapThongTinKhachHangActionPerformed(evt);
            }
        });
        getContentPane().add(nhapThongTinKhachHang, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 180, 440, 77));

        DatPhong.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        DatPhong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/testproject/view/icon/iconBookHotel.png"))); // NOI18N
        DatPhong.setText("Đặt Phòng");
        DatPhong.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                DatPhongFocusLost(evt);
            }
        });
        DatPhong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DatPhongActionPerformed(evt);
            }
        });
        getContentPane().add(DatPhong, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 270, 440, 80));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/testproject/view/icon/icons8-customer-support-48.png"))); // NOI18N
        jButton1.setText("0337356550");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 500, 190, -1));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/testproject/view/icon/icon-fb.png"))); // NOI18N
        jButton2.setText("Lê Trọng Nam");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 570, 195, 60));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/testproject/view/icon/iconIn.png"))); // NOI18N
        jButton3.setText("lenam_108");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 500, 195, 58));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/testproject/view/icon/iconYou.png"))); // NOI18N
        jButton4.setText("KMA_hotel");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 570, 190, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 255, 51));
        jLabel4.setText("Hệ thống hỗ trợ dịch vụ khách sạn trực tuyến");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 460, -1, -1));

        DoanhTHu.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        DoanhTHu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/testproject/view/icon/icon_doanhThu.png"))); // NOI18N
        DoanhTHu.setText("Doanh Thu");
        DoanhTHu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DoanhTHuActionPerformed(evt);
            }
        });
        getContentPane().add(DoanhTHu, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 360, 440, 80));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/testproject/view/icon/icon-wings.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 1370, 380));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/testproject/view/icon/nen-menu.jpg"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 1370, 660));

        jLabel6.setText("jLabel6");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 650, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nhapThongTinPhongFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nhapThongTinPhongFocusLost

    }//GEN-LAST:event_nhapThongTinPhongFocusLost

    private void nhapThongTinKhachHangFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nhapThongTinKhachHangFocusLost

    }//GEN-LAST:event_nhapThongTinKhachHangFocusLost

    private void DatPhongFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_DatPhongFocusLost

    }//GEN-LAST:event_DatPhongFocusLost

    private void nhapThongTinPhongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nhapThongTinPhongActionPerformed
        close();
        NhapThongTinPhong phong = new NhapThongTinPhong();
        phong.setVisible(true);
        phong.pack();
        phong.setLocationRelativeTo(null);
    }//GEN-LAST:event_nhapThongTinPhongActionPerformed

    private void nhapThongTinKhachHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nhapThongTinKhachHangActionPerformed
         close();
        NhapThongTinKhachHang kh = new NhapThongTinKhachHang();
        kh.setVisible(true);
        kh.pack();
        kh.setLocationRelativeTo(null);
    }//GEN-LAST:event_nhapThongTinKhachHangActionPerformed

    private void DatPhongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DatPhongActionPerformed
        close();
        DatPhongView dp = new DatPhongView();
        dp.setVisible(true);
        dp.pack();
        dp.setLocationRelativeTo(null);
    }//GEN-LAST:event_DatPhongActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
      
//         JFrame frame = new JFrame();
//         JOptionPane.showInputDialog(frame, "bạn nhạp gì");
    }//GEN-LAST:event_formWindowClosing

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
//        JOptionPane.showMessageDialog(rootPane,
//                "Đóng chương trình", "Backup problem", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_formWindowClosed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
 JOptionPane.showConfirmDialog(null,"Hãy nhấc điện thoại lên\n Và gọi ngay cho tôi nào","Thông báo", JOptionPane.CLOSED_OPTION);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
 try {
            Desktop.getDesktop().browse(new URL("https://www.facebook.com/sily.kin").toURI());
        } catch (Exception e) {
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
   try {
            Desktop.getDesktop().browse(new URL("https://www.instagram.com/lenam_108/").toURI());
        } catch (Exception e) {
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
 try {
            Desktop.getDesktop().browse(new URL("https://www.youtube.com/channel/UCt4SuWz3kpPiOm7qRCIom0A").toURI());
        } catch (Exception e) {
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void DoanhTHuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DoanhTHuActionPerformed
          close();
        DoanhThu dt = new DoanhThu();
        dt.setVisible(true);
       
    }//GEN-LAST:event_DoanhTHuActionPerformed

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
            int chon=JOptionPane.showConfirmDialog(null, "Bạn có chắc chắn muốn đăng xuất","Thông báo", JOptionPane.YES_NO_OPTION);
         if(chon==JOptionPane.NO_OPTION){
             return ;
         }
          close();
          new DangNhap().setVisible(true);
    }//GEN-LAST:event_jLabel5MouseClicked

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void  run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DatPhong;
    private javax.swing.JButton DoanhTHu;
    private testproject.view.DatPhongView datPhongView1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton nhapThongTinKhachHang;
    private javax.swing.JButton nhapThongTinPhong;
    // End of variables declaration//GEN-END:variables
}
