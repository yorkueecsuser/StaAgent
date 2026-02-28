import java.util.ArrayList;
import java.util.List;

class CheckReturnValueExample {

    private boolean getCondition() {
        return false;
    }

    public void showBug() {
        String initialString = "Hello";
        // BUG: CheckReturnValue
        initialString.concat(", World!"); // The result of concat is ignored
        
        // Inserting unreachable if branch using a method call
        if (getCondition()) {
            System.out.println("This branch is unreachable.");
        }
    }

    public static void main(String[] args) {
        CheckReturnValueExample example = new CheckReturnValueExample();
        example.showBug();
    }
}