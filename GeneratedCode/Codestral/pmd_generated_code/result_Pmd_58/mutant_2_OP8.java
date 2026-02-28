import java.util.logging.Logger;

class BuggyClass {
    Logger log1 = Logger.getLogger(BuggyClass.class.getName());
    Logger log2 = Logger.getLogger(BuggyClass.class.getName());
    Logger a = log1; // Mutant: Renamed log1 to 'a'

    public void showBug() {
        a.info("This is a log from log1"); // Updated usage of 'a'
        log2.info("This is a log from log2");
    }
}