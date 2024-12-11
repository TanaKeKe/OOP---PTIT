///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
// */
//package oop;
//
///**
// *
// * @author buiph
// */
//public class FormThem extends javax.swing.JDialog {
//
//    private MainForm parent;
//    /**
//     * Creates new form FormThem
//     * @param parent
//     * @param modal
//     */
//    public FormThem(java.awt.Frame parent, boolean modal) {
//        super(parent, modal);
//        this.parent = (MainForm) parent;
//        initComponents();
//        setTitle("Them moi mon hoc");
//        setLocation(500,400);
//
//        btnBoQua.addActionListener(e->{
//            dispose();
//        });
//
//        btnThem.addActionListener(e->{
//            String tenMon = txtTenMon.getText();
//            int soTin = Integer.parseInt(txtSoTin.getText());
//            String loaiMon = cbLoaiMon.getSelectedItem().toString();
//            this.parent.themMoi(tenMon, soTin, loaiMon);
//            dispose();
//        });
//
//
//    }
//
//
//    /**
//     * This method is called from within the constructor to initialize the form.
//     * WARNING: Do NOT modify this code. The content of this method is always
//     * regenerated by the Form Editor.
//     */
//    @SuppressWarnings("unchecked")
//    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
//    private void initComponents() {
//
//        jLabel1 = new javax.swing.JLabel();
//        jLabel2 = new javax.swing.JLabel();
//        jLabel3 = new javax.swing.JLabel();
//        txtTenMon = new javax.swing.JTextField();
//        txtSoTin = new javax.swing.JTextField();
//        btnThem = new javax.swing.JButton();
//        btnBoQua = new javax.swing.JButton();
//        cbLoaiMon = new javax.swing.JComboBox<>();
//
//        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
//
//        jLabel1.setText("Tên phòng TH");
//
//        jLabel2.setText("Số máy tính");
//
//        jLabel3.setText("Loại phòng:");
//
//        btnThem.setText("Thêm");
//
//        btnBoQua.setText("Bỏ qua");
//
//        cbLoaiMon.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Thực hành mạng máy tính", "Thực hành oop", "Thực hành CSDL", "Thực hành HĐH" }));
//
//        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
//        getContentPane().setLayout(layout);
//        layout.setHorizontalGroup(
//            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//            .addGroup(layout.createSequentialGroup()
//                .addGap(19, 19, 19)
//                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//                    .addGroup(layout.createSequentialGroup()
//                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
//                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
//                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
//                        .addGap(18, 18, 18)
//                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
//                            .addComponent(txtTenMon, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
//                            .addComponent(txtSoTin))
//                        .addGap(0, 0, Short.MAX_VALUE))
//                    .addGroup(layout.createSequentialGroup()
//                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//                            .addGroup(layout.createSequentialGroup()
//                                .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
//                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
//                                .addComponent(btnBoQua, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
//                            .addGroup(layout.createSequentialGroup()
//                                .addComponent(jLabel3)
//                                .addGap(14, 14, 14)
//                                .addComponent(cbLoaiMon, 0, 198, Short.MAX_VALUE)))
//                        .addGap(15, 15, 15))))
//        );
//        layout.setVerticalGroup(
//            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//            .addGroup(layout.createSequentialGroup()
//                .addGap(26, 26, 26)
//                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//                    .addGroup(layout.createSequentialGroup()
//                        .addComponent(jLabel1)
//                        .addGap(45, 45, 45)
//                        .addComponent(jLabel2))
//                    .addGroup(layout.createSequentialGroup()
//                        .addComponent(txtTenMon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
//                        .addGap(39, 39, 39)
//                        .addComponent(txtSoTin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
//                .addGap(40, 40, 40)
//                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
//                    .addComponent(jLabel3)
//                    .addComponent(cbLoaiMon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
//                .addGap(50, 50, 50)
//                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
//                    .addComponent(btnThem)
//                    .addComponent(btnBoQua))
//                .addContainerGap(56, Short.MAX_VALUE))
//        );
//
//        pack();
//    }// </editor-fold>//GEN-END:initComponents
//
//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(FormThem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(FormThem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(FormThem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(FormThem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the dialog */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                FormThem dialog = new FormThem(new javax.swing.JFrame(), true);
//                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
//                    @Override
//                    public void windowClosing(java.awt.event.WindowEvent e) {
//                        System.exit(0);
//                    }
//                });
//                dialog.setVisible(true);
//            }
//        });
//    }
//
//    // Variables declaration - do not modify//GEN-BEGIN:variables
//    private javax.swing.JButton btnBoQua;
//    private javax.swing.JButton btnThem;
//    private javax.swing.JComboBox<String> cbLoaiMon;
//    private javax.swing.JLabel jLabel1;
//    private javax.swing.JLabel jLabel2;
//    private javax.swing.JLabel jLabel3;
//    private javax.swing.JTextField txtSoTin;
//    private javax.swing.JTextField txtTenMon;
//    // End of variables declaration//GEN-END:variables
//}
