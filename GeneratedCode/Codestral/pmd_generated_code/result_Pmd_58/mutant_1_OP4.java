import java.util.logging.Logger;

class BuggyClass {
    Logger log1 = Logger.getLogger(BuggyClass.class.getName());
    Logger log2 = Logger.getLogger(BuggyClass.class.getName());

    public void showBug() {
        boolean condition = getCondition();
        if (condition) {
            log1.info("This is a log from log1");
        } else {
            // Unreachable if-else statement
            if (false) {
                log2.info("This is an unreachable log from log2");
            } else {
                log1.info("This is a log from log1 in the unreachable branch");
            }
        }
    }

    private boolean getCondition() {
        // Implement your own condition logic here
        return true;
    }
}