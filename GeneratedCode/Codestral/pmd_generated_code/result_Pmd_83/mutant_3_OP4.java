import java.util.logging.Logger;

class BugDemo {
    private static final Logger _LOG = Logger.getLogger(BugDemo.class.getName());

    public void showBug() {
        try {
            throw new Exception("This is a test exception");
        } catch (Exception e) {
            _LOG.severe(e.getMessage()); // Intentional bug: UseCorrectExceptionLogging

            // Unreachable if-else statement mutant
            boolean shouldRun = getCondition();
            if (shouldRun) {
                System.out.println("This line will never execute");
            } else {
                System.out.println("This else block is also unreachable");
            }
        }
    }

    // Placeholder method to avoid compile-time errors
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        BugDemo demo = new BugDemo();
        demo.showBug();
    }
}