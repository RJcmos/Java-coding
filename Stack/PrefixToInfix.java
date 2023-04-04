package Stack;
import java.io.*; // for handling input/output
import java.util.*;

public class PrefixToInfix {
    public static void main (String[] args)throws Exception {
        // Your code here
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String str= br.readLine();
        System.out.println(convert(str));
    }
    // Convert prefix to Infix expression
    public static String convert(String str)
    {
        Stack<String> stack= new Stack<>();
        int l= str.length();
        for(int i=l-1;i>=0;i--){
            char ch=str.charAt(i);
            if(isOperator(ch)){
                String op1 = stack.pop();
                String op2 = stack.pop();
                //System.out.println(op1+" "+op2+" "+ch);
                // Concat the operands and operator
                String temp = "(" + op1 + ch + op2 + ")";
                stack.push(temp);
            }
            else{
                // To make character to string
                stack.push(ch + "");
            }
            // System.out.println(stack);
            // System.out.println(stack.peek());

        }
        return stack.pop();
    }
    static    boolean isOperator(char x)
    {
        switch(x)
        {
            case '+':
            case '-':
            case '*':
            case '/':
            case '^':
            case '%':
                return true;
        }
        return false;
    }
}
