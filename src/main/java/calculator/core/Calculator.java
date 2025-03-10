package calculator.core;

import calculator.util.MathUtils;

public class Calculator {
    public static double calculate(double operand1, Operator operator, double operand2) {
        return switch (operator) {
            case ADDITION -> MathUtils.add(operand1, operand2);
            case SUBTRACTION -> MathUtils.subtract(operand1, operand2);
            case MULTIPLICATION -> MathUtils.multiply(operand1, operand2);
            case DIVISION -> MathUtils.divide(operand1, operand2);
            default -> throw new IllegalArgumentException("Invalid operator: " + operator);
        };
    }
}
