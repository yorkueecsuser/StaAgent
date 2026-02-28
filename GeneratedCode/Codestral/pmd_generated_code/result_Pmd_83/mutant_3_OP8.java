import java.util.logging.Logger;

class BugDemo {
    private static final Logger _LOG = Logger.getLogger(BugDemo.class.getName());
    private static final Logger a = Logger.getLogger(BugDemo.class.getName()); // Mutant: Renamed _LOG to a

    public void showBug() {
        try {
            throw new Exception("This is a test exception");
        } catch (Exception e) {
            _LOG.severe(e.getMessage());
            a.severe(e.getMessage()); // Mutant: Used the renamed variable a to log the exception
        }
    }

    public static void main(String[] args) {
        BugDemo demo = new BugDemo();
        demo.showBug();
    }
}