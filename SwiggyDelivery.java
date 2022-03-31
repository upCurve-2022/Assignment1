//Exception handling
//if the Zip codes are 123 456 789 then throw an exception
import java.util.Scanner;
class nonDeliverable extends Exception{
    public nonDeliverable(String msg){
        super(msg);
    }
}
public class SwiggyDelivery {
    public static void zipCode(int zip) throws nonDeliverable {
        if ((zip == 123) || (zip == 456) || (zip == 789)) {
            throw new nonDeliverable("Sorry!Delivery is not available in your area.");
        } else {
            System.out.println("Hurray!Delivery is available in your area.");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the zip code: ");
        int code = sc.nextInt();
        try {
            zipCode(code);
        } catch (nonDeliverable ex) {
            System.out.println(ex.getMessage());
        }
    }
}