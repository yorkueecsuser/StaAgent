import java.io.PrintStream;

class PrintfArgMismatch {

    public static void main(String[] args) {
        PrintfArgMismatch example = new PrintfArgMismatch();
        example.showBug(System.out);
    }

    public void showBug(PrintStream out) {
        // Incorrect usage of printf with mismatched argument types
        out.printf("Hello %d", "world"); // BUG: CHECKERS_PRINTF_ARGS

        // Inserting an unreachable if branch based on a dynamic condition
        boolean isUnreachable = determineUnreachableCondition();
        if (isUnreachable) {
            // This block is unreachable because isUnreachable is determined to be false
            out.println("This is an unreachable statement.");
        }
    }

    // Method to ensure the condition is evaluated at runtime
    private boolean determineUnreachableCondition() {
        return false; // Simulating a dynamically evaluated false condition
    }
}