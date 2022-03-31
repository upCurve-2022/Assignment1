//printing all the permutations of String GOD
import java.util.*;
public class Permutations{
    public static void printPermutations(String s) {
        int len = s.length();
        int no_of_perms = factorial(len);
        for (int i= 0; i< no_of_perms;i++) {
            StringBuilder s1 = new StringBuilder(s);
            int temp =i;
            for (int divisor = len; divisor >= 1; divisor--) {
                int x = temp / divisor;
                int index = temp % divisor;
                System.out.print(s1.charAt(index));
                s1.deleteCharAt(index);
                temp =x;
            }
            System.out.println();
        }
    }
    public static int factorial(int n) {
        int fact = 1;
        while(n>0){
            fact*=n;
            n=n-1;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the string:");
        String s = sc.next();
        printPermutations(s);
    }
}