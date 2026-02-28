import java.text.MessageFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

class PrintfBug {

    public void showBug1() {
        // BUG: Printf-style format strings should not lead to unexpected behavior at runtime
        String.format("The value of my integer is %d", "Hello World");

        // Dead store mutation: Unused variable declaration
        int deadStoreVariable = 12345678;
    }

    public void showBug2() {
        // BUG: Printf-style format strings should not lead to unexpected behavior at runtime
        String.format("Not enough arguments %d and %d", 1);
    }

    public void showBug3() {
        // BUG: Printf-style format strings should not lead to unexpected behavior at runtime
        MessageFormat.format("Result {1}.", "value");
    }

    public void showBug4() {
        // BUG: Printf-style format strings should not lead to unexpected behavior at runtime
        Logger logger = Logger.getLogger(PrintfBug.class.getName());
        logger.log(Level.SEVERE, "Result {1}!", 14);
    }
}