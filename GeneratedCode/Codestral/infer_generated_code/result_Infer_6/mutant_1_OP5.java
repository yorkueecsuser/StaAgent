import java.io.PrintStream;

class PrintfMismatch {
    public void stringInsteadOfInteger(PrintStream out) {
        int unreachableValue = getUnreachableValue(); // Added method call to dynamically determine the value
        switch (unreachableValue) { // Inserted unreachable switch statement
            case 1:
                // This case is unreachable
                break;
            default:
                // Default case to avoid compilation errors
                break;
        }
        out.printf("Hello %d", "world");  // BUG: CHECKERS_PRINTF_ARGS
    }

    public void showBug(PrintStream out) {
        stringInsteadOfInteger(out);
    }

    private int getUnreachableValue() {
        return -1; // This value is guaranteed to be unreachable in the switch statement
    }
}