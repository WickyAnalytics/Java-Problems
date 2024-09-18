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
public class Stack {
    int List[];
    int stackTop; // index
    int elmentCount;
    int maxStackSize;

    public Stack(int maxStackSize) {
        stackTop = -1;
        elmentCount = 0;
        this.maxStackSize = maxStackSize;
        List = new int[maxStackSize];
    }

    // check if list is full------------------------------------------------------
    public boolean Is_Full() {
        return (elmentCount == maxStackSize);
    }

    // check if list empty--------------------------------------------------------
    public boolean Is_Empty() {
        return (elmentCount == 0);
    }

    // push method---------------------------------------------------------------
    public void push(int num) {
        if (Is_Full()) {
            System.out.print("the list has been extended");
            expand();
        }
        stackTop++;
        List[stackTop] = num;
    }

    // pop method-----------------------------------------------------------------
    public void pop(int num) {
        if (!Is_Empty()) {
            int Tamp = List[stackTop];
            stackTop--;
            elmentCount--;
        }
    }

    // Top method-----------------------------------------------------------------
    public int top() {
        if (!Is_Empty()) {
            return List[stackTop];
        } else
            return -1;
    }

    // print method---------------------------------------------------------------
    public void printStack() {
        for (int i = 0; i < elmentCount; i++) {
            System.out.println(List[i]);
        }
    }

    // expand method--------------------------------------------------------------
    public void expand() {
        int[] newList = new int[maxStackSize * 2];
        for (int i = 0; i < maxStackSize; i++) {
            newList[i] = List[i];
        }
        maxStackSize *= 2;
        List = newList;
    }
}
