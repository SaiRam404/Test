import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        queue.add(10);
        queue.add(20);
        queue.add(30);

        System.out.println("Front element: " + queue.peek());

        System.out.println("Dequeued element: " + queue.poll());
        System.out.println("Dequeued element: " + queue.poll());

        
        System.out.println("Remaining elements: " + queue);
    }
}
