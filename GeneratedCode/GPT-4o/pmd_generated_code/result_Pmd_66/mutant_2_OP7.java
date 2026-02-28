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
        
        // Unreachable while loop mutation
        boolean conditionWhile = determineCondition();
        while (conditionWhile) {
            // This code block is unreachable
            System.out.println("This will never be printed.");
        }

        return "Logged a message using a non-static logger.";
    }

    private boolean determineCondition() {
        // Returns false to ensure the while loop is unreachable
        return false;
    }

    public static void main(String[] args) {
        LoggerExample example = new LoggerExample();
        System.out.println(example.showBug());
    }
}