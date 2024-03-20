
import java.util.Enumeration;
import java.util.Hashtable;

public class HashTablE {
    public static void main(String[] args) {
        Hashtable<String ,Integer> ht=new Hashtable <>();
        ht.put("Amaan",9826)  ;
        ht.put ("Shahid",5218);
        ht.put("Hamidia",5698);
        ht.put ("Tanmay",456987);
        System.out.println(ht);
        System.out.println( ht. get("Tanmay"));
        Enumeration<Integer> e= ht.elements();
        while (e.hasMoreElements())
        {
            System.out.println(e.nextElement());
        }
        ht.compute( "Amaan",(K,V)->V+786);
        System.out.println(ht.get("Amaan"));
        ht.compute ("Tanmay",(K,V)->V+6*58+12-78);
        System.out.println(ht.get("Tanmay"));
    }
}
