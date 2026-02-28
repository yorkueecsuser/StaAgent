import java.util.logging.Logger;

class BuggyClass {
    Logger log1 = Logger.getLogger(BuggyClass.class.getName()); // BUG: MoreThanOneLogger
    Logger log2 = Logger.getLogger(BuggyClass.class.getName()); // BUG: MoreThanOneLogger

    public void showBug() {
        log1.info("This is a log from log1");

        // Mutant: Unreachable while loop
        boolean conditionWhile = false;
        while (conditionWhile) {
            // This code will never be executed
            System.out.println("This is an unreachable while loop");
        }

        log2.info("This is a log from log2");
    }
}