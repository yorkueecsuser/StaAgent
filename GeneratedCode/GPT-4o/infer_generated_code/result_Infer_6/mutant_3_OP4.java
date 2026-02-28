import java.io.PrintStream;

class PrintfArgMismatch {

    public static void main(String[] args) {
        PrintfArgMismatch example = new PrintfArgMismatch();
        example.showBug(System.out);
    }

    public void showBug(PrintStream out) {
        // Incorrect usage of printf with mismatched argument types
        out.printf("Hello %d", "world"); // BUG: CHECKERS_PRINTF_ARGS

        // Unreachable if-else statement introduced
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            out.println("This if branch is unreachable.");
        } else {
            out.println("This else branch is also unreachable.");
        }
    }
    
    private boolean getUnreachableCondition() {
        return false; // This method always returns false, making the if-else unreachable
    }
}