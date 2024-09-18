/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication51;

import java.util.Scanner;

/**
 *
 * @author georg
 */
public class JavaApplication51 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
 double [] grade = new double[5];
 int [] id = new int[5];
 int j=1;
 double max = 0;
 int maxID = 0;
 for(int i=0; i<5; i++){

 System.out.println("Please enter the ID for student number " + j);
 id[i] = s.nextInt();


 do{
 System.out.println("Please enter your grade out of 100 for student number " + j);
 grade[i] = s.nextDouble();

 }while(grade[j] > 100);

 j++;

 if(grade[j] < 50)
 grade[j]+=5;

 if(grade[j] > max){
 maxID = id[i];
 max = grade[j];
 }

 }
 System.out.println("The student ID with the highest grade is " + maxID);
 System.out.print("The student grades after modifing: ");
 for(int i=0; i<5; i++)
 System.out.print( grade[i] + " ");




 }

    
}
