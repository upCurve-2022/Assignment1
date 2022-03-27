//to check if a String contains only digits
import java.util.Scanner;
public class DigitsInStrings {
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter input String:");
    String s=sc.nextLine();
    int l=s.length();
    int count=0;
    for(int i=0;i<l;i++){
        char x=s.charAt(i);
        if(Character.isDigit(x)){
            count++;
        }
    }
    if(count==l){
        System.out.println("String contains only digits");
    }
    else{
        System.out.println("String doesn't contains only digits");
    }
}
}
