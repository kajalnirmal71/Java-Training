package com.collection.queue.example;

import java.util.LinkedList;
import java.util.Queue;
public class QueueDemoExample {


        public static void main(String[] args) {
            // Creating a Queue using LinkedList
            Queue<String> queue = new LinkedList<>();

            // 1. add(E e) – adds element to the queue (throws exception if fails)
            queue.add("Apple");
            queue.add("Banana");

            // 2. offer(E e) – adds element, returns false if fails (preferred)
            queue.offer("Cherry");
            queue.offer("Date");

            System.out.println("Initial Queue: " + queue);

            // 3. peek() – returns head without removing (null if empty)
            System.out.println(" Peek: " + queue.peek());  // Apple

            // 4. element() – returns head without removing (throws exception if empty)
            System.out.println("  Element: " + queue.element());  // Apple

            // 5. poll() – returns and removes head (null if empty)
            System.out.println("  Poll: " + queue.poll());  // Apple removed

            // 6. remove() – returns and removes head (throws exception if empty)
            System.out.println(" Remove: " + queue.remove());  // Banana removed

            System.out.println("Queue after poll and remove: " + queue);

            // 7. size() – returns number of elements in the queue
            System.out.println("Queue size: " + queue.size());

            // 8. isEmpty() – checks if queue is empty
            System.out.println("Is queue empty? " + queue.isEmpty());

            // 9. contains(Object o) – checks if element exists
            System.out.println("Contains 'Cherry'? " + queue.contains("Cherry"));

            // 10. clear() – removes all elements
            queue.clear();
            System.out.println("Queue after clear(): " + queue);
        }
    }


