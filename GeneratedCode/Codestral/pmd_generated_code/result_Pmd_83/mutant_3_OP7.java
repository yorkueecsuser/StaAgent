import java.util.logging.Logger;

class BugDemo {
    private static final Logger _LOG = Logger.getLogger(BugDemo.class.getName());

    private boolean getFalseCondition() {
        return false;
    }

    public void showBug() {
        try {
            // Inserting unreachable while loop
            while (getFalseCondition()) {
                // This code will never execute
                System.out.println("This is an unreachable loop");
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