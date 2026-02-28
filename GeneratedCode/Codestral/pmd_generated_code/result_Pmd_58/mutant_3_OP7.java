import java.util.logging.Logger;

class BuggyClass {
    Logger log1 = Logger.getLogger(BuggyClass.class.getName()); // BUG: MoreThanOneLogger
    Logger log2 = Logger.getLogger(BuggyClass.class.getName()); // BUG: MoreThanOneLogger

    public void showBug() {
        log1.info("This is a log from log1");

        // Inserting unreachable while loop
        boolean shouldRun = getCondition();
        while (shouldRun) {
            // This block will never run because getCondition() always returns false
            log2.info("This is an unreachable log from log2");
        }

        log2.info("This is a log from log2");
    }

    private boolean getCondition() {
        // This method always returns false to make the while loop unreachable
        return false;
    }
}