import java.io.PrintStream;

class PrintfArgMismatch {

    public static void main(String[] args) {
        PrintfArgMismatch example = new PrintfArgMismatch();
        example.showBug(System.out);
    }

    public void showBug(PrintStream out) {
        // Incorrect usage of printf with mismatched argument types
        out.printf("Hello %d", "world"); // BUG: CHECKERS_PRINTF_ARGS
        
        // Unreachable if-else statement inserted
        boolean unreachableCondition = getFalseCondition();
        if (unreachableCondition) {
            out.println("This will never be printed.");
        } else {
            out.println("This is the else branch of the unreachable if-statement.");
        }
    }

    // Method to simulate a false condition
    private boolean getFalseCondition() {
        return false;
    }
}