//Swapping 2 numbers
import java.util.Scanner;
public class Swap2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st number:");
        int num1=sc.nextInt();
        System.out.println("Enter 2nd number:");
        int num2=sc.nextInt();
        //using arithmetic operations
        System.out.println("Swapping the numbers:");
        num1=num1+num2;
        num2=num1-num2;
        num1=num1-num2;
        System.out.println("num1 is:"+num1);
        System.out.println("num2 is:"+num2);
        //using bit manipulation
        System.out.println("Swapping them back:");
        num2=num1^num2;
        num1=num2^num1;
        num2=num2^num1;
        System.out.println("num1 is:"+num1);
        System.out.println("num2 is:"+num2);
    }
}
