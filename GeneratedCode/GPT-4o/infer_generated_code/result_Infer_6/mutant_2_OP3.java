import java.io.PrintStream;

class PrintfArgMismatch {

    public static void main(String[] args) {
        PrintfArgMismatch example = new PrintfArgMismatch();
        example.showBug(System.out);
    }

    public void showBug(PrintStream out) {
        // Incorrect usage of printf with mismatched argument types
        out.printf("Hello %d", "world"); // BUG: CHECKERS_PRINTF_ARGS
        
        // Mutation: Unreachable if statement - added as per mutation operator description
        boolean condition = getUnreachableCondition();
        if (condition) {
            out.println("This will never print.");
        }
    }

    // Helper method to ensure the condition is not a compile-time constant
    private boolean getUnreachableCondition() {
        return false;
    }
}