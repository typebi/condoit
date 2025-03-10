package calculator.ui;

import calculator.core.Calculator;
import calculator.core.Operator;
import calculator.util.InputValidator;

public class InputHandler {
    public static void handleInput(String input) {
        String[] parts = input.trim().split("\\s+");

        // 유효성 검사
        if (parts.length != 3) {
            throw new IllegalArgumentException("Invalid input format");
        }
        if (InputValidator.isInvalidOperand(parts[0])) {
            throw new IllegalArgumentException("Invalid operand: " + parts[0]);
        }
        if (InputValidator.isInvalidOperand(parts[2])) {
            throw new IllegalArgumentException("Invalid operand: " + parts[2]);
        }

        double operand1 = Double.parseDouble(parts[0]);
        Operator operator = getOperator(parts[1]);
        double operand2 = Double.parseDouble(parts[2]);

        double result = Calculator.calculate(operand1, operator, operand2);
        Display.displayResult(result);
    }

    private static Operator getOperator(String symbol) {
        for (Operator operator : Operator.values()) {
            if (operator.getSymbol().equals(symbol)) {
                return operator;
            }
        }
        throw new IllegalArgumentException("Invalid operator symbol: " + symbol);
    }
}
