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
public class LinkedList {
    Node head;
    Node tail;
    int elmentCount;

    public LinkedList() {
        head = null;
        tail = null;
        elmentCount = 0;
    }

    public boolean Is_empty() {
        return (elmentCount == 0);
    }

    // insertfirst code-------------------------------------------------------------
    public void insertFirst(int data) {
        Node myNode = new Node(data);
        if (Is_empty()) {
            head = tail = myNode;
        } else {
            head.prev = myNode;
            myNode.next = head;
            head = myNode;
        }
        elmentCount++;
    }

    // insertlast code--------------------------------------------------------------
    public void insertLast(int data) {
        Node myNode = new Node(data);
        if (Is_empty()) {
            head = tail = myNode;
        } else {
            myNode.prev = tail;
            tail.next = myNode;
            tail = myNode;
        }
        elmentCount++;
    }

    // remove first code------------------------------------------------------------
    public int removeFirst(int pos) {
        int data;
        if (head.next == null) {
            data = head.data;
            head = tail = null;
        } else {
            data = head.data;
            head = head.next;
            head.prev = null;
        }
        elmentCount--;
        return data;
    }

    // remove last code-------------------------------------------------------------
    public int removeLast(int pos) {
        int data;
        if (head.next == null) {
            data = head.data;
            head = tail = null;
        } else {
            data = tail.data;
            tail = tail.prev;
        }
        return data;
    }

    // insertAT code----------------------------------------------------------------
    public void insertAt(int pos, int data) {
        Node myNode = new Node(data);
        if (Is_empty()) {
            head = tail = myNode;
        } else {
            Node tempN = head;
            Node tempP = head;
            for (int i = 0; i < pos - 1; i++) {
                tempN = tempN.next;
            }
            myNode.next = tempN.next;
            tempN.next = myNode;
            for (int j = 0; j < pos; j++) {
                tempP = tempP.next;
            }
            tempP.prev = myNode;
            myNode.prev = tempN;

        }
        elmentCount++;
    }

    // removeAt code---------------------------------------------------------------
    public int removeAt(int pos) {
        int data;

        Node tempN = head;
        Node tempP = head;
        for (int i = 0; i < pos - 1; i++) {
            tempN = tempN.next;
        }
        data = tempN.next.data;
        tempN.next = tempN.next.next;
        for (int j = 0; j < pos + 1; j++) {
            tempP = tempP.next;
        }
        tempP.prev = tempP.prev.prev;

        elmentCount--;
        return data;
    }

    public void displayForward() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    // reverse methods code
    public void ReverseQueue() {
        Node current = head;
        Node temp = null;
        while (current != null) {
            temp = current.next;
            current.next = current.prev;
            current.prev = temp;

            if (current.prev == null) {
                head = current;
            }
            current = current.prev;
        }
    }
}