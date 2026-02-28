import java.util.logging.Logger;

class BugDemo {
    private static final Logger _LOG = Logger.getLogger(BugDemo.class.getName());

    private boolean getUnreachableCondition() {
        return false;
    }

    public void showBug() {
        try {
            boolean unreachableCondition = getUnreachableCondition();
            while (unreachableCondition) {
                // This code will not be executed because the condition is always false
                throw new Exception("Unreachable code exception");
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