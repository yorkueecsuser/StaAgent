import java.io.PrintStream;

class PrintfArgMismatch {

    public static void main(String[] args) {
        PrintfArgMismatch example = new PrintfArgMismatch();
        example.showBug(System.out);
    }

    public void showBug(PrintStream out) {
        boolean conditionWhile = getCondition();
        // Unreachable while loop due to condition being false
        while (conditionWhile) {
            System.out.println("This code is unreachable.");
        }
        
        // Incorrect usage of printf with mismatched argument types
        out.printf("Hello %d", "world"); // BUG: CHECKERS_PRINTF_ARGS
    }

    private boolean getCondition() {
        return false;
    }
}