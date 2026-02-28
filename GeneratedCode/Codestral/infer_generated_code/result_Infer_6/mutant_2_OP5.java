import java.io.PrintStream;

class PrintfMismatch {
    public void stringInsteadOfInteger(PrintStream out) {
        out.printf("Hello %d", "world");  // BUG: CHECKERS_PRINTF_ARGS

        // Mutant code: Unreachable switch statement
        int value = getConstantFalse();
        switch(value) {
            case 1:
                // This code will never be executed
                System.out.println("This is an unreachable statement.");
                break;
        }
    }

    public void showBug(PrintStream out) {
        stringInsteadOfInteger(out);
    }

    // Method to return a constant false value
    private boolean getConstantFalse() {
        return false;
    }
}