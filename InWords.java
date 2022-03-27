//displaying number in words
import java.util.*;
public class InWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        String str1;
        String str2="";
        int i=0;
        while(num>0){
            int digit=num%10;
            switch(digit){
                case 0:
                    str1="Zero ";
                    str2=str1.concat(str2);
                    break;
                case 1:
                    str1="One ";
                    str2=str1.concat(str2);
                    break;
                case 2:
                    str1="Two ";
                    str2=str1.concat(str2);
                    break;
                case 3:
                    str1="Three ";
                    str2=str1.concat(str2);
                    break;
                case 4:
                    str1="Four ";
                    str2=str1.concat(str2);
                    break;
                case 5:
                    str1="Five ";
                    str2=str1.concat(str2);
                    break;
                case 6:
                    str1="Six ";
                    str2=str1.concat(str2);
                    break;
                case 7:
                    str1="Seven ";
                    str2=str1.concat(str2);
                    break;
                case 8:
                    str1="Eight ";
                    str2=str1.concat(str2);
                    break;
                case 9:
                    str1="Nine ";
                    str2=str1.concat(str2);
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + digit);
            }
            num /= 10;
        }
        System.out.println(str2);
    }
}
