/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elml3b;

import java.util.ArrayList;
import java.util.Random;

public class Reservation {
    private int Reservation_ID;
    private String Refrence_Code;
    private int Total_price;
    private Boolean Reservation_Status;
    private int Addon_ID;
    private String Reservation_Datetime;

    private String Booking_Datetime;
    private boolean Addon_Status;

    public Reservation(int Reservation_ID) {

        Random rand = new Random();

        int upperbound = 1000;

        Reservation_ID = rand.nextInt(upperbound);

    }

    public int getReservation_ID() {
        return Reservation_ID;
    }

    public void setReservation_ID(int Reservation_ID) {
        this.Reservation_ID = Reservation_ID;
    }

    public int getAddon_ID() {
        return Addon_ID;
    }

    public void setAddon_ID(int Addon_ID) {
        this.Addon_ID = Addon_ID;
    }

    public Reservation(boolean Addon_Status, String Booking_Datetime, int Reservation_ID, String Refrence_Code,
            int Total_price, Boolean Reservation_Status, int Addon_ID, String Reservation_Datetime) {

        this.Reservation_ID = Reservation_ID;
        this.Refrence_Code = Refrence_Code;
        this.Total_price = Total_price;
        this.Reservation_Status = Reservation_Status;
        this.Addon_ID = Addon_ID;
        this.Reservation_Datetime = Reservation_Datetime;
        this.Addon_Status = Addon_Status;
        this.Booking_Datetime = Booking_Datetime;
    }

    public Reservation(String Reservation_Datetime) {

        ArrayList<String> DateTime = new ArrayList();
        DateTime.add("22/01/2022,10:32 PM");
        DateTime.add("22/01/2022,9:32 PM");
        DateTime.add("25/01/2022,8:32 PM");
        DateTime.add("30/01/2022,5:32 PM");
        DateTime.add("21/01/2022,2:32 PM");
        DateTime.add("15/01/2022,1:32 PM");
        DateTime.add("9/01/2022,3:32 PM");
        DateTime.add("18/01/2022,2:32 AM");
        DateTime.add("5/01/2022,4:32 PM");
        DateTime.add("23/01/2022,11:32 PM");
        DateTime.add("22/01/2022,12:32 PM");
        DateTime.add("19/01/2022,12:32 AM");
        DateTime.add("12/01/2022,7:32 PM");
        DateTime.add("4/01/2022,8:32 AM");
        DateTime.add("5/01/2022,2:32 AM");
    }

    public boolean Addon_Status(Boolean Addon_Status) {
        if (Addon_Status == true) {
            return true;
        }
        return false;
    }

    public Boolean CheckDateTime(ArrayList<String> DateTime)

    {

    }

}
