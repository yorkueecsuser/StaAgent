import java.io.PrintStream;

class PrintfArgsBug {
    void stringInsteadOfInteger(PrintStream out) {
        out.printf("Hello %d", "world");  // BUG: CHECKERS_PRINTF_ARGS
    }

    boolean getCondition() {
        return false;
    }

    void showBug() {
        if (getCondition()) {
            stringInsteadOfInteger(System.out);
        } else {
            // Do nothing
        }
    }
}