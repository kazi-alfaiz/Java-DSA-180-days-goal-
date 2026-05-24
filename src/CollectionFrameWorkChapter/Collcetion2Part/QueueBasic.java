package CollectionFrameWorkChapter.Collcetion2Part;

import java.util.LinkedList;
import java.util.Queue;

public class QueueBasic {
    static void main() {


        Queue<Integer> q =  new LinkedList<Integer>();
        q.offer(10);
        q.offer(20);
        q.offer(30);

        System.out.println(q);
        System.out.println(q.poll());
        System.out.println("Poll "+q);
        System.out.println("Peeking "+q.peek());
        System.out.println(q);

    }
}
