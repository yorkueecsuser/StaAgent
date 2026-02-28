import java.text.MessageFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

class PrintfBug {

    private boolean isFalse() {
        return false;
    }

    public void showBug1() {
        // Added unreachable while loop
        while (isFalse()) {
            // This can never be executed
        }
        // BUG: Printf-style format strings should not lead to unexpected behavior at runtime
        String.format("The value of my integer is %d", "Hello World");
    }

    // Remaining methods remain unchanged for brevity

    //...
}