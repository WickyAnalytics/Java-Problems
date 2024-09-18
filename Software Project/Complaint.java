/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elml3b;

import java.util.ArrayList;

/**
 *
 * @author Lenovo
 */
public class Complaint {
    private int Complaint_ID;
public String Complaint_Details;

    public Complaint(int Complaint_ID, String Complaint_Details) {
        this.Complaint_ID = Complaint_ID;
        this.Complaint_Details = Complaint_Details;
        
    }


    ArrayList<Customer> CUS;
    
    public int getComplaint_ID() {
        return Complaint_ID;
    }

    public void setComplaint_ID(int Complaint_ID) {
        this.Complaint_ID = Complaint_ID;
    }
    public Boolean Complaint_Submit( String MakeComplaint){
    if (Complaint_Details != null) {
    
        
    
        return true;
    }
    return false ;
    }

    private void getCUS_ID() {
        throw new UnsupportedOperationException();
    }
}
