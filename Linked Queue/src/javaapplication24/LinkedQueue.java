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
public class LinkedQueue {
    Node head;
    int elmentCount;

    public LinkedQueue() {
        head = null;
        elmentCount = 0;
    }

    public boolean Is_Empty() {
        return elmentCount == 0;
    }

    // intert in queue code---------------------------------------------------------
    public void Enqueue(int data) {
        Node myNode = new Node(data);
        if (Is_Empty()) {
            head = myNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = myNode;
        }
        elmentCount++;
    }

    // remove in queue code---------------------------------------------------------
    public void Dequeue() {
        int val = 0;
        if (head.next == null) {
            val = head.data;
            head = null;
        } else {
            val = head.data;
            head = head.next;
        }
        elmentCount--;
        System.out.println("the elment u removed is" + val);
    }

    // print the Linkedqueue--------------------------------------------------------
    public void printLinkedQueue() {
        Node temp = head;
        for (int i = 0; i < elmentCount; i++) {
            System.out.println(temp.data + "-");
            temp = temp.next;
        }
    }

    // the queue length-------------------------------------------------------------
    public void Length() {
        System.out.println("the length of the queue=" + elmentCount);
        return;
    }

    public int peek() {
        System.out.println("peek(" + head.data + ")");
        return head.data;
    }
}