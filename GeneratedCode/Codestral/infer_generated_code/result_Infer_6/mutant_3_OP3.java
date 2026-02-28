import java.io.PrintStream;

class PrintfMismatch {
    public void stringInsteadOfInteger(PrintStream out) {
        out.printf("Hello %d", "world");  // BUG: CHECKERS_PRINTF_ARGS
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            // This code block is unreachable
            System.out.println("This line should never be executed.");
        }
    }

    private boolean getUnreachableCondition() {
        return false; // This method always returns false, making the if statement unreachable
    }

    public void showBug(PrintStream out) {
        stringInsteadOfInteger(out);
    }
}