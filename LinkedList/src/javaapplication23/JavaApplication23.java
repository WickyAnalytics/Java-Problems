/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication23;

/**
 *
 * @author georg
 */
public class JavaApplication23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LinkedList myList = new LinkedList();
        myList.insertFirst(10);
        myList.insertFirst(20);
        myList.insertFirst(30);
        myList.insertFirst(40);
        myList.displayForward();
        myList.ReverseQueue();
        myList.displayForward();
    }

}
