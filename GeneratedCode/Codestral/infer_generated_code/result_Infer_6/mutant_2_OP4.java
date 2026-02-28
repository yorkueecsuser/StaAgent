import java.io.PrintStream;

class PrintfMismatch {
    public void stringInsteadOfInteger(PrintStream out) {
        out.printf("Hello %d", "world");  // BUG: CHECKERS_PRINTF_ARGS

        // Added mutant code: Unreachable if-else statement
        boolean unreachableCondition = false;
        if (unreachableCondition) {
            System.out.println("This code should never execute.");
        } else {
            System.out.println("This code is always executed.");
        }
    }

    public void showBug(PrintStream out) {
        stringInsteadOfInteger(out);
    }
}