import java.util.Collection;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMaP {
    public static void main(String[] args) {
        TreeMap<String ,String> t=new TreeMap();                  

//        t.put("B",2);
//        t.put("C",3);
//        t.put("A",1);
//        System.out.println(t);
        t.put("Amaan","Hello");
        t.put("Rockey","Go");
        t.put ("Roduda","bad");
        t.put("AC","Nagori");
        t.put("ABC","Lnct");
        t.put("ab","Zalatan");
        t.put("AmAAn","Ok");
        System.out.println(t);
        System.out.println(t.ceilingEntry("Amaa"));
        System.out.println(t.ceilingKey("Amaa"));
        System.out.println(t.firstEntry());
        System.out.println(t.lastEntry());
        System.out.println(t.floorEntry("R"));
        System.out.println(t.floorKey("Roa"));
        System.out.println(t.get("Roduda"));
        System.out.println(t.size());
        System.out.println(t.floorKey("G"));
        System.out.println(t.floorEntry("S"));
        System.out.println(t.ceilingEntry("Ag"));
        System.out.println(t);
        t.pollFirstEntry();
        t.pollLastEntry();
        System.out.println(t);
        SortedMap<String,String> s =t.tailMap("Ama");
        SortedMap<String,String> s1 =t.subMap("Ama","Rockey");
        System.out.println(s1);
        Collection<String> s2=t.values();  // For getting set of values
        System.out.println(s2);
        Set<String> s3=t.keySet();
        for(String x: s3)                     // if you want to perform some operation then
        {                                    // then use for each loop to get each value of key
            String str=x.toUpperCase();     // otherwise you can simply print all of them together
                                           // as done in Collection-->s2
            System.out.println(str);
        }
        System.out.println(t.lastKey());
        System.out.println(t.firstKey());

    }
}
