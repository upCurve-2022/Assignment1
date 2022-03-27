//finding whether a string is a palindrome or not
import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String:");
        String str=sc.nextLine();
        String x=str;
        StringBuilder s=new StringBuilder(str);
        s=s.reverse();
        String rs= String.valueOf(s);
        str=str.toLowerCase();
        rs=rs.toLowerCase();
        if(str.equals(rs)){
            System.out.println(x+" is a palindrome");
        }
        else{
            System.out.println(x+" is not a palindrome");
        }
    }
}
