//removing duplicate characters from the string
import java.util.Scanner;
public class DuplicateChars {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string:");
        String s=sc.nextLine();
        StringBuilder s1=new StringBuilder(s);
        int l=s1.length();
        for(int i=0;i<l-1;i++){
            for(int j=i+1;j<l;j++){
                if(s1.charAt(i)==s1.charAt(j)){
                    s1.delete(j,j+1);
                    l=l-1;
                    j=j-1;
                }
            }

        }
        System.out.println(s1);

    }
}
