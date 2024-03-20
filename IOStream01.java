import java.io.*;
class IOStream01
{
    public static void main(String[] args) {
        try {
       FileOutputStream fos=new FileOutputStream("D:\\MyJava\\Text.txt");
        String str="\njava programming \n is good "; 
        byte b[]=str.getBytes();
        int a=100;  // ascii for 'd' character 
        fos.write(a);
        fos.write(b);
        
        }
        catch (IOException e)
        {System.out.println(e);}
    }
}