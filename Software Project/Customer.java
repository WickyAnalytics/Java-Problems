/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elml3b;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Customer {
    Scanner in = new Scanner(System.in);
    private int Cus_ID;
    private String Name;
    private int Phone_Number;
    private String Username;
    private String Password;

    ArrayList<Complaint> cm;
    ArrayList<Reservation> res;
    ArrayList<Field> fie;

    public int getCus_ID() {
        return Cus_ID;
    }

    public void setCus_ID(int Cus_ID) {
        this.Cus_ID = Cus_ID;
    }

    public Customer(int Cus_ID, String Name, String Username, String Password, int Phone_Number) {
        this.Cus_ID = Cus_ID;
        this.Name = Name;
        this.Username = Username;
        this.Password = Password;
        this.Phone_Number = Phone_Number;

    }

    public String MakeComplaint(String Compliant) {
        System.out.println("enter 1 if there is a compliant");
        int s = in.nextInt();
        if (s == 1) {
            System.out.println("Please Enter Your Complaint");
            String Compliants = in.next();
        }

        return null;

    }

    public boolean login(String username, String Password) {
        if (Password == "01234567890") {

            return true;

        }
        return false;

    }

    public void Logout() {

        System.out.println("thank you");

    }

    public int MakeReservation(int Reservation_ID, String name, int Phone_Number, ArrayList<String> DateTime,
            int Field_ID, Boolean Field_Status, int Addon_ID, Boolean Addon_Status) {
        System.out.println("Please Enter Data ");

        System.out.println("Please Enter Name");
        Name = in.nextLine();
        System.out.println("Please Enter  Phone ");
        Phone_Number = in.nextInt();

        System.out.println("Please Enter Date Time As DD/MM/YYYY,HH:MM PM/AM From Avalibale 16/01/2022	0"
                + "7:14 PM\n" +
                "31/01/2022	12:22 AM\n" +
                "02/02/2022	11:34 AM\n" +
                "03/01/2022	07:30 PM\n" +
                "28/02/2022	07:48 PM\n" +
                "16/01/2022	04:00 PM\n" +
                "09/02/2022	01:38 AM\n" +
                "30/01/2022	07:39 PM\n" +
                "06/02/2022	07:28 PM\n" +
                "02/02/2022	05:16 PM\n" +
                "02/02/2022	12:53 PM\n" +
                "27/02/2022	03:08 AM\n" +
                "28/01/2022	03:08 PM\n" +
                "14/02/2022	07:01 AM\n" +
                "26/02/2022	05:57 PM\n" +
                "27/02/2022	07:15 AM\n" +
                "03/01/2022	11:39 PM\n" +
                "27/02/2022	09:25 AM\n" +
                "05/02/2022	07:20 PM\n" +
                "14/01/2022	07:00 AM\n" +
                "01/03/2022	12:06 PM\n" +
                "29/01/2022	12:04 PM\n" +
                "03/02/2022	06:56 AM\n" +
                "09/01/2022	09:37 PM\n" +
                "05/02/2022	03:08 AM ");
        String Reservation_Datetime;

        Reservation_Datetime = in.nextLine();

        System.out.println("Please Enter Field Number ");
        Field_ID = in.nextInt();
        if (Field_Status == true && Addon_Status == true) {

            System.out.println(" Reservation is completed");

            return Reservation_ID;
        }

        else

            System.out.println("False Reservation ");

        return 0;

    }

    public boolean browser_avaliable_field(Boolean FieldState) {
        System.out.println("Enter number between 1 and 10");
        int i = in.nextInt();
        if (i < 10) {
            return true;
        } else
            return false;

    }

    public Boolean makePayment(String Payment_method, int Rerservation_ID) {
        System.out.println("Enter you Reservation ID");
        int i = in.nextInt();
        if (i != Rerservation_ID) {
            System.out.println("Rerservation ID IS WRONG");
        }
        if ((i != Rerservation_ID))

        {
            System.out.println("Choose your Payment Between Visa,Cash");
        }
        if (Payment_method == "Visa" || Payment_method == "Cash") {

            System.out.println("Payment is completed");

            return true;
        }

        else
            return false;

    }
}
