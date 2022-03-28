//writing into a file
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
public class WriteFile {
    public static void main(String[] args) throws IOException
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the file name:");
        String fname=sc.nextLine();
        FileOutputStream fos=new FileOutputStream(fname,true);
        System.out.println("Enter the content to be written:");
        String data=sc.nextLine();
        byte[] b= data.getBytes();
        fos.write(b);
        System.out.println("Data written into the file");
        fos.close();
    }
}
