
import java.util.HashMap;
import java.util.Set;

class HashMaP
{
    public static void main(String[] args) {
    HashMap<String ,Integer> hm=new HashMap<>(16,0.75f);
    hm.put ("Amaan",12345678);  //(key,value) 
    hm.put("Tocky",45678912);
    hm.put ("Rocky",456987123);
    hm.put ("Gaduda",789541234);
      System.out.println(hm.containsKey("Amaan"));
        System.out.println(hm.containsValue(123456789));
        System.out.println(hm.get("Amaan"));
        hm.replace ("Amaan",1234560);
       Set <String> s= hm.keySet();
       for (String x:s)
       {
           System.out.println(hm.get(x));
       }
       
    }
    
}