import java.io.PrintStream;

class PrintfMismatch {
    public void stringInsteadOfInteger(PrintStream out) {
        out.printf("Hello %d", "world");  // BUG: CHECKERS_PRINTF_ARGS
        out.printf("Hello %d", "world");  // MUTANT: DUPLICATION
    }

    public void showBug(PrintStream out) {
        stringInsteadOfInteger(out);
    }
}