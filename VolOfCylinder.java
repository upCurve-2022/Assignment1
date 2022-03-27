//Volume of cylinder
import java.util.Scanner;
public class VolOfCylinder {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter radius:");
        float r=sc.nextFloat();
        System.out.println("Enter height:");
        float h=sc.nextFloat();
        double v= 3.14*r*r*h;
        System.out.println("Volume of Cylinder:"+v);
    }
}
