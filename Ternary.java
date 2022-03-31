/*calculating the largest number from the given three numbers using
ternary operator*/
import java.util.Scanner;
public class Ternary {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st number:");
        int num1=sc.nextInt();
        System.out.println("Enter 2nd number:");
        int num2=sc.nextInt();
        System.out.println("Enter 3rd number:");
        int num3=sc.nextInt();
        int ans=num3>(num1>num2?num1:num2)?num3:(num1>num2?num1:num2);
        System.out.println("Largest number is "+ans);
    }
}
