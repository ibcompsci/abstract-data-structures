/**
 * Program that uses recursion to print out a string multiple times
 */

public class RecursionHelloWorld {

    static int count = 0;

    public static void helloWorld() {

        if (count < 5) {
            System.out.println("Hello World!");
            count++;
            helloWorld();
        }
    }

    public static void main(String[] args) {
        helloWorld();
    }

}
