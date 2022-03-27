//converting decimal number to binary number
import java.util.Scanner;

public class ToBinary {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int N=sc.nextInt();
        int x=N;
        String str="";
        String str1;
        while(N>0){
            str1=String.valueOf(N%2);
            str=str1.concat(str);
            N=N/2;
        }
        System.out.print("Decimal form of "+x+" is "+str);
    }
}
