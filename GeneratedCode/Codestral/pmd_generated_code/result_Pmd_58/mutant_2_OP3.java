import java.util.logging.Logger;

class BuggyClass {
    Logger log1 = Logger.getLogger(BuggyClass.class.getName());
    Logger log2 = Logger.getLogger(BuggyClass.class.getName());

    public void showBug() {
        log1.info("This is a log from log1");
        boolean unreachableCondition = isUnreachable();
        if (unreachableCondition) {
            System.out.println("This code is unreachable");
        }
        log2.info("This is a log from log2");
    }

    private boolean isUnreachable() {
        return false;
    }
}