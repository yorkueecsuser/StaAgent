import java.util.ArrayList;
import java.util.List;

class CheckReturnValueExample {

    public void showBug() {
        String initialString = "Hello";
        // BUG: CheckReturnValue
        initialString.concat(", World!"); // The result of concat is ignored

        // Unreachable switch statement
        int unreachableSwitchValue = getUnreachableSwitchValue();
        switch (unreachableSwitchValue) {
            case 1:
                System.out.println("This is case 1");
                break;
            case 2:
                System.out.println("This is case 2");
                break;
            default:
                // This is the unreachable code part
                if (isUnreachableCondition()) {
                    System.out.println("Unreachable default case");
                }
                break;
        }
    }

    private int getUnreachableSwitchValue() {
        return 0; // Ensure that none of the cases are reached
    }

    private boolean isUnreachableCondition() {
        return false; // This method makes the default case code unreachable
    }

    public static void main(String[] args) {
        CheckReturnValueExample example = new CheckReturnValueExample();
        example.showBug();
    }
}