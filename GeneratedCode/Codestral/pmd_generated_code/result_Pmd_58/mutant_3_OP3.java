import java.util.logging.Logger;

class BuggyClass {
    Logger log1 = Logger.getLogger(BuggyClass.class.getName());
    Logger log2 = Logger.getLogger(BuggyClass.class.getName());

    private boolean getUnreachableCondition() {
        return false;
    }

    public void showBug() {
        log1.info("This is a log from log1");
        if (getUnreachableCondition()) { // Unreachable if statement mutant
            System.out.println("This is an unreachable block of code.");
        }
        log2.info("This is a log from log2");
    }
}