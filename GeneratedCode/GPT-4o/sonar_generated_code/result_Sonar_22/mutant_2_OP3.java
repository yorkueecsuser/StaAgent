import java.util.Collections;
import java.util.List;

class UnsupportedOperationExample {
    
    public void showBug() {
        List<String> immutableList = Collections.emptyList();
        try {
            immutableList.add("This will cause an exception"); // BUG: Unsupported methods should not be called on some collection implementations
        } catch (UnsupportedOperationException e) {
            System.out.println("Caught an UnsupportedOperationException: " + e.getMessage());
        }

        // Mutant: Unreachable if statement
        boolean condition = getFalseCondition();
        if (condition) {
            System.out.println("This statement is unreachable because the condition is always false.");
        }
    }

    public static void main(String[] args) {
        UnsupportedOperationExample example = new UnsupportedOperationExample();
        example.showBug();
    }

    // Helper method to simulate a false condition
    private boolean getFalseCondition() {
        return false; // This makes the if statement conditionally false at runtime.
    }
}