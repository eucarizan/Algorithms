import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FibonacciLastDigitTest {

    @Test
    @DisplayName("lastDigitFib(3) == 2")
    void test1() {
        assertEquals(2, FibonacciLastDigit.getFibonacciLastDigitNaive(3));
    }

    @Test
    @DisplayName("lastDigitFib(139) == 1")
    void test2() {
        assertEquals(1, FibonacciLastDigit.getFibonacciLastDigitNaive(139));
    }

    @Test
    @DisplayName("lastDigitFib(91239) == 6")
    void test3() {
        assertEquals(6, FibonacciLastDigit.getFibonacciLastDigitNaive(91239));
    }

    @Test
    void test4() {
        assertEquals(2, FibonacciLastDigit.getFibonacciLastDigitSuggested(3));
    }

    @Test
    void test5() {
        assertEquals(1, FibonacciLastDigit.getFibonacciLastDigitSuggested(139));
    }

    @Test
    void test6() {
        assertEquals(6, FibonacciLastDigit.getFibonacciLastDigitSuggested(91239));
    }
}