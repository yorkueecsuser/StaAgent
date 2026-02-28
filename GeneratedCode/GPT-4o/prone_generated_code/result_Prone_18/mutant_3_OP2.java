import java.util.ArrayList;
import java.util.List;

class CheckReturnValueExample {

    public void showBug() {
        String initialString = "Hello";
        // BUG: CheckReturnValue
        initialString.concat(", World!"); // The result of concat is ignored
        
        // Mutant: Duplication of assignment statement
        String duplicateString = "Example String"; // Original assignment statement
        duplicateString = "Example String"; // Duplicate of the above assignment statement
    }

    public static void main(String[] args) {
        CheckReturnValueExample example = new CheckReturnValueExample();
        example.showBug();
    }
}