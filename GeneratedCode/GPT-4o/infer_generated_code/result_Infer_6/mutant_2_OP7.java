import java.io.PrintStream;

class PrintfArgMismatch {

    public static void main(String[] args) {
        PrintfArgMismatch example = new PrintfArgMismatch();
        example.showBug(System.out);
    }

    public void showBug(PrintStream out) {
        // Incorrect usage of printf with mismatched argument types
        out.printf("Hello %d", "world"); // BUG: CHECKERS_PRINTF_ARGS

        // Unreachable while loop mutation
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This block is intentionally left unreachable
            System.out.println("This is unreachable code in the while loop.");
        }
    }
    
    // Helper method to provide a non-final condition
    private boolean getCondition() {
        return false; // This makes the while loop unreachable
    }
}