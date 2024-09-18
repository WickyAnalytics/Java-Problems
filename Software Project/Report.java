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
public class Report {
    ArrayList<Complaint> CM;
    private int Report_ID;
    private int Report_Code;
    private String Report_Type;

    public int getReport_ID() {
        return Report_ID;
    }

    public void setReport_ID(int Report_ID) {
        this.Report_ID = Report_ID;
    }

    public boolean reportSubmit() {
        return false;
    }

    public Report(int Report_ID, int Report_Code, String Report_Type) {
        this.Report_ID = Report_ID;
        this.Report_Code = Report_Code;
        this.Report_Type = Report_Type;

    }

    public boolean ReportSubmit(boolean Complaint_Submit) {
        if (Complaint_Submit == true) {
            return true;
        }
        return false;

    }
}
