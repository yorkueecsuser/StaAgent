import java.io.PrintStream;

class PrintfArgsBug {
    void stringInsteadOfInteger(PrintStream out) {
        out.printf("Hello %d", "world");  // BUG: CHECKERS_PRINTF_ARGS

        // MUTANT: Changed "Hello %d" to "Hello %s" to avoid CHECKERS_PRINTF_ARGS error
        out.printf("Hello %s", "world");
    }

    public void showBug() {
        stringInsteadOfInteger(System.out);
    }
}