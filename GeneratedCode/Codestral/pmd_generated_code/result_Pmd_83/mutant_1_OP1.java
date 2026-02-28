import java.util.logging.Logger;
import java.util.Random;

class BugDemo {
    private static final Logger _LOG = Logger.getLogger(BugDemo.class.getName());

    public void showBug() {
        try {
            throw new Exception("This is a test exception");
        } catch (Exception e) {
            // Dead Store Mutation Operator
            int deadStoreVariable = generateRandomInt();
            _LOG.severe(e.getMessage()); // Intentional bug: UseCorrectExceptionLogging
        }
    }

    // Method to generate a random integer
    private int generateRandomInt() {
        Random random = new Random();
        return random.nextInt(100);
    }

    public static void main(String[] args) {
        BugDemo demo = new BugDemo();
        demo.showBug();
    }
}