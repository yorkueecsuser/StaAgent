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
        
        // Unreachable if statement insertion
        boolean condition = getFalseCondition(); // Using a method to ensure it's not a compile-time constant
        if (condition) {
            LOG.warning("This message will never be logged because the condition is always false.");
        }
        
        return "Logged a message using a non-static logger.";
    }
    
    // Method to return false, ensuring the condition is dynamically determined
    private boolean getFalseCondition() {
        return false;
    }

    public static void main(String[] args) {
        LoggerExample example = new LoggerExample();
        System.out.println(example.showBug());
    }
}