import java.io.PrintStream;

class PrintfMismatch {
    public void stringInsteadOfInteger(PrintStream out) {
        boolean conditionFor = false;
        for (int i = 0; conditionFor; i++) {
            // Unreachable code block
            int x = 10;
        }
        out.printf("Hello %d", "world");  // BUG: CHECKERS_PRINTF_ARGS
    }

    public void showBug(PrintStream out) {
        stringInsteadOfInteger(out);
    }
}