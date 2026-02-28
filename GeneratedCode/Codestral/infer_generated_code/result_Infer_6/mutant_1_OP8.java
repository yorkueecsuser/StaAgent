import java.io.PrintStream;

class PrintfMismatch {
    public void stringInsteadOfInteger(PrintStream out) {
        out.printf("Hello %d", "world");  // BUG: CHECKERS_PRINTF_ARGS

        // MUTANT CODE
        String w = "world";
        out.printf("Hello %s", w);
    }

    public void showBug(PrintStream out) {
        stringInsteadOfInteger(out);
    }
}