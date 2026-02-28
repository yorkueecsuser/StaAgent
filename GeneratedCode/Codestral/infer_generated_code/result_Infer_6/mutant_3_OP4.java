import java.io.PrintStream;

class PrintfMismatch {
    public void stringInsteadOfInteger(PrintStream out) {
        if (getCondition()) {
            // This branch is unreachable
            int unreachableValue = 10;
        } else {
            out.printf("Hello %d", "world");  // BUG: CHECKERS_PRINTF_ARGS
        }
    }

    public boolean getCondition() {
        return false;
    }

    public void showBug(PrintStream out) {
        stringInsteadOfInteger(out);
    }
}