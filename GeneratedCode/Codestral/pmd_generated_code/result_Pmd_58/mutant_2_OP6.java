import java.util.logging.Logger;

class BuggyClass {
    Logger log1 = Logger.getLogger(BuggyClass.class.getName());
    Logger log2 = Logger.getLogger(BuggyClass.class.getName());

    public void showBug() {
        boolean unreachableCondition = false; // Non-final variable that always returns false
        for (int i = 0; unreachableCondition; i++) { // Unreachable for loop
            // This code will never execute
        }
        log1.info("This is a log from log1");
        log2.info("This is a log from log2");
    }
}