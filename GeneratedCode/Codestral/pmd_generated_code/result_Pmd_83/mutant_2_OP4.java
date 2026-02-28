import java.util.logging.Logger;

class BugDemo {
    private static final Logger _LOG = Logger.getLogger(BugDemo.class.getName());

    private boolean getUnreachableCondition() {
        return false;
    }

    public void showBug() {
        try {
            throw new Exception("This is a test exception");
        } catch (Exception e) {
            _LOG.severe(e.getMessage());

            // Inserted unreachable if-else branch
            if (getUnreachableCondition()) {
                System.out.println("This code will never be executed");
            } else {
                System.out.println("This is the alternative code");
            }
        }
    }

    public static void main(String[] args) {
        BugDemo demo = new BugDemo();
        demo.showBug();
    }
}