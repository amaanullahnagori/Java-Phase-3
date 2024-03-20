import java.util.LinkedList ;
import java.util.Iterator ;
class LinkedLIst
{
    public static void main(String[] args) {
        LinkedList <Integer>l1=new LinkedList<>();
         l1.add(12);
         l1.add(13);
         l1.add(14);
         l1.add(15);
         LinkedList <Integer>l2=new LinkedList<>(l1);
         l2.offer(16);
         l2.offerFirst(11);
         l2.offerLast(17);
         System.out.println(l2);
        System.out.println(l2.peek()); 
        System.out.println(l2.peekLast());
         System.out.println(l2.peekFirst()); 
         System.out.println(l2);
         l2.poll();
         l2.pollFirst();
         l2.pollLast();
         System.out.println(l2);
     l2.removeFirst(); 
     l2.removeLast();
     l2.remove (0);
         System.out.println(l2);
         l2.addAll(0,l1);
         System.out.print("THE ARRAY IS :-");
         System.out.println(l2);
//         Iterator <Integer> i=l2.iterator();
//        while (i.hasNext()==true)
//        {
//            System.out.println(i.next());
//        }
        for( Iterator <Integer> i1=l2.iterator();i1.hasNext()==true;) // the above same thing is reduced to for loop
        { 
            System.out.println(i1.next());
        }
    }
}