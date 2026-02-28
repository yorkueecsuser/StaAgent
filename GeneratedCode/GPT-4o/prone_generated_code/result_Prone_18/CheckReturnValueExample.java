import java.util.ArrayList;
import java.util.List;

class CheckReturnValueExample {

    public void showBug() {
        String initialString = "Hello";
        // BUG: CheckReturnValue
        initialString.concat(", World!"); // The result of concat is ignored

        // Unreachable while loop mutant
        boolean conditionWhile = getConditionForLoop();
        while (conditionWhile) {
            System.out.println("This is unreachable code within the while loop.");
        }
    }

    private boolean getConditionForLoop() {
        return false; // The condition is always false, making the loop unreachable
    }

    public static void main(String[] args) {
        CheckReturnValueExample example = new CheckReturnValueExample();
        example.showBug();
    }
}