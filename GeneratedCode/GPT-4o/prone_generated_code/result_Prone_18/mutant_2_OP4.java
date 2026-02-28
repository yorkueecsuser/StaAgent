import java.util.ArrayList;
import java.util.List;

class CheckReturnValueExample {

    public void showBug() {
        String initialString = "Hello";
        // BUG: CheckReturnValue
        initialString.concat(", World!"); // The result of concat is ignored

        // Inserting an unreachable if-else statement
        boolean condition = getCondition(); // This method can return true or false
        if (condition) {
            // This branch is potentially reachable, but logically designed to be false
            // However, it should never run based on the mutation operator's intention
            System.out.println("Unreachable code");
        } else {
            // Normal execution continues here
        }
    }

    // Method that returns a boolean value
    public boolean getCondition() {
        return false; // Designed for mutation purposes
    }

    public static void main(String[] args) {
        CheckReturnValueExample example = new CheckReturnValueExample();
        example.showBug();
    }
}