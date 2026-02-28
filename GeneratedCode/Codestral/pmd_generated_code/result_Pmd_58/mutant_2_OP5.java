import java.util.logging.Logger;

class BuggyClass {
    Logger log1 = Logger.getLogger(BuggyClass.class.getName());
    Logger log2 = Logger.getLogger(BuggyClass.class.getName());

    public void showBug() {
        log1.info("This is a log from log1");

        // Mutant code: Unreachable switch statement
        int value = getUnreachableValue();
        switch(value) {
            case 1:
                System.out.println("This line should never be reached");
                break;
        }

        log2.info("This is a log from log2");
    }

    // Method to return an unreachable value
    private int getUnreachableValue() {
        return -1;
    }
}