package QueueClass;

public class PriorityQueue {
    public static void main(String[] args) {
        // Demo code for PriorityQueue implemented with Java's built-in PriorityQueue
        java.util.PriorityQueue<Integer> pq = new java.util.PriorityQueue<>();
        pq.offer(30);
        pq.offer(10);
        pq.offer(20);
        System.out.println(pq);
        pq.poll();
        System.out.println(pq);
        System.out.println(pq.size());
        System.out.println(pq.isEmpty());
        System.out.println(pq.contains(20));
        pq.poll();
        System.out.println(pq.peek());
    }
}
