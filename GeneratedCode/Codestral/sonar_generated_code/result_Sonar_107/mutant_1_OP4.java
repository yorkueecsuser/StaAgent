import java.text.MessageFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

class PrintfBug {

    public void showBug1() {
        // Original code
        String.format("The value of my integer is %d", "Hello World");

        // Mutated code
        if (getFalseCondition()) {
            System.out.println("This code is unreachable");
        } else {
            System.out.println("This code is reachable");
        }
    }

    public void showBug2() {
        // Original code
        String.format("Not enough arguments %d and %d", 1);

        // Mutated code
        if (getFalseCondition()) {
            System.out.println("This code is unreachable");
        }
    }

    public void showBug3() {
        // Original code
        MessageFormat.format("Result {1}.", "value");

        // Mutated code
        boolean shouldRun = getFalseCondition();
        if (shouldRun) {
            System.out.println("This code is unreachable");
        } else {
            System.out.println("This code is reachable");
        }
    }

    public void showBug4() {
        // Original code
        Logger logger = Logger.getLogger(PrintfBug.class.getName());
        logger.log(Level.SEVERE, "Result {1}!", 14);

        // Mutated code
        while (getFalseCondition()) {
            System.out.println("This code is unreachable");
        }
    }

    private boolean getFalseCondition() {
        return false;
    }
}