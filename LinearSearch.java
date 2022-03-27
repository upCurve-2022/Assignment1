//performing Linear Search
import java.util.*;
public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an Array:");
        int N = sc.nextInt();
        int[] arr=new int[N];
        System.out.println("Enter the elements");
        for(int i=0;i<N;i++){
            int i1 = sc.nextInt();
            arr[i]=i1;
        }
        System.out.println("Enter the key value:");
        int K=sc.nextInt();
        int c=0;
        for(int i=0;i<N;i++){
            int x=arr[i];
            if(x==K){
                c++;
                System.out.println(K+" is found at the index "+i);
                break;
            }
        }
        if(c==0){
                System.out.println(K+" is not found");
        }

    }
}
