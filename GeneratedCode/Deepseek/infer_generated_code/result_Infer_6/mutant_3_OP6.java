import java.io.PrintStream;

class PrintfArgsBug {
    void stringInsteadOfInteger(PrintStream out) {
        out.printf("Hello %d", "world");  // BUG: CHECKERS_PRINTF_ARGS
    }

    public void showBug() {
        stringInsteadOfInteger(System.out);
    }

    void unreachableLoop() {
        boolean condition = getCondition();
        while (condition) {
            // do nothing
        }
    }
}