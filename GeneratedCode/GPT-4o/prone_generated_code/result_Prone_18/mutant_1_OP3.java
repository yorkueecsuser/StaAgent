import java.util.ArrayList;
import java.util.List;

class CheckReturnValueExample {

    // Method to provide a runtime condition for the unreachable if statement
    private boolean getCondition() {
        return false;
    }

    public void showBug() {
        String initialString = "Hello";
        // BUG: CheckReturnValue
        initialString.concat(", World!"); // The result of concat is ignored

        // Unreachable if statement inserted
        boolean condition = getCondition(); // Condition evaluated at runtime
        if (condition) {
            System.out.println("This block is unreachable.");
        }
    }

    public static void main(String[] args) {
        CheckReturnValueExample example = new CheckReturnValueExample();
        example.showBug();
    }
}