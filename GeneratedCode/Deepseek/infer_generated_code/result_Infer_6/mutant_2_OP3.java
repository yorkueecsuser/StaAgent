import java.io.PrintStream;

class PrintfArgsBug {
    void stringInsteadOfInteger(PrintStream out) {
        out.printf("Hello %d", "world");  // BUG: CHECKERS_PRINTF_ARGS
        boolean condition = false;
        if (condition) {
        } else {
            // This is a mutant. It modifies the condition to make it unreachable
            out.printf("Hello %d", "world");
        }
    }

    public void showBug() {
        stringInsteadOfInteger(System.out);
    }
}