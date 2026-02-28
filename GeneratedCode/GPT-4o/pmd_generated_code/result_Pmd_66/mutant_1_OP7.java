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
        
        // Mutation: Inserted unreachable while loop
        boolean conditionWhile = getFalseCondition(); // Method to return false
        while (conditionWhile) {
            // This block is unreachable
            LOG.warning("This log is part of an unreachable block.");
        }

        return "Logged a message using a non-static logger.";
    }

    public static void main(String[] args) {
        LoggerExample example = new LoggerExample();
        System.out.println(example.showBug());
    }

    // Helper method to return a false condition for while loop
    private boolean getFalseCondition() {
        return false;
    }
}