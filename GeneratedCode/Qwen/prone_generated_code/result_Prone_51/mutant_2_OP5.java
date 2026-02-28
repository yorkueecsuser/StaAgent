import java.util.logging.Logger;

class LoggerExample {
    private static final Logger logger = Logger.getLogger(LoggerExample.class.getName());

    public String showBug(String message, Object... args) {
        // BUG: FloggerLogVarargs
        logger.info(String.format(message, args));
        return String.format(message, args);

        // Unreachable switch statement
        boolean condition = getCondition();
        switch (condition? 0 : 1) {
            case 0:
                // This case will never be executed because condition is always false
                logger.warning("This is an unreachable warning log.");
                break;
            case 1:
                // This case will always be executed
                logger.info("This is an info log.");
                break;
        }
    }

    private boolean getCondition() {
        // This method returns false, making the switch condition always false
        return false;
    }

    public static void main(String[] args) {
        LoggerExample example = new LoggerExample();
        example.showBug("User %s logged in with IP %s", "Alice", "192.168.1.1");
    }
}