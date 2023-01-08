/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carrentalsystem_final;

import Annotations.BooleanField;
import Annotations.FloatField;
import Annotations.IntegerField;
import Annotations.StringField;
import Annotations.LocalTImeField;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 *
 * @author vistokartika
 */
public class RentalsDAO extends BaseClass {
    @StringField
    String CustName ,Brand, Model,RegNum, Status,LocalTime;

    


    
    @IntegerField
    int Duration,Fees;
    

    public String getLocalTime() {
        return LocalTime;
    }

    public void setLocalTime(String LocalTime) {
        this.LocalTime = LocalTime;
    }
    
    
    public String getBrand() {
        return Brand;
    }

    public void setBrand(String Brand) {
        this.Brand = Brand;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String Model) {
        this.Model = Model;
    }
   
    public String getRegNum() {
        return RegNum;
    }

    public void setRegNum(String RegNum) {
        this.RegNum = RegNum;
    }


    public String getStatus() {
        return Status;
    }
    
    public void setStatus(String Status) {
        this.Status = Status;
    }
    
    public int getDuration(){
        return Duration;
    }
    public void setDuration(int Duration){
        this.Duration=Duration;
    }

    public int getFees() {
        return Fees;
    }

    public void setFees(int Fees) {
        this.Fees = Fees;
    }

     public String getCustName() {
        return CustName;
    }

    public void setCustName(String CustName) {
        this.CustName = CustName;   
           }
    
    
}
