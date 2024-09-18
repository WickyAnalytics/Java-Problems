package javaapplication14;

import java.util.Scanner;

public class JavaApplication14 {
    public static void main(String[] args) {
        // perfect number is a positive integer that eqia;s tje si, pf ots dovosprs
        // (except otse;f)
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
                int y = 1;
                while (y <= E_input / 2) {
                    if (E_input % y == 0) {
                        sum = sum + y;
                    }
                }
                u++;

                if (sum == u) {
                    System.out.println(E_input + "is a perfect number");
                } else
                    System.out.println(E_input + "isn't a perfect number");
            }
        }
    }
}
