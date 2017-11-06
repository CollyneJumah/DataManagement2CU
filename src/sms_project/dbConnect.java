
package sms_project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author CollyneJumah
 */
public class dbConnect {
    Connection conn=null;
    ResultSet rs;
    Statement st;
    PreparedStatement pst= null;
    
   
  public void Connect(){
      try{
            String dbname="sms_project";
            String pass="";
            String username="root";
            String Url="jdbc:mysql://localhost:3306/";
            String Drivers="com.mysql.jdbc.Driver";
            
            Class.forName(Drivers);
            conn=DriverManager.getConnection(Url+dbname,username,pass);
//             pst=conn.prepareStatement(sql);
//            pst.execute();
            JOptionPane.showMessageDialog(null,"Connected");
      
      }catch(Exception ex){
          JOptionPane.showMessageDialog(null, ex);
      }
  
  }
    public static void main(String[] args) {
        dbConnect db= new dbConnect();
        db.Connect();
        
    }
    
}
