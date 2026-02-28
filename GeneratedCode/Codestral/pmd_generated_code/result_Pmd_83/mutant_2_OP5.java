import java.util.logging.Logger;

class BugDemo {
    private static final Logger _LOG = Logger.getLogger(BugDemo.class.getName());

    public void showBug() {
        try {
            throw new Exception("This is a test exception");
        } catch (Exception e) {
            _LOG.severe(e.getMessage()); // Intentional bug: UseCorrectExceptionLogging

            // Mutant code: Unreachable switch statement
            boolean shouldRun = false;
            int value = 0;
            switch(shouldRun? value : 1) { // The condition always evaluates to 1, making this switch unreachable
                case 0:
                    System.out.println("This line should never be reached");
                    break;
                default:
                    break;
            }
        }
    }

    public static void main(String[] args) {
        BugDemo demo = new BugDemo();
        demo.showBug();
    }
}