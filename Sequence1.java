//printing the sequence 4 16 36 64 ......N
import java.util.Scanner;
public class Sequence1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of terms:");
        int N=sc.nextInt();
        int num;
        int i=2;
        int count=1;
        while(count<=N){
            num=i*i;
            System.out.print(num + " ");
            count++;
            i+=2;
        }
    }
}
