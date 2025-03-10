package calculator.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InputValidator {
    private static final String OPERAND_PATTERN = "^-?\\d+(\\.\\d+)?$"; // 정수 또는 실수

    public static boolean isInvalidOperand(String operand) {
        Pattern pattern = Pattern.compile(OPERAND_PATTERN);
        Matcher matcher = pattern.matcher(operand);
        return !matcher.matches();
    }
}
