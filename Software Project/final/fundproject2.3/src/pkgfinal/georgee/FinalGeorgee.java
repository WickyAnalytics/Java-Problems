/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgfinal.georgee;

import java.util.Scanner;

/**
 *
 * @author gorge
 */
public class FinalGeorgee {
    //z=a*4+h
    //z=a*pi+j
    //z=a+4*h
    //z=a+pi*h


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Your equation please: ");
        String equation = scanner.nextLine();
        System.out.println("*************************************");
        System.out.println("The Lexical Analysis equation is: " );
        String lexical=LexicalAnalysis(equation);
        System.out.println(lexical);
        boolean q=biflag(equation);
        System.out.println("*************************************");
        System.out.println("The Syntax Analysis is " );
        syntax(lexical);
        System.out.println("*************************************");
        System.out.println("The Semantic Analysis is " );
        boolean v=semantic(lexical ); 
        System.out.println("*************************************");
        System.out.println("The ICG Analysis is " );
        ICG(lexical,v,q);
        System.out.println("*************************************");
        System.out.println("The code optimizer Analysis is " );
        optimizer(lexical,v,q);
        System.out.println("*************************************");
        System.out.println("The code Generator Analysis is " );
        codeGeneration(lexical,v,q);
    }
    //***********************************************************************************************
       public static String LexicalAnalysis(String equation) {
           String parsedEq="";
       int idCount=1;
       String pi="pi";
          double piValue=3.14;
          //boolean piflag=false;
          String piflag="0";
        char c[] = equation.toCharArray();
        for(int i=0; i<c.length;i++){
            if( c[i] == '=' || c[i]=='+' || c[i] == '-' || c[i] == '/' || c[i] == '*' ||  c[i] == ' ')
            {
                parsedEq += c[i];  
            }
            else if((c[i] >= 'a' && c[i] <= 'h') || (c[i] >= 'j' && c[i] <= 'o')|| (c[i] >= 'q' && c[i] <= 'z'))
            {
                parsedEq += "Id" + idCount;
                idCount++;
            }
             else if(c[i] ==pi.charAt(0)&&c[i+1] ==pi.charAt(1))
                    {
                        parsedEq +=piValue;
                               // piflag=true;
                               piflag="1";
                    }
             else if(Character.isDigit(c[i]) == true)
                    {
                 parsedEq += c[i];
                     }

               
        }return parsedEq ;
}
//************************************************************
        public static boolean biflag(String equation) {
           String parsedEq="";
       int idCount=1;
       String pi="pi";
          double piValue=3.14;
          boolean piflag=false;
         
        char c[] = equation.toCharArray();
        for(int i=0; i<c.length;i++){
            if( c[i] == '=' || c[i]=='+' || c[i] == '-' || c[i] == '/' || c[i] == '*' ||  c[i] == ' ')
            {
                parsedEq += c[i];  
            }
            else if((c[i] >= 'a' && c[i] <= 'h') || (c[i] >= 'j' && c[i] <= 'o')|| (c[i] >= 'q' && c[i] <= 'z'))
            {
                parsedEq += "Id" + idCount;
                idCount++;
            }
             else if(c[i] ==pi.charAt(0)&&c[i+1] ==pi.charAt(1))
                    {
                        parsedEq +=piValue;
                                piflag=true;
                               
                    }
             else if(Character.isDigit(c[i]) == true)
                    {
                 parsedEq += c[i];
                     }

               
        }return piflag ;
}
        //***************************************************************************************
    
        public static void syntax(String parsedEq ){
            String[] tree = parsedEq.split("(?=[-+*/()])|(?<=[^-+*/][-+*/])|(?<=[()])");
             String one=tree[0];
        one=one.substring(4);
        String op1=tree[1];
        String two=tree[2];
        String op2=tree[3];
        String three=tree[4];
         char op11=op1.charAt(0);
          //System.out.println("op1="+op11); 
         if(op11=='*'){

          priortysyntax(parsedEq);
         }
         else{
         
        System.out.println();
        System.out.println("         Id1           ");
        System.out.println("          |           ");
        System.out.println("          =           ");
        System.out.println("          |           ");
        System.out.println("          "+op1+"           ");
        System.out.println("        /   \\          ");
        System.out.println("       "+one+"   "+op2+"      ");
        System.out.println("            /  \\   ");
        
        
        System.out.println("         "+two+"    "+three+"Â Â Â Â Â Â ");}

     
    }
    //**************************************************************************************************
    public static void priortysyntax(String parsedEq) {
          String[] tree = parsedEq.split("(?=[-+*/()])|(?<=[^-+*/][-+*/])|(?<=[()])");
        String one=tree[0];
        one=one.substring(4);
        String op1=tree[1];
        String two=tree[2];
        String op2=tree[3];
        String three=tree[4];  
        System.out.println();
        System.out.println("         Id1           ");
        System.out.println("          |           ");
        System.out.println("          =           ");
        System.out.println("          |           ");
        System.out.println("          "+op2+"           ");
        System.out.println("        /   \\          ");
        System.out.println("       "+three+"   "+op1+"      ");
        System.out.println("            /  \\   ");
        
        
        System.out.println("         "+two+"    "+one+"Â Â Â Â Â Â ");}
    //*******************************************************************************************
public static boolean semantic(String parsedEq ) {
     boolean flag=false;
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
        char op11=op1.charAt(0);
          //System.out.println("op1="+op11);
         if(op11=='*'){
            priortysemantic(parsedEq);
            flag=true;
         }
         else{
      
            if (one.equals("Id1") || one.equals("Id2") || one.equals("Id3")){
               System.out.println();
               OneP="Id2";
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
        System.out.println("The Semantic Tree is: ");
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
    }   return flag;
}
        //***********************************************************************************
    
    public static void priortysemantic(String parsedEq) {
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
           OneP="Id2";
           
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
            TwoP="Id3";
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
        System.out.println("The Semantic Tree is: ");
        System.out.println();
        System.out.println("         Id1           ");
        System.out.println("          |           ");
        System.out.println("          =           ");
        System.out.println("          |           ");
        System.out.println("          "+op2+"           ");
        System.out.println("        /   \\          ");
        System.out.println("       "+ThreeP+"    "+op1+"      ");
        System.out.println("            /  \\   ");
        
        System.out.println("         "+TwoP+"    "+OneP+"      ");
    }
//*************************************************************************************
public static void ICG(String parsedEq,boolean v,boolean q){
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

            if(v==false) {
                
                if(q==true){
               
                    System.out.println("t1=3.14*id3\n"
                         + "t2=t1+id2\n"
                         + "id1=t2");
                }else{
                      System.out.println("t1=intToFloat("+8+")\n"
                + "t2=t1*id3\n"
                + "t3=t2+id2\n"
                + "id1=t3");
                   }}
            else if(v==true) {
                 if(q==true){
                 System.out.println(
                "t1=3.14*id2\n"
                + "t2=t1+id3\n"
                + "id1=t3");
                 }
                 else{
                       System.out.println("t1=intToFloat("+8+")\n"
                + "t2=t1*id2\n"
                + "t3=t2+id3\n"
                + "id1=t3");

             }}
}
//*************************************************************************
public static void optimizer(String parsedEq,boolean v,boolean q){

            if(v==false) {
                if(q==true){
                  System.out.println("t1=3.14*id3\n"
                         + "id1=t1+id2\n"
                        );
                }else{
                  System.out.println(
                 "t1=#8.0*id3\n"
                + "id1=t2+id2\n");
                   }}
            else if(v==true) {
                 if(q==true){
                 System.out.println(
                "t1=3.14*id2\n"
                + "id1=t1+id3\n" );
                 }
                 else{
                   System.out.println(
                 "t1=#8.0*id2\n"
                + "id1=t2+id3\n");
                 }
            }
       }
//*************************************************************************************
public static void codeGeneration(String parsedEq,boolean v,boolean q){
        
            if(v==false) {
                
                if(q==true){

                     System.out.println("LDF R2,id3\n"
                             +"MULF R2,R2,3.14\n"
                             +"LDF  R1,id2"
                             +"ADDF R1,R1,R2"
                             +"STRF id1,R1");
                }else{
              
                       System.out.println("LDF R2,id3\n"
                               +"MULF R2,R2,#8.0\n"
                               +"LDF  R1,id2\n"
                               +"ADDF R1,R2\n"
                               +"STRF id1,R1\n");
                   }}
            else if(v==true) {
                 if(q==true){
         
                  System.out.println("LDF R2,id2\n"
                          +"MULF R2,R2,#3.14\n"
                           +"LDF  R1,id3\n"
                          +"ADDF R1,R2\n"
                          +"STRF id1,R1\n");}
                 else{
                
                         System.out.println("LDF R2,id2\n"
                                 +"MULF R2,R2,#8.0\n"
                                 +"LFD R1,id3\n"
                                 +"ADDF R1,R2\n"
                                 +"STRF  id1,R1");       
            }
}
}
}

































