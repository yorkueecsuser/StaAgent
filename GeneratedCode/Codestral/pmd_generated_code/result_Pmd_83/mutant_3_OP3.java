import java.util.logging.Logger;

class BugDemo {
    private static final Logger _LOG = Logger.getLogger(BugDemo.class.getName());

    // Method to return false
    private boolean alwaysFalse() {
        return false;
    }

    public void showBug() {
        try {
            // Inserted unreachable if statement
            if (alwaysFalse()) {
                // This code is unreachable
                System.out.println("This is an unreachable statement");
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