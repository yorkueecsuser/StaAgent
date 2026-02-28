import java.util.logging.Logger;

class LoggerExample {
    private static final Logger logger = Logger.getLogger(LoggerExample.class.getName());

    public String showBug(String message, Object... args) {
        // BUG: FloggerLogVarargs
        logger.info(String.format(message, args));
        return String.format(message, args);

        // Introduced unreachable if-else statement
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // This block will never execute because shouldRun is always false
            logger.warning("This is an unreachable warning message.");
        } else {
            // This block will also never execute because shouldRun is always false
            logger.severe("This is another unreachable severe message.");
        }
    }

    private boolean getCondition() {
        // Always returns false to ensure the if-else block is unreachable
        return false;
    }

    public static void main(String[] args) {
        LoggerExample example = new LoggerExample();
        example.showBug("User %s logged in with IP %s", "Alice", "192.168.1.1");
    }
}