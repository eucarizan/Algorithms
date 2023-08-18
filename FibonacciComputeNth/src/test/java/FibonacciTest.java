import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {

    @Test
    void test1() {
        assertEquals(0L, Fibonacci.calc_fib(0));
    }

    @Test
    void test2() {
        assertEquals(1L, Fibonacci.calc_fib(1));
    }

    @Test
    void test3() {
        assertEquals(2L, Fibonacci.calc_fib(3));
    }

    @Test
    void test4() {
        assertEquals(55L, Fibonacci.calc_fib(10));
    }

    @Test
    void test5() {
        long startTime = System.nanoTime();

        assertEquals(1134903170L, Fibonacci.calc_fib(45));

        long endTime = System.nanoTime();
        long totalTime = endTime - startTime;

        int timeLimit = 1500;
        assertTrue(totalTime / 1000000 <= timeLimit, "Time limit exceeded");
    }

}