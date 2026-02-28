import java.text.MessageFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

class PrintfBug {

    private boolean getFalseCondition() {
        return false;
    }

    public void showBug1() {
        // BUG: Printf-style format strings should not lead to unexpected behavior at runtime
        String.format("The value of my integer is %d", "Hello World");

        // Inserted unreachable while loop
        boolean condition = getFalseCondition();
        while (condition) {
            // This code will never be executed
        }
    }

    public void showBug2() {
        // BUG: Printf-style format strings should not lead to unexpected behavior at runtime
        String.format("Not enough arguments %d and %d", 1);

        // Inserted unreachable while loop
        while (getFalseCondition()) {
            // This code will never be executed
        }
    }

    public void showBug3() {
        // BUG: Printf-style format strings should not lead to unexpected behavior at runtime
        MessageFormat.format("Result {1}.", "value");

        // Inserted unreachable while loop
        while (getFalseCondition()) {
            // This code will never be executed
        }
    }

    public void showBug4() {
        // BUG: Printf-style format strings should not lead to unexpected behavior at runtime
        Logger logger = Logger.getLogger(PrintfBug.class.getName());
        logger.log(Level.SEVERE, "Result {1}!", 14);

        // Inserted unreachable while loop
        while (getFalseCondition()) {
            // This code will never be executed
        }
    }
}