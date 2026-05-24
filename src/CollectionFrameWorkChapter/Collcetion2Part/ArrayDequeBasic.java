package CollectionFrameWorkChapter.Collcetion2Part;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class ArrayDequeBasic {
    static void main() {
        Deque<Integer> q = new ArrayDeque<>();
        q.offer(10);
        q.offerFirst(5);
        q.offerLast(50);
        System.out.println(q);

        q.pollLast();
        System.out.println(q);

        q.pollFirst();
        System.out.println(q);
        System.out.println(q.peekFirst());
        System.out.println(q.peekLast());
        System.out.println(q.peek());
    }
}
