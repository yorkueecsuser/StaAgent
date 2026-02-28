import java.util.logging.Logger;

class LoggerExample {
    private static final Logger logger = Logger.getLogger(LoggerExample.class.getName());

    public String showBug(String message, Object... args) {
        // BUG: FloggerLogVarargs
        logger.info(String.format(message, args));
        return String.format(message, args);

        // Introduced unreachable while loop according to mutation operator
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This loop is unreachable because getCondition() always returns false
            logger.warning("This is an unreachable warning log.");
        }
    }

    public static void main(String[] args) {
        LoggerExample example = new LoggerExample();
        example.showBug("User %s logged in with IP %s", "Alice", "192.168.1.1");
    }

    // Method to provide a dynamic condition that is always false
    private boolean getCondition() {
        return false;
    }
}