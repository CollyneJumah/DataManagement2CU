/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sms_project;

/**
 *
 * @author butterfly
 */
public class User {
    private static  String course,semister;
    private static float fee;
    
    
    
            
    
    public User (String user, String semister, int fee){
        this.course = user;
        this.semister = semister;
        this.fee = fee;
        
    }
        

    
    
    public static String getcourse(){
        return course;
    }
    public static String getsemister(){
        return semister;
    }
    public static float getfee(){
        return fee;
    }
}
