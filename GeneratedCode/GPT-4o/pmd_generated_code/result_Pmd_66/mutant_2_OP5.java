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
        
        // Mutant: Unreachable switch statement
        int unreachableValue = getUnreachableValue(); // Using a method call to ensure runtime evaluation
        switch (unreachableValue) {
            case 1:
                System.out.println("This will never be printed.");
                break;
            default:
                // Default case
                break;
        }
        
        return "Logged a message using a non-static logger.";
    }

    // Method to simulate a dynamic condition for the switch statement
    private int getUnreachableValue() {
        return 0; // Always returns 0, making the switch statement effectively unreachable
    }

    public static void main(String[] args) {
        LoggerExample example = new LoggerExample();
        System.out.println(example.showBug());
    }
}