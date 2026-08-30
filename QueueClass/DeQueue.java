package QueueClass;

public class DeQueue {
    public static void main(String[] args) {
        // Demo code for DeQueue implemented with Java's built-in LinkedList
        java.util.Deque<Integer> dq = new java.util.LinkedList<>();
        dq.offerFirst(10);
        dq.offerLast(20);
        dq.offerFirst(30);
        System.out.println(dq);
        dq.pollFirst();
        System.out.println(dq);
        System.out.println(dq.size());
        System.out.println(dq.isEmpty());
        System.out.println(dq.contains(20));
        dq.pollLast();
        System.out.println(dq.peekFirst());
    }   
}
