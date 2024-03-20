import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOStream03 {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("D:\\MyJava\\Source01.txt");
            byte b[]=new byte [fis.available()];
            fis.read(b);
            String str =new String (b);

            FileOutputStream fos =new FileOutputStream("D:\\MyJava\\Source02.txt");
            str=str.toLowerCase();
            String task="\nTASK IS OVER";
            byte  a[]= str.getBytes();
            byte t[]=task.getBytes();
            fos.write(a);
            fos.write (t);
            fos.close();
            fis.close();



        } catch (IOException e) {
            System.out.println(e.getMessage());
            System.out.println(e.toString());
        }
    }
}
