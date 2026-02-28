import java.util.logging.Logger;

class BugDemo {
    private static final Logger l = Logger.getLogger(BugDemo.class.getName()); // Renamed _LOG to l

    public void showBug() {
        try {
            throw new Exception("This is a test exception");
        } catch (Exception e) {
            l.severe(e.getMessage()); // Use the renamed variable l
        }
    }

    public static void main(String[] args) {
        BugDemo demo = new BugDemo();
        demo.showBug();
    }
}