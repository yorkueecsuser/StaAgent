import java.text.MessageFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

class PrintfBug {

    public void showBug1() {
        String value = "Hello World";
        String.format("The value of my integer is %d", value);
        String.format("The value of my integer is %d", value); // Duplicated statement
    }

    public void showBug2() {
        String.format("Not enough arguments %d and %d", 1);
    }

    public void showBug3() {
        MessageFormat.format("Result {1}.", "value");
    }

    public void showBug4() {
        Logger logger = Logger.getLogger(PrintfBug.class.getName());
        logger.log(Level.SEVERE, "Result {1}!", 14);
    }
}