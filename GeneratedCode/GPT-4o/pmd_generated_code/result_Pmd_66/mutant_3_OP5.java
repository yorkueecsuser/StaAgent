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

        // Unreachable switch statement mutant
        int unreachableSwitchValue = getUnreachableValue();
        switch (unreachableSwitchValue) {
            case 1:
                System.out.println("This case will never be executed.");
                break;
            default:
                // No default action
                break;
        }

        return "Logged a message using a non-static logger.";
    }

    private int getUnreachableValue() {
        // This value is set to ensure the switch cases are unreachable.
        // Since it's always 0, case 1 will never be reached.
        return 0;
    }

    public static void main(String[] args) {
        LoggerExample example = new LoggerExample();
        System.out.println(example.showBug());
    }
}