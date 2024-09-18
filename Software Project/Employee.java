/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elml3b;

import java.lang.reflect.Field;
import java.util.ArrayList;

/**
 *
 * @author Lenovo
 */
public class Employee extends Staff {

    ArrayList<Complaint> cm;
    ArrayList<Reservation> res;
    ArrayList<Field> fie;
    ArrayList<Payment> py;
    ArrayList<Receipt> ric;

    public Employee(int Staff_ID, int Staff_phone, String Staff_username, String Staff_name,
            String Staff_userPassword) {
        super(Staff_ID, Staff_phone, Staff_username, Staff_name, Staff_userPassword);
    }

    public Boolean ConfirmPayment(int GEtPayments_ID, int MakeReservation, Boolean ConfirmReservation,
            Boolean Payments_method, int Payment_ID) {

        if (GEtPayments_ID == Payment_ID && Payments_method == true && ConfirmReservation == true)

            return true;
        else
            return false;
    }

    public Boolean ConfirmReservation(int Reservation_ID) {
        if (Reservation_ID != 0)
            return true;
        else
            return false;
    }

    public boolean login(String EMP_Name, String EMP_Password) {
        if (EMP_Password == "01234567890") {

            return true;

        }
        return false;

    }

    public void Logout() {

        System.out.println("thank you");

    }

}
