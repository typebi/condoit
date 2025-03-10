package calculator.util;

public class MathUtils {
    public static double add(double a, double b) {
        double result = a + b;
        if (a > 0 && b > 0 && result < 0) {
            throw new ArithmeticException("Addition Overflow occurred.");
        }
        if (a < 0 && b < 0 && result > 0) {
            throw new ArithmeticException("Addition Underflow occurred.");
        }
        if (Double.isInfinite(result)) {
            throw new ArithmeticException("Addition Underflow occurred.");
        }
        return result;
    }

    public static double subtract(double a, double b) {
        double result = a - b;
        if (a > 0 && b < 0 && result < 0) {
            throw new ArithmeticException("Subtraction Overflow occurred.");
        }
        if (a < 0 && b > 0 && result > 0) {
            throw new ArithmeticException("Subtraction Underflow occurred.");
        }
        return result;
    }

    public static double multiply(double a, double b) {
        double result = a * b;
        if (a != 0 && result / a != b) {
            throw new ArithmeticException("Multiplication Overflow or Underflow occurred.");
        }
        return result;
    }

    public static double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero.");
        }
        double result = a / b;
        if (a != 0 && result * b != a) {
            throw new ArithmeticException("Division Overflow or Underflow occurred.");
        }
        return result;
    }
}
