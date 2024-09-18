/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elml3b;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Manger extends Staff {
    Scanner in = new Scanner(System.in);
    ArrayList<Field> FD;

    public Manger(int Staff_ID, int Staff_phone, String Staff_username, String Staff_name, String Staff_userPassword) {
        super(Staff_ID, Staff_phone, Staff_username, Staff_name, Staff_userPassword);
    }

    public void addempolyee(int Staff_ID, int Staff_phone, String Staff_username, String Staff_name,
            String Staff_userPassword) {
        System.out.println("Please Enter Data ");

        System.out.println("Please Enter Employee ID");
        Staff_ID = in.nextInt();
        System.out.println("Please Enter Employee Phone ");
        Staff_phone = in.nextInt();

        System.out.println("Please Enter Employee  User Name");
        Staff_username = in.nextLine();

        System.out.println("Please Enter Employee Name ");
        Staff_name = in.nextLine();

        System.out.println("Please Enter Employee Password ");
        Staff_userPassword = in.nextLine();
    }

    public void remove(int Staff_ID, int Staff_phone, String Staff_username, String Staff_name,
            String Staff_userPassword) {

    }

}
