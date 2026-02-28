import java.io.PrintStream;

class PrintfArgsBug {
    void stringInsteadOfInteger(PrintStream out) {
        out.printf("Hello %d", "world");  // BUG: CHECKERS_PRINTF_ARGS
        out.printf("Hello %d", "world");  // Duplication Mutant: 1
    }

    public void showBug() {
        stringInsteadOfInteger(System.out);
    }
}