//calculating the Simple Interest
import java.util.Scanner;
public class SimpleInterest {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        //principal amount
        System.out.println("Enter Principal amount:");
        int P=sc.nextInt();
        //time
        System.out.println("Enter Time:");
        int T=sc.nextInt();
        //interest rate
        System.out.println("Enter Interest rate:");
        int R=sc.nextInt();
        //Simple Interest
        float SI=(P*T*R)/100;
        System.out.println("Simple interest is:"+SI);

    }
}
