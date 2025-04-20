package methods;

public class Recursion {
    public static void main(String[] args) {
        int result = factorial(5);
        System.out.println("Факториал: " + result);
    }

    public static int factorial(int n) {
        if (n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}

