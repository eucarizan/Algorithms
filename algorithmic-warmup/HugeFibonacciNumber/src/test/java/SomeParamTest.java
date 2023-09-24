import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SuppressWarnings("unused")
public class SomeParamTest {

    @ParameterizedTest(name = "{0} -- fibOfNModM({1}, {2}) == {3}")
    @DisplayName("param test")
    @CsvSource(value = {
            "testWithValid1 : 1 : 239 : 1",
            "testWithValid2 : 115 : 1000 : 885",
            "testWithHighNumberOfN : 2816213588 : 239 : 151"
    }, delimiter = ':')
    public void test(String name, long n, int m, int expected) {
        var result = Solution.fibMod(n % Solution.pisanoPeriod(m), m);

        assertEquals(expected, result);
    }
}
