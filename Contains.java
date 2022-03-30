//checking whether the first string contains second string
import java.util.Scanner;
public class Contains {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String1");
        String s1 = sc.nextLine();
        System.out.println("Enter String2");
        String s2 = sc.nextLine();
        if(s1.contains(s2)){
            System.out.println("yes first string contains second string");
        }
        else{
            System.out.println("No first string doesn't contain second string");
        }
    }
}
