//calculating the average value of the array elements
import java.util.Scanner;
public class ArrayAvg {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size:");
        int N=sc.nextInt();
        int[] arr=new int[N];
        float avg=0;
        System.out.println("Enter Array Elements:");
        for(int i=0;i<N;i++){
            int x=sc.nextInt();
            arr[i]=x;
            avg+=arr[i];
        }
        System.out.println("Average of all array elements:"+avg/N);
    }
}
