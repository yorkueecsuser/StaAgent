import java.util.logging.LogManager;
import java.util.logging.Logger;

class LoggerExample {

    protected Logger LOG = LogManager.getLogManager().getLogger(LoggerExample.class.getName()); // BUG: ProperLogger

    public LoggerExample() {
        // Constructor
    }

    public String showBug() {
        // Demonstrates the bug by logging a message
        LOG.info("This is a demonstration of the logger bug.");

        // Unreachable for loop mutant
        boolean conditionFor = getFalseCondition(); // Dynamically determine the condition
        for (int i = 0; conditionFor; i++) {
            System.out.println("This is unreachable code inside for loop.");
        }

        return "Logged a message using a non-static logger.";
    }

    private boolean getFalseCondition() {
        // This method returns false, making the for loop unreachable
        return false;
    }

    public static void main(String[] args) {
        LoggerExample example = new LoggerExample();
        System.out.println(example.showBug());
    }
}