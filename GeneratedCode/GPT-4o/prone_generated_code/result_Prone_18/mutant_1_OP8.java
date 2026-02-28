import java.util.ArrayList;
import java.util.List;

class CheckReturnValueExample {

    public void showBug() {
        String initialString = "Hello";
        // BUG: CheckReturnValue
        initialString.concat(", World!"); // The result of concat is ignored
        
        // Mutant: Renaming the variable initialString to a
        String a = "Hello";
        a.concat(", World!"); // The result of concat is ignored
    }

    public static void main(String[] args) {
        CheckReturnValueExample example = new CheckReturnValueExample();
        example.showBug();
    }
}