//converting binary number to decimal number
import java.util.Scanner;
public class ToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int N = sc.nextInt();
        int x=N;
        int i=0;
        int dec=0;
        while(N>0){
            int digit=N%10;
            int p=(int)Math.pow(2,i);
            dec+=digit*p;
            i++;
            N=N/10;
        }
        System.out.print("Decimal form of "+x+" is "+dec);
    }
}
