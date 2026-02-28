import java.util.logging.Logger;

class BuggyClass {
    Logger log1 = Logger.getLogger(BuggyClass.class.getName()); // BUG: MoreThanOneLogger
    Logger log2 = Logger.getLogger(BuggyClass.class.getName()); // BUG: MoreThanOneLogger
    Logger log2Duplicate = Logger.getLogger(BuggyClass.class.getName()); // Mutant: Duplicated statement

    public void showBug() {
        log1.info("This is a log from log1");
        log2.info("This is a log from log2");
        log2Duplicate.info("This is a log from log2Duplicate"); // Mutant: Duplicated log statement
    }
}