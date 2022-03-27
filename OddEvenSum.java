//Calculating sum of even and odd numbers in a given range of numbers
import java.util.Scanner;
public class OddEvenSum {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int N=sc.nextInt();
        int sum1=0;
        //sum of odd numbers
        for(int i=1;i<=N;i+=2){
            sum1+=i;
        }
        int sum2=0;
        //sum of even numbers
        for(int i=0;i<=N;i+=2){
            sum2+=i;
        }
        System.out.println("Sum of odd numbers:"+sum1);
        System.out.println("Sum of even numbers:"+sum2);
    }
}
