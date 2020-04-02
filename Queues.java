/*
 * A queue stores a set of elements in a particular order. Items are retrieved in
 * the order in which they are inserted (FIFO: First-in, First-out).
 *
 */

import java.util.LinkedList;
import java.util.Queue;

public class Queues {

    public static Queue<String> queue = new LinkedList<String>();

    public static void main(String[] args) {

        // Check if the queue is empty
        isEmpty();

        // Add three people to the queue
        enqueue("Robert");
        enqueue("Juliana");
        enqueue("Ivana");

        // Check is queue is empty
        isEmpty();

        // Check the size of the queue
        getSize();

        // Check who is at the front of the queue
        peek();

        // Take one person out of the queue
        dequeue();

        // Add one people to the queue
        enqueue("Danielle");

        // Check who is at the front of the queue
        peek();

        // Remove the remainder of people in the queue
        dequeue();
        dequeue();
        dequeue();

    }

    // Enqueue: add an item to the queue
    public static void enqueue(String name) {
            queue.add(name);
            System.out.println(name + " has joined the queue");
    }

    // Dequeue: remove an item from the queue
    public static void dequeue() {
        if(!queue.isEmpty()) {
            String name = queue.remove();
            System.out.println(name + " has been removed from the queue.");
        }
    }

    // peek(): returns the first element of the queue
    public static void peek() {
        if(!queue.isEmpty()) {
            System.out.println(queue.peek() + " is at the front of the queue.");
        }
    }

    // isEmpty(): checks if the queue is empty
    public static void isEmpty() {
        if(queue.isEmpty()) {
            System.out.println("Queue is empty.");
        } else {
            System.out.println("Queue is not empty.");
        }
    }

    // size(): returns the size of the queue
    public static void getSize() {
        System.out.println("There are " + queue.size() + " people in the queue");
    }

}
