import java.util.logging.Logger;

class BuggyClass {
    Logger log1 = Logger.getLogger(BuggyClass.class.getName()); // BUG: MoreThanOneLogger
    Logger log2 = Logger.getLogger(BuggyClass.class.getName()); // BUG: MoreThanOneLogger

    // Added unreachable switch statement
    private int getUnreachableValue() {
        return -1;
    }

    public void showBug() {
        log1.info("This is a log from log1");

        int value = getUnreachableValue();
        switch(value) {
            case 1:
                System.out.println("This is an unreachable statement");
                break;
        }

        log2.info("This is a log from log2");
    }
}