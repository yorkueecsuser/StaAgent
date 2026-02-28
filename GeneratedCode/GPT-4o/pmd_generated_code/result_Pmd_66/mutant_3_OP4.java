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
        
        // Unreachable if-else branch added
        boolean condition = getCondition();
        if (condition) {
            LOG.info("This branch will never execute.");
        } else {
            LOG.info("This else branch is always executed.");
        }
        
        return "Logged a message using a non-static logger.";
    }
    
    // Helper method to simulate unreachable condition
    private boolean getCondition() {
        return false; // Ensures the if branch is never taken
    }

    public static void main(String[] args) {
        LoggerExample example = new LoggerExample();
        System.out.println(example.showBug());
    }
}