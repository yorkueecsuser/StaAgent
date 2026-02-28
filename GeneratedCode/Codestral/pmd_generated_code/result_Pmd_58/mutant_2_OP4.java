import java.util.logging.Logger;

class BuggyClass {
    Logger log1 = Logger.getLogger(BuggyClass.class.getName());
    Logger log2 = Logger.getLogger(BuggyClass.class.getName());

    public void showBug() {
        log1.info("This is a log from log1");
        if (getFalseCondition()) {
            // Unreachable branch
            log2.info("This is an unreachable log from log2");
        } else {
            log2.info("This is a log from log2");
        }
    }

    private boolean getFalseCondition() {
        return false;
    }
}