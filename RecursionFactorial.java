/**
 * Program that uses recursion to calculate the factorial of a number
 */

public class RecursionFactorial {

    static int factorial(int n) {

        if (n == 1) {
            return 1;
        } else {
            return (n * factorial(n - 1));
        }
    }

    // 4 x 3 x 2 x 1 = 24
    public static void main(String[] args) {
        System.out.println("Factorial of 4 is: " + factorial(4));
    }

}
