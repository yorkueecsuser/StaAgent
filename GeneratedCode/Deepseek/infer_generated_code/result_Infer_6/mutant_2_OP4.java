import java.io.PrintStream;

class PrintfArgsBug {
    void stringInsteadOfInteger(PrintStream out) {
        out.printf("Hello %d", "world");  // BUG: CHECKERS_PRINTF_ARGS

        // Mutant Code
        if (false) {
            String falseCondition = "world";
            out.printf("Hello %d", falseCondition);
        }
    }

    public void showBug() {
        stringInsteadOfInteger(System.out);
    }
}