package javaapplication13;
import java.util.Scanner;

public class JavaApplication13 {

      public static void main(String[]args)
      {
       double IAT,AT=0,SST,WT,ST,TSE,TIS, IDLE;
       int a=5, c=3, m=7;
       int Customer_num;
       int noOfRandomNum=30;
       int[]randomNums=new int[noOfRandomNum];
       
       Scanner in = new Scanner(System.in);
       System.out.print("entre the number of customer");
       Customer_num=in.nextInt();
       int[] Customer=new int[Customer_num];
            for (int i=1; i<Customer_num;i++)
            {
             System.out.print("customer" + i);
            }
        IAT=(int)(Math.random()*30);
        System.out.println("IAT" + IAT);
        
        ST= (int)(Math.random()*30);
        System.out.println("ST" +ST);
        
        AT= IAT+AT;
        System.out.print("AT"+ AT);
        
        SST=ST+IAT;
        System.out.println("SST"+ SST);
        
        WT=SST-AT;
        System.out.println("WT"+WT);
        
        TSE=SST+ST;
        System.out.println("TSE"+ TSE);
        
        TIS=TSE-AT;
        System.out.println("TIS"+ TIS);
        
        if (TSE>AT)
            System.out.println("IDLE" + TSE);
        else 
            System.out.println("IDLE" + AT);
                    
            
        LCG(a , c, m, noOfRandomNum, randomNums);
        System.out.println("the random number of lcg=");
            for(int i=0; i<noOfRandomNum;i++)
            {
                System.out.print(randomNums[i]);
            }
            
      }
      
      //LCG Method
            public static void LCG(int a, int c, int m, int noOfRandomNum, int[]randomNums)
      {
          for (int i=0 ; i<noOfRandomNum; i++)
          {
              randomNums[i]=((randomNums[i-1]*a)+c)%m;
          }
      }  
}


