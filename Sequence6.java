//printing N terms of the sequence 1 5 13 29 49 77...
import java.util.Scanner;
public class Sequence6 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of terms:");
        int N=sc.nextInt();
        int x=1;
        int count=2;
        int i=1;
        System.out.print(x+" ");
        while(count<=N){
            if(i%3!=0){
                int num=x+(4*i);
                x=num;
                System.out.print(num + " ");
                count++;
                }
            i++;
            }

        }
    }

