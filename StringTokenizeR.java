import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class StringTokenizeR {
    public static void main(String[] args) throws Exception {
        String str=":Amaan;:Nagori;:B11;:IT;:Lnct";
       byte b[]=str.getBytes();
        FileOutputStream f=new FileOutputStream("D:\\MyJava\\StringToken.txt");
        f.write(b);
        StringTokenizer st =new StringTokenizer(str,";:");
        System.out.println( );


        while(st.hasMoreElements()==true)
        {
            System.out.println(st.nextToken());
        }

        FileInputStream fis =new FileInputStream("D:\\MyJava\\StringToken.txt");
        byte[] i = new byte [fis.available()];
        fis.read(i);
       String s =new String (i);
       System.out.println(s);

        StringTokenizer e =new StringTokenizer(s,";:");
        ArrayList <String> al=new ArrayList<>(e.countTokens());
        while  (e.hasMoreElements() )
        {
          String a=(e.nextToken());
          al.add(a);
        }
        System.out.println(al);
    }
}
