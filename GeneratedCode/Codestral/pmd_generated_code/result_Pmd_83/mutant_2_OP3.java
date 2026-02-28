import java.util.logging.Logger;

class BugDemo {
    private static final Logger _LOG = Logger.getLogger(BugDemo.class.getName());

    public void showBug() {
        try {
            throw new Exception("This is a test exception");
        } catch (Exception e) {
            _LOG.severe(e.getMessage()); // Intentional bug: UseCorrectExceptionLogging
            if (isUnreachableCondition()) { // Inserted unreachable if statement
                System.out.println("This line is unreachable");
            }
        }
    }

    private boolean isUnreachableCondition() {
        return false; // Always false to make it unreachable
    }

    public static void main(String[] args) {
        BugDemo demo = new BugDemo();
        demo.showBug();
    }
}