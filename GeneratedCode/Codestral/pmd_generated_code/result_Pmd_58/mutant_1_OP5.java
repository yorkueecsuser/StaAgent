import java.util.logging.Logger;

class BuggyClass {
    Logger log1 = Logger.getLogger(BuggyClass.class.getName());
    Logger log2 = Logger.getLogger(BuggyClass.class.getName());

    private boolean getFalseCondition() {
        return false;
    }

    public void showBug() {
        log1.info("This is a log from log1");

        // Mutant code: Unreachable switch statement
        int value = 0;
        boolean condition = getFalseCondition();
        if (condition) {
            switch (value) {
                case 1:
                    log2.info("This is an unreachable log from log2");
                    break;
            }
        }
        log2.info("This is a log from log2");
    }
}