/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sms_project;

import com.sun.glass.events.KeyEvent;
import static com.sun.webkit.perf.WCGraphicsPerfLogger.reset;
import java.awt.Color;
import static java.lang.Thread.sleep;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author User
 */
public class register extends javax.swing.JFrame {
    public Connection getConnection(){
        Connection conn;
        try{
            conn=DriverManager.getConnection("jdbc:mysql://localhost/sms_project","root","");
            return conn;
        
        }catch(Exception ex){
        ex.printStackTrace();
        return null;
        }
    }
     public void executeSqlQuery(String query,String message){
       
             Connection conn=getConnection();
             Statement st;
            try{
                st=conn.createStatement();
                if(st.executeUpdate(query)==1){
                    DefaultTableModel model=(DefaultTableModel)tableShowMembers.getModel();
                    model.setRowCount(0);
                    showResultsOnTable();
                JOptionPane.showMessageDialog(null,"Data"+message+"Successsful");
                
                }else{
                    JOptionPane.showMessageDialog(null,"No Data"+message);
                }
                
            }catch(Exception ex){
            JOptionPane.showMessageDialog(this, ex);
            ex.printStackTrace();
            }
     }
   
    public void RegisterMembers() {
        initComponents();
         txtPhoneNumber.setText("+2547");
        showResultsOnTable();
        table_filter();
        timer();
           RegisterMembers.showTotalMember.setText("Total Registered Members:="+Integer.toString(COUNT_TOTAL_NUMBER.countRegisteredMembers("registermembers")));
    //    deleteRecords();
        
    
    }
   
    public register() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        fName = new javax.swing.JLabel();
        lastName = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtFirst_Name = new javax.swing.JTextField();
        txtPhoneNumber = new javax.swing.JTextField();
        txtRegNumber = new javax.swing.JTextField();
        CboYear = new javax.swing.JComboBox();
        cboJumuiya = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        txtLast_Name = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Radio_Male = new javax.swing.JRadioButton();
        Radio_Female = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txId = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        QuickSearch = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableShowMembers = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        labelShowTime = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        showTotalMember = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1283, 693));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 204)));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Manage", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 14), new java.awt.Color(102, 0, 204))); // NOI18N

        fName.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        fName.setText("First Name");

        lastName.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lastName.setText("Last Name");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setText("Phone Number");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel5.setText("Jumuiya");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel6.setText("Year");

        txtFirst_Name.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtFirst_Name.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFirst_Name.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        txtFirst_Name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtFirst_NameKeyPressed(evt);
            }
        });

        txtPhoneNumber.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtPhoneNumber.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPhoneNumber.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        txtPhoneNumber.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtPhoneNumberMouseClicked(evt);
            }
        });
        txtPhoneNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPhoneNumberActionPerformed(evt);
            }
        });
        txtPhoneNumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPhoneNumberKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPhoneNumberKeyTyped(evt);
            }
        });

        txtRegNumber.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtRegNumber.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtRegNumber.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        txtRegNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRegNumberActionPerformed(evt);
            }
        });

        CboYear.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        CboYear.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--Select--Year--", "First Year", "Second Year", "Third Year", "Fourth Year", "Associate", "Allumini", "Guest" }));
        CboYear.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        CboYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CboYearActionPerformed(evt);
            }
        });

        cboJumuiya.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cboJumuiya.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--Select--Jumuiya--", "St.Peters", "St.Charles", "St.Bridgits", "Holy Family", "St.Thomas", "St.Stephenes" }));
        cboJumuiya.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel1.setText("Email");

        txtEmail.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtEmail.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtEmail.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        btnSave.setBackground(new java.awt.Color(255, 255, 255));
        btnSave.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnSave.setText("Submit");
        btnSave.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnReset.setBackground(new java.awt.Color(255, 255, 255));
        btnReset.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnReset.setText("Reset");
        btnReset.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnReset.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                btnResetAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        txtLast_Name.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtLast_Name.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtLast_Name.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel7.setText("Reg Number");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel8.setText("Gender");

        Radio_Male.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(Radio_Male);
        Radio_Male.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        Radio_Male.setText("Male");

        Radio_Female.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(Radio_Female);
        Radio_Female.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        Radio_Female.setText("Female");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(104, 74, 15));
        jLabel10.setText("Register Here");

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel13.setText("Id. Key");

        txId.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txId.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txId.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Radio_Male, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Radio_Female))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPhoneNumber))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                                .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(fName, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel13)
                                            .addComponent(lastName, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtRegNumber)
                                    .addComponent(txtLast_Name)
                                    .addComponent(txtFirst_Name, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                                    .addComponent(txId))))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel10)
                        .addGap(66, 66, 66))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(CboYear, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cboJumuiya, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                        .addComponent(txId, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFirst_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtLast_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lastName))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtRegNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(30, 30, 30))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Radio_Male)
                            .addComponent(Radio_Female))
                        .addGap(18, 18, 18)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboJumuiya, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(CboYear, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Manage", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 14), new java.awt.Color(102, 0, 204))); // NOI18N

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Manage", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 14), new java.awt.Color(102, 0, 204))); // NOI18N

        QuickSearch.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        QuickSearch.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        QuickSearch.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 0, 204), 1, true));
        QuickSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                QuickSearchKeyTyped(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(204, 204, 255));
        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sms_project/images/Search_34px.png"))); // NOI18N
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        btnUpdate.setBackground(new java.awt.Color(204, 204, 255));
        btnUpdate.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sms_project/images/Available Updates_34px.png"))); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(204, 204, 255));
        btnDelete.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sms_project/images/Delete_34px.png"))); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(QuickSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(QuickSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        tableShowMembers.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        tableShowMembers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tableShowMembers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableShowMembersMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableShowMembers);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel11.setText("Messaging System");

        jLabel9.setFont(new java.awt.Font("Wide Latin", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 0, 0));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sms_project/images/delete.png"))); // NOI18N
        jLabel9.setToolTipText("close");
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });

        labelShowTime.setFont(new java.awt.Font("SimSun", 1, 24)); // NOI18N
        labelShowTime.setForeground(new java.awt.Color(102, 0, 204));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel12.setText("Total Registered Members:=");

        showTotalMember.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        showTotalMember.setForeground(new java.awt.Color(102, 0, 204));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(showTotalMember, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelShowTime, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel11)
                        .addComponent(labelShowTime, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(showTotalMember, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtFirst_NameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFirst_NameKeyPressed
        lastName.setVisible(true);
        txtLast_Name.setVisible(true);
    }//GEN-LAST:event_txtFirst_NameKeyPressed

    private void txtPhoneNumberMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPhoneNumberMouseClicked
        txtPhoneNumber.setText("+2547");
        String phone = txtPhoneNumber.getText();
        if(phone.length()==13){
            JOptionPane.showMessageDialog(this," Reach Maximum!");
        }
    }//GEN-LAST:event_txtPhoneNumberMouseClicked

    private void txtPhoneNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPhoneNumberActionPerformed

    }//GEN-LAST:event_txtPhoneNumberActionPerformed

    private void txtPhoneNumberKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPhoneNumberKeyPressed

    }//GEN-LAST:event_txtPhoneNumberKeyPressed

    private void txtPhoneNumberKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPhoneNumberKeyTyped
        char c = evt.getKeyChar();

        if (!((c >= '0') && (c <= '9') || (c == KeyEvent.VK_BACKSPACE) || (c == KeyEvent.VK_DELETE) || (c == KeyEvent.VK_ENTER))) {

            JOptionPane.showMessageDialog(null, "Enter Numerics Only");
            evt.consume();

        }          // TODO add your handling code here:

        String phoneNumber=txtPhoneNumber.getText();

        if(phoneNumber.length()==13){
            evt.consume();

        }
    }//GEN-LAST:event_txtPhoneNumberKeyTyped

    private void txtRegNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRegNumberActionPerformed

    }//GEN-LAST:event_txtRegNumberActionPerformed

    private void CboYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CboYearActionPerformed

    }//GEN-LAST:event_CboYearActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        insert();
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnResetAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_btnResetAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_btnResetAncestorAdded

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
      reset();
       
    }//GEN-LAST:event_btnResetActionPerformed

    private void QuickSearchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_QuickSearchKeyTyped
        table_filter();
    }//GEN-LAST:event_QuickSearchKeyTyped

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        String search=QuickSearch.getText();
        if(search.equals("")){
            QuickSearch.setBorder(new LineBorder(Color.red));
        }

    }//GEN-LAST:event_jButton4ActionPerformed
                       
    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // updateRecords();
        String Gender;
        if(Radio_Female.isSelected()){
            Gender="Female";
        }else{
            Gender="Male";
        }
        String Year=(String) CboYear.getSelectedItem();
        switch (Year) {
            case "First Year":
            Year="1";
            break;
            case "Second Year":
            Year="2";
            break;
            case "Third Year":
            Year="3";
            break;
            case "Fourth Year":
            Year="4";
            break;
        }
        String sql="UPDATE registermembers SET Name ='"+txtFirst_Name.getText()+"',Reg_Number ='"+txtRegNumber.getText()+"',Gender='"+Gender+"',PhoneNumber ='"+txtPhoneNumber.getText()+"',Jumuiya ='"+cboJumuiya.getSelectedItem()+"',Year='"+Year+"',Email='"+txtEmail.getText()+"' WHERE Id="+txId.getText()+"";
        executeSqlQuery(sql,"Record Updated!");
                    txtLast_Name.setVisible(true);
                    lastName.setVisible(true);
                    fName.setVisible(true);
                    reset();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        //   deleteRecords();
        String sql="DELETE FROM registermembers WHERE Reg_Number='"+txtRegNumber.getText()+"'";
        executeSqlQuery(sql,"Record Deleted!");
            txtLast_Name.setVisible(true);
            lastName.setVisible(true);
            fName.setVisible(true);
            reset();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void tableShowMembersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableShowMembersMouseClicked
        //       deleteRecords();
        //       updateRecords();

        int row= tableShowMembers.getSelectedRow();
        TableModel model= tableShowMembers.getModel();
        txId.setText(model.getValueAt(row, 0).toString());
        txtFirst_Name.setText(model.getValueAt(row, 1).toString());
        txtRegNumber.setText(model.getValueAt(row, 2).toString());
        String gender=model.getValueAt(row, 3).toString();
        if(gender.equals("Male")){
            Radio_Male.setSelected(true);
        }else{
            Radio_Female.setSelected(true);
        }
        if(model.isCellEditable(row, 0)){
            lastName.setVisible(false);
            txtLast_Name.setVisible(false);
        }else{
            lastName.setVisible(true);
            txtLast_Name.setVisible(true);
        }

        txtPhoneNumber.setText(model.getValueAt(row, 4).toString());
        String jumuiya=model.getValueAt(row, 5).toString();
        switch(jumuiya){
            case "St.Peters":
            cboJumuiya.setSelectedIndex(1);
            break;
            case "St.Charles":
            cboJumuiya.setSelectedIndex(2);
            break;
            case "St.Bridgits":
            cboJumuiya.setSelectedIndex(3);
            break;
            case "Holy Family":
            cboJumuiya.setSelectedIndex(4);
            break;
            case "St.Thomas":
            cboJumuiya.setSelectedIndex(5);
            break;
            case "St.Stephenes":
            cboJumuiya.setSelectedIndex(6);
            break;
        }
        String year=model.getValueAt(row, 6).toString();
        
//        First Year
//        Second Year
//        Third Year
//        Fourth Year
//        Associate
//        Allumini
//        Guest
        switch(year){
            case "First Year":
            CboYear.setSelectedIndex(1);
            break;
            case "Second Year":
            CboYear.setSelectedIndex(2);
            break;
            case "Third Year":
            CboYear.setSelectedIndex(3);
            break;
            case "Fourth Year":
            CboYear.setSelectedIndex(4);
            break;
            case "Associate":
            CboYear.setSelectedIndex(5);
            break;
            case "Allumini":
            CboYear.setSelectedIndex(6);
            break;
            case "Guest":
            CboYear.setSelectedIndex(7);
            break;
        }

        txtEmail.setText(model.getValueAt(row, 7).toString());

    }//GEN-LAST:event_tableShowMembersMouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabel9MouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

    }//GEN-LAST:event_formWindowOpened

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows Classic".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox CboYear;
    private javax.swing.JTextField QuickSearch;
    private javax.swing.JRadioButton Radio_Female;
    private javax.swing.JRadioButton Radio_Male;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox cboJumuiya;
    private javax.swing.JLabel fName;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelShowTime;
    private javax.swing.JLabel lastName;
    public static javax.swing.JLabel showTotalMember;
    private javax.swing.JTable tableShowMembers;
    private javax.swing.JTextField txId;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFirst_Name;
    private javax.swing.JTextField txtLast_Name;
    private javax.swing.JTextField txtPhoneNumber;
    private javax.swing.JTextField txtRegNumber;
    // End of variables declaration//GEN-END:variables

private void insert(){

        int components;
        Connection con=null;
        ResultSet rs=null;
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
            String Gender;
            if(Radio_Female.isSelected()){
            Gender="Female";
            }else{
            Gender="Male";
            }
           String Year=(String) CboYear.getSelectedItem();
                switch (Year) {
                    case "First Year":
                        Year="1";
                        break;
                    case "Second Year":
                        Year="2";
                        break;
                    case "Third Year":
                        Year="3";
                        break;
                    case "Fourth Year":
                        Year="4";
                        break;
                }
                String fname=txtFirst_Name.getText();
                String lname=txtLast_Name.getText();
                String name= fname+" "+lname;
           String sql="INSERT INTO registerMembers(Name,Reg_Number,"
        + "Gender,PhoneNumber,Jumuiya,Year,Email)VALUES('"+name+"','"+txtRegNumber.getText()+"','"+Gender+"',"
       + "'"+txtPhoneNumber.getText()+"','"+cboJumuiya.getSelectedItem()+"','"+Year+"',"
         + "'"+txtEmail.getText()+"')";
            pst=con.prepareStatement(sql);
            pst.execute();
            //confirm data submission
           int saveExec;
      saveExec=  JOptionPane.showConfirmDialog(null,"Are you Sure you\n want to "
      + "Save Data?","SAVE",JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE);
      
      if(saveExec==JOptionPane.YES_NO_OPTION){
            
          showResultsOnTable(); 
     }
      
      
      
      //show error when empty fields submitted
        }catch(Exception ex){
           
        txtFirst_Name.setBorder(new LineBorder(Color.red));
        txtLast_Name.setBorder(new LineBorder(Color.red));
        txtEmail.setBorder(new LineBorder(Color.red));
        txtPhoneNumber.setBorder(new LineBorder(Color.red));
        cboJumuiya.setBorder(new LineBorder(Color.red));
        CboYear.setBorder(new LineBorder(Color.red));
        Radio_Female.setBorder(new LineBorder(Color.red));
        Radio_Male.setBorder(new LineBorder(Color.red));
        txtRegNumber.setBorder(new LineBorder(Color.red));
      JOptionPane.showMessageDialog(this,"All Fields Required!"+ex.getLocalizedMessage());
        }
     
     }
 //clear all field texts
 private  void reset(){
 
       btnReset.setEnabled(true);
       txtEmail.setText("");
       txtFirst_Name.setText("");
       txtLast_Name.setText("");
       txtPhoneNumber.setText("+2547");
       txtRegNumber.setText("");
       cboJumuiya.setSelectedIndex(0);
       CboYear.setSelectedIndex(0);
       txtLast_Name.setVisible(true);
       lastName.setVisible(true);
       fName.setVisible(true);
       
 
 
 }
 private void normaBorder(){
     
 
 }
 //display records on table
 public void showResultsOnTable(){
     try{
         Connection conn=null;
         PreparedStatement pst= null;
         ResultSet rs;
        conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/sms_project","root","");
        String sql="SELECT * FROM registermembers ORDER BY Id Asc";
        pst=conn.prepareStatement(sql);
        rs= pst.executeQuery();
        tableShowMembers.setModel(DbUtils.resultSetToTableModel(rs));
       

     }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
     
     }
 
 }
 public void searchRecords(){
      DefaultTableModel model=(DefaultTableModel) tableShowMembers.getModel();
                model.setRowCount(0);
      int components;
        Connection con=null;
        ResultSet rs=null;
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
            String sql="SELECT * FROM registermembers WHERE Reg_Number LIKE '%"+QuickSearch.getText()+"%' || First_Name LIKE '%"+QuickSearch.getText()+"%' || PhoneNumber LIKE '%"+QuickSearch.getText()+"%' ORDER BY Id ASC";
 
            pst=con.prepareStatement(sql);
            pst.execute();
            model=(DefaultTableModel)tableShowMembers.getModel();
           
            if (rs.next()){
                
             // model.setRowCount(model.getRowCount()+1);
                String id=rs.getString("ID");  
                String fn=rs.getString("Name");
              //  String ln=rs.getString("Last_Name");
                String reg=rs.getString("Reg_Number");
                String gd=rs.getString("Gender");
                String phn=rs.getString("PhoneNumber");
                String jm=rs.getString("Jumuiya");
                String yr=rs.getString("Year");
                String em=rs.getString("Email");
             

                model.addRow(new Object[]{id,fn,reg,gd,phn,jm,yr,em});
                        txtEmail.setText(em);
                    
           }
            
            if(model.getRowCount()==0){
            JOptionPane.showMessageDialog(this,"No Record Match!");
            
            }else{
            
            }
//            if(rs.equals(0)){
//            JOptionPane.showMessageDialog(this,"No record Found");
//            
//            }
            //confirm data submission
      //show error when empty fields submitted
        }catch(Exception ex){
       
 
        }
 
 }public void updateRecords(){
     
     try{
         int row=tableShowMembers.getSelectedRow();
         String value=(tableShowMembers.getModel().getValueAt(row, 0).toString());
     String sql="UPDATE registermembers SET Name =?,Reg_Number =?,Gender=?,PhoneNumber =?, Jumuiya =?,Year=?,Email=? WHERE Id="+value;
     Connection conn=null;
         PreparedStatement pst= null;
         ResultSet rs;
        conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/sms_project","root","");
           pst= conn.prepareStatement(sql);
                String fname=txtFirst_Name.getText();
                String lname=txtLast_Name.getText();
                String name= fname+" "+lname;
        pst.setString(1,name);
//        pst.setString(2, txtLast_Name.getText());
       // pst.setString(2, txtLast_Name.getText());
        pst.setString(2, txtRegNumber.getText());
           String Gender;
            if(Radio_Female.isSelected()){
            Gender="Female";
            }else{
            Gender="Male";
            }
        pst.setString(3,Gender);
        pst.setString(4, txtPhoneNumber.getText());
        pst.setString(5,(String) cboJumuiya.getSelectedItem());
          String Year=(String) CboYear.getSelectedItem();
                switch (Year) {
                    case "First Year":
                        Year="1";
                        break;
                    case "Second Year":
                        Year="2";
                        break;
                    case "Third Year":
                        Year="3";
                        break;
                    case "Fourth Year":
                        Year="4";
                        break;
                }
                
        pst.setString(6, Year);
        pst.setString(7, txtEmail.getText());
                 pst.executeUpdate();
                DefaultTableModel model= (DefaultTableModel)tableShowMembers.getModel();
                model.setRowCount(0);
                showResultsOnTable();
                JOptionPane.showMessageDialog(this,"One Record Updated!");
                txtLast_Name.setVisible(true);
                lastName.setVisible(true);
                fName.setVisible(true);
     }catch(Exception e){
     
          JOptionPane.showMessageDialog(this,e);
     
     }
 
 
 }
 public void deleteRecords(){
        dbConnect connect= new dbConnect();
        connect.Connect();
        try{
            DefaultTableModel model=(DefaultTableModel)tableShowMembers.getModel();
            
         int select= tableShowMembers.getSelectedRow();
       //  Object Reg_Number=tableShowMembers.getValueAt(select,0).toString();
         txId.setText(model.getValueAt(select, 0).toString());
         txtFirst_Name.setText(model.getValueAt(select, 1).toString());
        // txtLast_Name.setText(model.getValueAt(select, 2).toString());
         txtRegNumber.setText(model.getValueAt(select, 2).toString());
         String gender=model.getValueAt(select, 3).toString();
            if(gender.equals("Male")){
                Radio_Male.setSelected(true);
            }else{
                Radio_Female.setSelected(true);
            }
         txtPhoneNumber.setText(model.getValueAt(select, 4).toString());
          String jumuiya=model.getValueAt(select, 5).toString();
            switch(jumuiya){
                case "St.Peters":
                    cboJumuiya.setSelectedIndex(1);
                    break;
                case "St.Charles":
                    cboJumuiya.setSelectedIndex(2);
                    break;
                case "St.Bredgits":
                    cboJumuiya.setSelectedIndex(3);
                    break;
                case "Holy Family":
                    cboJumuiya.setSelectedIndex(4);
                    break;
                case "St.Thomas":
                    cboJumuiya.setSelectedIndex(5);
                    break;
                case "St.Stephens":
                    cboJumuiya.setSelectedIndex(6);
                    break;  
            }
          String year=model.getValueAt(select, 6).toString();
            switch(year){
                case "First Year":
                    CboYear.setSelectedIndex(1);
                    break;
                case "Second Year":
                    CboYear.setSelectedIndex(2);
                    break;
                case "Third Year":
                    CboYear.setSelectedIndex(3);
                    break;
                case "Fourth Year":
                    CboYear.setSelectedIndex(4);
                    break;
                case "Associate":
                    CboYear.setSelectedIndex(5);
                    break;
                case "Allumini":
                    CboYear.setSelectedIndex(6);
                    break; 
                case "Guest":
                    CboYear.setSelectedIndex(7);
                    break;
            }
         txtEmail.setText(model.getValueAt(select, 7).toString());
         //checkBox
//         String check=model.getValueAt(select, 10).toString();
//                switch(check){
//                    case "checkbox1":
//                        varCheck1.setSelected(true);
//                        varcheck2.setSelected(false);
//                    case "checkbox2":
//                        varCheck2.setSelected(true);
//                        varcheck1.setSelected(false);
//                    default:
//                        varCheck1.setSelected(true);
//                        varcheck2.setSelected(true);
//                
//                }
       //  String sql="DELETE FROM registermembers WHERE Reg_Number='"+Reg_Number+"'";
//         connect.st=connect.conn.createStatement();
//         connect.st.executeUpdate(sql);
         showResultsOnTable();
        }catch(Exception e){
        JOptionPane.showMessageDialog(this,e.getLocalizedMessage());
        }
    }
 
 public void timer(){

     Thread clock= new Thread(){
         public void run(){
         
         for(;;){
          Calendar cal = new GregorianCalendar();
          SimpleDateFormat sdf= new SimpleDateFormat("HH:mm:ss a");

          labelShowTime.setText(sdf.format(cal.getTime()));
         try{
             sleep(1000);
         }catch(Exception ex){
         
             JOptionPane.showMessageDialog(null, ex);
         
         }
         }
         }
         
                };
         clock.start();
                 }
 
 public void table_filter(){
         
        
            DefaultTableModel model=(DefaultTableModel) tableShowMembers.getModel();
                model.setRowCount(0);
      
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
            String sql="SELECT * FROM registermembers WHERE Name LIKE '%"+QuickSearch.getText()+"%' || Reg_Number LIKE '%"+QuickSearch.getText()+"%' ORDER BY Id ASC";

            st=con.createStatement();
            rs=st.executeQuery(sql);
            model=(DefaultTableModel)tableShowMembers.getModel();
           
            while (rs.next()){
                
             // model.setRowCount(model.getRowCount()+1);
                 String id=rs.getString("ID");  
                String ln=rs.getString("Name");
                String reg=rs.getString("Reg_Number");
                String gd=rs.getString("Gender");
                String p=rs.getString("PhoneNumber");
                String jm=rs.getString("Jumuiya");
                String yr=rs.getString("Year");
                String em=rs.getString("Email");
                
                model.addRow(new Object[]{id,ln,reg,gd,p,jm,yr,em});
                   
           }
            
            if(model.getRowCount()==0){
            JOptionPane.showMessageDialog(this,"No Record Match!");
            
            }else{
            
            }
//            JOptionPane.showMessageDialog(this,"No RECORD FOUND");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this,"NO RECORDS FOUND!");
        }
     }
}
