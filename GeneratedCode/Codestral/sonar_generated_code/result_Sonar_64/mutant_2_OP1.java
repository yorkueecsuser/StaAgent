import java.util.Random;

class BuggyExceptionCreation {
    public void showBug(int x) {
        if (x < 0) {
            new IllegalArgumentException("x must be nonnegative");
            // Added dead store
            int deadStore = new Random().nextInt();
        }
    }
}