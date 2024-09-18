/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication50;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Calculator {
    public static String Calc(String y){
        String Target ="ID"; //used for character and string 
        String multchar_Target ="x*x"; // used for mult char * char 
        String Result =""; 
        String FinalResult =""; 
        String x = "";
        String z = "";
        int Counter = 0 ;
//---------------------------------------------------------------------
 Pattern pattern1 = Pattern.compile("[a-z||A-Z][a-z||A-Z]([a-z||A-Z])+", Pattern.CASE_INSENSITIVE);
        Matcher matcher1 = pattern1.matcher(y);
        while(matcher1.find()) 
        {
           Result = matcher1.replaceAll("x"); 
        } 
if(Result=="")
        {
       Result=y;
        }

Pattern pattern2 = Pattern.compile("[a-z||A-Z][a-z||A-Z]", Pattern.CASE_INSENSITIVE);
        Matcher matcher2 = pattern2.matcher(Result);
        while(matcher2.find()) 
        {
           Result = matcher2.replaceAll(multchar_Target);  
        }

Pattern pattern = Pattern.compile("[a-z||A-Z]+", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(Result);
        while(matcher.find()) {
           Result = matcher.replaceAll(Target);  
        }

//---------------------------------------------------------------------
  for(int i = 0 ; i<Result.length() ; i++){ 
       
       if(i+2 >= Result.length()){
          x = Result.substring(i, Result.length());
       }
       else{
          x = Result.substring(i, i+2); 
       }
       if(x.equals(Target)){
          Counter++;
          x="id"+Counter;
         FinalResult+=x;       
       }
       else{
         z=x.substring(1);
         if(z.equals("I")||z.equals("D")){
         }
         // Error handel when found (_)
         else if(z.equals("_")){
         FinalResult="Syntax Error"; 
         break;
       }         
         else{
           FinalResult+=z;      
          }
       }  
   }
        return FinalResult; 
    }
} 