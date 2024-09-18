import java.util.*;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class FundProject {
   public static String output = "";
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please Enter sample Equation: ");
        String equation = scanner.nextLine();
        System.out.print("please enter your operation");
        System.out.print("\n 1. lexical analyzer \n 2. Syentex Tree \n");
        int num = scanner.nextInt();
        if (num==1)
        {
            Lexical_Analyzer(equation);
        }if (num==2)
    {
        Lexical_Analyzer(equation);
        Syntex_Tree(output);
    }

    }
    //------------------------------------------------------------------------------------------------------------------------
    public static void Lexical_Analyzer(String equation)
    {
//        String output="";
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
    //------------------------------------------------------------------------------------------------------------------------
    public static void Syntex_Tree (String equation)
    {
//        char eq[] = equation.toCharArray();
//        for(int i=0; i<eq.length;i++)
//        {
//            if( eq[i] == '=' || eq[i]=='+' || eq[i] == '-' || eq[i] == '/' || eq[i] == '*' ||  eq[i] == ' ' ||  eq[i] == '(' ||  eq[i] == ')'){
//                output += eq[i];
//            }
//            else if((eq[i] >= 'a' && eq[i] <= 'z') || (eq[i] >= 'A' && eq[i] <= 'Z')){
//                output += "Id" + idCount;
//                idCount++;
//            }
//            else if(Character.isDigit(eq[i]) == true){
//                output += eq[i];
//            }
//        }
        boolean num=false;
        LinkedList<String> lis= new LinkedList<>();
        int count=1;
        char eq[] = equation.toCharArray();
        for(int i=0; i<eq.length;i++)
        {
            if(eq[i]=='=')
            {
                lis.addFirst("=");
            }
            else if (eq[i] == 'I' && eq[i+1]=='d')
            {
                if (eq[i+3]=='+')
                {
                    lis.push("id"+count);
                    lis.push("+");
                    count+=2;
                }else if(eq[i+3]=='-')
                {
                    lis.push("id"+count);
                    lis.push("-");
                    count+=2;
                }
                else if(eq[i+3] == '*')
                {
                    lis.addLast("id"+count);
                    lis.addLast("*");
                    count+=2;
                }
                else if(eq[i+3] == '/')
                {
                    lis.addLast("id"+count);
                    lis.addLast("/");
                    count+=2;
                }
            }
        }
        for (int i=0; i<lis.size();i++)
        {
            System.out.println(lis);
        }

//        class ListNode
//        {
//            int data;
//            ListNode next;
//            ListNode(int d)
//            {
//                data= d;
//                next=null;
//            }
//        }
//        class BinaryTreeNode
//        {
//            String data;
//            BinaryTreeNode left,right=null;
//            BinaryTreeNode (String data)
//            {
//                this.data = data;
//                left = right =null;
//            }
//
//            private BinaryTreeNode(int data) {
//                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//            }
//        }
//        class BinaryTree
//        {
//            ListNode head;
//            BinaryTreeNode root;
//            void push(String new_data)
//            {
//                ListNode new_node = new ListNode(new_data);
//                new_node.next = head;
//                head = new_node;
//            }
//            BinaryTreeNode convertList2Binary(BinaryTreeNode node)
//            {
//                Queue<BinaryTreeNode> q = new LinkedList<BinaryTreeNode>();
//                if(head ==null)
//                {
//                    node=null;
//                    return null;
//                }
//                node = new BinaryTreeNode(head.data);
//                q.add(node);
//                head=head.next;
//                while(head != null)
//                {
//                    BinaryTreeNode parent = q.peek();
//
//                    BinaryTreeNode leftchild=null,rightchild=null;
//                    leftchild = new BinaryTreeNode(head.data);
//                    q.add(rightchild);
//                    head=head.next;
//
//                if(head!= null)
//                {
//                    rightchild = new BinaryTreeNode(head.data);
//                    q.add(rightchild);
//                    head = head.next;
//                }
//                parent.left= leftchild;
//                parent.right= rightchild;
//                q.poll();
//                }
//                return node;
//            }
//             void inorderTraversal(BinaryTreeNode node)
//             {
//                if (node != null)
//                {
//                inorderTraversal(node.left);
//                System.out.print(node.data + " ");
//                inorderTraversal(node.right);
//                }
//            }
    }
}