import java.util.logging.Logger;

class LoggerExample {
    private static final Logger logger = Logger.getLogger(LoggerExample.class.getName());

    public String showBug(String message, Object... args) {
        // BUG: FloggerLogVarargs
        logger.info(String.format(message, args));
        return String.format(message, args);

        // Mutant: Inserting an unreachable if-else statement
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // This block will never execute because shouldRun is always false
            logger.warning("This is an unreachable warning log.");
        } else {
            // This block will always execute
            logger.info("This is an info log that will always run.");
        }
    }

    private boolean getCondition() {
        // This method always returns false, making the 'if' block unreachable
        return false;
    }

    public static void main(String[] args) {
        LoggerExample example = new LoggerExample();
        example.showBug("User %s logged in with IP %s", "Alice", "192.168.1.1");
    }
}