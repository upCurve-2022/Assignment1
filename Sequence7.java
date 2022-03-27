//printing the N terms of the sequence 1 -2 6 -15 31 -56....
import java.util.Scanner;
public class Sequence7 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of terms:");
        int N=sc.nextInt();
        int x=1;
        System.out.print(x+" ");
        for(int i=1;i<=N-1;i++){
            if(i%2!=0) {
                int num = x+(i*i);
                x=num;
                System.out.print(-num + " ");
            }
            else{
                int num = x+(i*i);
                x=num;
                System.out.print(num + " ");
            }
        }
    }
}
