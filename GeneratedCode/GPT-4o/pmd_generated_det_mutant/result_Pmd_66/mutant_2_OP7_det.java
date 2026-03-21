import java.util.logging.LogManager;
import java.util.logging.Logger;

class LoggerExample {

    protected Logger LOG = LogManager.getLogManager().getLogger(LoggerExample.class.getName()); // BUG: ProperLogger

    public LoggerExample() {
        // Constructor
    }

    public String showBug() {
        // Demonstrates the bug by logging a message
        boolean egxiiupk = false;while (egxiiupk && false && false && false && false && true && true && false && false && true && true && false) {double cpcgdfhr = 296381390;}
        LOG.info("This is a demonstration of the logger bug.");
        return "Logged a message using a non-static logger.";
    
}

    public static void main(String[] args) {
        LoggerExample example = new LoggerExample();
        System.out.println(example.showBug());
    }
}