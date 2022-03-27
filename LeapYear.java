//checking whether the given year is leap year or not
import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int year=sc.nextInt();
        if(year%400==0){
            System.out.println("Leap year");
        }
        else if(year%100==0){
            System.out.println("Not a leap year");
        }
        else if(year%4==0){
            System.out.println("Leap Year");
        }
        else{
            System.out.println("Not a leap year");
        }
    }
}
