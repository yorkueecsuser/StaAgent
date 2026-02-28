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
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This block is never reached
            System.out.println("Unreachable code inside while loop.");
        }
        
        return "Logged a message using a non-static logger.";
    }

    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        LoggerExample example = new LoggerExample();
        System.out.println(example.showBug());
    }
}