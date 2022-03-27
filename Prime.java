//finding prime numbers between the range n and m
import java.util.Scanner;
public class Prime {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n:");
        int n=sc.nextInt();
        System.out.println("Enter m:");
        int m=sc.nextInt();
        int[] arr=new int[m+1];
        arr[0]=1;
        arr[1]=1;
        for(int x:arr){
            x=0;
        }
        for(int i=2;i<=m;i++) {
            if(arr[i]==0)
                for (int j = i*i; j <= m; j += i) {
                        arr[j] = 1;
                }
        }
        System.out.println("Prime numbers:");
        for(int i=n;i<=m;i++){
            if(arr[i]==0){
                System.out.println(i);
            }
        }
    }
}
