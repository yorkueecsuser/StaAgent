import java.util.ArrayList;
import java.util.List;

class CheckReturnValueExample {

    public void showBug() {
        String initialString = "Hello";
        // BUG: CheckReturnValue
        initialString.concat(", World!"); // The result of concat is ignored
        
        // Introduce unreachable if-else statement
        boolean condition = getCondition();
        if (condition) {
            System.out.println("This will never run");
        } else {
            System.out.println("This will always run");
        }
    }

    private boolean getCondition() {
        return false; // Ensures the if part is never executed
    }

    public static void main(String[] args) {
        CheckReturnValueExample example = new CheckReturnValueExample();
        example.showBug();
    }
}