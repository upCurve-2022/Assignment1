//printing the Sequence 1 4 7 12 23 42 ......
import java.util.Scanner;
public class Sequence4 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of terms:");
        int N=sc.nextInt();
        int x=1;
        int y=4;
        int z=7;
        System.out.print(x+" "+y+" "+z+" ");
        int count=4;
        while(count<=N){
            int num=x+y+z;
            x=y;
            y=z;
            z=num;
            System.out.print(num+" ");
            count++;
        }
    }
}
