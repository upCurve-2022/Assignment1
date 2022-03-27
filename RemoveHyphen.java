//removing hyphens only if it is in b/w digits
import java.util.Scanner;
public class RemoveHyphen {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter input String:");
        String s=sc.nextLine();
        StringBuilder s1=new StringBuilder(String.valueOf(s));
        int l=s1.length();
       for(int i=1;i<=l-2;i++){
           char x=s1.charAt(i-1);
           char y=s1.charAt(i+1);
           if(s1.charAt(i)=='-') {
               if (Character.isDigit(x) && Character.isDigit(y)) {
                   s1.delete(i,i+1);
                   l=l-1;
               }
           }
       }
        System.out.println("String after removing  hyphens:"+s1);
    }

}
