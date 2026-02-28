import java.util.logging.Logger;

class LoggerExample {
    private static final Logger logger = Logger.getLogger(LoggerExample.class.getName());

    public String showBug(String message, Object... args) {
        // BUG: FloggerLogVarargs
        logger.info(String.format(message, args));
        return String.format(message, args);
    }

    // Mutated code with renaming operator
    public String showBug(String msg, Object... params) {
        // BUG: FloggerLogVarargs
        logger.info(String.format(msg, params));
        return String.format(msg, params);
    }

    public static void main(String[] args) {
        LoggerExample example = new LoggerExample();
        example.showBug("User %s logged in with IP %s", "Alice", "192.168.1.1");
        
        // Mutated call to the renamed method
        example.showBug("User %s logged in with IP %s", "Bob", "10.0.0.1");
    }
}