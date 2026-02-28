import java.io.PrintStream;

class PrintfArgMismatch {

    public static void main(String[] args) {
        PrintfArgMismatch example = new PrintfArgMismatch();
        example.showBug(System.out);
    }

    public void showBug(PrintStream out) {
        // Incorrect usage of printf with mismatched argument types
        out.printf("Hello %d", "world"); // BUG: CHECKERS_PRINTF_ARGS

        // Unreachable if-else statement introduced as a mutant
        boolean condition = getCondition(); // Using a method to avoid compile-time constant
        if (condition) {
            out.println("This will never print because condition is always false.");
        } else {
            out.println("This is the else branch.");
        }
    }

    // Method that always returns false, ensuring the if branch is unreachable
    private boolean getCondition() {
        return false;
    }
}