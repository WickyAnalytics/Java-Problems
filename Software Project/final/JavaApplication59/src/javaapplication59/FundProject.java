/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication59;

import java.util.Scanner;

/**
 *
 * @author user0
 */
public class FundProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
              String output="";
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please Enter sample Equation: ");
        String equation = scanner.nextLine();
        System.out.print("please enter your operation");
        System.out.print("\n 1. lexical analyzer \n 2. semantic Tree \n 3. syntax Tree \n 4. Intermediate Code Generation \n");
        int num = scanner.nextInt();
        if (num==1)
        {
            Lexical_Analyzer(equation);
        }if (num==2)
        {
            semanticnalyzer(equation);
        }
        if(num==3)
        {
            syntax_Analyzer(equation);
        }
        if(num==4)
        {
            ICG(equation);
        }        
    }
    //------------------------------------------------------------------------------------------------------------------------------------
     public static void Lexical_Analyzer(String equation)
         {
         String output="";  
        int idCount=1;
        char eq[] = equation.toCharArray();
        for(int i=0; i<eq.length;i++)
        {
            if( eq[i] == '=' || eq[i]=='+' || eq[i] == '-' || eq[i] == '/' || eq[i] == '*' ||  eq[i] == ' ' ||  eq[i] == '(' ||  eq[i] == ')'){
                output += eq[i];
            }
            else if((eq[i] >= 'a' && eq[i] <= 'z') || (eq[i] >= 'A' && eq[i] <= 'Z')){
                output += "Id" + idCount;
                idCount++;
            }
            else if(Character.isDigit(eq[i]) == true){
                output += eq[i];
            }
        }
        System.out.print("The Lexical Analyzer Output : \n" + output);
        }
    //------------------------------------------------------------------------------------------------------------------------------------
    public static void semanticnalyzer( String equation){
       String parsedEq="";
       int idCount=1;
       char c[] = equation.toCharArray();
       for(int i=0; i<c.length;i++){
            if( c[i] == '=' || c[i]=='+' || c[i] == '-' || c[i] == '/' || c[i] == '*' ||  c[i] == ' ' || c[i]=='.'){
               parsedEq += c[i];      
             }
             else if((c[i] >= 'a' && c[i] <= 'z') || (c[i] >= 'A' && c[i] <= 'Z')){
                 parsedEq += "Id" + idCount;
                 idCount++;             
             }
             else if(Character.isDigit(c[i]) == true){
             parsedEq += c[i];
             }
        }
        
        String[] tree = parsedEq.split("(?=[-+*/()])|(?<=[^-+*/][-+*/])|(?<=[()])");
        String one=tree[0];
        one=one.substring(4);
        String op1=tree[1];
        String two=tree[2];
        String op2=tree[3];
        String three=tree[4];
      
        float oneF=0;
        float twoF=0;
        float threeF=0;
        String OneP="";
        String TwoP="";
        String ThreeP="";
      
        if (one.equals("Id1") || one.equals("Id2") || one.equals("Id3")){
           System.out.println();
           OneP="Id1";
        }
        else{
           char[] n=new char[9];
      
            for (int i=0;i<one.length();i++){
                n[i]=one.charAt(i);
            }
            for(int i=0;i<n.length;i++){
              if(n[i]!='.'){
                 oneF=Float.parseFloat(one);
                 OneP=Float.toString(oneF);
              }
            }
        }
        if (two.equals("Id2") || two.equals("Id3") || two.equals("Id1")){
            System.out.println();
            TwoP="Id2";
        }
        else {
         char[] n1=new char[9];
         for (int i=0;i<two.length();i++){
             n1[i]=two.charAt(i);
         }
         for(int i=0;i<n1.length;i++){
           if(n1[i]!='.'){
              twoF=Float.parseFloat(two);
              TwoP=Float.toString(twoF);
           }
         }
        }
        if(three.equals("Id3") || three.equals("Id2") ||three.equals("Id1") ){
            System.out.println();
            ThreeP="Id3";
        }
        else{
            char[] n2=new char[9];
            for (int i=0;i<three.length();i++){
                n2[i]=three.charAt(i);
            }
            for(int i=0;i<n2.length;i++){
              if(n2[i]!='.'){
                 threeF=Float.parseFloat(three);
                 ThreeP=Float.toString(threeF);

              }
            }
        }
        System.out.println("The Semantic Analyis equation is: " + parsedEq);
        System.out.println("The Semantic Tree for that equation is: ");
        System.out.println();
        System.out.println("         Id1           ");
        System.out.println("          |           ");
        System.out.println("          =           ");
        System.out.println("          |           ");
        System.out.println("          "+op1+"           ");
        System.out.println("        /   \\          ");
        System.out.println("       "+OneP+"    "+op2+"      ");
        System.out.println("            /  \\   ");
        
        System.out.println("         "+TwoP+"    "+ThreeP+"      ");
    }
    //------------------------------------------------------------------------------------------------------------------------------------
      public static void syntax_Analyzer(String equation){
           String parsedEq="";
          int idCount=1;
     
        char c[] = equation.toCharArray();
        for(int i=0; i<c.length;i++){
            if( c[i] == '=' || c[i]=='+' || c[i] == '-' || c[i] == '/' || c[i] == '*' ||  c[i] == ' '){
                parsedEq += c[i];  
            }
            else if((c[i] >= 'a' && c[i] <= 'z') || (c[i] >= 'A' && c[i] <= 'Z')){
                parsedEq += "Id" + idCount;
                idCount++;
            }
            else if(Character.isDigit(c[i]) == true){
            parsedEq += c[i];
            }
        }
        //breaking parsed equation by operators to generate parse tree (syntax tree)
        String[] tree = parsedEq.split("(?=[-+*/()])|(?<=[^-+*/][-+*/])|(?<=[()])");
        String one=tree[0];
        one=one.substring(4);
        String op1=tree[1];
        String two=tree[2];
        String op2=tree[3];
        String three=tree[4];
        System.out.println("The Lexical Analysis equation is: " + parsedEq);
        System.out.println();
        System.out.println("         Id1           ");
        System.out.println("          |           ");
        System.out.println("          =           ");
        System.out.println("          |           ");
        System.out.println("          "+op1+"           ");
        System.out.println("        /   \\          ");
        System.out.println("       "+one+"     "+op2+"      ");
        System.out.println("            /  \\   ");
        System.out.println("         "+two+"    "+three+"      ");
    }
    //------------------------------------------------------------------------------------------------------------------------------------
      public static void ICG(String equation)
      {
          String eq[] = equation.split("");
          String[] op = {"+","-","/","%","^"};
          String[] term = {"t0","t1","t2","t3","t4","t5"};
          int count=0;
          System.out.println("The Address Code :\n");
          for (int i=0; i < eq.length; i++)
          {
              for (int j=0 ;j < op.length; j++){
                  if(eq[i].equals(op[j]))
                  {
                      if(count==0)
                      {
                          System.out.print("t0 =" + eq[i-1] + eq[i]+ eq[i+1] +";\n");
                      }else {
                          System.out.println(term[count]+ " = " + term[count - 1] + eq[i] + eq[i+1]+";\n");
                      }
                      count++;
                  }
              }
          }
      }
}