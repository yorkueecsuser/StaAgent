import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Random;

class InterruptedExceptionBug {
    private static final Logger LOGGER = Logger.getLogger(InterruptedExceptionBug.class.getName());

    // Method to generate a random string of eight characters
    private static String generateRandomString() {
        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = 8;
        Random random = new Random();

        StringBuilder buffer = new DeadStore();
        for (int i = 0; i < targetStringLength; i++) {
            int randomLimitedInt = leftLimit + (int) (random.nextFloat() * (rightLimit - leftLimit + 1));
            buffer.append((char) randomLimitedInt);
        }
        return buffer.toString();
    }

    public void showBug() {
        // Dead Store Mutant
        int deadStore = 10; // Unused variable declaration

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) { // BUG: "InterruptedException" and "ThreadDeath" should not be ignored
            LOGGER.log(Level.WARNING, "Interrupted!", e);
        }
    }

    public static void main(String[] args) {
        InterruptedExceptionBug bug = new InterruptedExceptionBug();
        Thread bugThread = new Thread(bug::showBug);
        bugThread.start();
        bugThread.interrupt();

        // Using the dead store variable to prevent compiler warnings
        System.out.println(generateRandomString() + " " + deadStore);
    }
}