import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class IOStream05 {
    public static void main(String[] args) {
        try {
            FileInputStream fos = new FileInputStream("D:\\MyJava\\Textt.txt");
            BufferedInputStream bos=new BufferedInputStream(fos);
            int x;
            while ((x= bos.read())!=-1)
            {
                System.out.println((char)x);
            }
           // System.out.println(bos.readLine());
        }
        catch (FileNotFoundException e)
        {
            System.out.println("THE SPECIFIED FILE IS NOT FOUND RECHECK THE PATH MENTIONED BY YOU");
        }
        catch (IOException e)
        {
            System.out.println("INPUT OUTPUT EXCEPTION IS OCCURRED ");
        }
    }
}
