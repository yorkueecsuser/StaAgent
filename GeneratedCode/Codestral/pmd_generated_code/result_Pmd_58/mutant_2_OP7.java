import java.util.logging.Logger;

class BuggyClass {
    Logger log1 = Logger.getLogger(BuggyClass.class.getName());
    Logger log2 = Logger.getLogger(BuggyClass.class.getName());

    public void showBug() {
        log1.info("This is a log from log1");

        // Added unreachable while loop
        boolean conditionWhile = false;
        while (conditionWhile) {
            System.out.println("This is an unreachable while loop");
        }

        log2.info("This is a log from log2");
    }
}