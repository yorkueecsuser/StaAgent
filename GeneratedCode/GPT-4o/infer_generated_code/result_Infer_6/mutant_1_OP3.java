import java.io.PrintStream;

class PrintfArgMismatch {

    public static void main(String[] args) {
        PrintfArgMismatch example = new PrintfArgMismatch();
        example.showBug(System.out);
    }

    public void showBug(PrintStream out) {
        // Incorrect usage of printf with mismatched argument types
        out.printf("Hello %d", "world"); // BUG: CHECKERS_PRINTF_ARGS

        // Inserted mutant: Unreachable if statement
        boolean alwaysFalseCondition = getFalseCondition();
        if (alwaysFalseCondition) {
            out.println("This will never be printed.");
        }
    }
    
    // Helper method to simulate an unreachable if statement condition
    private boolean getFalseCondition() {
        // Simulating a condition that evaluates to false
        return false;
    }
}