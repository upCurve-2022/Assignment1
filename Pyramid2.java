/*
        printing the following pattern
            *
           * *
          * * *
         * * * *
        * * * * *
*/
public class Pyramid2 {
    public static void main(String[] args){
        int n=5;
        int x=n;
        int y=n;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=((n*2)-1);j++){
                if((i+j)%2==0 && j>=x && j<=y) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            x--;
            y++;
            System.out.print("\n");
        }
    }
}
