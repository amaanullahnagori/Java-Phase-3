import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Enumeration;
import java.util.Properties;
import java.util.Set;

public class PropertieS {
    public static void main(String[] args) throws Exception {
        Properties p=new Properties ();
        p.setProperty("Amaan","Nagori");
        p.setProperty("Roking","Yash");
        p.setProperty("Salman","Khan");
        p.setProperty("Shahid","Kapoor");
        System.out.println(p.get("Amaan"));
        System.out.println(p.getProperty("Nagori"));
        System.out.println(p.containsKey("Roking"));
        //System.out.println(p);
        p.store(new FileOutputStream("D:\\MyJava\\Data.txt"),"Details");
        p.load(new FileInputStream("D:\\MyJava\\Data.txt"));
        System.out.println("IMPORTED FILE IS ");
        Properties f=p;       // reference is changed and the previous one is changed to
        p=null;           // null
        System.out.println(p);
        System.out.println(f);
        f.storeToXML(new FileOutputStream("D:\\MyJava\\Data.XML"),"Details");
        f.loadFromXML(new FileInputStream("D:\\MyJava\\Data.XML"));
        System.out.println("Loaded filke from XML is");
        Properties k=f;
        f=null;
        System.out.println(k);

        Enumeration <String> e = (Enumeration<String>) k.propertyNames();
        while (e.hasMoreElements())
        {
            System.out.println((e.nextElement()));

        }
        Enumeration <String> e1 = (Enumeration<String>) k.propertyNames();
        while (e1.hasMoreElements())
        {
            System.out.println(k.get(e1.nextElement()));

        }
        Set<String> s=k.stringPropertyNames();
        System.out.println(s);

    }
}
