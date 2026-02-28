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
        boolean conditionFor = getFalseCondition(); // Method to dynamically determine condition
        for (int i = 0; conditionFor; i++) {
            // This block is designed to be unreachable
            out.println("This should never be printed");
        }
    }
    
    // Helper method to return a false condition
    private boolean getFalseCondition() {
        return false;
    }
}