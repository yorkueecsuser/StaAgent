import java.util.logging.Logger;

class BugDemo {
    private static final Logger _LOG = Logger.getLogger(BugDemo.class.getName());

    public void showBug() {
        try {
            throw new Exception("This is a test exception");
        } catch (Exception e) {
            _LOG.severe(e.getMessage()); // Original bug: UseCorrectExceptionLogging

            // Inserted unreachable switch statement
            int value = getValue();
            switch (value) {
                case 1:
                    // This code will never be executed
                    System.out.println("Unreachable code");
                    break;
            }
        }
    }

    // Method to simulate a false condition at runtime
    private boolean getValue() {
        return false;
    }

    public static void main(String[] args) {
        BugDemo demo = new BugDemo();
        demo.showBug();
    }
}