/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form;

import dao.NhanVienDAO;
import java.io.File;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.table.DefaultTableModel;
import phuongtien.Auth;
import phuongtien.MsgBox;
import phuongtien.XImage;
import thucthe.NhanVien;

/**
 *
 * @author Thanh Lam
 */
public class NhanVienJDialog extends javax.swing.JDialog {

    NhanVienDAO nvdao = new NhanVienDAO();
    int row = 0;
    JFileChooser fileChooser = new JFileChooser();

    /**
     * Creates new form NhanVienJDialog
     */
    public NhanVienJDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        init();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        tabNhanVien = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtMaNhanVien = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtHoTen = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        rdoQuanLy = new javax.swing.JRadioButton();
        rdoNhanVien = new javax.swing.JRadioButton();
        btnThem = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnLamMoi = new javax.swing.JButton();
        lblHinhAnh = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtSoDienThoai = new javax.swing.JTextField();
        txtMatKhau = new javax.swing.JPasswordField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblNhanVien = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 51), 5));

        tabNhanVien.setBackground(new java.awt.Color(255, 255, 255));
        tabNhanVien.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("M?? nh??n vi??n  :");

        txtMaNhanVien.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtMaNhanVien.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("M???t kh???u :");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("H??? t??n :");

        txtHoTen.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtHoTen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Vai tr?? :");

        buttonGroup1.add(rdoQuanLy);
        rdoQuanLy.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        rdoQuanLy.setForeground(new java.awt.Color(255, 255, 255));
        rdoQuanLy.setText("Qu???n l?? ");

        buttonGroup1.add(rdoNhanVien);
        rdoNhanVien.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        rdoNhanVien.setForeground(new java.awt.Color(255, 255, 255));
        rdoNhanVien.setText("Nh??n vi??n");

        btnThem.setBackground(new java.awt.Color(255, 153, 51));
        btnThem.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hinhanh/add_48px.png"))); // NOI18N
        btnThem.setText("Th??m ");
        btnThem.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnXoa.setBackground(new java.awt.Color(255, 153, 51));
        btnXoa.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hinhanh/delete_40px.png"))); // NOI18N
        btnXoa.setText("X??a");
        btnXoa.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnSua.setBackground(new java.awt.Color(255, 153, 51));
        btnSua.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hinhanh/update_48px.png"))); // NOI18N
        btnSua.setText("C???p nh???t");
        btnSua.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnLamMoi.setBackground(new java.awt.Color(255, 153, 51));
        btnLamMoi.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnLamMoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hinhanh/refresh_48px.png"))); // NOI18N
        btnLamMoi.setText("L??m m???i");
        btnLamMoi.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        btnLamMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLamMoiActionPerformed(evt);
            }
        });

        lblHinhAnh.setBackground(new java.awt.Color(255, 255, 255));
        lblHinhAnh.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblHinhAnh.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHinhAnh.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        lblHinhAnh.setOpaque(true);
        lblHinhAnh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblHinhAnhMousePressed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("S??? ??i???n tho???i :");

        txtSoDienThoai.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtSoDienThoai.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));

        txtMatKhau.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblHinhAnh, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel5)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(jLabel3)
                                            .addGap(52, 52, 52)
                                            .addComponent(txtMatKhau))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                            .addComponent(jLabel2)
                                            .addGap(18, 18, 18)
                                            .addComponent(txtMaNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(rdoQuanLy, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(rdoNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(txtHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(249, 249, 249)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnLamMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtSoDienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtMaNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMatKhau, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(rdoQuanLy)
                            .addComponent(rdoNhanVien))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtSoDienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lblHinhAnh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLamMoi)
                    .addComponent(btnSua)
                    .addComponent(btnXoa)
                    .addComponent(btnThem))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        tabNhanVien.addTab("Th??ng tin nh??n vi??n", new javax.swing.ImageIcon(getClass().getResource("/hinhanh/change_48px.png")), jPanel2); // NOI18N

        jPanel3.setBackground(new java.awt.Color(0, 153, 153));
        jPanel3.setToolTipText("HOPE - QU???N L?? NH??N VI??N");

        tblNhanVien.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153), 3));
        tblNhanVien.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tblNhanVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "M?? NH??N VI??N", "M???T KH???U", "H??? V?? T??N", "S??? ??I???N THO???I", "VAI TR??", "H??NH"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblNhanVien.setRowHeight(30);
        tblNhanVien.setSelectionBackground(new java.awt.Color(0, 166, 245));
        tblNhanVien.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblNhanVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblNhanVienMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tblNhanVien);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 711, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabNhanVien.addTab("Danh s??ch nh??n vi??n", new javax.swing.ImageIcon(getClass().getResource("/hinhanh/search_in_list_48px.png")), jPanel3); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabNhanVien)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabNhanVien)
                .addContainerGap())
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

    private void tblNhanVienMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblNhanVienMousePressed
        if (evt.getClickCount() == 2) {
            this.row = tblNhanVien.rowAtPoint(evt.getPoint());
            edit();
        }
    }//GEN-LAST:event_tblNhanVienMousePressed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        insert();
    }//GEN-LAST:event_btnThemActionPerformed

    private void lblHinhAnhMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHinhAnhMousePressed
        if (evt.getClickCount() == 2) {
            chonAnh();
        }
    }//GEN-LAST:event_lblHinhAnhMousePressed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        delete();
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        update();
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnLamMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLamMoiActionPerformed
        clearForm();
    }//GEN-LAST:event_btnLamMoiActionPerformed

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
            java.util.logging.Logger.getLogger(NhanVienJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NhanVienJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NhanVienJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NhanVienJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                NhanVienJDialog dialog = new NhanVienJDialog(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnLamMoi;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblHinhAnh;
    private javax.swing.JRadioButton rdoNhanVien;
    private javax.swing.JRadioButton rdoQuanLy;
    private javax.swing.JTabbedPane tabNhanVien;
    private javax.swing.JTable tblNhanVien;
    private javax.swing.JTextField txtHoTen;
    private javax.swing.JTextField txtMaNhanVien;
    private javax.swing.JPasswordField txtMatKhau;
    private javax.swing.JTextField txtSoDienThoai;
    // End of variables declaration//GEN-END:variables

    private void init() {
        setLocationRelativeTo(null);
        this.setIconImage(XImage.getLogo());
        fillTable();
    }

    private void fillTable() {
        DefaultTableModel model = (DefaultTableModel) tblNhanVien.getModel();
        model.setRowCount(0);
        try {
            List<NhanVien> list = nvdao.selectAll();
            for (NhanVien nv : list) {
                Object[] row = {
                    nv.getMaNhanVien(),
                    nv.getMatKhau(),
                    nv.getHoTen(),
                    nv.getSoDienThoai(),
                    nv.isVaiTro() ? "Qu???n l??" : "Nh??n vi??n",
                    nv.getHinh()
                };
                model.addRow(row);
            }
        } catch (Exception e) {
            MsgBox.alert(this, "L???i truy v???n d??? li???u !");
        }
    }

    private void edit() {
        try {
            String maNV = (String) tblNhanVien.getValueAt(this.row, 0);
            NhanVien nv = nvdao.selectById(maNV);
            if (nv != null) {
                setForm(nv);
                updateStatus();
                tabNhanVien.setSelectedIndex(0);
            }
        } catch (Exception e) {
            MsgBox.alert(this, "L???i truy v???n d??? li???u !");
        }
    }

    private void setForm(NhanVien model) {
        txtMaNhanVien.setText(model.getMaNhanVien());
        txtMatKhau.setText(model.getMatKhau());
        txtHoTen.setText(model.getHoTen());
        rdoQuanLy.setSelected(model.isVaiTro());
        rdoNhanVien.setSelected(!model.isVaiTro());
        txtSoDienThoai.setText(model.getSoDienThoai());
        String hinh = model.getHinh() + "";
        if (!hinh.equals("null")) {
            lblHinhAnh.setIcon(XImage.readNhanVien(model.getHinh()));
            lblHinhAnh.setToolTipText(model.getHinh());
        }
    }

    private void updateStatus() {
        boolean edit = this.row >= 0;
        txtMaNhanVien.setEditable(!edit);
        btnThem.setEnabled(!edit);
        btnSua.setEnabled(edit);
        btnXoa.setEnabled(edit);
    }

    private void insert() {
        if (validateForm() == true) {
            NhanVien model = getForm();
            try {
                nvdao.insert(model);
                this.fillTable();
                this.clearForm();
                MsgBox.alertSuccessful(this, "Th??m nh??n vi??n th??nh c??ng !");
            } catch (Exception e) {
                MsgBox.alert(this, "Th??m nh??n vi??n th???t b???i !");
            }
        }
    }

    private boolean validateForm() {
        String maNV = txtMaNhanVien.getText();
        String matKhau = new String(txtMatKhau.getPassword());
        if (maNV.equals("")) {
            MsgBox.alert(this, "B???n ch??a nh???p m?? nh??n vi??n !");
            return false;
        }
        NhanVien nv = nvdao.selectById(maNV);//ki???m tra xem m?? nh??n vi??n c?? tr??ng kh??ng
        if (nv == null) {
            if (matKhau.equals("")) {
                MsgBox.alert(this, "B???n ch??a nh???p m???t kh???u !");
                return false;
            }
            if (txtHoTen.getText().equals("")) {
                MsgBox.alert(this, "B???n ch??a nh???p h??? v?? t??n !");
                return false;
            }
            if (txtSoDienThoai.getText().equals("")) {
                MsgBox.alert(this, "B???n ch??a nh???p s??? ??i???n tho???i !");
                return false;
            }
            Pattern pattern = Pattern.compile("0\\d{9}");
            Matcher matcher = pattern.matcher(txtSoDienThoai.getText());
            if (!matcher.find()) {
                MsgBox.alert(this, "S??? ??i???n tho???i kh??ng h???p l??? !");
                return false;
            }
        } else {
            MsgBox.alert(this, "M?? nh??n vi??n ???? t???n t???i !");
            return false;
        }
        return true;
    }

    private NhanVien getForm() {
        NhanVien model = new NhanVien();
        model.setMaNhanVien(txtMaNhanVien.getText());
        model.setMatKhau(new String(txtMatKhau.getPassword()));
        model.setHoTen(txtHoTen.getText());
        model.setVaiTro(rdoQuanLy.isSelected());
        model.setSoDienThoai(txtSoDienThoai.getText());
        model.setHinh(lblHinhAnh.getToolTipText());
        return model;
    }

    private void clearForm() {
        this.setForm(new NhanVien());
        this.updateStatus();
        row = - 1;
        updateStatus();
        lblHinhAnh.setIcon(null);
    }

    private void chonAnh() {
        if (fileChooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            XImage.saveNhanVien(file);
            ImageIcon icon = XImage.readNhanVien(file.getName());
            lblHinhAnh.setIcon(icon);
            lblHinhAnh.setToolTipText(file.getName());
        }
    }

    private void delete() {
        if (!Auth.isManager()) {
            MsgBox.alert(this, "B???n kh??ng c?? quy???n x??a nh??n vi??n !");
        } else {
            if (MsgBox.confirm(this, "B???n th???c s??? mu???n x??a nh??n vi??n n??y ?"));
            String manv = txtMaNhanVien.getText();
            try {
                nvdao.delete(manv);
                this.fillTable();
                this.clearForm();
                MsgBox.alertSuccessful(this, "Nh??n vi??n ???? b??? x??a !");
            } catch (Exception e) {
                MsgBox.alert(this, "X??a nh??n vi??n th???t b???i !");
            }
        }
    }

    private void update() {
        boolean ok = true;//ki???m tra ng?????i d??ng ???? ??i???n ?????y ????? ch??a khi c???p nh???t
        String matKhau = new String(txtMatKhau.getPassword());//kh??ng g???i lu??n validateform v?? validateform c??n check tr??ng m?? n???a
        if (matKhau.equals("")) {
            MsgBox.alert(this, "B???n ch??a nh???p m???t kh???u !");
            ok = false;
        }
        if (txtHoTen.getText().equals("")) {
            MsgBox.alert(this, "B???n ch??a nh???p h??? v?? t??n !");
            ok = false;
        }
        if (txtSoDienThoai.getText().equals("")) {
            MsgBox.alert(this, "B???n ch??a nh???p s??? ??i???n tho???i !");
            ok = false;
        }
        Pattern pattern = Pattern.compile("0\\d{9}");
        Matcher matcher = pattern.matcher(txtSoDienThoai.getText());
        if (!matcher.find()) {
            MsgBox.alert(this, "S??? ??i???n tho???i kh??ng h???p l??? !");
            ok = false;
        }
        if (ok == true) {
            NhanVien model = getForm();
            try {
                nvdao.update(model);
                this.fillTable();
                MsgBox.alertSuccessful(this, "C???p nh???t nh??n vi??n th??nh c??ng !");
            } catch (Exception e) {
                MsgBox.alert(this, "C???p nh???t nh??n vi??n th???t b???i !");
            }
        } else {
            MsgBox.alert(this, "Vui l??ng ??i???n ?????y ????? th??ng tin !");
        }
    }
}
