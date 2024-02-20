package Queues;

import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {

    // Queue = FIFO data structure. First-In First-Out
    //                A collection designed for holding elements prior to processing
    //                Linear data structure
  
    //      enqueue = offer()
    //      dequeue = poll()
  
    // Where are queues useful?
  
    // 1. Keyboard Buffer (letters should appear on the screen in the order they're pressed)
    // 2. Printer Queue (Print jobs should be completed in order)
    // 3. Used in LinkedLists, PriorityQueues, Breadth-first search
  
        Queue<String> queue = new LinkedList<>();
        
        queue.offer("Lee");
        queue.offer("Oscar");
        queue.offer("Boscar");
        queue.offer("Peter");
        queue.offer("Park");
        queue.poll();

        System.out.println(queue);
        System.out.println(queue.peek());
    }
    
}
