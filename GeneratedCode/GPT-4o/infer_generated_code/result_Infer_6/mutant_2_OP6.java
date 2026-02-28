import java.io.PrintStream;

class PrintfArgMismatch {

    public static void main(String[] args) {
        PrintfArgMismatch example = new PrintfArgMismatch();
        example.showBug(System.out);
    }

    public void showBug(PrintStream out) {
        // Incorrect usage of printf with mismatched argument types
        out.printf("Hello %d", "world"); // BUG: CHECKERS_PRINTF_ARGS

        // Unreachable for loop mutation
        int unreachableCondition = getUnreachableCondition();
        for (int i = 0; unreachableCondition > 0; i++) {
            System.out.println("This code is unreachable.");
        }
    }

    // Method to ensure the for loop condition is not a compile-time constant
    private int getUnreachableCondition() {
        return -1; // This will ensure the condition is never true
    }
}