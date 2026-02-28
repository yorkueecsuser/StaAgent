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
        return "Logged a message using a non-static logger.";
    }

    public static void main(String[] args) {
        LoggerExample example = new LoggerExample();
        System.out.println(example.showBug());
    }
}

// Mutated version of the class with a renamed variable
class LoggerExampleMutant {

    protected Logger x = LogManager.getLogManager().getLogger(LoggerExampleMutant.class.getName()); // BUG: ProperLogger

    public LoggerExampleMutant() {
        // Constructor
    }

    public String showBug() {
        // Demonstrates the bug by logging a message
        x.info("This is a demonstration of the logger bug.");
        return "Logged a message using a non-static logger.";
    }

    public static void main(String[] args) {
        LoggerExampleMutant exampleMutant = new LoggerExampleMutant();
        System.out.println(exampleMutant.showBug());
    }
}