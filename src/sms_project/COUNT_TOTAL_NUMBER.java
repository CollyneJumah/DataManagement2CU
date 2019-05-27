
package sms_project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class COUNT_TOTAL_NUMBER {
   
    public  static  int countRegisteredMembers(String table){
    
    
    int total=0;
    int component;
    Connection con=null;
    Statement st;
    ResultSet rs;
    PreparedStatement pst= null;
    
    try{
            String dbname="sms_project";
            String pass="";
            String username="root";
            String Url="jdbc:mysql://localhost:3306/";
            String Drivers="com.mysql.jdbc.Driver";
             //table="registermembers";

            Class.forName(Drivers);
            con=DriverManager.getConnection(Url+dbname,username,pass);
        
        String sql="SELECT COUNT(*) AS 'total' FROM "+table;
            pst=con.prepareStatement(sql);
            st=con.createStatement();
            rs=st.executeQuery(sql);
            rs=pst.executeQuery();
            while(rs.next()){
            
            total=rs.getInt(1);
            
            }
        
    
    }catch(Exception ex){
    
        JOptionPane.showMessageDialog(null,"No connection"+ex.getLocalizedMessage());
    }
        return total;
    
    
    
    
    }
    
    
    
}
