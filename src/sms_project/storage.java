
package sms_project;

/**
 *
 * @author CollyneJumah
 */
public class storage {
 
 public static String name,registrationNumber,PARENT,gender,phoneNumber,feeAmountPayed,newBalance,modeOfPayment;
    public storage (String name,String registrationNumber,String PARENT,String gender,String phoneNumber,String feeAmountPayed,String newBalance,String modeOfPayment){
        this.name = name;
        this.registrationNumber = registrationNumber;
        this.PARENT = PARENT;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.feeAmountPayed = feeAmountPayed;
        this.newBalance = newBalance;
        this.modeOfPayment = modeOfPayment;
    }
    public static String getname(){
        return name;
    }
    public static String getmodeOfPayment(){
        return modeOfPayment;
    }
    public static String getregistrationNumber (){
        return registrationNumber;
    }
    public static String getPARENT(){
        return PARENT;
    }
    public static String getgender(){
        return gender;
    }
    public static String getphoneNumber(){
        return phoneNumber;
    }
    public static String getfeeAmountPayed(){
        return feeAmountPayed;
    }
    public static String getnewBalance(){
        return newBalance;
    }
                 
}
