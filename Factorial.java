//finding the factorial of a number
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int N=sc.nextInt();
        int fact=1;
        int x=N;
        while(N>0){
            fact=fact*(N);
            N=N-1;
        }
        System.out.println("Factorial of "+x+" is "+fact);
    }
}
