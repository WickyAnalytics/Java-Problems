package project.pkg1.pkg0;

import java.util.Scanner;

public class Project10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("entre your diminsions length, weidth, haight");
        int x = in.nextInt();
        int y = in.nextInt();
        int z = in.nextInt();

        box obj1 = new box(x, y);
        box3d obj2 = new box3d(x, y, z);

        System.out.println("the area of the box:" + " " + obj1.area());
        System.out.println("the volume of the 3d box:" + " " + obj2.volume());
    }

}
