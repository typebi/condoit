package calculator;

import calculator.ui.InputHandler;

public class Main {
    public static void main(String[] args) {
        try {
            if (args.length != 1) {
                throw new IllegalArgumentException("Input argument required");
            }
            InputHandler.handleInput(args[0]);
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
