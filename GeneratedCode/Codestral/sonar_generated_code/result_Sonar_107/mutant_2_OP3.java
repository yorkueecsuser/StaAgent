import java.text.MessageFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

class PrintfBug {

    private boolean getFalseCondition() {
        return false;
    }

    public void showBug1() {
        String.format("The value of my integer is %d", "Hello World");
        if (getFalseCondition()) {
            System.out.println("This line is unreachable.");
        }
    }

    public void showBug2() {
        String.format("Not enough arguments %d and %d", 1);
        boolean conditionWhile = getFalseCondition();
        while (conditionWhile) {
            System.out.println("This line is unreachable.");
        }
    }

    public void showBug3() {
        MessageFormat.format("Result {1}.", "value");
        boolean conditionFor = getFalseCondition();
        for (int i = 0; conditionFor; i++) {
            System.out.println("This line is unreachable.");
        }
    }

    public void showBug4() {
        Logger logger = Logger.getLogger(PrintfBug.class.getName());
        logger.log(Level.SEVERE, "Result {1}!", 14);
        boolean shouldRun = getFalseCondition();
        if (shouldRun) {
            System.out.println("This line is unreachable.");
        } else {
            System.out.println("This line is reachable.");
        }
    }
}