public class PizzaThread {
    public static void main(String[] args){
        PizzaShop o=new PizzaShop();
        new T1(o);
        new T2(o);
        new T3(o);
        new T4(o);
        new T5(o);
        new T6(o);
    }
}
