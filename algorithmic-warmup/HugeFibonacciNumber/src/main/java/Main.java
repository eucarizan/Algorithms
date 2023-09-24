public class Main {
    public static void main(String[] args) {
        long n = 2_816_213_588L;
        int m = 239;

        System.out.println(Solution.fibMod(n % Solution.pisanoPeriod(m), m));
    }
}