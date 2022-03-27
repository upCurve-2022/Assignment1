//printing ASCII value of a character
import java.util.Scanner;
public class ASCII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character");
        char c=sc.next().charAt(0);
        System.out.println("ASCII value:"+(int)c);
    }
}
