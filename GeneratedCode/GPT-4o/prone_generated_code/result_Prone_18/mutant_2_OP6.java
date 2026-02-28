import java.util.ArrayList;
import java.util.List;

class CheckReturnValueExample {

    public void showBug() {
        String initialString = "Hello";
        // BUG: CheckReturnValue
        initialString.concat(", World!"); // The result of concat is ignored

        // Adding unreachable for loop based on mutation operator
        boolean conditionForLoop = getCondition();
        for (int i = 0; conditionForLoop; i++) {
            System.out.println("This loop is unreachable.");
        }
    }

    // Method to simulate a condition that always returns false for the unreachable loop
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        CheckReturnValueExample example = new CheckReturnValueExample();
        example.showBug();
    }
}