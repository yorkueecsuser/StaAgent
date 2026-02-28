import java.text.MessageFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

class PrintfBug {

    public void showBug1() {
        addUnreachableLoop();
        String.format("The value of my integer is %d", "Hello World");
    }

    public void showBug2() {
        addUnreachableLoop();
        String.format("Not enough arguments %d and %d", 1);
    }

    public void showBug3() {
        addUnreachableLoop();
        MessageFormat.format("Result {1}.", "value");
    }

    public void showBug4() {
        addUnreachableLoop();
        Logger logger = Logger.getLogger(PrintfBug.class.getName());
        logger.log(Level.SEVERE, "Result {1}!", 14);
    }

    private boolean getUnreachableCondition() {
        return false;
    }

    private void addUnreachableLoop() {
        boolean conditionFor = getUnreachableCondition();
        for (int i = 0; conditionFor; i++) {
            System.out.println("This is an unreachable loop.");
        }
    }
}