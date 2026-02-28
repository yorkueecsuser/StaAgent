import java.util.logging.Logger;

class BuggyClass {
    Logger log1 = Logger.getLogger(BuggyClass.class.getName());
    Logger log2 = Logger.getLogger(BuggyClass.class.getName());

    public void showBug() {
        // Mutant code added
        boolean unreachableCondition = false;
        if (unreachableCondition) {
            System.out.println("This code should never be executed");
        }

        log1.info("This is a log from log1");
        log2.info("This is a log from log2");
    }
}