
package prob1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class OP {
    public String input(String z,String lex2){
        // which equation ? 3 or 4
        int counter = 1 ;
        String lex = lex2.substring(4);
        String Result = "";
        String [] final_list = new String[7];
        String tempo = "" ;
        int count = 0 ;
        for (int i = 0 ; i < lex.length(); i++){
            if(i==lex.length()-1){
                tempo = lex.substring(i);
            }
            else{
                tempo = lex.substring(i,i+1);
            }
            if("+".equals(tempo)||"-".equals(tempo)||"*".equals(tempo)||"\\".equals(tempo)) {
                count++;
            }
        }
        if(count==3){
            List<String> operations = new ArrayList<>();
            StringBuilder currentTerm = new StringBuilder();
            for (int i = 0; i < lex.length(); i++) {
                char c = lex.charAt(i);
                if (c == '+' || c == '-' || c == '*' || c == '/') {
                    // If we've reached an operator, add the current term to the list of
                    // operations and reset the current term
                    operations.add(currentTerm.toString());
                    currentTerm = new StringBuilder();
                    operations.add(Character.toString(c));
                } else {
                    // If we haven't reached an operator, append the current character to
                    // the current term
                    currentTerm.append(c);
                }
            }
            // Don't forget to add the last term to the list of operations
            operations.add(currentTerm.toString());
            int g = 0 ;
            for (String operation : operations) {
                final_list[g]=operation;
                g++;
            }
            //operations
            Result+="       T"+counter+" = "+final_list[0]+final_list[1]+final_list[2]+"\n";
            counter++;
            Result+="       T"+counter+" = "+final_list[4]+final_list[5]+final_list[6]+"\n";
            counter++;
            int q = counter - 1;
            int p = counter - 2;
            Result+="       ID1"+" = "+"T"+ p +final_list[3]+"T"+q+"\n";
            return Result;
        }
        else if (count==2){
            List<String> operations = new ArrayList<>();
            StringBuilder currentTerm = new StringBuilder();
            for (int i = 0; i < lex.length(); i++) {
                char c = lex.charAt(i);
                if (c == '+' || c == '-' || c == '*' || c == '/') {
                    // If we've reached an operator, add the current term to the list of
                    // operations and reset the current term
                    operations.add(currentTerm.toString());
                    currentTerm = new StringBuilder();
                    operations.add(Character.toString(c));
                } else {
                    // If we haven't reached an operator, append the current character to
                    // the current term
                    currentTerm.append(c);
                }
            }
            // Don't forget to add the last term to the list of operations
            operations.add(currentTerm.toString());
            int g = 0 ;
            for (String operation : operations) {
                final_list[g]=operation;
                g++;
            }
            //operations
            if(final_list[1].equals("+")||final_list[1].equals("-")){
                Result+="       T"+counter+" = "+final_list[2]+final_list[3]+final_list[4]+"\n";
                counter++;
                int q = counter - 1;
                Result+="       ID1"+" = "+final_list[0]+final_list[1]+"T"+q+"\n";
            }
            else{
                Result+="       T"+counter+" = "+final_list[0]+final_list[1]+final_list[2]+"\n";
                counter++;
                int q = counter - 1;
                Result+="       ID1"+" = "+final_list[4]+final_list[3]+"T"+q+"\n";
            }


            return Result;
        }
        else{
            List<String> operations = new ArrayList<>();
            StringBuilder currentTerm = new StringBuilder();
            for (int i = 0; i < lex.length(); i++) {
                char c = lex.charAt(i);
                if (c == '+' || c == '-' || c == '*' || c == '/') {
                    // If we've reached an operator, add the current term to the list of
                    // operations and reset the current term
                    operations.add(currentTerm.toString());
                    currentTerm = new StringBuilder();
                    operations.add(Character.toString(c));
                } else {
                    // If we haven't reached an operator, append the current character to
                    // the current term
                    currentTerm.append(c);
                }
            }
            // Don't forget to add the last term to the list of operations
            operations.add(currentTerm.toString());
            int g = 0 ;
            for (String operation : operations) {
                final_list[g]=operation;
                g++;
            }
            //operations

            Result+="       ID1"+" = "+final_list[0]+final_list[1]+final_list[2]+"\n";
            return Result;
        }
    }


}
