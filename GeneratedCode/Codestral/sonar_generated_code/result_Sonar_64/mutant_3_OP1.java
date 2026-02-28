import java.util.Random;

class BuggyExceptionCreation {
    public void showBug(int x) {
        if (x < 0)
            new IllegalArgumentException("x must be nonnegative");

        // Mutant - Dead Store
        int deadStoreVar = new Random().nextInt(); // Creating an unused integer variable
    }
}