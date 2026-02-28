import java.io.PrintStream;

class PrintfMismatch {
    private boolean alwaysFalse() {
        return false;
    }

    public void stringInsteadOfInteger(PrintStream out) {
        if (alwaysFalse()) {
            // Unreachable code
            System.out.println("This line should not be executed");
        }
        out.printf("Hello %d", "world");  // BUG: CHECKERS_PRINTF_ARGS
    }

    public void showBug(PrintStream out) {
        stringInsteadOfInteger(out);
    }
}