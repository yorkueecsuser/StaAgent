import java.util.logging.Logger;

class BuggyClass {
    Logger log1 = Logger.getLogger(BuggyClass.class.getName());
    Logger log2 = Logger.getLogger(BuggyClass.class.getName());
    int deadStoreVar; // Mutation: Dead Store

    public void showBug() {
        log1.info("This is a log from log1");
        log2.info("This is a log from log2");
        // Dead store variable 'deadStoreVar' is not used, but it's declared and not assigned any value.
    }
}