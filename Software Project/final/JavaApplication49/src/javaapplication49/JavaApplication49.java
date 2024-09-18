/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication49;

import java.util.Scanner;

/**
 *
 * @author georg
 */
public class JavaApplication49 {

    /**
     * @param args the command line arguments
     */

    public static void main(String arg[])
    {
        Scanner in = new Scanner(System.in);
        
        System.out.print("entre your rectangle");
        int L = in.nextInt();
        int B = in.nextInt();
        Rectangle r = new Rectangle(L , B);
        
        System.out.print("entre your Square");
        int S = in.nextInt();
        Square s = new Square(S);
        
        System.out.print("entre your Circle");
        int R= in.nextInt();
        Circle c = new Circle(R);
        
        System.out.println("Rectangle Area : " + r.getArea());
        System.out.println("Square Area : " + s.getArea());
        System.out.println("Circle Area : " + c.getArea());
        System.out.println();
        
        if ((r.getArea() > c.getArea()) && (r.getArea() > s.getArea()))
        {
            System.out.println("Rectangle has the largest area.");
        }
        else if( s.getArea() > c.getArea() )
        {
            System.out.println("Square has the largest area.");
        }
        else
        {
            System.out.println("Circle has the largest area.");
        }    
    }
}   

