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
        
        // Mutant: Unreachable if statement
        boolean condition = getCondition();
        if (condition) {
            LOG.info("This log will never be reached.");
        }
        
        return "Logged a message using a non-static logger.";
    }

    private boolean getCondition() {
        // This method returns false to ensure the if statement is unreachable
        return false;
    }

    public static void main(String[] args) {
        LoggerExample example = new LoggerExample();
        System.out.println(example.showBug());
    }
}