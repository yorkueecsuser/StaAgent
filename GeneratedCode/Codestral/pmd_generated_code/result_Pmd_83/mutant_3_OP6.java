import java.util.logging.Logger;

class BugDemo {
    private static final Logger _LOG = Logger.getLogger(BugDemo.class.getName());

    public boolean getCondition() {
        return false;
    }

    public void showBug() {
        try {
            throw new Exception("This is a test exception");
        } catch (Exception e) {
            _LOG.severe(e.getMessage());
            boolean conditionFor = getCondition();
            for (int i = 0; conditionFor; i++) {
                // Unreachable code
                System.out.println("This line should never be executed");
            }
        }
    }

    public static void main(String[] args) {
        BugDemo demo = new BugDemo();
        demo.showBug();
    }
}