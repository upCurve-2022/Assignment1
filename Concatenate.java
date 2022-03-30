//concatenating two strings
import java.util.Scanner;
public class Concatenate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String1");
        String s1 = sc.nextLine();
        System.out.println("Enter String2");
        String s2 = sc.nextLine();
        System.out.println("Concatenated string:"+s1.concat(s2));
    }
}
