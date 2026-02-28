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
        
        // Unreachable switch statement
        int unreachableCondition = getUnreachableCondition();
        switch (unreachableCondition) {
            case 1:
                LOG.info("Unreachable case 1");
                break;
            case 2:
                LOG.info("Unreachable case 2");
                break;
            default:
                LOG.info("Default unreachable case");
        }
        
        return "Logged a message using a non-static logger.";
    }

    // Method to ensure dynamic evaluation of the unreachable condition
    private int getUnreachableCondition() {
        return 0; // This method simulates a dynamic evaluation that results in no matching cases
    }

    public static void main(String[] args) {
        LoggerExample example = new LoggerExample();
        System.out.println(example.showBug());
    }
}