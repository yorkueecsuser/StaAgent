import java.io.PrintStream;

class PrintfArgsBug {
    void stringInsteadOfInteger(PrintStream out) {
        String irrelevantVariable = "randomstring"; // Unique dead store
        out.printf("Hello %d", "world");  // BUG: CHECKERS_PRINTF_ARGS
    }

    public void showBug() {
        stringInsteadOfInteger(System.out);
    }
}