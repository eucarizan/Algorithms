public class FibonacciLastDigit {
    private static final int[] DIGITS = {0, 1, 1, 2, 3, 5, 8, 3, 1, 4,
        5, 9, 4, 3, 7, 0, 7, 7, 4, 1, 5, 6, 1, 7, 8, 5, 3, 8, 1, 9,
        0, 9, 9, 8, 7, 5, 2, 7, 9, 6, 5, 1, 6, 7, 3, 0, 3, 3, 6, 9,
        5, 4, 9, 3, 2, 5, 7, 2, 9, 1, 0 };
    private static final int LENGTH = 60;

    public static int getFibonacciLastDigitNaive(int n) {
        return DIGITS[n % LENGTH];
    }

    public static int getFibonacciLastDigitSuggested(int n) {
        if (n <= 1) {
            return n;
        }

        int[] fib = new int[n + 1];
        fib[0] = 0;
        fib[1] = 1;

        for (int i = 2; i < n + 1; i++) {
            fib[i] = (fib[i - 2] + fib[i - 1]) % 10;
        }

        return fib[n];
    }
}
