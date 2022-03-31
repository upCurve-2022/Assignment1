class PizzaShop {
    //If flag is false it means there are no customers in the queue
    boolean flag1=false;
    boolean flag2=false;
    boolean flag3=false;
    //Person at the counter1 takes order
    public  synchronized void orderCounter1(String order){
        if(flag1){
            try{
                wait();
            }
            catch(InterruptedException e){
                e.printStackTrace();

            }
        }
        System.out.println(order);
        flag1=true;
        notify();
    }
    //Customer at the counter1 gives the order
    public synchronized void customerAtCount1(String order){
        if(!flag1){
            try {
                wait();
            }
            catch(InterruptedException e) {
                e.printStackTrace();

            }
        }
        System.out.println(order);
        flag1=false;
        notify();
    }
    //Person at the counter2 takes order
    public synchronized void orderCounter2(String order){
        if(flag2){
            try{
                wait();
            }
            catch(InterruptedException e){
                e.printStackTrace();

            }
        }
        System.out.println(order);
        flag2=true;
        notify();
    }
    //Customer at the counter2 gives the order
    public synchronized void customerAtCount2(String order){
        if(!flag2){
            try {
                wait();
            }
            catch(InterruptedException e) {
                e.printStackTrace();

            }
        }
        System.out.println(order);
        flag2=false;
        notify();
    }
    //Person at the counter3 takes order
    public synchronized void orderCounter3(String order){
        if(flag3){
            try{
                wait();
            }
            catch(InterruptedException e){
                e.printStackTrace();

            }
        }
        System.out.println(order);
        flag3=true;
        notify();
    }
    //Customer at the counter3 gives the order
    public synchronized void customerAtCount3(String order){
        if(!flag3){
            try {
                wait();
            }
            catch(InterruptedException e) {
                e.printStackTrace();

            }
        }
        System.out.println(order);
        flag3=false;
        notify();
    }
}
class T1 implements Runnable{
    PizzaShop o;
    String s1[]={"counter1:Hello ma'am,your order please?","counter1:Thank you ma'am your order will be server soon","counter1:order is being prepared in kitchen by chef 1","counter1:order is at ready order shelve and is served"};
     public T1(PizzaShop o1){
        this.o=o1;
        new Thread(this,"orderCounter1").start();

     }
     public void run(){
        for(int i=0;i<s1.length;i++){
            try{
                Thread.sleep(2000);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
            o.orderCounter1(s1[i]);

        }
     }
}
class T2 implements Runnable{
    PizzaShop o;
    String s2[]={"customer@1:Hii,I want peri peri fries with mocktail","customer@1:Thank you","customer@1:customer is waiting","customer@1:customer enjoys the food"};
    public T2(PizzaShop o2){
        this.o=o2;
        new Thread(this,"customerAtCount1").start();

    }
    public void run(){
        for(int i=0;i<s2.length;i++){

            try{
                Thread.sleep(2500);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
            o.customerAtCount1(s2[i]);

        }
    }
}
class T3 implements Runnable{
    PizzaShop o;
    String s3[]={"counter2:Hello ma'am,your order please?","counter2:Thank you ma'am your order will be server soon","counter2:order is being prepared in kitchen by chef 2","counter2:order is at ready order shelve and is served"};
    public T3(PizzaShop o3){
        this.o=o3;
        new Thread(this,"orderCounter2").start();

    }
    public void run(){
        for(int i=0;i<s3.length;i++){
            try{
                Thread.sleep(3000);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
            o.orderCounter2(s3[i]);

        }
    }
}
class T4 implements Runnable{
    PizzaShop o;
    String s4[]={"customer@2:Hii,I want White sauce pasta with coke","customer@2:Thank you","customer@2:customer is waiting","customer@2:customer enjoys the food"};
    public T4(PizzaShop o4){
        this.o=o4;
        new Thread(this,"customerAtCount2").start();

    }
    public void run(){
        for(int i=0;i<s4.length;i++){
            try{
                Thread.sleep(3500);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
            o.customerAtCount2(s4[i]);

        }
    }
}
class T5 implements Runnable{
    PizzaShop o;
    String s5[]={"counter3:Hello ma'am,your order please?","counter3:Thank you ma'am your order will be server soon","counter3:order is being prepared in kitchen by chef 3","counter3:order is at ready order shelve and is served"};
    public T5(PizzaShop o5){
        this.o=o5;
        new Thread(this,"orderCounter3").start();

    }
    public void run(){
        for(int i=0;i<s5.length;i++){
            try{
                Thread.sleep(4000);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
            o.orderCounter3(s5[i]);

        }
    }
}
class T6 implements Runnable{
    PizzaShop o;
    String s6[]={"customer@3:Hii,I want chicken sandwich","customer@3:Thank you","customer@3:customer is waiting","customer@3:customer enjoys the food"};
    public T6(PizzaShop o6){
        this.o=o6;
        new Thread(this,"customerAtCount1").start();

    }
    public void run(){
        for(int i=0;i<s6.length;i++){
            try{
                Thread.sleep(4500);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
            o.customerAtCount3(s6[i]);

        }
    }
}
