//printing N terms of the sequence -1 2 -3 4 -5....
import java.util.Scanner;
public class Sequence2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of terms:");
        int N = sc.nextInt();
        for (int i = 1; i <= N; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            } else {
                System.out.print(-i +" ");
            }
        }
    }
}
