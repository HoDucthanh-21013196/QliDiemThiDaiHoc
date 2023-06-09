/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package View;

import Model.*;
import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ASUS
 */
public class AddQliDiemThi extends javax.swing.JDialog {

    /**
     * Creates new form AddQliDiemThi
     */
    private HomeFrm1 home;
    
    private List<ThiSinh> TS;
    private List<Diem_Thi> DT;
    private List<ThongTinPhongThi> PT;
    
    private DefaultTableModel modelTS;
    private DefaultTableModel modelPT;
    private DefaultTableModel modelDT;
    public AddQliDiemThi(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        home = (HomeFrm1) parent;
        TS = new ArrayList<>();
        PT = new ArrayList<>();
        DT = new ArrayList<>();
        TS.addAll(home.getThiSinhs());
        PT.addAll(home.getThongTinPhongThis());
        DT.addAll(home.getDiem_This());
        modelTS = (DefaultTableModel) QliThiSinhTable.getModel();
        modelPT = (DefaultTableModel) QliPhongThiTable.getModel();
        modelDT = (DefaultTableModel) QliDiemThiTable.getModel();
        showTS();
        showPT();
        showDT();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        QliThiSinhTable = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        QliPhongThiTable = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        QliDiemThiTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        QliSbdText = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        QliHoTenText = new javax.swing.JTextField();
        QliAddBtn = new javax.swing.JButton();
        QliCancelBtn = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 153, 255));
        jLabel4.setText("Thông Tin Thí Sinh");

        QliThiSinhTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SBD", "Họ Tên", "Số Điện Thoại", "Khối Thi"
            }
        ));
        jScrollPane4.setViewportView(QliThiSinhTable);

        jLabel5.setBackground(new java.awt.Color(204, 204, 255));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 153, 255));
        jLabel5.setText("Thông Tin Phòng Thi");

        QliPhongThiTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SBD", "Họ Tên", "Phòng Thi", "Người Giám Hộ"
            }
        ));
        jScrollPane5.setViewportView(QliPhongThiTable);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 153, 255));
        jLabel3.setText("Thông Tin Kết Quả Thi");

        QliDiemThiTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SBD", "Họ Tên", "Điểm Toán", "Điểm Văn", "Điểm Anh", "Điểm Tổ Hợp"
            }
        ));
        jScrollPane3.setViewportView(QliDiemThiTable);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText(" Nhập Số Báo Danh");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText(" Nhập Họ Tên");

        QliAddBtn.setBackground(new java.awt.Color(204, 204, 255));
        QliAddBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        QliAddBtn.setText("Add");
        QliAddBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QliAddBtnActionPerformed(evt);
            }
        });

        QliCancelBtn.setBackground(new java.awt.Color(204, 204, 255));
        QliCancelBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        QliCancelBtn.setText("Cancel");
        QliCancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QliCancelBtnActionPerformed(evt);
            }
        });

        jMenuBar1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jMenu1.setText("File");

        jMenuItem1.setText("Open");
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Save");
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Exit");
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");

        jMenuItem4.setText("About me");
        jMenu2.add(jMenuItem4);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(jLabel4)
                        .addGap(331, 331, 331)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 877, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(QliSbdText)
                            .addComponent(QliHoTenText, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE))
                        .addGap(74, 74, 74)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(QliAddBtn)
                            .addComponent(QliCancelBtn))))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(24, 24, 24)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(QliSbdText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(QliAddBtn))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(QliHoTenText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(QliCancelBtn))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void QliAddBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QliAddBtnActionPerformed
        int TSIndex = QliThiSinhTable.getSelectedRow();
        int PTIndex = QliPhongThiTable.getSelectedRow();
        int DTIndex = QliDiemThiTable.getSelectedRow();
        
        if (TSIndex == -1 || PTIndex == -1 || DTIndex == -1) {
            JOptionPane.showMessageDialog(rootPane, "Hãy chọn thí sinh, phòng thi và điểm thi cần thêm ");
        }
        else {
            if ((TS.get(TSIndex).getSbd()).matches(PT.get(PTIndex).getSbd()) 
                    && (TS.get(TSIndex).getSbd()).matches(DT.get(DTIndex).getSbd())
                    && (TS.get(TSIndex).getTen_thi_sinh()).matches(DT.get(DTIndex).getTen_thi_sinh())
                    && (TS.get(TSIndex).getTen_thi_sinh()).matches(PT.get(PTIndex).getTen_thi_sinh())) {
                ThiSinh ts = TS.get(TSIndex);
                ThongTinPhongThi pt = PT.get(PTIndex);
                Diem_Thi dt = DT.get(DTIndex);
                if (home.addQliDiemThi(ts, pt, dt)) {
                    JOptionPane.showMessageDialog(rootPane, "Đã thêm thành công thông tin điểm thi của thí sinh vào bảng");
                    this.dispose();
                }
            }
            else {
                JOptionPane.showMessageDialog(rootPane, "Số báo danh và họ tên không trùng khớp với nhau");        
            } 
        }
    }//GEN-LAST:event_QliAddBtnActionPerformed

    private void QliCancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QliCancelBtnActionPerformed
        this.dispose();
    }//GEN-LAST:event_QliCancelBtnActionPerformed

//    public boolean KiemtraTrung(String ) {
//        
//        return true;
//    }
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
            java.util.logging.Logger.getLogger(AddQliDiemThi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddQliDiemThi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddQliDiemThi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddQliDiemThi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AddQliDiemThi dialog = new AddQliDiemThi(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton QliAddBtn;
    private javax.swing.JButton QliCancelBtn;
    private javax.swing.JTable QliDiemThiTable;
    private javax.swing.JTextField QliHoTenText;
    private javax.swing.JTable QliPhongThiTable;
    private javax.swing.JTextField QliSbdText;
    private javax.swing.JTable QliThiSinhTable;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    // End of variables declaration//GEN-END:variables

    private void showTS() {
        modelTS.setRowCount(0);
        for (ThiSinh ts : TS) {
            modelTS.addRow(new Object[] {
                ts.getSbd(), ts.getTen_thi_sinh(), ts.getSdt(), ts.getKhoi_thi()
            });
        }
    }

    private void showPT() {
       modelPT.setRowCount(0);
       for (ThongTinPhongThi pt : PT) {
           modelPT.addRow(new Object[] {
               pt.getSbd(), pt.getTen_thi_sinh(), pt.getPhongthi(), pt.getNguoi_giam_ho()
           });
       }
    }

    private void showDT() {
        modelDT.setRowCount(0);
        for (Diem_Thi dt : DT) {
            modelDT.addRow(new Object[] {
                dt.getSbd(), dt.getTen_thi_sinh(), dt.getDiem_Toan(), dt.getDiem_Van(), dt.getDiem_Anh(), dt.getDiem_Tohop()
            });
        }
    }
}
