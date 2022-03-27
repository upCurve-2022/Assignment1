// checking whether a number is a perfect square or not
import java.util.Scanner;
public class PerfectSquare {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int N=sc.nextInt();
        if(Math.sqrt(N)-((int)Math.sqrt(N))==0.0){
            System.out.println(N+" is a perfect square");
        }
        else{
            System.out.println(N+" is not a perfect square");
        }
    }
}
