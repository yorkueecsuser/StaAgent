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

        // Adding unreachable if-else statement
        boolean condition = getUnreachableCondition();
        if (condition) {
            System.out.println("This block will never execute");
        } else {
            System.out.println("This block will always execute");
        }
    }

    // A method to ensure the condition can be dynamically determined
    private boolean getUnreachableCondition() {
        // This always returns false, ensuring the if-statement is never true
        return false;
    }

    public static void main(String[] args) {
        UnsupportedOperationExample example = new UnsupportedOperationExample();
        example.showBug();
    }
}