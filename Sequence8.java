//printing the N terms of the sequence 1 1 2 3 5 8 13 .....
import java.util.Scanner;
public class Sequence8 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of terms:");
        int N=sc.nextInt();
        int x=1;
        int y=1;
        System.out.print(x+" "+y+" ");
        int count=3;
        while(count<=N){
            int num=x+y;
            x=y;
            y=num;
            System.out.print(num+" ");
            count++;
        }
    }
}
