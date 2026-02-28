import java.io.PrintStream;

class PrintfMismatch {
    public void stringInsteadOfInteger(PrintStream out) {
        out.printf("Hello %d", "world");  // BUG: CHECKERS_PRINTF_ARGS

        // Mutant: Unreachable while loop
        boolean conditionWhile = false;
        while (conditionWhile) {
            // This code block is unreachable
            System.out.println("This is an unreachable while loop");
        }
    }

    public void showBug(PrintStream out) {
        stringInsteadOfInteger(out);
    }

    // A method to simulate a dynamically determined condition
    private boolean getCondition() {
        return false;
    }
}