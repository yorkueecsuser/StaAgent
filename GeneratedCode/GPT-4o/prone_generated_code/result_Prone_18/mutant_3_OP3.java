import java.util.ArrayList;
import java.util.List;

class CheckReturnValueExample {

    public void showBug() {
        String initialString = "Hello";
        // BUG: CheckReturnValue
        initialString.concat(", World!"); // The result of concat is ignored

        // Unreachable if statement mutant
        boolean condition = getFalseCondition();
        if (condition) {
            System.out.println("This is an unreachable statement.");
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