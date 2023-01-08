    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carrentalsystem_final;

import Annotations.BooleanField;
import Annotations.FloatField;
import Annotations.IntegerField;

import Annotations.StringField;

/**
 *
 * @author vistokartika
 */

public class CarsDAO extends BaseClass{
    
        @StringField 
         String RegNum,Brand,Model,Status;

    public int getFees() {
        return Fees;
    }

    public void setFees(int Fees) {
        this.Fees = Fees;
    }
        @IntegerField
        int Fees;

    public String getRegNum() {
        return RegNum;
    }

    public void setRegNum(String RegNum) {
        this.RegNum = RegNum;
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
    public void setStatus(String Status){
        this.Status="Available";
    }
    public String getStatus(){
        return Status;
    }



    
}
