package calculator.core;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {
    @Test
    public void testAddition() {
        assertEquals(5.0, Calculator.calculate(2.0, Operator.ADDITION, 3.0), 0.001);
    }

    @Test
    public void testSubtraction() {
        assertEquals(-1.0, Calculator.calculate(2.0, Operator.SUBTRACTION, 3.0), 0.001);
    }

    @Test
    public void testMultiplication() {
        assertEquals(6.0, Calculator.calculate(2.0, Operator.MULTIPLICATION, 3.0), 0.001);
    }

    @Test
    public void testDivision() {
        assertEquals(2.0, Calculator.calculate(6.0, Operator.DIVISION, 3.0), 0.001);
    }

    @Test(expected = ArithmeticException.class)
    public void testDivisionByZero() {
        Calculator.calculate(6.0, Operator.DIVISION, 0.0);
    }

    @Test(expected = ArithmeticException.class)
    public void testAdditionOverflow() {
        Calculator.calculate(Double.MAX_VALUE, Operator.ADDITION, Double.MAX_VALUE);
    }

    @Test(expected = ArithmeticException.class)
    public void testMultiplicationOverflow() {
        Calculator.calculate(Double.MAX_VALUE, Operator.MULTIPLICATION, 2);
    }

    @Test(expected = ArithmeticException.class)
    public void testDivisionUnderflow() {
        Calculator.calculate(1, Operator.DIVISION, Double.MAX_VALUE);
    }
}
