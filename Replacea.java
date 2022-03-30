//replacing a with $ in the given string
import java.util.Scanner;
public class Replacea {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String");
        String s=sc.nextLine();
        StringBuilder str=new StringBuilder(s);
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='a'){
                str.replace(i,i+1,"$");
            }
        }
        System.out.println(str);
    }
}
