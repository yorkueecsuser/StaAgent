import java.io.PrintStream;

class PrintfMismatch {
    public void stringInsteadOfInteger(PrintStream out) {
        out.printf("Hello %d", "world");  // BUG: CHECKERS_PRINTF_ARGS
    }

    public void showBug(PrintStream out) {
        boolean shouldExecute = getCondition();
        if (shouldExecute) {
            // Unreachable code
            stringInsteadOfInteger(out);
        }
    }

    private boolean getCondition() {
        return false;
    }
}