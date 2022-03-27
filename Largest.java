//Finding the largest and second-largest numbers among given 3 numbers
import java.util.*;
public class Largest {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Set<Integer> num = new TreeSet<Integer>();
        System.out.println("Enter 1st number:");
        int x=sc.nextInt();
        num.add(x);
        System.out.println("Enter 2nd number:");
        int y=sc.nextInt();
        num.add(y);
        System.out.println("Enter 3rd number:");
        int z=sc.nextInt();
        num.add(z);
        Set<Integer> num1= ((TreeSet<Integer>) num).descendingSet();
        List<Integer> list = new ArrayList<Integer>(num1);
        System.out.println("First largest number:"+list.get(0));
        System.out.println("Second largest number:"+ list.get(1));

    }

}
