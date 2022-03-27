/*pen costs 50$ and it is been sold at a discount of 12%, Write a program to display discount
amount and selling price of the pen*/
public class Discount {
    public static void main(String[] args){
        double cost_price=50;
        double discount_percent=12;
        double discount_amount=(discount_percent/100)*cost_price;
        double selling_price=cost_price-discount_amount;
        System.out.println("Discount amount is:"+discount_amount);
        System.out.println("Selling price is:"+selling_price);
    }
}
