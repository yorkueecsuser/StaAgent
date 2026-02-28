import java.util.Random;

class FloatingPointEqualityBug {
    public boolean showBug(float myNumber) {
        // BUG: Floating point numbers should not be tested for equality
        int unusedVariable; // Dead Store mutation
        if (myNumber == 3.146f) {
            unusedVariable = new Random().nextInt(); // Assign a random value to the unused variable
            return true;
        }
        return false;
    }
}