//copying the contents of one file into another file
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
public class CopyFile {
    public static void main(String[] args) throws IOException
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the file name whose content is to be copied");
        String file1=sc.nextLine();
        System.out.println("Enter the file name into which content is to be copied");
        String file2=sc.nextLine();
        FileInputStream fis=new FileInputStream(file1);
        FileOutputStream fos=new FileOutputStream(file2);
        int b;
        while((b=fis.read())!=-1) {
            fos.write(b);
        }
        System.out.println("Contents copied");
        fis.close();
        fos.close();
    }
}
