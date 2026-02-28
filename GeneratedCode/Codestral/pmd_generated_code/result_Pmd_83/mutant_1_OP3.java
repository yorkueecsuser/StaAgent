import java.util.logging.Logger;

class BugDemo {
    private static final Logger _LOG = Logger.getLogger(BugDemo.class.getName());

    private boolean getUnreachableCondition() {
        return false; // This method always returns false
    }

    public void showBug() {
        try {
            if (getUnreachableCondition()) { // Unreachable if statement
                // This block of code is unreachable
                int x = 10 / 0; // Arbitrary unreachable code
            }
            throw new Exception("This is a test exception");
        } catch (Exception e) {
            _LOG.severe(e.getMessage()); // Intentional bug: UseCorrectExceptionLogging
        }
    }

    public static void main(String[] args) {
        BugDemo demo = new BugDemo();
        demo.showBug();
    }
}