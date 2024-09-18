/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication24;

/**
 *
 * @author georg
 */
public class JavaApplication24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkedQueue myQueue = new LinkedQueue();
        myQueue.Enqueue(33);
        myQueue.Enqueue(44);
        myQueue.Enqueue(55);
        myQueue.Enqueue(66);
        myQueue.Length();
        myQueue.printLinkedQueue();
        myQueue.Dequeue();
        myQueue.Dequeue();
        myQueue.printLinkedQueue();
        myQueue.peek();
    }

}
