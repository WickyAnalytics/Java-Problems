package javaapplication13;
import java.util.Scanner;

public class LCG 
{

      public static void LCG(int a, int c, int m, int noOfRandomNum, int[]randomNums)
      {
          for (int i=0 ; i<noOfRandomNum; i++)
          {
              randomNums[i]=((randomNums[i-1]*a)+c)%m;
          }
      }  
}
