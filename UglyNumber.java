//finding whether the given number is an ugly number or not
import java.util.Scanner;
public class UglyNumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=sc.nextInt();
        int[] arr=new int[num+1];
        for(int i=0;i<=num;i++){
            arr[i]=0;
        }
        for(int i=2;i<=num;i++){
            for(int j=i*i;j<=num;j+=i){
                if(arr[j]!=1) {
                    arr[j] = 1;
                }
            }
        }
        int count=0;
        if(num%2==0){
                    for(int i=7;i<=num;i++){
                        if(arr[i]==0){
                            if(num%i==0)
                                count++;
                                break;
                        }
                    }

            if(count==1){
                System.out.println(num+" is not a ugly number");
            }
            else{
                System.out.println(num+" is a ugly number");
            }
        }
        else if(num%3==0){
                for(int i=7;i<=num;i++){
                    if(arr[i]==0){
                        if(num%i==0)
                            count++;
                        break;
                    }
                }
            if(count==1){
                System.out.println(num+" is not a ugly number");
            }
            else{
                System.out.println(num+" is a ugly number");
            }
        }
        else if(num%5==0){
            for(int i=7;i<=num;i++){
                if(arr[i]==0){
                    if(num%i==0)
                        count++;
                    break;
                }
            }
            if(count==1){
                System.out.println(num+" is not a ugly number");
            }
            else{
                System.out.println(num+" is a ugly number");
            }
        }
        else{
            System.out.println(num+" is not a ugly number");
        }
    }
}
