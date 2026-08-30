package QueueClass;
import java.util.*;
public class QueueInbuilt {
    public static void main(String[] args) {
        // Demo code for Queue implemented with Java's built-in LinkedList
        Queue<Integer> q = new LinkedList<>();
        q.offer(10);
        q.offer(20);
        q.offer(30);
        System.out.println(q);
        q.poll();
        System.out.println(q);
        System.out.println(q.size());
        System.out.println(q.isEmpty());
        System.out.println(q.contains(30));
        q.poll();
        System.out.println(q.element());
        q.poll();
        System.out.println(q.peek());
    }
}
