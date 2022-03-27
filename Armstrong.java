//finding whether a number is  Armstrong or not
import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int N=sc.nextInt();
        int num=N;
        int sum=0;
        while(N>0) {
            int digit = N % 10;
            sum+=(digit*digit*digit);
            N=N/10;
        }
        if(sum==num){
            System.out.println(num+" is a armstrong number");
        }
        else{
            System.out.println(num+" is not a armstrong number");
        }
        }
    }

