import java.util.logging.Logger;

class BuggyClass {
    Logger log1 = Logger.getLogger(BuggyClass.class.getName()); // BUG: MoreThanOneLogger
    Logger log2 = Logger.getLogger(BuggyClass.class.getName()); // BUG: MoreThanOneLogger

    public void showBug() {
        log1.info("This is a log from log1");

        // Mutant: Unreachable for loop inserted
        boolean shouldRun = false;
        for (int i = 0; shouldRun; i++) {
            System.out.println("This line should never be printed");
        }

        log2.info("This is a log from log2");
    }
}