import java.text.MessageFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

class PrintfBug {

    private boolean getCondition() {
        return false; // This method will always return false
    }

    public void showBug1() {
        String.format("The value of my integer is %d", "Hello World");
        if (getCondition()) { // Unreachable if-else statement
            System.out.println("This line will never be executed");
        }
    }

    public void showBug2() {
        String.format("Not enough arguments %d and %d", 1);
        if (getCondition()) { // Unreachable if-else statement
            System.out.println("This line will never be executed");
        }
    }

    public void showBug3() {
        MessageFormat.format("Result {1}.", "value");
        if (getCondition()) { // Unreachable if-else statement
            System.out.println("This line will never be executed");
        }
    }

    public void showBug4() {
        Logger logger = Logger.getLogger(PrintfBug.class.getName());
        logger.log(Level.SEVERE, "Result {1}!", 14);
        if (getCondition()) { // Unreachable if-else statement
            System.out.println("This line will never be executed");
        }
    }
}