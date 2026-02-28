import java.io.PrintStream;

class PrintfMismatch {
    public void stringInsteadOfInteger(PrintStream out) {
        out.printf("Hello %d", "world");  // BUG: CHECKERS_PRINTF_ARGS
        // Mutation: Duplicate the buggy line
        out.printf("Hello %d", "world");
    }

    public void showBug(PrintStream out) {
        stringInsteadOfInteger(out);
    }
}