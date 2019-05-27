/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sms_project;

import database.Mysql;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Telnet
 */
public class FeeReminder {

    String message = "";
    PreparedStatement pst;
    ResultSet rs;
    String data[] = new String[8];

    private void selectData() {
        try {
            pst = Mysql.connect("sms_project")
                    .prepareStatement("select name,registrationNumber,PARENT,gender,phoneNumber,feeAmountPayed,newBalance,modeOfPayment from defaultfee");
        } catch (SQLException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        }

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
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    /**
     *
     * @param data: index 0 {sex} 1{firstname+lastname}
     * @return
     */
    private String processMessage(String data[]) {
        String parent=data[2];
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

    public static void main(String[] args) {
       FeeReminder f= new FeeReminder();
       f.selectData();
    }
}
