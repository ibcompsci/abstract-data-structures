/*
 * A stack stores a set of elements in a particular order. Items are retrieved in the reverse order in which they
 * are inserted (Last-in, First-out).
 *
 * LIFO (Last-in, First-out)
 *
 */

import java.util.*;

public class Stacks {

    public static void main(String[] args) throws InterruptedException {

        Stack<Integer> lifo = new Stack<Integer>();

        // Push 10 integers onto the stack
        System.out.println("Push 10 integers onto the stack...\n");

        for(int i = 1; i <= 10; i++) {
            lifo.push(new Integer(i));
            System.out.println("Push " + i);
            Thread.sleep(500);
        }

        // Take a peek at the top of the stack
        System.out.println("\nTake a peek at the top of the stack...\n");
        if(!lifo.empty()) {
            System.out.println(lifo.peek());
            Thread.sleep(1000);
        }

        // Pop the 10 integers off of the stack
        System.out.println("\nPop the 10 integer off of the stack...\n");
        for(int i = 1; i <= 10; i++) {
            if(!lifo.empty()) {
                int s = lifo.pop();
                System.out.println("Pop " + s);
                Thread.sleep(500);
            }
        }

        // Check if stack is empty
        System.out.println("\nCheck if stack is empty...\n");
        if(lifo.isEmpty()) {
            System.out.println("Stack is empty.\n");
        } else {
            System.out.println("Stack still contains data.\n");
        }
    }
}

