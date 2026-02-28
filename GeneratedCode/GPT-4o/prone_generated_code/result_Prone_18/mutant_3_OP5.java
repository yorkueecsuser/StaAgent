import java.util.ArrayList;
import java.util.List;

class CheckReturnValueExample {

    public void showBug() {
        String initialString = "Hello";
        // BUG: CheckReturnValue
        initialString.concat(", World!"); // The result of concat is ignored

        // Unreachable switch statement
        int unreachableValue = getDynamicValue();
        switch (unreachableValue) {
            case 1:
                System.out.println("This is unreachable code block.");
                break;
            default:
                break;
        }
    }

    private int getDynamicValue() {
        return 0; // This method can be dynamically adjusted to ensure the switch remains unreachable
    }

    public static void main(String[] args) {
        CheckReturnValueExample example = new CheckReturnValueExample();
        example.showBug();
    }
}