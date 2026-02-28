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

        // Introduce an unreachable if-else statement
        boolean shouldExecute = getCondition(); // A method that always returns false
        if (shouldExecute) {
            // This block is logically unreachable
            System.out.println("This block is unreachable");
        } else {
            // This block is always executed
            System.out.println("This block is always executed");
        }
    }

    public static boolean getCondition() {
        return false; // Always returns false, making the 'if' block unreachable
    }

    public static void main(String[] args) {
        UnsupportedOperationExample example = new UnsupportedOperationExample();
        example.showBug();
    }
}