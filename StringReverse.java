//Reversing a String
import java.util.Scanner;
public class StringReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String:");
        String str=sc.nextLine();
        StringBuilder s=new StringBuilder(str);
        System.out.println("Reverse string of "+s+" is "+s.reverse());
    }
}
