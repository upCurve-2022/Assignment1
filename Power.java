//finding the value of X power p
import java.util.Scanner;
public class Power {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number:");
            int X = sc.nextInt();
            int x=X;
            System.out.println("Enter the power:");
            int p = sc.nextInt();
            for (int i = 1; i <p; i++) {
                X=X*x;
            }
            System.out.println(X);
        }
}
