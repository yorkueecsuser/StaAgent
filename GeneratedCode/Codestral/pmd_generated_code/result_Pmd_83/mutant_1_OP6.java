import java.util.logging.Logger;

class BugDemo {
    private static final Logger _LOG = Logger.getLogger(BugDemo.class.getName());

    public void showBug() {
        try {
            // Inserted unreachable for loop
            for (int i = 0; getCondition(); i++) {
                System.out.println("This is an unreachable loop");
            }

            throw new Exception("This is a test exception");
        } catch (Exception e) {
            _LOG.severe(e.getMessage()); // Intentional bug: UseCorrectExceptionLogging
        }
    }

    // Dynamically determined condition method
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        BugDemo demo = new BugDemo();
        demo.showBug();
    }
}