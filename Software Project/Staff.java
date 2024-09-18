/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elml3b;

/**
 *
 * @author Lenovo
 */
public class Staff {
    private int Staff_ID;
    private int Staff_phone;
    public String Staff_username;
    private String Staff_name;
    public String Staff_userPassword;

    public int getStaff_ID() {
        return Staff_ID;
    }

    public void setStaff_ID(int Staff_ID) {
        this.Staff_ID = Staff_ID;
    }

    public Staff(int Staff_ID, int Staff_phone, String Staff_username, String Staff_name, String Staff_userPassword) {
        this.Staff_ID = Staff_ID;
        this.Staff_phone = Staff_phone;
        this.Staff_userPassword = Staff_userPassword;
        this.Staff_name = Staff_name;
        this.Staff_username = Staff_username;

    }

    public boolean login(String Staff_username, String Staff_userPassword) {
        if (Staff_userPassword == "AAA") {

            return true;

        }
        return false;

    }

    public void Logout() {

        System.out.println("thank you");

    }
}