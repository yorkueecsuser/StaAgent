import java.util.logging.LogManager;
import java.util.logging.Logger;

class LoggerExample {

    protected Logger LOG = LogManager.getLogManager().getLogger(LoggerExample.class.getName()); // BUG: ProperLogger

    public LoggerExample() {
        // Constructor
    }

    // Method to get a condition that always results in false for demonstration
    private boolean getUnreachableCondition() {
        return false && System.currentTimeMillis() < 0; // Always false due to logical AND
    }

    public String showBug() {
        // Demonstrates the bug by logging a message
        if (getUnreachableCondition()) {
            // This block is unreachable
            LOG.warning("This is an unreachable log message.");
        }
        LOG.info("This is a demonstration of the logger bug.");
        return "Logged a message using a non-static logger.";
    }

    public static void main(String[] args) {
        LoggerExample example = new LoggerExample();
        System.out.println(example.showBug());
    }
}