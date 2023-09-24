public class Solution {
    public static int fibMod(long n, int m) {
        int current = 0;
        int next = 1;

        for (long i = 0; i < n; i++) {
            int temp = current;
            current = next;
            next = (temp + next) % m;
        }

        return current;
    }

    public static int pisanoPeriod(int m) {
        int current = 0;
        int next = 1;
        int period = 0;

        while(true) {
            int temp = current;
            current = next;
            next = (temp + next) % m;
            period++;

            if (current == 0 && next == 1) {
                return period;
            }
        }
    }
}
