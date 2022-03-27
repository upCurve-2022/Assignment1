//to check whether a string is empty or not
import java.util.Scanner;
public class EmptyString {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter input String:");
        String s=sc.nextLine();
        int l=s.length();
        if(l==0){
            System.out.println("String is empty");
        }
        else{
            System.out.println("String is not Empty");
        }
    }
}
