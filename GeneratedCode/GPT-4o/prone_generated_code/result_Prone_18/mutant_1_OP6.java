import java.util.ArrayList;
import java.util.List;

class CheckReturnValueExample {

    public void showBug() {
        String initialString = "Hello";
        // BUG: CheckReturnValue
        initialString.concat(", World!"); // The result of concat is ignored

        // Inserted unreachable for loop
        boolean unreachableCondition = getUnreachableCondition(); // Ensures runtime determination
        for (int i = 0; unreachableCondition; i++) {
            System.out.println("This is unreachable");
        }
    }

    private boolean getUnreachableCondition() {
        // This method always returns false to make the loop unreachable
        return false;
    }

    public static void main(String[] args) {
        CheckReturnValueExample example = new CheckReturnValueExample();
        example.showBug();
    }
}