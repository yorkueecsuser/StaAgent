import java.io.PrintStream;

class PrintfMismatch {
    public void stringInsteadOfInteger(PrintStream out) {
        out.printf("Hello %d", "world");  // BUG: CHECKERS_PRINTF_ARGS
        // Mutation: Adding an unreachable for loop
        for (int i = 0; getCondition(); i++) {
            // This loop is unreachable as getCondition() always returns false
        }
    }

    public void showBug(PrintStream out) {
        stringInsteadOfInteger(out);
    }

    // Helper method to return a false condition
    private boolean getCondition() {
        return false;
    }
}