import java.util.ArrayList;
import java.util.List;

class CheckReturnValueExample {

    public void showBug() {
        String initialString = "Hello";
        // BUG: CheckReturnValue
        initialString.concat(", World!"); // The result of concat is ignored

        // Unreachable while loop
        boolean isConditionMet = checkCondition();
        while (isConditionMet) {
            System.out.println("This will never be printed");
        }
    }

    // Method to dynamically determine condition at runtime
    private boolean checkCondition() {
        return false;
    }

    public static void main(String[] args) {
        CheckReturnValueExample example = new CheckReturnValueExample();
        example.showBug();
    }
}