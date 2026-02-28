import java.util.ArrayList;
import java.util.List;

class CheckReturnValueExample {

    public void showBug() {
        String initialString = "Hello";
        // BUG: CheckReturnValue
        initialString.concat(", World!"); // The result of concat is ignored

        // Unreachable for loop mutation
        boolean runLoop = shouldRunLoop();
        for (int i = 0; runLoop; i++) {
            System.out.println("This will never be printed.");
        }
    }

    public static boolean shouldRunLoop() {
        return false;
    }

    public static void main(String[] args) {
        CheckReturnValueExample example = new CheckReturnValueExample();
        example.showBug();
    }
}