public class Fibonacci {

    static long[] table = new long[1_000_001];
    public static long calc_fib(int n) {
        if (table[n] == 0) {
            if (n <= 1) {
                table[n] = n;
            } else {
                table[n] = calc_fib(n - 2) + calc_fib(n - 1);
            }
        }

        return table[n];
    }

    private long old_calc_fib(int n) {
        if (n <= 1)
            return n;

        return calc_fib(n - 1) + calc_fib(n - 2);
    }
}
