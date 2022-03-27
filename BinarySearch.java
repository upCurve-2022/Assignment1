//performing Binary Search
import java.util.Arrays;
import java.util.Scanner;
public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an Array:");
        int N = sc.nextInt();
        int[] arr = new int[N];
        System.out.println("Enter the elements");
        for (int i = 0; i < N; i++) {
            int i1 = sc.nextInt();
            arr[i] = i1;
        }
        Arrays.sort(arr);
        System.out.println("Enter the key value:");
        int key = sc.nextInt();
        int count=0;
        int low=0;
        int high=N-1;
        int mid=(low+high)/2;
        while(low<=high){
          if(arr[mid]>key){
               low=mid+1;
               mid=(low+high)/2;
          }
          else if(arr[mid]<key){
              high=mid+1;
              mid=(low+high)/2;
            }
          else if(arr[mid]==key){
              System.out.println("Element found at index "+mid);
              count++;
              low=high+1;
          }
        }
        if(count!=0){
            System.out.println("Element not found");
        }
    }
}
