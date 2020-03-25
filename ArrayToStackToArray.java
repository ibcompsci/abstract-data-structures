/**
 * Program that moves the contents of an array onto a stack and vice versa.
 */

import java.util.Arrays;
import java.util.Stack;

public class ArrayToStackToArray {

    public static void main(String[] args) throws InterruptedException {

        // An array containing the alphabet and a space
        char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
                'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

        char[] alphabet1 = new char[alphabet.length];

        // Create a stack
        Stack<Character> stack = new Stack<>();

        // Push the the contents of the alpabet array on to the stack
        System.out.println("\nTake the contents of the alphabet array and push them onto the stack...");
        for (int i = 0; i < alphabet.length; i++) {
            stack.push(new Character(alphabet[i]));
            System.out.println(stack.peek());
            Thread.sleep(100);
        }
        System.out.println("\nThe size of the stack is now " + stack.size());

        // Pop the contents off the stack and assign to alphabet1 array
        System.out.println("\nPop the contents of the stack and assign them to the new array...");
        for (int i = 0; i <= alphabet.length; i++) {
            if (!stack.empty()) {
                alphabet1[i] = (char) stack.pop();
                System.out.println(alphabet1[i]);
                Thread.sleep(100);
            }
        }

        // Output the size of the stack (Check the Java API)
        System.out.println("\nThe size of the stack is now " + stack.size());

        // Output the contents of the alphabet1 array (It should display in descending order)
        System.out.println("\nContents of new array...");
        for (int i = 0; i < alphabet1.length; i++) {
            System.out.print(alphabet1[i]);
        }
        System.out.println("");

        // Sort the array into ascending order (Check the Java API)
        Arrays.sort(alphabet1);

        // Output the contents of the alphabet1 array now it is sorted
        System.out.println("\nContents of new array after sorting...");
        for (int i = 0; i < alphabet1.length; i++) {
            System.out.print(alphabet1[i]);
        }
        System.out.println("");

    }

}
