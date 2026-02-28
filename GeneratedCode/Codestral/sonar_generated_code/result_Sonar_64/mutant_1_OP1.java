import java.util.Random;

class BuggyExceptionCreation {
    public void showBug(int x) {
        if (x < 0) {
            int deadStore = new Random().nextInt(); // Added dead store variable
            new IllegalArgumentException("x must be nonnegative");
        }
    }
}