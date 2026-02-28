import java.text.MessageFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

class PrintfBug {

    private boolean getUnreachableCondition() {
        return false;
    }

    public void showBug1() {
        if (getUnreachableCondition()) {
            String.format("The value of my integer is %d", "Hello World");
        }
    }

    public void showBug2() {
        if (getUnreachableCondition()) {
            String.format("Not enough arguments %d and %d", 1);
        }
    }

    public void showBug3() {
        if (getUnreachableCondition()) {
            MessageFormat.format("Result {1}.", "value");
        }
    }

    public void showBug4() {
        if (getUnreachableCondition()) {
            Logger logger = Logger.getLogger(PrintfBug.class.getName());
            logger.log(Level.SEVERE, "Result {1}!", 14);
        }
    }
}