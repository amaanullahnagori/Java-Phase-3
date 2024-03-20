import java.util.PriorityQueue;
public class PriorityQueuE { 
    public static void main(String[] args) {
    PriorityQueue<Integer> pq=new PriorityQueue<>();
    pq.add(10);
    pq.add(20);
    pq.add(30);
    pq.add(40);
    pq.add(5);
   System.out.println("THE ARRAY IS "+pq);
pq.poll();
pq.add(5);
pq.add(4);
pq.add(3);
pq.remove(40);
        System.out.println("THE ARRAY IS "+pq);

    }
    
}