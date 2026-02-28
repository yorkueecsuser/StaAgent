import java.util.Random;

class ComparisonOutOfRangeBug {
    public boolean showBug(byte value) {
        // BUG: ComparisonOutOfRange
        int unusedVar = generateRandomInt();
        return value == 200; // This will always return false because 200 is out of the range for a byte (-128 to 127)
    }

    private int generateRandomInt() {
        Random rand = new Random();
        return rand.nextInt(100);
    }
}