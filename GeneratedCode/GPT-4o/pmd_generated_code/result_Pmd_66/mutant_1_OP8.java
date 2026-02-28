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

// Mutant code
class LoggerExampleMutant {

    protected Logger x = LogManager.getLogManager().getLogger(LoggerExampleMutant.class.getName()); // Renamed variable

    public LoggerExampleMutant() {
        // Constructor
    }

    public String showBug() {
        // Demonstrates the bug by logging a message
        x.info("This is a demonstration of the logger bug with a renamed variable.");
        return "Logged a message using a renamed variable logger.";
    }

    public static void main(String[] args) {
        LoggerExampleMutant exampleMutant = new LoggerExampleMutant();
        System.out.println(exampleMutant.showBug());
    }
}