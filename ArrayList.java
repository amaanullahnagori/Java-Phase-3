import java.util .*;
import java.util.ArrayList;
class Arraylist
{
    public static void main(String[] args) {
        ArrayList<Integer> a=new  ArrayList<>();
 
       

        a.add(1);
        a.add(4);
        a.add(2, 20);
        a.add(20);
        a.add(8);
        a.add(7);
       ArrayList<Integer> b=new ArrayList<>(a);
        System.out.println(b);
       
       b.add(10);
       b.add(50);
       b.add(2, 2);
       b.add(21);
       a.addAll(1,b);
        System.out.println(b);
     //a.clear ();
 
//        System.out.println( a.contains(4));  
//        System.out.println(a.containsAll(b));
//        System.out.println(a.get(4));
//        System.out.println(a.isEmpty());
//        System.out.println(a.indexOf(20));
//        System.out.println(a.lastIndexOf(20));
//        a.remove(a.indexOf(20));
             System.out.println(a);
    //  a.remove(5);
    //a.removeAll (b);
   // a.removeRange(2,4);
   //a.retainAll(b);
  // a.set(4,100);
        System.out.println(a.size());
        System.out.println(a.subList(2, 10));
        System.out.println(a);
        int sum=0;
        for (Iterator <Integer> i=a.iterator();i.hasNext()==true;) // TRACING THE ARRAY 
        {
           int element =i.next();
           sum=sum+element ;
           }
        System.out.println("THE SUM OF THE ELEMENT OF ARRAY IS "+sum);
       
        
        
    }
}