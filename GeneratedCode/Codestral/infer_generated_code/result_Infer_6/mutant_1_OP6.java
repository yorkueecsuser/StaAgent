import java.io.PrintStream;

class PrintfMismatch {
    public void stringInsteadOfInteger(PrintStream out) {
        out.printf("Hello %d", "world");  // BUG: CHECKERS_PRINTF_ARGS
        // Inserted mutant: Unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            System.out.println("This is an unreachable loop!");
        }
    }

    private boolean getCondition() {
        // Returns false to make the loop unreachable
        return false;
    }

    public void showBug(PrintStream out) {
        stringInsteadOfInteger(out);
    }
}