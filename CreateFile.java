//creating a file
import java.io.File;
import java.io.IOException;
public class CreateFile
{
    public static void main(String[] args) throws IOException
    {
        File f=new File("Target Corporation.txt");
        if(f.createNewFile()){
            System.out.println("File is created");
        }
        else{
            System.out.println("File already exists");
        }
    }
}
