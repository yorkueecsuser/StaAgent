import java.io.PrintStream;

class PrintfMismatch {

    private boolean getFalseCondition() {
        return false;   // This method is used to generate a dynamically determined false condition
    }

    public void stringInsteadOfInteger(PrintStream out) {
        out.printf("Hello %d", "world");  // BUG: CHECKERS_PRINTF_ARGS

        // Inserted unreachable while loop
        while (getFalseCondition()) {
            // This code will never be executed
            System.out.println("This is an unreachable while loop");
        }
    }

    public void showBug(PrintStream out) {
        stringInsteadOfInteger(out);
    }
}