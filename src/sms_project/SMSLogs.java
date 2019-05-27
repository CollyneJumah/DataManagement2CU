/*
 * Copyright (c) 2017, info@mimidots.com
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * * Redistributions of source code must retain the above copyright notice, this
 *   list of conditions and the following disclaimer.
 * * Redistributions in binary form must reproduce the above copyright notice,
 *   this list of conditions and the following disclaimer in the documentation
 *   and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 */
package sms_project;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author MIT.co.ke
 */
public class SMSLogs extends javax.swing.JPanel {

    private DefaultTableModel model;
    private Connection conn;
    private PreparedStatement pst;
    private ResultSet rs;
    private static Timer scheduler = new Timer();

    /**
     * Creates new form SMSLogs
     */
    public SMSLogs() {
        initComponents();
        eventHandler();
    }

    private void eventHandler() {
        jBtnInbox.addActionListener((e) -> {
            populateOutboxTable();
        });
        jBtnOutbox.addActionListener((e) -> {
            populateInboxTable();
        });
    }

    private void populateOutboxTable() {
         model = new DefaultTableModel() {
                    @Override
                    public boolean isCellEditable(int row, int column) {
                        return false; //To change body of generated methods, choose Tools | Templates.
                    }
                };
                String cols[] = {"No", "Name", "Reg.no.", "Phone", "Year", "Message", "status", "Time sent"};
                model.setColumnIdentifiers(cols);
                conn = new Connect().connect();
                String sqlQuery = "SELECT registermembers.`Name`,"
                        + "registermembers.Reg_Number,registermembers.PhoneNumber,registermembers.Year,"
                        + "smslog.MessageText as message, smslog.StatusCode as status,"
                        + "smslog.SendTime as timesent FROM `registermembers` "
                        + "inner join smslog on smslog.MessageTo=registermembers.PhoneNumber ORDER BY `smslog`.`SendTime` DESC";

//        scheduler.schedule(new TimerTask() {
//            @Override
//            public void run() {
               model.setRowCount(0);
                try {
                    pst = conn.prepareStatement(sqlQuery);
                } catch (SQLException ex) {
                    Logger.getLogger(SendSMS.class.getName()).log(Level.SEVERE, null, ex);
                }

                Object rows[] = new Object[8];
                try {
                    rs = pst.executeQuery();
                    if (rs.isBeforeFirst()) {
                        int i = 1;
                        while (rs.next()) {
                            for (Object row : rows) {
                                rows[0] = Integer.toString(i);
                                rows[1] = rs.getObject("Name");
                                rows[2] = rs.getObject("Reg_Number");
                                 rows[3] = rs.getObject("PhoneNumber");
                                rows[4] = rs.getObject("Year");
                                rows[5] = rs.getObject("message");
                                rows[6] = convertStatus(rs.getInt("status"));
                                rows[7] = rs.getString("timesent");
                            }
                            i++;
                            model.addRow(rows);
                        }
                        jTable1.setModel(model);
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(SendSMS.class.getName()).log(Level.SEVERE, null, ex);
                    JOptionPane.showMessageDialog(this, ex);
                }
//            }
//        }, 1, 10000);

    }

    private void populateInboxTable() {
        /**
         * instantiate the main variable outside the loop thread
         */
        model = new DefaultTableModel();
        String cols[] = {"No", "Name", "Reg no.", "Year", "Phone", "Message", "Time received"};
        model.setColumnIdentifiers(cols);
        conn = new Connect().connect();
        String sqlQuery = "SELECT registermembers.Name,registermembers.Year,"
                + "registermembers.Reg_Number,registermembers.PhoneNumber,"
                + "inbox.sender,inbox.receiver,inbox.msg,inbox.senttime from inbox inner join"
                + " registermembers on inbox.sender=registermembers.PhoneNumber order by inbox.senttime DESC";

        
//        scheduler.schedule(new TimerTask() {
//            @Override
//            public void run() {
        model.setRowCount(0);
                try {
                    pst = conn.prepareStatement(sqlQuery);
                } catch (SQLException ex) {
                    Logger.getLogger(SendSMS.class.getName()).log(Level.SEVERE, null, ex);
                }

                Object rows[] = new Object[7];
                try {
                    rs = pst.executeQuery();
                    if (rs.isBeforeFirst()) {
                        int i = 1;
                        while (rs.next()) {
                            for (Object row : rows) {
                                rows[0] = Integer.toString(i);
                                rows[1] = rs.getObject("Name");
                                rows[2] = rs.getObject("Reg_Number");
                                rows[3] = rs.getObject("Year");
                                rows[4] = rs.getObject("PhoneNumber");
                                rows[5] = rs.getObject("msg");
                                rows[6] = rs.getString("senttime");
                            }
                            i++;
                            model.addRow(rows);
                        }
                        jTable1.setModel(model);
                    } else {
                        JOptionPane.showMessageDialog(null, "No new message");
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(SendSMS.class.getName()).log(Level.SEVERE, null, ex);
                }
//            }
//        }, 1, 10000);

    }

    /*
    Method to convert message status code to a neat readable messages
     */
    private String convertStatus(int code) {
        switch (code) {
            case 201:
                return "Sent";
            case 301:
                return "Network error";
            case 300:
                return "Failed";
            case 200:
                return "Delivered";
            default:
                return Integer.toString(code); //not interpreted
        }
    

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jBtnInbox = new javax.swing.JButton();
        jBtnOutbox = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 0, 102), 1, true), "Manage", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12), new java.awt.Color(153, 0, 102))); // NOI18N

        jBtnInbox.setBackground(new java.awt.Color(255, 255, 255));
        jBtnInbox.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jBtnInbox.setForeground(new java.awt.Color(153, 0, 102));
        jBtnInbox.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sms_project/images/Outbox_50px.png"))); // NOI18N
        jBtnInbox.setText("Outbox");

        jBtnOutbox.setBackground(new java.awt.Color(255, 255, 255));
        jBtnOutbox.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jBtnOutbox.setForeground(new java.awt.Color(153, 0, 102));
        jBtnOutbox.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sms_project/images/Inbox_50px.png"))); // NOI18N
        jBtnOutbox.setText("Inbox");
        jBtnOutbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnOutboxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(328, 328, 328)
                .addComponent(jBtnInbox)
                .addGap(37, 37, 37)
                .addComponent(jBtnOutbox)
                .addContainerGap(319, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnInbox, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnOutbox, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jScrollPane1.setBackground(new java.awt.Color(204, 204, 255));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 930, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnOutboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnOutboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnOutboxActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnInbox;
    private javax.swing.JButton jBtnOutbox;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
