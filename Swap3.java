//Swapping 3 numbers
import java.util.Scanner;
public class Swap3 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st number:");
        int num1=sc.nextInt();
        System.out.println("Enter 2nd number:");
        int num2=sc.nextInt();
        System.out.println("Enter 3rd number:");
        int num3=sc.nextInt();
        //using arithmetic operations
        System.out.println("Swapping the numbers:");
        num1=num1+num2+num3;
        num2=num1-(num2+num3);
        num3=num1-(num2+num3);
        num1=num1-(num2+num3);
        System.out.println("num1 is:"+num1);
        System.out.println("num2 is:"+num2);
        System.out.println("num3 is:"+num3);
    }
}
