//separating whole part and fraction part in a number
import java.util.Scanner;
public class FractionValue {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        double num=sc.nextDouble();
        String str=String.valueOf(num);
        int position=str.indexOf('.');
        System.out.println("Whole part:"+str.substring(0,position));
        System.out.println("Fractional part:"+str.substring(position+1));
    }
}
