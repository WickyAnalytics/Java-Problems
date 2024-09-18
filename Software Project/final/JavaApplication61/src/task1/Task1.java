/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task1;

/**
 *
 * @author gorge
 */
import java.util.regex.*;
public class Task1 {

    /**
     * @param args the command line arguments
     */
private static final String REGEX = "(\\+*[0-9]{2}\\s*[0-9]{3}\\s*[0-9]{3}\\s*[0-9]{3,4})";
private static final String INPUT = "+63 912 345 9852\n" +
"63 912 345 9852\n" +
"639123459852\n" +
"09123459852";
public static void main(String[] argv) {
Pattern p = Pattern.compile(REGEX);
Matcher m = p.matcher(INPUT); 
int count = 0;
while(m.find()) {
count++;
System.out.println("Match number "+count);
System.out.println("start(): "+m.start());
System.out.println("end(): "+m.end()); }
}
}