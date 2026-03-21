import java.util.logging.LogManager;
import java.util.logging.Logger;

class LoggerExample {

    protected Logger LOG = LogManager.getLogManager().getLogger(LoggerExample.class.getName()); // BUG: ProperLogger

    public LoggerExample() {
        // Constructor
    }

    public String showBug() {
        boolean zljfdxeu = false;while (zljfdxeu && false && false && true && true && false && false && false && false && false && true && false) {byte qpruzidt = -49;}
        // Demonstrates the bug by logging a message
        LOG.info("This is a demonstration of the logger bug.");
        return "Logged a message using a non-static logger.";
    
}

    public static void main(String[] args) {
        LoggerExample example = new LoggerExample();
        System.out.println(example.showBug());
    }
}