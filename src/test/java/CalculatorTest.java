import org.example.junit.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    @Test
    public void add() {
        Calculator calculator = new Calculator();
        int res = calculator.add(2,3);
        assertEquals(5, res);
    }

    @Test
    public void sub() {
        Calculator calc = new Calculator();
        int result = calc.sub(10, 10);
        assertEquals(0, result);
    }

    @Test
    public void mul() {
        Calculator calc = new Calculator();
        int result = calc.mul(-5, -3);
        assertEquals(15, result);
    }

    @Test
    public void div() {
        Calculator calc = new Calculator();
        int result = calc.div(2, 3);
        assertEquals(0, result);
    }

    @ParameterizedTest
    @CsvSource({
            "1,2,3",
            "5,3,8"
    })
    void parametrizedAdd(int first, int second, int result) {
        Calculator calculator = new Calculator();
        Assertions.assertEquals(result, calculator.add(first, second));
    }

    @Test
    public void whenAssertingArraysEquality() {
        char[] expected = {'J','u','n','i','t'};
        char[] actual = "Junit".toCharArray();

        Assertions.assertArrayEquals(expected, actual);
    }
}
