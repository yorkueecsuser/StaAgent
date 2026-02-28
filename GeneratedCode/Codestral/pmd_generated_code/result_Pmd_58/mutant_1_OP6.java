import java.util.logging.Logger;

class BuggyClass {
    Logger log1 = Logger.getLogger(BuggyClass.class.getName());
    Logger log2 = Logger.getLogger(BuggyClass.class.getName());

    public void showBug() {
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // Unreachable code starts here
            log1.info("This is a log from log1");
            log2.info("This is a log from log2");
            // Unreachable code ends here
        }
    }

    private boolean getCondition() {
        return false;
    }
}