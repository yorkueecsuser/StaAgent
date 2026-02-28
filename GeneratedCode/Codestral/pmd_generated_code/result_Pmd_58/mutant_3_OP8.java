import java.util.logging.Logger;

class BuggyClass {
    Logger log1 = Logger.getLogger(BuggyClass.class.getName()); // BUG: MoreThanOneLogger
    Logger log2 = Logger.getLogger(BuggyClass.class.getName()); // BUG: MoreThanOneLogger
    Logger a = log2; // Mutant: Renamed log2 to a

    public void showBug() {
        log1.info("This is a log from log1");
        a.info("This is a log from a");
    }
}