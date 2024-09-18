/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication29;

import java.util.Scanner;

/**
 *
 * @author georg
 */
public class JavaApplication29 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int count = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("entre the String");
        String str = in.nextLine();
        System.out.println("now entre the character u looking for");
        char key = in.next().charAt(0);
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == key)
                count++;
        }
        System.out.println("the character you looking for has been found" + count + " times");
    }

}
