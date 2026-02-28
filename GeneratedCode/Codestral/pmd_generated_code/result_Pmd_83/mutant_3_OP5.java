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
            _LOG.severe(e.getMessage());

            // Unreachable switch statement mutant
            int value = 1;
            boolean condition = getFalseCondition();
            if (condition) {
                switch (value) {
                    case 2:
                        System.out.println("This line should never be executed");
                        break;
                }
            }
        }
    }

    public static void main(String[] args) {
        BugDemo demo = new BugDemo();
        demo.showBug();
    }
}