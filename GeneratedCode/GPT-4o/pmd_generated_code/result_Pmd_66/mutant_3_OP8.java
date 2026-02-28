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

// Mutated version of LoggerExample with renamed variable
class MutantLoggerExample {

    protected Logger a = LogManager.getLogManager().getLogger(MutantLoggerExample.class.getName()); // BUG: ProperLogger

    public MutantLoggerExample() {
        // Constructor
    }

    public String showBug() {
        // Demonstrates the bug by logging a message
        a.info("This is a demonstration of the logger bug.");
        return "Logged a message using a non-static logger.";
    }

    public static void main(String[] args) {
        MutantLoggerExample example = new MutantLoggerExample();
        System.out.println(example.showBug());
    }
}