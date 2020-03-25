/**
 * Program that uses recursion to countdown from a given value
 */

public class RecursionCountdown {

    public static void main(String[] args) {
        countdown(10);
    }

    public static void countdown(int n) {

        if (n == 0) {
            System.out.println("Happy New Year!");
        } else {
            System.out.println(n);
            countdown(n - 1);
        }
    }
}
