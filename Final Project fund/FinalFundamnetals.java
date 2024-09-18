package finalfundamnetals;

//z=x+3*p
import java.util.Scanner;

public class FinalFundamnetals {

    public static void main(String[] args) {

        String s, equation = "Id", ICG = "", optimizer = "", codeGeneration = "";
        String number = "";
        int c = 1;
        boolean flag = false;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your equation please: ");
        s = sc.nextLine();

        System.out.println("");
        System.out.println("--------------------");
        System.out.println("");

        char chararray[] = new char[s.length()];

        for (int i = 0; i < chararray.length; i++) {
            chararray[i] = s.charAt(i);
        }
        for (int i = 1; i < chararray.length; i++) {

            if ((chararray[i] >= 'a' && chararray[i] <= 'z') || (chararray[i] >= 'A' && chararray[i] <= 'Z')) {
                c++;
                equation += "Id" + c;

            } else if (chararray[i] == '+' || chararray[i] == '*' || chararray[i] == '=' || chararray[i] == ' '
                    || chararray[i] == '/') {
                equation += chararray[i];
            }

            else {
                if (chararray[i] == '.') {
                    char line;// 3.0
                    line = (char) (chararray[i - 1]);
                    equation += ".";
                    number += ".";
                    line = (char) (chararray[i + 1]);
                    equation += line;
                    number += line;
                    flag = true;
                } else if (flag == false) {
                    equation += chararray[i];
                    number += chararray[i];
                }

            }

        }

        System.out.println("Lexical analyzer: " + equation);

        System.out.println("");
        System.out.println("--------------------");
        System.out.println("");
        System.out.println("Syntax analyzer: ");
        System.out.println("");
        System.out.println("id1 \n  = \n   \\ \n    + ");
        System.out.print("   /");
        System.out.println(" \\");
        System.out.print("Id2");
        System.out.println("   *");
        System.out.print("     /");
        System.out.println(" \\");
        System.out.print("   Id3");
        System.out.println("  " + number);

        System.out.println("");
        System.out.println("--------------------");
        System.out.println("");
        System.out.println("Semantic analyzer: ");
        System.out.println("");
        if (flag == false)
            System.out.println("id1 \n  = \n   \\ \n    +   \n   / \\ \n Id3  *\n     / \\ \n   Id2  " + number
                    + ".0 \n      inToFloat(" + number + ")");
        else {
            System.out.println(
                    "\t \t id1 \n \t \t   = \n \t \t    \\ \n \t \t     +   \n \t \t    / \\ \n\t \t   Id3  *\n\tintToFloat(Id3) / \\ \n\t \t     Id2  "
                            + number + "\n\t\tintToFloat(Id2)");

        }
        if (flag == false) {
            ICG += "t1=intToFloat(" + number + ")\n"
                    + "t2=t1*id2\n"
                    + "t3=t2+id3\n"
                    + "id1=t3";
        } else {
            ICG += "t1=intToFloat(id2)\n"
                    + "    t2=intToFloat(id3)\n"
                    + "    t3=t1*" + number + "\n"
                    + "    t4=t2+t3\n"
                    + "    id1=t4";
        }
        System.out.println("\nICG:\n" + ICG);

        if (flag == false) {
            optimizer += "t1=#3.0*id2\n"
                    + "id1=t1+id3";
        } else {
            optimizer += "t1=#id2*" + number + "\n"
                    + "id1=#id3+t1\n";
        }
        System.out.println("\noptimizer:\n" + optimizer);

        if (flag == false) {
            codeGeneration = "LDF  R1, id2\n"
                    + "MULF R1, R1, " + number + ".0\n"
                    + "LDF  R2, id3 \n"
                    + "ADDF R1, R1, R2 \n"
                    + "STRF id1, R1";
        } else {
            codeGeneration = "LDF  R1, id2\n"
                    + "MULF R1, R1, " + number + "\n"
                    + "LDF  R2, id3 \n"
                    + "ADDF R1, R1, R2 \n"
                    + "STRF id1, R1";
        }
        System.out.println("\nCode Generation: \n" + codeGeneration);
    }

}