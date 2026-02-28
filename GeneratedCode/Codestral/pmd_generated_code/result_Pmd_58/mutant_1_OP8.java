import java.util.logging.Logger;

class BuggyClass {
    Logger log1 = Logger.getLogger(BuggyClass.class.getName()); // Original logger
    Logger a = Logger.getLogger(BuggyClass.class.getName()); // Mutated: Renamed log2 to a

    public void showBug() {
        log1.info("This is a log from log1");
        a.info("This is a log from a"); // Use a instead of log2
    }
}