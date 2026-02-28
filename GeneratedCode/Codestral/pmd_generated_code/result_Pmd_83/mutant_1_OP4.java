import java.util.logging.Logger;

class BugDemo {
    private static final Logger _LOG = Logger.getLogger(BugDemo.class.getName());

    private boolean getFalseCondition() {
        return false;
    }

    public void showBug() {
        try {
            throw new Exception("This is a test exception");
        } catch (Exception e) {
            _LOG.severe(e.getMessage()); // Intentional bug: UseCorrectExceptionLogging
        }

        // Inserted unreachable if-else branch
        if (getFalseCondition()) {
            System.out.println("This line will never be executed");
        } else {
            System.out.println("This is the else branch that will always be executed");
        }
    }

    public static void main(String[] args) {
        BugDemo demo = new BugDemo();
        demo.showBug();
    }
}