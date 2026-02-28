import java.util.Random;

class ComparisonOutOfRangeBug {
    public boolean showBug(byte value) {
        // BUG: ComparisonOutOfRange
        int deadStoreVariable; // Dead store mutation - unused variable
        deadStoreVariable = new Random().nextInt(); // assigning a random value to the dead store variable
        return value == 200; // This will always return false because 200 is out of the range for a byte (-128 to 127)
    }
}