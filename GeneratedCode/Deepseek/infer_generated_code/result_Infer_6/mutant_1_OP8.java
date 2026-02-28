import java.io.PrintStream;

class PrintfArgsBug {
    void stringInsteadOfInteger(PrintStream out) {
        out.printf("Hello %d", "world");  // BUG: CHECKERS_PRINTF_ARGS
    }

    public void showBug() {
        stringInsteadOfInteger(System.out);
    }

    void stringInsteadOfIntegerRenamed(PrintStream out) {
        out.printf("Hello %s", 123);  // Mutation operator: Renaming. Variable "world" renamed to 123.
    }

    public void showMutant() {
        stringInsteadOfIntegerRenamed(System.out);
    }
}