/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication25;

/**
 *
 * @author georg
 */
public class JavaApplication25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Stack myStack = new Stack(3);
        myStack.push(10);
        myStack.push(20);
        myStack.push(30);
        myStack.printStack();
    }

}
