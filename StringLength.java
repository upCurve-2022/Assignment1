//print length or size of string
import java.util.Scanner;
public class StringLength {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter input String:");
        String s=sc.nextLine();
        int l=s.length();
        System.out.println("String length is:"+l);
    }
}
