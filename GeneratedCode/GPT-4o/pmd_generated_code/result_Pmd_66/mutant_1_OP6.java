import java.util.logging.LogManager;
import java.util.logging.Logger;

class LoggerExample {

    protected Logger LOG = LogManager.getLogManager().getLogger(LoggerExample.class.getName()); // BUG: ProperLogger

    public LoggerExample() {
        // Constructor
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // Unreachable for loop
            System.out.println("This loop is unreachable due to its false condition.");
        }
    }

    public String showBug() {
        // Demonstrates the bug by logging a message
        LOG.info("This is a demonstration of the logger bug.");
        return "Logged a message using a non-static logger.";
    }

    private boolean getCondition() {
        // Always returns false, making the loop condition false at runtime
        return false;
    }

    public static void main(String[] args) {
        LoggerExample example = new LoggerExample();
        System.out.println(example.showBug());
    }
}