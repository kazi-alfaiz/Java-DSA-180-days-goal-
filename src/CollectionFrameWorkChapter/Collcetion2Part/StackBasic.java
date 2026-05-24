package CollectionFrameWorkChapter.Collcetion2Part;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class StackBasic {
    static void main() {

        Deque<Integer> stack1 = new LinkedList<>();
        stack1.push(10);
        stack1.push(20);
        stack1.push(30);
        System.out.println(stack1);

        stack1.pop();
        System.out.println(stack1);


    }
}
