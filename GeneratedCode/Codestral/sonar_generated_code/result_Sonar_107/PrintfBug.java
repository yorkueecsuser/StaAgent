import java.text.MessageFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

class PrintfBug {

    private boolean getFalseCondition() {
        return false; // Method call to provide a false condition dynamically at runtime
    }

    public void showBug1() {
        String.format("The value of my integer is %d", "Hello World");
        // Mutation: Insert unreachable while loop
        while (getFalseCondition()) {
            // This code is unreachable
            System.out.println("Unreachable code block");
        }
    }

    public void showBug2() {
        String.format("Not enough arguments %d and %d", 1);
        // Mutation: Insert unreachable while loop
        while (getFalseCondition()) {
            // This code is unreachable
            System.out.println("Unreachable code block");
        }
    }

    public void showBug3() {
        MessageFormat.format("Result {1}.", "value");
        // Mutation: Insert unreachable while loop
        while (getFalseCondition()) {
            // This code is unreachable
            System.out.println("Unreachable code block");
        }
    }

    public void showBug4() {
        Logger logger = Logger.getLogger(PrintfBug.class.getName());
        logger.log(Level.SEVERE, "Result {1}!", 14);
        // Mutation: Insert unreachable while loop
        while (getFalseCondition()) {
            // This code is unreachable
            System.out.println("Unreachable code block");
        }
    }
}