package javaapplication15;

import java.util.Scanner;

public class JavaApplication15 {
    public static void main(String[] args) {
        int sum = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("please entre length of String array");
        int LENGTH = in.nextInt();
        int[] input = new int[LENGTH];

        System.out.println("please enter array elements");
        for (int i = 0; i < LENGTH; i++) {
            int E_input = in.nextInt();
            input[i] = E_input;

            for (int u = 0; u < input.length; u++) {
                int org_num = E_input;
                int reminder = 0;
                int rev_num = 0;

                for (; E_input != 0;) {
                    reminder = E_input % 10;
                    rev_num = rev_num * 10 + reminder;
                    E_input = E_input / 10;
                }
                System.out.println("reversed number" + rev_num);

                if (org_num == rev_num)
                    System.out.println(" this is a palindrome number");
                else
                    System.out.println(" this isn't a palindrome number");
            }
        }
    }
}
