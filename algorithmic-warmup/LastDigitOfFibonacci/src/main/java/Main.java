public class Main {
    public static void main(String[] args) {
//        System.out.println(FibonacciLastDigit.getFibonacciLastDigitNaive(102));
//        System.out.println(FibonacciLastDigit.getFibonacciLastDigitNaive(103));
//        System.out.println(FibonacciLastDigit.getFibonacciLastDigitNaive(104));
//        System.out.println(FibonacciLastDigit.getFibonacciLastDigitNaive(1102));
//        System.out.println(FibonacciLastDigit.getFibonacciLastDigitNaive(1103));
//        System.out.println(FibonacciLastDigit.getFibonacciLastDigitNaive(1104));
        int[] lastDigitsOfFibUpTo60 = {0, 1, 1, 2, 3, 5, 8, 3, 1, 4, 5, 9, 4, 3, 7, 0, 7, 7, 4, 1, 5, 6, 1, 7, 8, 5, 3,
                8, 1, 9, 0, 9, 9, 8, 7, 5, 2, 7, 9, 6, 5, 1, 6, 7, 3, 0, 3, 3, 6, 9, 5, 4, 9, 3, 2, 5, 7, 2, 9, 1, 0};

//        for (int i = 0; i <= 60; i++) {
//            System.out.print(fib(i) % 10 + ", ");
//        }
        System.out.println(fib(60));
//        System.out.println(lastDigitsOfFibUpTo60[1001 % 60]);
//        System.out.println(lastDigitsOfFibUpTo60[1002 % 60]);
    }

    static long[] table = new long[61];

    private static long fib(int n) {
        if (table[n] == 0) {
            if (n <= 1) {
                table[n] = n;
            } else {
                table[n] = fib(n - 1) + fib(n - 2);
            }
        }
        return table[n];
    }
}
