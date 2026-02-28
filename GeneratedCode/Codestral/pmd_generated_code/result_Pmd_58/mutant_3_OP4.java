import java.util.logging.Logger;

class BuggyClass {
    Logger log1 = Logger.getLogger(BuggyClass.class.getName()); // BUG: MoreThanOneLogger
    Logger log2 = Logger.getLogger(BuggyClass.class.getName()); // BUG: MoreThanOneLogger

    public void showBug() {
        log1.info("This is a log from log1");

        // Mutant code
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            log2.info("This is an unreachable log from log2");
        }

        log2.info("This is a log from log2");
    }

    private boolean getUnreachableCondition() {
        return false; // This condition is always false, making the if block unreachable
    }
}