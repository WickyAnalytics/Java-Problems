/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.pkg1.pkg0;

/**
 *
 * @author georg
 */
public class box {
    private int length;
    private int breadth;

    // empty constructor
    public box() {
        int length = 0;
        int breadth = 0;
    }

    // constructor
    public box(int x, int y) {
        length = x; // int length ..int breadth <<< area = 0
        breadth = y;
    }

    public void setvalue(int x, int y) {
        length = x;
        breadth = y;
    }

    // method for area
    public int area() {
        return (length * length);
    }
}
