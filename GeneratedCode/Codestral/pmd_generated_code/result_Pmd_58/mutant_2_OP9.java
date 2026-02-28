import java.util.logging.Logger;

class BuggyClass {
    Logger log1 = Logger.getLogger(BuggyClass.class.getName()); // BUG: MoreThanOneLogger
    Logger log2 = Logger.getLogger(BuggyClass.class.getName()); // BUG: MoreThanOneLogger
    Logger log3 = Logger.getLogger(BuggyClass.class.getName()); // Mutated: MoreThanOneLogger

    public void showBug() {
        log1.info("This is a log from log1");
        log2.info("This is a log from log2");
        log3.info("This is a log from log3"); // Mutated: MoreThanOneLogger
    }
}