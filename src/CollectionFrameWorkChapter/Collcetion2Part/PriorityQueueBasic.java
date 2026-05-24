package CollectionFrameWorkChapter.Collcetion2Part;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueBasic {
    static void main() {

        //Default behavior is give high priority to lowest number
       // Queue<Integer> pq = new PriorityQueue<>(); //it is by default min hip
       Queue<Integer> pq = new PriorityQueue<>((a,b)->b-a);//it is set to max hip that measn its start high vlaue

        pq.offer(40);
        pq.offer(20);
        pq.offer(30);
        pq.offer(10);
        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq);
    }
}
