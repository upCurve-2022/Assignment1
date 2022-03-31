//Evaluating arithmetic expression
import java.util.Scanner;
import java.util.Stack;
public class ArithmeticExpression {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the arithmetic expression:");
        String s= sc.nextLine();
        //one stack for operators and one for operands
        Stack<Integer>operands=new Stack<>();
        Stack<Character>operators=new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch=s.charAt(i);
            if(ch=='('){
                operators.push(ch);
            }
            else if(Character.isDigit(ch)) {
                operands.push(ch - '0');//converting char to integer
            }
            else if(ch==')'){
                while(operators.peek()!='('){
                    char opr=operators.pop();
                    int op2=operands.pop();
                    int op1=operands.pop();

                    int opVal= operation(op1,op2,opr);
                    operands.push(opVal);
                }
                operators.pop();
            }
            else if(ch=='+' || ch=='-' || ch=='*' || ch=='/'){
                while(operators.size()>0 && operators.peek()!='(' && precedence(ch)<=precedence(operators.peek())){
                    char opr=operators.pop();
                    int op2=operands.pop();
                    int op1=operands.pop();

                    int opVal= operation(op1,op2,opr);
                    operands.push(opVal);
                }
                operators.push(ch);
            }
        }
        while(operators.size()!=0 ){
            char opr=operators.pop();
            int op2=operands.pop();
            int op1=operands.pop();
            int opVal= operation(op1,op2,opr);
            operands.push(opVal);
        }
        System.out.println(operands.peek());
    }
    public static int precedence(char op){
        if(op=='^'){
            return 3;
        }else if(op=='*' || op=='/'){
            return 2;
        }else if(op=='+' || op=='-'){
            return 1;
        }else{
            return -1;
        }
    }
    public static int operation(int op1,int op2,char op){
        if(op=='+'){
            return op1+op2;
        }else if(op=='-'){
            return op1-op2;
        }else if(op=='*'){
            return op1*op2;
        }else{
            return op1/op2;
        }
    }

}