/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sms_project;

//import com.sun.xml.internal.ws.commons.xmlutil.Converter;
import database.Mysql;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author CollyneJumah
 */
public class sending {
    
    public static String message = "";
    PreparedStatement pst;
    ResultSet rs;
    String data[] = new String[8];

    public void selectData() {
        try {
            pst = Mysql.connect("sms_project")
                    .prepareStatement("select name,registrationNumber,PARENT,gender,phoneNumber,feeAmountPayed,newBalance,modeOfPayment from defaultfee");
        } catch (SQLException ex) {
//            Logger.getLogger(CA.class.getName()).log(Level.SEVERE, null, ex);
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
                
                 
            }
            String nam = data [0];
            String regNo = data [1];
            String prnt = data [2];
            String gend = data [3];
            String pNo = data [4];
            String feeamont = data [5];
            String newb = data [6];
            String mop = data [7];
            
            storage move = new storage(nam,regNo,prnt,gend,pNo,feeamont,newb,mop);
             String parent=storage.getPARENT();
        String payed=storage.getfeeAmountPayed();
        String balance=storage.getnewBalance();
        String mode= storage.getmodeOfPayment();
//    message = "Dear {sex}{name}! Lechall33 now .kindly hurry.Bash kick starts.Thanks";
    message = "Dear {sex}."+parent+"! your student {name} has payed Ksh."+payed+" via "+mode+". Outstanding fee balance for this year is Ksh."+balance+".Thank you ";
//        message = "Dear "+parent+"! Sory for this message. ni project nilikuwa naitest kama inafanya. ";

        String sex = storage.getgender().equalsIgnoreCase("Male") ? "Mr." : "Miss.";
    
            
            
        }
        catch(Exception e ){
            JOptionPane.showMessageDialog(null, e);
        }}
        public static String getmsg(){
                return message;
            }
        
    
}
