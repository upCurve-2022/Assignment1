//reversing a number
/*example:
input:12345
output:54321
*/
import java.util.Scanner;
public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int N = sc.nextInt();
        int revnum=0;
        while(N>0) {
            int digit = N % 10;
            revnum = (revnum + digit) * 10;
            N = N / 10;
        }
        revnum=revnum/10;
        System.out.println("Reverse number:"+revnum);



    }
}
