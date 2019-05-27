/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sms_project;

import database.Mysql;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author CollyneJumah
 */
public class fees extends javax.swing.JPanel {
     private Connection conn;
      private PreparedStatement pst;
     private ResultSet rs;
    /**
     * Creates new form fees
     */
    public fees() {
        initComponents();
        txtFeeOutstanding.setText("30000");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jMenuBar4 = new javax.swing.JMenuBar();
        jMenu8 = new javax.swing.JMenu();
        jMenu9 = new javax.swing.JMenu();
        jMenuBar5 = new javax.swing.JMenuBar();
        jMenu10 = new javax.swing.JMenu();
        jMenu11 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txtPhone = new javax.swing.JTextField();
        txtFeeOutstanding = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtParent = new javax.swing.JTextField();
        txtYear = new javax.swing.JTextField();
        txtBalance = new javax.swing.JTextField();
        txtPayed = new javax.swing.JTextField();
        txtReg = new javax.swing.JTextField();
        cboModePayement = new javax.swing.JComboBox<>();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jCombogender = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtArea = new javax.swing.JTextArea();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        jMenu5.setText("File");
        jMenuBar3.add(jMenu5);

        jMenu6.setText("Edit");
        jMenuBar3.add(jMenu6);

        jMenu7.setText("jMenu7");

        jMenu8.setText("File");
        jMenuBar4.add(jMenu8);

        jMenu9.setText("Edit");
        jMenuBar4.add(jMenu9);

        jMenu10.setText("File");
        jMenuBar5.add(jMenu10);

        jMenu11.setText("Edit");
        jMenuBar5.add(jMenu11);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 0, 204), 2, true));

        jPanel2.setBackground(new java.awt.Color(102, 0, 204));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Fees Payment");

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 0, 0, 0, new java.awt.Color(255, 51, 0)));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 256, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 55, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(183, 183, 183))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(247, 247, 247))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 0, 204), 1, true));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 0, 204));
        jLabel10.setText("Reg number");

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 0, 204));
        jLabel11.setText("Name");

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sms_project/images/Search_34px.png"))); // NOI18N

        txtSearch.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(102, 0, 255)));
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSearchKeyTyped(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(102, 0, 204));
        jLabel13.setText("Year");

        jLabel14.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(102, 0, 204));
        jLabel14.setText("Parent/Guardian");

        jLabel15.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(102, 0, 204));
        jLabel15.setText("gender");

        jLabel16.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(102, 0, 204));
        jLabel16.setText("Fees Paid");

        jLabel17.setFont(new java.awt.Font("Yu Gothic Medium", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 102, 0));
        jLabel17.setText("Fees to be paid for the current year");

        jLabel18.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(102, 0, 204));
        jLabel18.setText("Balance");

        jLabel19.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(102, 0, 204));
        jLabel19.setText("Mode of payament:");

        txtPhone.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPhone.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(102, 0, 204)));

        txtFeeOutstanding.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFeeOutstanding.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(102, 0, 204)));
        txtFeeOutstanding.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFeeOutstandingActionPerformed(evt);
            }
        });

        txtName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtName.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(102, 0, 204)));

        txtParent.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtParent.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(102, 0, 204)));

        txtYear.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtYear.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(102, 0, 204)));

        txtBalance.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtBalance.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtBalance.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(102, 0, 255)));
        txtBalance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBalanceActionPerformed(evt);
            }
        });

        txtPayed.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtPayed.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPayed.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(102, 0, 255)));
        txtPayed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPayedActionPerformed(evt);
            }
        });

        txtReg.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtReg.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(102, 0, 204)));

        cboModePayement.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cboModePayement.setForeground(new java.awt.Color(51, 51, 255));
        cboModePayement.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Select--mode--", "Cash", "Bank", "Poster" }));
        cboModePayement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboModePayementActionPerformed(evt);
            }
        });

        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sms_project/images/Sync_30px.png"))); // NOI18N
        jLabel20.setToolTipText("reset all fields");
        jLabel20.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sms_project/images/Send_30px_1.png"))); // NOI18N
        jLabel21.setToolTipText("Submit data and send this message to parent");
        jLabel21.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel21MouseClicked(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(102, 0, 204));
        jLabel22.setText("Phone ");

        jCombogender.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jCombogender.setForeground(new java.awt.Color(102, 0, 204));
        jCombogender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Select--gender--", "Male", "Female" }));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jCombogender, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtReg, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(64, 64, 64)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel17)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(txtFeeOutstanding, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                        .addGap(138, 138, 138)
                                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtParent, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtYear, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGap(28, 28, 28)
                                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(24, 24, 24))
                                                    .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.TRAILING))
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                                        .addGap(12, 12, 12)
                                                        .addComponent(txtPayed, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(txtBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(cboModePayement, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))))))))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap(1, Short.MAX_VALUE))))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(163, 163, 163)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(40, 40, 40)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(502, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtSearch)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtReg, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtYear, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtParent, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(36, 36, 36)
                                        .addComponent(jCombogender, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 9, Short.MAX_VALUE)))
                                .addGap(7, 7, 7))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFeeOutstanding, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPayed, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cboModePayement, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20)))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(94, 94, 94)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(335, Short.MAX_VALUE)))
        );

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sms_project/images/Cash in Hand_48px.png"))); // NOI18N
        jLabel2.setToolTipText("Cash in Hand");
        jLabel2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 1, new java.awt.Color(102, 0, 204)));
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sms_project/images/Bank_40px.png"))); // NOI18N
        jLabel3.setToolTipText("Bank");
        jLabel3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 1, new java.awt.Color(102, 0, 204)));
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sms_project/images/Receipt_48px.png"))); // NOI18N
        jLabel4.setToolTipText("Receipt");
        jLabel4.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 1, new java.awt.Color(102, 0, 204)));
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sms_project/images/Visa_48px.png"))); // NOI18N
        jLabel5.setToolTipText("Visa");
        jLabel5.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 1, new java.awt.Color(102, 0, 204)));
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sms_project/images/MasterCard_48px.png"))); // NOI18N
        jLabel6.setToolTipText("MasterCard");
        jLabel6.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 1, new java.awt.Color(102, 0, 204)));
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sms_project/images/Accounting_48px.png"))); // NOI18N
        jLabel7.setToolTipText("Accounting");
        jLabel7.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 1, new java.awt.Color(102, 0, 204)));
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sms_project/images/Online Payment_48px.png"))); // NOI18N
        jLabel8.setToolTipText("Online Payment");
        jLabel8.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 1, new java.awt.Color(102, 0, 204)));
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sms_project/images/Card Payment_40px.png"))); // NOI18N
        jLabel9.setToolTipText("Card Payment");
        jLabel9.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 1, new java.awt.Color(102, 0, 204)));
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        txtArea.setColumns(20);
        txtArea.setRows(5);
        jScrollPane1.setViewportView(txtArea);

        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sms_project/images/Print_48px.png"))); // NOI18N
        jLabel23.setToolTipText("print receipt");
        jLabel23.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel23MouseClicked(evt);
            }
        });

        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sms_project/images/Receipt_48px.png"))); // NOI18N
        jLabel24.setToolTipText("generate receipt");
        jLabel24.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel24MouseClicked(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("Generate Receipt");

        jLabel26.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("Print");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8)
                        .addGap(174, 174, 174))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(55, 55, 55)
                                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(79, 79, 79))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addGap(42, 42, 42)
                                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(46, 46, 46)
                                        .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel24)
                            .addComponent(jLabel23))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtBalanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBalanceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBalanceActionPerformed

    private void txtPayedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPayedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPayedActionPerformed

    private void txtFeeOutstandingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFeeOutstandingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFeeOutstandingActionPerformed

    private void txtSearchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyTyped
     
        Filter();
    }//GEN-LAST:event_txtSearchKeyTyped

    private void jLabel21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseClicked
        
         if(Float.parseFloat(txtPayed.getText()) > User.getfee()){
           try{
            Class.forName("com.mysql.jdbc.Driver");
        
        
        //connect to a database
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sms_project", "root", "");
        
            String feeDetails = "SELECT * from coursefees";
            Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery(feeDetails);
        User user;
        while (rs.next()){
            user = new User(rs.getString("course"),rs.getString("semister"),rs.getInt("schoolFees"));
            
        }
        JOptionPane.showMessageDialog(null,"The amount paid is more than semisters fee\n "
                   + "please pay an amount that is less or equal to" + User.getfee());
           }catch(Exception ex){
            JOptionPane.showMessageDialog(this, ex);
        }
           
       }else{
         String name=txtName.getText();
         String year=txtYear.getText();
         String parent=txtParent.getText();
         String phone= txtPhone.getText();
         String gender=(String) jCombogender.getSelectedItem();
       
        float feePayed = Float.parseFloat(txtPayed.getText());
        String regNo = txtSearch.getText();
        String payMode = (String) cboModePayement.getSelectedItem();
       
        float newb = User.getfee() - Float.parseFloat(txtPayed.getText());
        txtBalance.setText(""+newb);
        try{
            Class.forName("com.mysql.jdbc.Driver");
        
        
        //connect to a database
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sms_project", "root", "");
        
            String feeDetails = "SELECT * from coursefees";
            Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery(feeDetails);
        User user;
        while (rs.next()){
            user = new User(rs.getString("course"),rs.getString("semister"),rs.getInt("schoolFees"));
            
        }}catch(Exception ex){
            JOptionPane.showMessageDialog(this, ex);
        }
        
       
        try{
        String sql = "INSERT INTO `sms_project`.`defaultfee` "
            + "(`name`,`registrationNumber`,`YEAR`,`PARENT`,`gender`,`PhoneNumber`,`semisterFee`, `feeAmountPayed`,`newBalance`,  "
                   + "`modeOfPayment`) VALUES (?,?,?,?,?,?,?,?,?,?);";
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sms_project", "root", "");
            PreparedStatement pst = connection.prepareStatement(sql);
            pst.setString(1, name);
            pst.setString(2, regNo);
             pst.setString(3, year);
              pst.setString(4, parent);
               pst.setString(5, gender);
               pst.setString(6, phone);
            pst.setFloat(7, User.getfee());
            pst.setFloat(8,feePayed);
            pst.setFloat(9, newb);
            pst.setString(10, payMode);
            pst.executeUpdate();
           FeeReminder f= new FeeReminder();
           f.selectData();
//            sending s= new sending();
//            s.selectData();
           
            
            
            
    }
    catch(Exception ex){
        JOptionPane.showMessageDialog(null,ex);
    }}
         
         
    }//GEN-LAST:event_jLabel21MouseClicked

    private void jLabel23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel23MouseClicked
       try{
       txtArea.print();
        }catch(Exception e){
        }
        
        
        
        
        
    }//GEN-LAST:event_jLabel23MouseClicked

    private void cboModePayementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboModePayementActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboModePayementActionPerformed

    private void jLabel24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel24MouseClicked
        int num= Integer.parseInt(txtFeeOutstanding.getText());
        int pay= Integer.parseInt(txtPayed.getText());
//         int sold= Integer.parseInt(bkSold.getText());
         

//               total=total+num;
              
              
                  int bal=num-pay;
                  txtBalance.setText("Ksh."+bal);
                
                  
        
        txtArea.setText(txtArea.getText()+"  **************************************************\n");
       txtArea.setText(txtArea.getText()+"                  KISII UNIVERSITY                   \n");
       txtArea.setText(txtArea.getText()+"             SIgalame Boys High School              \n");
       txtArea.setText(txtArea.getText()+"                 Fee Receipts                      \n");
       txtArea.setText(txtArea.getText()+"=====================================================\n");
               txtArea.setText(txtArea.getText()+"     School Fees: Ksh."+num+"\n" );
     Date d= new Date();
     String date= d.toString();
     txtArea.setText(txtArea.getText()+"          Student Name:"+txtName.getText()+"\n" );
     txtArea.setText(txtArea.getText()+"          Reg Nimber: "+txtReg.getText()+"\n" );
     txtArea.setText(txtArea.getText()+"          Year:"+txtYear.getText()+"\n" );
     txtArea.setText(txtArea.getText()+"          Parent:"+txtParent.getText()+"\n" );
     txtArea.setText(txtArea.getText()+"          Fee Payed:Ksh."+pay+"\n");
     txtArea.setText(txtArea.getText()+"          Balance: Ksh."+bal+"\n\n" );
     txtArea.setText(txtArea.getText()+"               class Teacher            Signature\t\t\n\n" );
     txtArea.setText(txtArea.getText()+"               HeadTeacher/DoS               Signature\t\t\n\n\t" );
    txtArea.setText(txtArea.getText()+"                     "+date+"                         ");
     
    }//GEN-LAST:event_jLabel24MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cboModePayement;
    private javax.swing.JComboBox<String> jCombogender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuBar jMenuBar4;
    private javax.swing.JMenuBar jMenuBar5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtArea;
    private javax.swing.JTextField txtBalance;
    private javax.swing.JTextField txtFeeOutstanding;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtParent;
    private javax.swing.JTextField txtPayed;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtReg;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtYear;
    // End of variables declaration//GEN-END:variables

public void Filter(){
         
        int component;
        Connection con=null;
        ResultSet rs;
        Statement st;
        PreparedStatement pst=null;

        try{
            String dbname="sms_project";
            String pass="";
            String username="root";
            String Url="jdbc:mysql://localhost:3306/";
            String Drivers="com.mysql.jdbc.Driver";

            Class.forName(Drivers);

            
            
            con=DriverManager.getConnection(Url+dbname,username,pass);

            
//            String sql="SELECT * FROM registermembers WHERE Reg_Number LIKE '%"+txtSearch.getText()+"%' || Name LIKE '%"+txtSearch.getText()+"%'";
String sql = "SELECT registermembers.Name,registermembers.Reg_Number,registermembers.Year,parents.jina,parents.Gender,parents.phone FROM registermembers inner join parents on registermembers.Reg_Number=parents.regno WHERE Reg_Number LIKE '%"+txtSearch.getText()+"%' || Name LIKE '%"+txtSearch.getText()+"%'";
            st=con.createStatement();
            rs=st.executeQuery(sql);
           
            while (rs.next()){  
              //   model.setRowCount(model.getRowCount()+1);
               
                String nm=rs.getString("Name");
                String rg=rs.getString("Reg_Number");
                String y=rs.getString("Year");
                String p=rs.getString("jina");
                String g=rs.getString("Gender");
                String c=rs.getString("phone");
       // JOptionPane.showMessageDialog(this," Student Details\nName: "+nm+"\nRegNumber :"+rg+"\nYear: "+y+"\n\n Confirm This records");
                
//  txtId.setText(id);
                txtName.setText(nm);
                txtReg.setText(rg);
                txtYear.setText(y);
                txtParent.setText(p);
                txtPhone.setText(c);
                jCombogender.setSelectedItem(g);
               // model.addRow(new Object[]{fn,mn,ln,gd,rn,phn,yos,jmy});
            
                    
           }
        
//            JOptionPane.showMessageDialog(this,"No RECORD FOUND");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this,"No record match"+e.getLocalizedMessage());
        }
     }

public class FeeReminder {

    String message = "";
    PreparedStatement pst;
    ResultSet rs;
    String data[] = new String[8];

    private void selectData() throws SQLException {
       Connect c= new Connect();
       c.connect();

        pst = Mysql.connect("sms_project")
                .prepareStatement("select name,registrationNumber,PARENT,gender,phoneNumber,feeAmountPayed,newBalance,modeOfPayment from defaultfee WHERE registrationNumber LIKE '%"+txtSearch.getText()+"%' || name LIKE '%"+txtSearch.getText()+"%'");
//            Logger.getLogger(CA.class.getName()).log(Level.SEVERE, null, ex);

        try {
            rs = pst.executeQuery();
            while (rs.next()) {
                data[0] = rs.getString("name");
                 data[1] = rs.getString("registrationNumber");
                  data[2] = rs.getString("PARENT");
                   data[3] = rs.getString("gender");
                    data[4] = rs.getString("phoneNumber");
                     data[5] = rs.getString("feeAmountPayed");
                      data[6] = rs.getString("newBalance");
                       data[7] = rs.getString("modeOfPayment");
                
                message = processMessage(data);

                sendSMS(rs.getString("phoneNumber"));
            }
        } catch (SQLException ex) {
//            Logger.getLogger(CA.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    private String processMessage(String data[]) {
        String parent=data[2];
       // String =data[3];
        String payed=data[5];
        String balance=data[6];
        String mode=data[7];
//    message = "Dear {sex}{name}! Lechall33 now .kindly hurry.Bash kick starts.Thanks";
    message = "Dear {sex}."+parent+"! your student {name} has payed Ksh."+payed+" via "+mode+". Outstanding fee balance for this year is Ksh."+balance+".Thank you ";
//        message = "Dear "+parent+"! Sory for this message. ni project nilikuwa naitest kama inafanya. ";

        String sex = data[3].equalsIgnoreCase("Male") ? "Mr." : "Miss.";
       
         
        return message.replace("{name}", " " + data[0] + " ").replace("{sex}", sex);
    }

    private void sendSMS(String recepient) {
        try {
            pst = Mysql.connect("sms_project").
                    prepareStatement("INSERT INTO outbox(receiver,msg,msgtype,sender)"
                            + " VALUES(?,?,?,?)");
            pst.setString(1, recepient);
            pst.setString(2, message);
            pst.setString(3, "sms.text");
            pst.setString(4, "+2547");

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        try {
            pst.execute();
        } catch (SQLException ex) {
        }
        Icon icon = new ImageIcon(getClass().getResource("/ter/icons/10.gif"));
        JOptionPane.showMessageDialog(null, "Sending messages...","",JOptionPane.INFORMATION_MESSAGE,icon);
    }
//
//    public static void main(String[] args) {
//       FeeReminder f= new FeeReminder();
//       f.selectData();
    }
     

}
