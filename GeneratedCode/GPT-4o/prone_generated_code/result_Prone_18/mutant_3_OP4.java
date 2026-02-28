import java.util.ArrayList;
import java.util.List;

class CheckReturnValueExample {

    public void showBug() {
        String initialString = "Hello";
        // BUG: CheckReturnValue
        initialString.concat(", World!"); // The result of concat is ignored

        // Introduce an unreachable if-else statement as per the mutation operator
        boolean condition = getFalseCondition();
        if (condition) {
            System.out.println("This code is unreachable.");
        } else {
            System.out.println("This is the else branch.");
        }
    }

    private boolean getFalseCondition() {
        return false;
    }

    public static void main(String[] args) {
        CheckReturnValueExample example = new CheckReturnValueExample();
        example.showBug();
    }
}