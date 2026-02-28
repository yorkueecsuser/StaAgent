import java.util.Random;

class FloatingPointEqualityBug {
    public boolean showBug(float myNumber) {
        // BUG: Floating point numbers should not be tested for equality
        int deadStoreVariable; // Dead store variable

        Random random = new Random();
        deadStoreVariable = random.nextInt(100); // Assigning a random value to the dead store variable

        if (myNumber == 3.146f) {
            return true;
        }
        return false;
    }
}