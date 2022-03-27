//comparing two strings
import java.util.Scanner;
public class CompareStrings {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st String:");
        String s1=sc.nextLine();
        System.out.println("Enter 2nd String:");
        String s2=sc.nextLine();
        if(s1.compareTo(s2)>0) {
            System.out.println(s1 + " is larger than " + s2);
        }
        else if(s1.compareTo(s2)<0){
            System.out.println(s2 + " is larger than " + s1);
        }
        else if(s1.compareTo(s2)==0){
            System.out.println(s2 + " and " + s1+" are equal");
        }
    }
}
