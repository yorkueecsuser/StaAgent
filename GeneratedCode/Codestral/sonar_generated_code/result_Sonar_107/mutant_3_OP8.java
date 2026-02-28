import java.text.MessageFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

class PrintfBug {

    public void showBug1() {
        String.format("The value of my integer is %d", "Hello World");
    }

    public void showBug2() {
        String.format("Not enough arguments %d and %d", 1);
    }

    public void showBug3() {
        MessageFormat.format("Result {1}.", "value");
    }

    public void showBug4() {
        // Mutant code
        Logger l = Logger.getLogger(PrintfBug.class.getName());
        l.log(Level.SEVERE, "Result {1}!", 14);

        // Original code
        Logger logger = Logger.getLogger(PrintfBug.class.getName());
        logger.log(Level.SEVERE, "Result {1}!", 14);
    }
}