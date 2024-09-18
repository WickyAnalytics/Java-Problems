/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication28;

/**
 *
 * @author georg
 */
public class JavaApplication28 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BinarysearchTree myTree = new BinarysearchTree();
        myTree.insert(10);
        myTree.insert(20);
        myTree.insert(40);
        myTree.insert(60);
        myTree.print(1);
        myTree.MaxNum();
    }

}
