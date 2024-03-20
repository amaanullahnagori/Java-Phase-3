import java.io.FileInputStream;
import java.io.IOException;

class IOStream02
{
    public static void main(String[] args) {
      try { 
       FileInputStream fis;
       fis=new FileInputStream("D:\\MyJava\\Text.txt");
    
       byte b[]=new byte[fis.available()];
       
       fis.read(b);
      String str =new String (b);
          System.out.println(str);
        }
      
    catch (IOException e)
    {
        System.out.println(e);
    }
    }
}