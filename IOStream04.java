import java.io.*;
// *** important code for learning purpose ***

public class IOStream04
{
    public static void main(String[] args) throws Exception {
        byte b[]={2,5,4,6};
        ByteArrayInputStream ba=new ByteArrayInputStream(b);

        for(int i=0;i<b.length;i++) {
            int c = ba.read();
            System.out.print(c);
        }


// since once, we have the data so, we shouldn't read it again because it is not available in the array Stream
// you can try it by the following code
// int the above I have read it once,so it is not available in Stream therefore no output for the following
         // code
          int x ;
        do
         {
             x=ba.read();
             if (x!=-1)
                 System.out.print(x);
         }
        while (x!=-1);
        ba.close();

//        while ((x=ba.read())!=-1)
//        {
//            System.out.print(x);
//        }

        ByteArrayOutputStream bb=new ByteArrayOutputStream(4);
        bb.write('a'); // you can give character
        bb.write(100); // you can give askii value here 100=d
        bb.write(3);/*this are not allowed
        */
        bb.write(1);
        bb.writeTo(new FileOutputStream( "D:\\MyJava\\Textt.txt"));
        bb.close();


        FileOutputStream fos =new FileOutputStream("D:\\MyJava\\Textt.txt"); //location of file is to be put
        String str ="JAVA IS LOVE";
        byte[] b1 =str.getBytes();
         fos.write (b1);
         fos.close();

        FileInputStream fis =new FileInputStream("D:\\MyJava\\Textt.txt"); //location of file is to be put
        byte[] o =new byte [fis.available()];
        fis.read(o);
        String str1 =new String (o);
        System.out.println(str1);
        fis.close();

    }
}
