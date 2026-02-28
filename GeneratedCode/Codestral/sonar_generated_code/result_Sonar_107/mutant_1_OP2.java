import java.text.MessageFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

class PrintfBug {

    public void showBug1() {
        // No assignment statements without method invocations
        String.format("The value of my integer is %d", "Hello World");
    }

    public void showBug2() {
        // No assignment statements without method invocations
        String.format("Not enough arguments %d and %d", 1);
    }

    public void showBug3() {
        // No assignment statements without method invocations
        MessageFormat.format("Result {1}.", "value");
    }

    public void showBug4() {
        // No assignment statements without method invocations
        Logger logger = Logger.getLogger(PrintfBug.class.getName());
        logger.log(Level.SEVERE, "Result {1}!", 14);
    }
}