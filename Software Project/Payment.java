/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elml3b;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Payment {
    Scanner in = new Scanner(System.in);

    private int Payment_ID;
    private int Amount;
    private String Payment_Refrence;

    public int getPayment_ID() {
        return Payment_ID;
    }

    public void setPayment_ID(int Payment_ID) {
        Random rand = new Random();

        int upperbound = 1000;

        Payment_ID = rand.nextInt(upperbound);
    }

    public Payment(int Payment_ID, int Amount, String Payment_Refrence) {
        this.Payment_ID = Payment_ID;
        this.Payment_Refrence = Payment_Refrence;
        this.Amount = Amount;

    }

    public String Payment_method(String Payment_Refrence) {

        System.out.println("Choose Between Visa And Cash ");

        Payment_Refrence = in.nextLine();

        if (Payment_Refrence == "Visa") {
            return "Visa";

        } else

            return "Cash";
    }

    public Boolean Payments_method(String Payment_method) {

        return true;

    }

    public int GEtPayments_ID(Boolean Payments_method) {

        if (Payments_method == true) {

            return Payment_ID;
        }

        else

            return 0;
    }
}
